package lambda.methodRefrence;

import java.util.List;

public class ClassMethodRef {
    public static void main(String[] args) {
        
        var list = List.of("Supply", "HR", "Sales");
        list.forEach(depart -> System.err.println(depart));
        list.forEach(System.out::println);
    }
}
