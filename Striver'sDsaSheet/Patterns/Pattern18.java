public class Pattern18 {
    public static void main(String[] args) {
        int n = 5;
        pattern(n);
    };
    static void pattern(int n){
        for(int row = n; row >= 1; row--){
            int count = 64;
            for(int col = 0; col <= n-row; col++){                
                System.out.print((char)(count+row+col));
            };
            System.out.println();
        }
    }
}
