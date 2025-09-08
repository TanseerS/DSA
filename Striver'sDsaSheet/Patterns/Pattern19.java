public class Pattern19 {
    public static void main(String[] args) {
        int n = 5;
        pattern(n);
    };
    static void pattern(int n){
        for(int row = n; row >= 1; row--){
            for(int col = 1; col <= row; col++){
                System.out.print("*");
            };
            for(int space = 1; space <= 2*n-2*row; space++){
                System.out.print(" ");
            };
            for(int revCol =1; revCol<= row; revCol++){
                System.out.print("*");
            };
            System.out.println();
            
        };
        for(int row = 1; row <= n; row++){
            for(int col = 1; col <= row; col++){
                System.out.print("*");
            };
            for(int space = 1; space <= 2*n-2*row; space++){
                System.out.print(" ");
            };
            for(int revCol = 1; revCol <= row; revCol++){
                System.out.print("*");
            };
            System.out.println();
        }
    }
}
