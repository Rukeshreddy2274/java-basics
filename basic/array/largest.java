package basic.array;

public class largest {
    public static void main(String[] args) {
        
        int[] arr = {2,4,15,8, 3};
        System.out.println(findLargest(arr));

        
    }

    public static int findLargest(int[] arr) {
        int max = arr[0];

        for(int num : arr) {
            if(num > max) {
                max = num;
            }
        }
        return max;
    }
}
