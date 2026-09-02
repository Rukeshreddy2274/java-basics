package basic.number;

public class factorial {

    public static void main(String[] args) {
        int n = 5;
        System.out.println(Fact(n));
    }

    public static int Fact(int n) {


        if(n == 0 || n ==1) {
            return 1;
        }

        int result = 1;
        for(int i = 2; i <=n ; i++) {

            result *= i; 

        }

        return result;
    }
    
}
