package basic.array;

public class smallest {
    
    public static void main(String[] args) {
        int[] arr = {11,2,4,5};
        System.out.println(Smallest(arr));
    }

    public static int Smallest(int[] arr) {
        int small = arr[0];

        for(int num : arr) {
            if(num < small) {
                small = num;
            }
        }
        return small;
    }
}
