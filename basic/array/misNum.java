package basic.array;

//FInd missing number in arr (1 to n)
public class misNum {
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 5, 6};

        int n = 6;
        System.out.println(FindMissing(arr, n));

    }

    public static int FindMissing(int[] arr, int n) {
        int expectedSum = n * (n + 1) / 2; //sum formuala to calculate one missing number
        int actualSum = 0;

        for(int num : arr) {
            actualSum += num;
        }
        return expectedSum - actualSum;
    }
    
}
