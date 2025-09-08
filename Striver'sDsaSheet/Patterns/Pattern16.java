public class Pattern16 {
    public static void main(String[] args) {
        int n = 5;
        pattern(n);
    };
    static void pattern(int n){
        for(int i = 1; i <= n; i++){
            int count = 64;
            for(int j = 1; j <= i; j++){
                System.out.print((char)(count+i));
            };
            System.out.println();
        }
    }
}
