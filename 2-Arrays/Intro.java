// Arrays: collection of similar datatypes
// Syntax: datatype[] variable = new datatype[size] OR datatype[] variable = [element1, element2, ...]
// datatype[] variable = --> declaration,  new datatype[size] --> initialization
// declaration happens at compiletime, initialization happens at runtime

import java.util.Arrays;
import java.util.Scanner;

public class Intro {
    public static void main(String[] args) {
        // Input
        int[] arr = new int[5];
        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;
        arr[3] = 40;
        arr[4] = 50;
        System.out.println(arr[3]);

        int[] arr1 = new int[5];
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < arr1.length; i++){
            arr1[i] = sc.nextInt();
        };
        for(int i = 0; i < arr1.length; i++){
            System.out.println(arr1[i]);
        };
        sc.close();

        // for-each-loop
        for(int num : arr1 ){ // for every element(num) in arr1
            System.out.println(num);  // sout element
        }

        // to-string method
        System.out.println(Arrays.toString(arr1)); // output in an [array] format
    }
}
