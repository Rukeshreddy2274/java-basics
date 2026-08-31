package basic.array;

public class sum {
    public static void main(String[] args) {
        
        int[] arr = {2,4,15,8, 3};
        System.out.println(SumofArray(arr));
         
    }

    public static int SumofArray(int[] arr) {

        int total = 0;

        for(int num : arr) {
            total += num;
        }

        return total;
    }

}
