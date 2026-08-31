package basic.strings;

public class Reverse {
    
    public static void main(String[] args) {

        String str = "hello";
        System.out.println(reverse(str));
        
    }

    public static String reverse(String str) {
        StringBuilder sb = new StringBuilder(str);
        return sb.reverse().toString();
    }
}
