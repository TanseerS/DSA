import java.util.Scanner;

public class Functions {

    public static void main(String[] args) {
        // Functions are reusable piece of code
        sum();
    };

    static void sum(){
        Scanner sc = new Scanner(System.in);
        int num1, num2, addition;
        num1 = sc.nextInt();
        num2 = sc.nextInt();
        addition = num1 + num2;
        System.out.println(addition);
        sc.close();
    }
}
