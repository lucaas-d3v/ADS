package Atividade_3.utils;

public class Verificador {
    public static boolean isValidName( String name ){
        return name.matches("[A-Z]+ [A-Z]+");
    }

    public static boolean isPriceValid( double preco ){
        return preco >= 0;
    }

    public static boolean isQuatityValid( int quatity ){
        return quatity >= 0;
    }

    public static boolean isBarCode( String code_bar ){
        return code_bar.matches("\\d{13}");
    }
}
