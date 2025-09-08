public class Pattern17 {
    public static void main(String[] args) {
        int n = 5;
        pattern(n);
    };
    static void pattern(int n){
        for(int row = 1; row <= n; row++){
            int count = 64;
            for(int space = 1; space <= n-row; space++){
                System.out.print(" ");
            };
            for(int col = 1; col <= row; col++){
                System.out.print((char)(count+col));
            };
            for(int revCol = row-1; revCol >= 1; revCol--){
                System.out.print((char)(count+revCol));
            }
            System.out.println();
        }
    }
}
