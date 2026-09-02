package basic.misc;

public class leap {

    public static void main(String[] args) {
        int year = 2026;
        System.out.println(isLeap(year));
    }

    public static boolean isLeap(int n) {
        return (n % 4 == 0 && n % 100 != 0) || (n % 400 == 0) ;
    }
    
}
