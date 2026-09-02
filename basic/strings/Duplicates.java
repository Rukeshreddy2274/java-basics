package basic.strings;

import java.util.LinkedHashSet;
import java.util.Set;

public class Duplicates {
    public static void main(String[] args) {

        String str = "Hellolo";
        System.out.println(rmDuplicates(str));
        
    }

    public static String rmDuplicates(String str) {
        StringBuilder sb = new StringBuilder();
        Set<Character> set = new LinkedHashSet<>();

        for(char c : str.toCharArray()) {
            set.add(c);
        }

        for(char c : set) {
            sb.append(c);
        }

        return sb.toString();
    }
}
