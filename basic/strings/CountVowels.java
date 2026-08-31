package basic.strings;

public class CountVowels {
    
    public static void main(String[] args) {
        String str = "Hello Rukesh";
        count(str);
    }

    public static void count(String str) {
        int vowels = 0;
        int constants = 0;
        str = str.toLowerCase();

        for(char c : str.toCharArray()) {
            if(Character.isLetter(c)) {
                if("aeiou".indexOf(c) != -1) {
                    vowels++;
                } else {
                    constants++;
                }
            }
        }

        System.out.println(vowels + ", " + constants);
    }
}
