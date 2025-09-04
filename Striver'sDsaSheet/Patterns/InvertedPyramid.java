public class InvertedPyramid {
    public static void main(String[] args) {
        int n = 5;
        pattern(n);
    };
    static void pattern(int n){
        for(int row = 1; row <= n; row++){
            for(int space = 1; space <= row-1; space++){
                System.out.print(" ");
            };
            for(int star = row; star <= 2*n-row; star++){
                System.out.print("*");
            };
            System.out.println();
        }
    
    }
}
