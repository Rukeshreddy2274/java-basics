package basic.strings;

public class ConvertUp {

    public static void main(String[] args) {
        String str = "RUkesh";
        System.out.println(toUpper(str));
        System.out.println(toLower(str));
    }
    
    public static String toUpper(String str) {
        return str.toUpperCase();
    }

    public static String toLower(String str) {
        return str.toLowerCase();
    }
}
