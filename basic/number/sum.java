package basic.number;

public class sum {
    public static void main(String[] args) {
        int sum = 0;
        int n = 5;

        while(n > 0) {
            sum += n% 10;
            n /=10;
        }

        System.out.println(sum);
    }
}
