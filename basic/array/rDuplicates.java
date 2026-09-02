package basic.array;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

/*

-- Remove duplicates from Sorted Array

Approach - Two pointers
Array modification - in place
Time Complexity: O(n)
Space - O(1)


-- For unsorted array
Unsorted array - HAshSet / LinkedHashSet
Unsorted + must use O(1) space - Sort + two pinters
Need to preserve original order - LinkedHashSet

*/
public class rDuplicates {

    public static void main(String[] args) {

        int[] arr = {1, 2, 14, 3, 14};
        int[] arr1 = {1, 2, 14, 3, 14};

        // int n = rmDuplicates(arr);
        // System.out.println(Arrays.toString(Arrays.copyOf(arr, n)));

        UnSOrted(arr1);

    }

    // public static int rmDuplicates(int[] arr) {

    //     if(arr.length == 0) {
    //         return 0;
    //     }

    //     int j = 0;
    //     for(int i = 1; i < arr.length; i++) {
    //         if(arr[i] != arr[j]) {
    //             j++;
    //             arr[j] = arr[i];
    //         }
    //     }
    //     return j + 1;
    // }

    public static void UnSOrted(int[] arr) {

        Set<Integer> set = new LinkedHashSet<>();

        for(int num : arr) {
            set.add(num);
        }

        System.out.println(set);
    }
}
