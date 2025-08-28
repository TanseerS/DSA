// Dynamic array
// Arrays are of fixed size, when we dont know the size of array we use arraylist to dynamically adjust the size of arrays
// There is indexing in arraylist
import java.util.ArrayList;
import java.util.Scanner;
public class Arraylist {
    public static void main(String[] args) {
        // Syntax: ArrayList<Integer> arr = new ArrayList<>(initial-capacity);
        ArrayList<Integer> arr = new ArrayList<>(10);
        // methods:
        arr.add(50);
        System.out.println(arr);

        // Input
        ArrayList<Integer> list = new ArrayList<>(10);
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < 5; i++){
            list.add(sc.nextInt());
        };
        for(int i = 0; i < 5; i++){
            System.out.println(list.get(i));
        };
        sc.close();
        
    }
}
