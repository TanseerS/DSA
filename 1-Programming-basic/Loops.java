import java.util.Scanner;

public class Loops {

    public static void main(String[] args) {
        // for loop
        for(int num = 1; num <= 5; num += 1){
            System.out.println(num);
        };

        // print number from 1 to n
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        for(int number = 1; number <= n; number += 1){
            System.out.println(number);
        };
        input.close();

        // while loop
        // while (condition){body}
        int digit = 1;
        while(digit<=5){
            System.out.println(digit);
            digit += 1;
        };

        // do-while loop
        int p = 1;
        do{
            System.out.println(p);
            p += 1;
        }while(p<=5);
    }
}