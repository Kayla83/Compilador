package AnalisadorLexicoSintatico;

public class Token {

    private int id;
    private String lexeme;
    private int position;

    // Constantes para tipos de token
    public static final int IDENTIFICADOR = 1;
    public static final int CONSTANTE_INT = 2;
    public static final int SIMBOLO_ESPECIAL = 3;
    public static final int CONSTANTE_FLOAT = 4;
    public static final int CONSTANTE_CHAR = 5;
    public static final int CONSTANTE_STRING = 6;
    public static final int PALAVRA_RESERVADA = 7;

    public Token(int id, String lexeme, int line) {
        if (id < 0) {
            throw new IllegalArgumentException("ID do token não pode ser negativo");
        }
        this.id = id;
        this.lexeme = lexeme;
        this.position = line; // Alterado para linha
    }

    public final int getId() {
        return id;
    }

    public final String getLexeme() {
        return lexeme;
    }

    public static String getLexeme(int id) {
        switch (id) {
            case Constants.t_identificador:
                return "identificador";
            case Constants.t_constante_int:
                return "constante_int";
            case Constants.t_constante_float:
                return "constante_float";
            case Constants.t_constante_char:
                return "constante_char";
            case Constants.t_constante_string:
                return "constante_string";
            case Constants.t_module:
                return "module";
            case Constants.t_end:
                return "end";
            case Constants.t_local:
                return "local";
            case Constants.t_bool:
                return "bool";
            case Constants.t_request:
                return "request";
            case Constants.t_echo:
                return "echo";
            case Constants.t_switch:
                return "switch";
            case Constants.t_case:
                return "case";
            case Constants.t_do:
                return "do";
            case Constants.t_while:
                return "while";
            case Constants.t_until:
                return "until";
            case Constants.t_true:
                return "true";
            case Constants.t_false:
                return "false";
            case Constants.t_int:
                return "int";
            case Constants.t_float:
                return "float";
            case Constants.t_char:
                return "char";
            case Constants.t_string:
                return "string";
            case Constants.t_TOKEN_24:
                return "=";
            case Constants.t_TOKEN_25:
                return "==";
            case Constants.t_TOKEN_26:
                return "<";
            case Constants.t_TOKEN_27:
                return ">";
            case Constants.t_TOKEN_28:
                return "+";
            case Constants.t_TOKEN_29:
                return "-";
            case Constants.t_TOKEN_30:
                return "*";
            case Constants.t_TOKEN_31:
                return "/";
            case Constants.t_TOKEN_32:
                return "|";
            case Constants.t_TOKEN_33:
                return "!=";
            case Constants.t_TOKEN_34:
                return ",";
            case Constants.t_TOKEN_35:
                return ";";
            case Constants.t_TOKEN_36:
                return "&";
            case Constants.t_TOKEN_37:
                return "(";
            case Constants.t_TOKEN_38:
                return ")";
            case Constants.t_TOKEN_39:
                return "!";
            case Constants.DOLLAR:
                return "EOF";
            default:
                return "simbolo_desconhecido";
        }
    }

    public final int getPosition() {
        return position;
    }

    @Override
    public String toString() {
        String tipoToken;

        switch (id) {
            case IDENTIFICADOR:
                tipoToken = "Identificador";
                break;
            case CONSTANTE_INT:
                tipoToken = "Constante Inteira";
                break;
            case SIMBOLO_ESPECIAL:
                tipoToken = "Símbolo Especial";
                break;
            case CONSTANTE_FLOAT:
                tipoToken = "Constante Float";
                break;
            case CONSTANTE_CHAR:
                tipoToken = "Constante Char";
                break;
            case CONSTANTE_STRING:
                tipoToken = "Constante String";
                break;
            case PALAVRA_RESERVADA:
                tipoToken = "Palavra Reservada";
                break;
            default:
                tipoToken = "Desconhecido";
                break;
        }

        return String.format(" Linha: %d, Tipo: %s, Lexema: '%s' \n ",
                position, tipoToken, lexeme);
    }
}
