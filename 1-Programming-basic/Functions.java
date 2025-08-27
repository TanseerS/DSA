import java.util.Scanner;

public class Functions {

    public static void main(String[] args) {
        // Functions are reusable piece of code
        sum();
        System.out.println(add(10, 20));
    };

    static void sum(){
        Scanner sc = new Scanner(System.in);
        int num1, num2, addition;
        num1 = sc.nextInt();
        num2 = sc.nextInt();
        addition = num1 + num2;
        System.out.println(addition);
        sc.close();
    };

    // return is the value that a function call gets after the function is executed
    static int add(int num1, int num2){
        int sum = 0;
        sum = num1 + num2;
        return sum;
    }

}
