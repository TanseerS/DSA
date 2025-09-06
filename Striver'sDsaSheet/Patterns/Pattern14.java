// Java uses unicode 
// Char can be written as 65(A) 66(B) ......
// Typecasting : (char)(65) = A
public class Pattern14 {
    public static void main(String[] args) {
        int n = 5;
        pattern(n);
    };
    static void pattern(int n){
        int a = 'A';
        for(int row = 1; row <= n; row++){
            for(int col = 1; col <= row; col++){
                System.out.print((char)(a+col-1));
            };
            System.out.println();
        }
    }
}
