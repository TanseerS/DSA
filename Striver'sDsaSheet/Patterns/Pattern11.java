public class Pattern11 {
    public static void main(String[] args) {
        int n = 5;
        pattern(n);
    };
    static void pattern(int n){
        for(int row = 1; row <= n; row++){
            for(int col = 1; col <= row; col++){
                int count = col+row;
                if(count % 2 == 0){
                    System.out.print(1 +" ");
                }else{
                    System.out.print(0 +" ");
                }
            };
            System.out.println();
        }
    }
}
