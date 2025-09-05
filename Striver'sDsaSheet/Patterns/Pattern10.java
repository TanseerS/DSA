public class Pattern10 {
    public static void main(String[] args) {
        int n = 6;
        pattern(n);
    }
    static void pattern(int n){
        for(int row = 1; row <= n; row++){
            for(int col = 1; col <= row; col++){
                System.out.print("*");
            };
            System.out.println();
        };
        for(int row = 1; row <= n-1; row++){
            for(int col = 1; col <= n-row; col++){
                System.out.print("*");
            };
            System.out.println();
        };
    }
}
