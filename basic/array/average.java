package basic.array;

public class average {

    public static void main(String[] args) {
        
        int[] arr = {1, 2};
        System.out.println(Average(arr));
    }
    
    public static double Average(int[] arr) {

        double total = 0;
        for(int num : arr) {
            total += num;
        }

        double avg = total / arr.length;
        return avg;
    }
}
