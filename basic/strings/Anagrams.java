package basic.strings;

import java.util.Arrays;

//a phrase formed by rearrangig the exact same words
//same length, same charcater and different order
public class Anagrams {
    public static void main(String[] args) {

        String s1 = "Hello";
        String s2 = "lloeH";
        System.out.println(areAnagram(s1, s2));
        
    }

    public static boolean areAnagram(String s1, String s2) {
        char[] arr1 = s1.toCharArray();
        char[] arr2 = s2.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        return Arrays.equals(arr1, arr2);
    }
}
