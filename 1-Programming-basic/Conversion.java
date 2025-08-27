import java.util.Scanner;

public class Conversion {
    public static void main(String[] args) {
        // java automatically converts datatypes into other datatypes if:
        // type is compatible --> int to float
        // float is greater than int

        Scanner input = new Scanner(System.in);
        float num = input.nextFloat();
        System.out.println(num);
        input.close();

        // java can take care of conversion automatically but if we want to do incompatible conversion we use typecasting
        // float value to an int wont happen automatically
        // typecasting:
        int marks = (int)(95.8f);
        System.out.println(marks);
    }
}