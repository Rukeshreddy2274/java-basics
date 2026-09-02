package basic.number;

public class prime {

    public static void main(String[] args) {
        int n = 40;
        // System.out.println(isPrime(n));

        printPrime(n);

    }

    public static void printPrime(int n) {
        for(int i = 2; i<=n; i++) {
            if(isPrime(i)) {
                System.out.println(i + "");
            }
        }
    }

    private static boolean isPrime(int n) {
        if(n <= 1) {
            return false;
        }

        for(int i = 2; i <= Math.sqrt(n); i++) {
            if(n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
