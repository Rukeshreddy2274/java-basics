package lambda;

public class LambdaExpressionDemo {
    
    public static void main(String[] args) {
        
        Arthimetic addition = (a, b) -> a + b;
        System.err.println(addition.operation(5, 5));

        Arthimetic sub = (a, b) -> a - b;
        System.err.println(sub.operation(5, 3));
    }

}
