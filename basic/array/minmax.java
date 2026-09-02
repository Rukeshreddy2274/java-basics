package basic.array;

public class minmax {
    public static void findMinMax(int[] arr) {
        int max = arr[0];
        int min = arr[0];

        for(int num : arr) {
            if(num > max) {
                max = num;
            } 
            if(num < min) {
                min = num;
            }
        }

        System.out.println(max + "" + min);
    }
    
}
