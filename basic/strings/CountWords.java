package basic.strings;

public class CountWords {

    public static void main(String[] args) {
        String str = "Hello man is";

        System.out.println(countWords(str));
    }

    public static int countWords(String str) {
        if(str == null || str.isEmpty()) {
            return 0;
        }

        //split the string whenever there is one or more whitespace character
        // \s means whitespace shich as space, tab, newline, "+" means one or more
        String[] words = str.trim().split("\\s+");

        return words.length;
    }
    
}
