import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        System.out.println("Hellow World!!");   // printing some output

        Scanner input = new Scanner(System.in);     // taking input
        System.out.println(input.nextInt());
        input.close();
    }    
}
