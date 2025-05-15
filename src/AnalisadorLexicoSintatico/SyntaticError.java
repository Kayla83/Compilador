package AnalisadorLexicoSintatico;

public class SyntaticError extends AnalysisError {
    private Token token;  
    private String esperado;

    public SyntaticError(String msg) {
        super(msg);
    }

    public Token getToken() {
        return token;
    }

    public String getExpected() {
        return esperado;
    }
}