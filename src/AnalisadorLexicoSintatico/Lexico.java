package AnalisadorLexicoSintatico;

import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;

public class Lexico implements Constants {

    private int position;
    private int line;
    private int column;
    private String input;

    public Lexico() {
        this(new StringReader(""));
    }

    public Lexico(Reader input) {
        setInput(input);
        this.line = 1;
        this.column = 0;
    }

    public void setInput(Reader input) {
        StringBuilder bfr = new StringBuilder();
        try {
            int c = input.read();
            while (c != -1) {
                bfr.append((char) c);
                c = input.read();
            }
            this.input = bfr.toString();
        } catch (IOException e) {
            e.printStackTrace();
        }
        setPosition(0);
    }

    public void setPosition(int pos) {
        position = pos;
    }

    public Token nextToken() throws LexicalError {
        if (!hasInput())
            return null;

        while (hasInput()) {
            char currentChar = peekChar();

            // Ignora espaços em branco
            if (Character.isWhitespace(currentChar)) {
                currentChar = nextChar();
                if (currentChar == '\n') {
                    line++;
                    column = 0;
                } else {
                    column++;
                }
                continue;
            }

            // Ignora comentários de linha iniciados com #
            if (currentChar == '#') {
                while (hasInput() && peekChar() != '\n') {
                    nextChar();
                    column++;
                }
                if (hasInput() && peekChar() == '\n') {
                    nextChar();
                    line++;
                    column = 0;
                }
                continue;
            }

            // Ignora comentários de bloco { ... }
            if (currentChar == '{') {
                nextChar(); // consome '{'
                column++;
                while (hasInput()) {
                    char c = nextChar();
                    if (c == '\n') {
                        line++;
                        column = 0;
                    } else {
                        column++;
                    }
                    if (c == '}') {
                        break;
                    }
                }
                continue;
            }

            break; // saiu da limpeza, vai para o processamento de token
        }

        int start = position;
        int currentState = 0;
        int previousState = 0;
        int finalState = -1;
        int end = -1;

        while (hasInput()) {
            previousState = currentState;
            char readChar = nextChar();
            currentState = nextState(readChar, currentState);

            if (currentState < 0)
                break;

            if (readChar == '\n')
                line++;

            boolean isFinalState = tokenForState(currentState) >= 0;

            if (isFinalState) {
                finalState = currentState;
                end = position;
            }
        }

        validateFinalState(finalState, currentState, previousState, start);
        if (finalState < 0) {
            throw new LexicalError("símbolo inválido ---" + ScannerConstants.SCANNER_ERROR[finalState]);
        }

        return buildToken(finalState, start, end);
    }

    private void validateFinalState(int finalState, int currentState, int previousState, int start)
            throws LexicalError {
        if (finalState < 0 || (finalState != currentState && tokenForState(previousState) == -2))
            throwErrorForState(previousState, start);
    }

    private void throwErrorForState(int state, int start) throws LexicalError {
        String error = ScannerConstants.SCANNER_ERROR[state];

        String lexema = "";

        switch (error) {
            // case ScannerConstants.INVALID_COMMENT_BLOCK ->
            // lineNumber = commentBlockStartLineNumber;
            case ScannerConstants.INVALID_SYMBOL ->
                lexema = String.valueOf(input.charAt(position - 1));
            case ScannerConstants.INVALID_IDENTIFIER ->
                lexema = input.substring(start, position);
        }

        throw lexema.isEmpty()
                ? new LexicalError("Erro na linha " + line + " - " + error)
                : new LexicalError("Erro na linha " + line + " - " + lexema + " " + error);
    }

    private Token buildToken(int finalState, int start, int end) throws LexicalError {
        position = end;
        int tokenForFinalState = tokenForState(finalState);
        if (tokenForFinalState == -2)
            return nextToken();

        String lexema = input.substring(start, end);
        int tokenId = lookupToken(tokenForFinalState, lexema);

        return new Token(tokenId, lexema, line);
    }

    private char peekChar() {
        if (hasInput()) {
            return input.charAt(position);
        } else {
            return (char) -1;
        }
    }

        private int nextState(char c, int state) throws LexicalError {
        int start = ScannerConstants.SCANNER_TABLE_INDEXES[state];
        int end = ScannerConstants.SCANNER_TABLE_INDEXES[state + 1] - 1;

        while (start <= end) {
            int half = (start + end) / 2;
            if (ScannerConstants.SCANNER_TABLE[half][0] == c) {
                return ScannerConstants.SCANNER_TABLE[half][1];
            } else if (ScannerConstants.SCANNER_TABLE[half][0] < c) {
                start = half + 1;
            } else {
                end = half - 1;
            }
        }

        return -1;
    }

    private int tokenForState(int state) {
        if (state < 0 || state >= ScannerConstants.TOKEN_STATE.length)
            return -1;

        return ScannerConstants.TOKEN_STATE[state];
    }

    public int lookupToken(int base, String key) {
        int start = ScannerConstants.SPECIAL_CASES_INDEXES[base];
        int end = ScannerConstants.SPECIAL_CASES_INDEXES[base + 1] - 1;

        while (start <= end) {
            int half = (start + end) / 2;
            int comp = ScannerConstants.SPECIAL_CASES_KEYS[half].compareTo(key);

            if (comp == 0) {
                return ScannerConstants.SPECIAL_CASES_VALUES[half];
            } else if (comp < 0) {
                start = half + 1;
            } else {
                end = half - 1;
            }
        }

        return base;
    }

    private boolean hasInput() {
        return position < input.length();
    }

    private char nextChar() {
        if (hasInput()) {
            return input.charAt(position++);
        } else {
            return (char) -1;
        }
    }
}