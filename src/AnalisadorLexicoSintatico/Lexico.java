package AnalisadorLexicoSintatico;

import AnalisadorLexicoSintatico.LexicalError;
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

    if (!hasInput()) return null;

    int start = position;
    int state = 0;
    int endState = -1;
    int end = -1;
    int tokenLine = line;

    while (hasInput()) {
        char currentChar = nextChar();
        state = nextState(currentChar, state);

        if (state < 0) {
            break;
        }

        int tokenType = tokenForState(state);
        if (tokenType >= 0 || tokenType == -2) {
            endState = state;
            end = position;
        }
    }

    if (endState < 0) {
        throw new LexicalError("símbolo inválido", line, column);
    }

    position = end;
    int tokenId = tokenForState(endState);
    if (tokenId == -2) return nextToken();

    String lexeme = input.substring(start, end);
    return new Token(tokenId, lexeme, tokenLine);
}


    private char peekChar() {
        if (hasInput()) {
            return input.charAt(position);
        } else {
            return (char) -1;
        }
    }

    private int nextState(char c, int state) {
        switch (state) {
            case 0: // Estado inicial
                if (c == '\\') {
                    return 4; // Muda para o estado de Char
                } else if (Character.isLetter(c) || c == '_') {
                    return 1; // Identificador
                } else if (Character.isDigit(c)) {
                    return 2; // Constante Integer ou Float
                } else if (c == '"') {
                    return 3; // Constante String
                } else if (c == '#') {
                    return 10; // Início do comentário de linha
                } else if (c == '{') {
                    return 11; // Início do comentário de bloco
                } else if (isSymbol(c)) {
                    return 5; // Símbolo Especial
                }
                break;

            case 1: // Identificador
                if (Character.isLetterOrDigit(c) || c == '_') {
                    return 1;
                }
                break;

            case 2: // Constante Integer ou Float
                if (Character.isDigit(c)) {
                    return 2; // Continua como Integer
                } else if (c == '.') {
                    return 8; // Estado para Float
                }
                break;

            case 8: // Reconhecendo Float
                if (Character.isDigit(c)) {
                    return 9; // Continua como Float
                }
                break;

            case 9: // Float com dígitos após o ponto
                if (Character.isDigit(c)) {
                    return 9; // Continua como Float
                }
                break;

            case 3: // Constante String
                if (c != '"') {
                    return 3; // Continua no estado de String
                }
                return 6; // Fim da String

            case 4: // Constante Char
                if (c == 'n' || c == 's' || c == 't') {
                    return 7; // Fim do Char válido
                }
                return -1; // Char inválido

            case 5: // Símbolo Especial
                return -2;

            case 10: // Comentário de linha
                if (c == '\n') {
                    line++;
                    column = 0;
                    return 0; // Retorna ao estado inicial após o fim do comentário
                }
                return 10; // Continua no estado de comentário de linha

            case 11: // Comentário de bloco
                if (c == '}') {
                    return 0; // Retorna ao estado inicial após o fim do comentário
                }
                if (c == '\n') {
                    line++;
                    column = 0; // Conta nova linha
                }
                return 11; // Continua no estado de comentário de bloco
        }
        return -1; // Estado inválido
    }

    private boolean isSymbol(char c) {
        return "&|!==!=<>+-*/,;=()".indexOf(c) != -1;
    }

    private int tokenForState(int state) {
        switch (state) {
            case 1: // Identificador
                return Token.IDENTIFICADOR;
            case 2:
                return Token.CONSTANTE_INT;
            case 8: // Estado Float
            case 9:
                return Token.CONSTANTE_FLOAT;
            case 3: // Estado de String
                return -1; // Não deve ser retornado diretamente
            case 6: // Fim da String
                return Token.CONSTANTE_STRING;
            case 4: // Estado de Char
                return -1; // Não deve ser retornado diretamente
            case 7: // Char válido
                return Token.CONSTANTE_CHAR;
            case 5: // Símbolo Especial
                return Token.SIMBOLO_ESPECIAL;
            default:
                return -1;
        }
    }

    private Boolean isPalavraReservada(String lexeme) {
        String[] palavrasReservadas = {
            "bool", "case", "char", "echo", "do", "end",
            "false", "float", "int", "local", "module",
            "request", "string", "switch", "true", "until", "while"
        };
        for (String palavra : palavrasReservadas) {
            if (palavra.equals(lexeme)) {
                return true;
            }
        }
        return false;
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