package basic.array;

public class sorted {
    public static void main(String[] args) {
        
        int[] arr = {2,4,5,8, 13};

        System.out.println(Sorted(arr));
    }

    public static boolean Sorted(int[] arr) {
        for(int i =1; i< arr.length; i++) {
            if(arr[i] < arr[i - 1]) {
                return false;
            }

        }
        return true;
    }
}
