package lambda.methodRefrence;

public class InstanceMethodRef {
    public static void main(String[] args) {
        
        // ArthimeticOperation operation = (a, b) -> {
        //     int sum = a + b;
        //     System.err.println(sum);
        //     return sum;
        // };
        // operation.performOperation(2,3);

        InstanceMethodRef instanceMethodRef = new InstanceMethodRef();
        ArthimeticOperation methodRef = instanceMethodRef::performAddition;
        methodRef.performOperation(3, 5);

        ArthimeticOperation methodRefSub = instanceMethodRef::performSub;
        methodRefSub.performOperation(5, 3);

    }

    //note there is not static in these methods
    public int performAddition(int a, int b) {
        int sum = a + b;
        System.err.println(sum);
        return sum;
    }

    public int performSub(int a, int b) {
        int sum = a - b;
        System.err.println(sum);
        return sum;
    }
}
