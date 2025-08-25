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
    }
}