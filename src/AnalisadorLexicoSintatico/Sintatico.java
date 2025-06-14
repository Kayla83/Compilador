package AnalisadorLexicoSintatico;

import java.util.Stack;

public class Sintatico implements Constants {

    private Stack<Integer> stack = new Stack<>();
    private Token currentToken;
    private Token previousToken;
    private Lexico scanner;
    private Semantico semanticAnalyser;

    private String formataMensagemErro(Token token, int esperadoId) {
        int linha = token.getPosition();
        String lexema = token.getId() != Constants.t_constante_string ? token.getLexeme() : "constante_string";
        String message = "encontrado %s %s".formatted(lexema, Constants.PARSER_ERROR[esperadoId]);

        return "Erro na linha " + linha + " - " + message;
    }

    private static final boolean isTerminal(int x) {
        return x < FIRST_NON_TERMINAL;
    }

    private static final boolean isNonTerminal(int x) {
        return x >= FIRST_NON_TERMINAL && x < FIRST_SEMANTIC_ACTION;
    }

    private static final boolean isSemanticAction(int x) {
        return x >= FIRST_SEMANTIC_ACTION;
    }

    private boolean step() throws LexicalError, SyntaticError, SemanticError {
        if (currentToken == null) {
            int pos = 0;
            if (previousToken != null) {
                pos = previousToken.getPosition() + previousToken.getLexeme().length();
            }

            currentToken = new Token(DOLLAR, "$", pos);
        }

        int x = stack.pop();
        int a = currentToken.getId();

        if (x == EPSILON) {
            return false;
        } else if (isTerminal(x)) {
            if (x == a) {
                if (stack.empty()) {
                    return true;
                } else {
                    previousToken = currentToken;
                    currentToken = scanner.nextToken();
                    return false;
                }
            } else {
                throw new SyntaticError(formataMensagemErro(currentToken, x));
            }
        } else if (isNonTerminal(x)) {
            if (pushProduction(x, a)) {
                return false;
            } else {
                throw new SyntaticError(formataMensagemErro(currentToken, x));
            }
        } else {
        semanticAnalyser.executeAction(x - FIRST_SEMANTIC_ACTION, previousToken);
        return false;
    }
    }

    private boolean pushProduction(int topStack, int tokenInput) {
        int p = PARSER_TABLE[topStack - FIRST_NON_TERMINAL][tokenInput - 1];
        if (p >= 0) {
            int[] production = PRODUCTIONS[p];
            for (int i = production.length - 1; i >= 0; i--) {
                stack.push(production[i]);
            }
            return true;
        } else {
            return false;
        }
    }

    public void parse(Lexico scanner, Semantico semanticAnalyser)
            throws LexicalError, SyntaticError, SemanticError {
        this.scanner = scanner;
        this.semanticAnalyser = semanticAnalyser;

        stack.clear();
        stack.push(DOLLAR);
        stack.push(START_SYMBOL);

        currentToken = scanner.nextToken();

        while (!step());
    }
}