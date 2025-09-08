public class Pattern15 {
    public static void main(String[] args) {
        int n = 5;
        pattern(n);
    };
    static void pattern(int n){
        for(int i = 0; i < n; i++){
            int count = 65;
            for(int j = 0; j < n-i; j++){
                System.out.print((char)(count));
                count++;
            };
            System.out.println();
        }
    }
}
