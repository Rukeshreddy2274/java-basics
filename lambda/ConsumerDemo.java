package lambda;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerDemo {
    
    public static void main(String[] args) {
        Consumer<String> convert = input -> System.err.println(input.toUpperCase());
        convert.accept("Rukesh");

        Consumer<Integer> square = num -> System.err.println(num * num);
        List<Integer> numList = Arrays.asList(1,2,34,5,6,7);
        numList.forEach(square);

        Consumer<String> appendInput = input -> System.err.println("New value after append");
        appendInput.andThen(convert).accept("Lambda Expression");
    }
}
