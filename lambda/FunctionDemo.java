package lambda;

import java.util.function.Function;

public class FunctionDemo {
    
    public static void main(String[] args) {
        
        Function<String, String> convertStr = (input) -> input.toUpperCase();
        System.err.println(convertStr.apply("Hello"));

        Function<String, Integer> getStrLength = (input) -> input.length();
        System.err.println(getStrLength.apply("Hello"));

        Function<String, String> sameValue =  Function.identity();
        System.err.println(sameValue.apply("Hi Ruk"));

        Function<Integer, Integer> doubValue = num -> num * 2;
        Function<Integer, Integer> addThree = num -> num * 3;

        doubValue.andThen(addThree);
    }
}
