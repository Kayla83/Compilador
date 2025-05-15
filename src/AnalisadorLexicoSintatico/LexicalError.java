package AnalisadorLexicoSintatico;

public class LexicalError extends AnalysisError {
    private int line;    // Linha onde ocorreu o erro
    private int column;  // Coluna onde ocorreu o erro

    public LexicalError(String msg) {
        super(msg);
    }

    public int getLine() {
        return line;
    }

    public int getColumn() {
        return column;
    }

    @Override
    public String toString() {
        if (line >= 0 && column >= 0) {
            return String.format("Erro Léxico na linha %d, coluna %d: %s", line, column, super.getMessage());
        } else {
            return String.format("Erro Léxico: %s", super.getMessage());
        }
    }
}