package basic.number;

public class fibonnaci {
    
    public static void main(String[] args) {
        Fib(50);
    }

    public static void Fib(int n) {
        int a = 0; int b = 1;

        for(int i = 2; i <= n; i++) {
            System.out.println(a + "");
            int temp = a + b;
            a = b;
            b = temp;
        }
    }
}
