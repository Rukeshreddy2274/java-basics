package basic.array;

public class largestSecond {
    public static void main(String[] args) {
        
        int[] arr = {2,4,15,8, 3};

        int n = arr.length;

        int sS = largestSecond.secondSmallest(arr, n);
        System.out.println(sS);

        int sL = largestSecond.secondLargest(arr, n);
        System.out.println(sL);

    }

    //1. If current element is smaller than "small" update the value of second _small and small
    //2.Else if current element is smaller than "second_small", update the value of second_small
    //3. After transvering the array, second smallest element will be stored in variable second_small
    public static int secondSmallest(int[] arr, int n) {
        if(n < 2) {
            return -1;
        }
        int small = Integer.MAX_VALUE;
        int second_small = Integer.MAX_VALUE;

        for(int num : arr) {
            if(num < small) {
                second_small = small;
                small = num;
            } else if(num < second_small && num != small) {
                second_small = num;
            }
        }

        return second_small;
    }

    //1. if current element is larger than "large" update the second_large and large
    //2. Else if current element is larger than second large, update valeuof second large
    //3. After transvering the array, second largest elemnt will be stored in variable second_largest
    public static int secondLargest(int[] arr, int n) {
        
        int large = Integer.MIN_VALUE;
        int second_large = Integer.MIN_VALUE;

        for(int num : arr) {
            if(num > large) {
                second_large = large;
                large = num;
            } else if(num > second_large && num != large) {
                second_large = num;
            }
        }

        return second_large;
    }
}
