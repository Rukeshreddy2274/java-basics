package basic.patterns;

public class rightTriangle {
    public static void main(String[] args) {
        
        int n = 5;

        // //Right Traingle
        // for(int i = 1; i<=n; i++) {
        //     for(int j = 1; j <=i; j++) {
        //         System.out.print(" *");
        //     }
        //     System.out.println();
        // }

        //Inverted Triangle
        for(int i = n; i>=n; i--) {
            for(int j = 1; j<=i; j++){
                System.out.print(" *");
            
            }

            System.out.println();

        }
        
    }
}
