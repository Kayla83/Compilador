package AnalisadorLexicoSintatico;

public class SyntaticError extends AnalysisError {
    private Token token;  
    private String esperado;

    public SyntaticError(String msg, int position, Token token, String esperado) {
        super(msg, position);
        this.token = token;
        this.esperado = esperado;
    }

    public SyntaticError(String msg, Token token, String esperado) {
        super(msg);
        this.token = token;
        this.esperado = esperado;
    }

    public Token getToken() {
        return token;
    }

    public String getExpected() {
        return esperado;
    }
}