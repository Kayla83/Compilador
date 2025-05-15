package AnalisadorLexicoSintatico;

import AnalisadorLexicoSintatico.AnalysisError;

public class LexicalError extends AnalysisError {
    private int line;    // Linha onde ocorreu o erro
    private int column;  // Coluna onde ocorreu o erro

    public LexicalError(String msg, int line, int column) {
        super(msg);
        this.line = line;
        this.column = column;
    }

    public LexicalError(String msg) {
        super(msg);
        this.line = -1; // Linha desconhecida
        this.column = -1; // Coluna desconhecida
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