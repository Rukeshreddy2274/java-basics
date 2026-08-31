package optional;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class StreamAPiNullCheck {
    
    public static void main(String[] args) {
        List<String> countryName = Arrays.asList("USA", "India", null, "Canada", null, "UK");
        List<String> capitalNames = countryName.stream()
                .filter(Objects::nonNull)
                .map(String::toUpperCase)
                .collect(Collectors.toList());

            System.out.println(capitalNames);
    }
}
