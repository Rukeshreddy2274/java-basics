package basic.strings;

public class Palindrome {
    public static void main(String[] args) {
        
        String str1 = "ababa";
        String str2 = "helo";
        System.out.println(CheckPalind(str1));
        System.out.println(CheckPalind(str2));
    }

    public static boolean CheckPalind(String str) {
        int left = 0;
        int right = str.length() - 1;

        while(left < right) {
            if(str.charAt(left) != str.charAt(right)) {
                return false;
            }

            left++;
            right--;
        }
        return true;
    }
}
