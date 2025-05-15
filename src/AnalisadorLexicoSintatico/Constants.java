package AnalisadorLexicoSintatico;

public interface Constants extends ScannerConstants, ParserConstants
{
    int EPSILON  = 0;
    int DOLLAR   = 1;

    int t_identificador = 2;
    int t_constante_int = 3;
    int t_constante_float = 4;
    int t_constante_char = 5;
    int t_constante_string = 6;
    int t_module = 7;
    int t_end = 8;
    int t_local = 9;
    int t_bool = 10;
    int t_request = 11;
    int t_echo = 12;
    int t_switch = 13;
    int t_case = 14;
    int t_do = 15;
    int t_while = 16;
    int t_until = 17;
    int t_true = 18;
    int t_false = 19;
    int t_int = 20;
    int t_float = 21;
    int t_char = 22;
    int t_string = 23;
    int t_TOKEN_24 = 24; //"="
    int t_TOKEN_25 = 25; //"=="
    int t_TOKEN_26 = 26; //"<"
    int t_TOKEN_27 = 27; //">"
    int t_TOKEN_28 = 28; //"+"
    int t_TOKEN_29 = 29; //"-"
    int t_TOKEN_30 = 30; //"*"
    int t_TOKEN_31 = 31; //"/"
    int t_TOKEN_32 = 32; //"|"
    int t_TOKEN_33 = 33; //"!="
    int t_TOKEN_34 = 34; //","
    int t_TOKEN_35 = 35; //";"
    int t_TOKEN_36 = 36; //"&"
    int t_TOKEN_37 = 37; //"("
    int t_TOKEN_38 = 38; //")"
    int t_TOKEN_39 = 39; //"!"

}
