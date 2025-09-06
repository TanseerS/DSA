public class Pattern12 {
    public static void main(String[] args) {
        int n = 5;
        pattern(n);
    };
    static void pattern(int n){
        for(int row = 1; row <= n; row++){
            for(int col = 1; col <= row; col++){
                System.out.print(col);
            };
            for(int space = 1; space <= 2*n-2*row; space++){
                System.out.print(" ");
            };
            for(int revCol = row; revCol >= 1; revCol--){
                System.out.print(revCol);
            };
            System.out.println();
        }
        
    }
}
