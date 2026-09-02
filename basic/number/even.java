package basic.number;

public class even {

    public static void main(String[] args) {
        int n = 12;
        System.out.println(isEvenOdd(n));

    }
    public static String isEvenOdd(int n) {
        if(n % 2 == 0) {
            return "even";
        }
        return "odd";
    }
}
