package lambda.methodRefrence;

public class StaticMethodRefernce {
    
    public static void main(String[] args) {
        
        // ArthimeticOperation operation = (a, b) -> {
        //     int sum = a + b;
        //     System.err.println(sum);
        //     return sum;
        // };
        // operation.performOperation(2,3);

        ArthimeticOperation methodRef = StaticMethodRefernce::performAddition;
        methodRef.performOperation(3, 5);

    }

    public static int performAddition(int a, int b) {
        int sum = a + b;
        System.err.println(sum);
        return sum;
    }
}
