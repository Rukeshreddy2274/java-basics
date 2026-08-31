package lambda;

import java.time.LocalDate;
import java.util.function.Supplier;

public class SupplierDemo {
    
    public static void main(String[] args) {
        Supplier<Integer> getCurrentMonth = () -> LocalDate.now().getMonthValue();
        System.err.println(getCurrentMonth.get());

        Supplier<Integer> getCurrentDayOfMonth = () -> LocalDate.now().getDayOfMonth();
        System.err.println(getCurrentDayOfMonth.get());

        Supplier<String> getCurrentDayName = () -> LocalDate.now().getDayOfWeek().name();
        System.err.println(getCurrentDayName.get());


    }
}
