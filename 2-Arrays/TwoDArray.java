// Arrays are not stored continuosly in java(heap memory)

import java.util.Arrays;
import java.util.Scanner;

public class TwoDArray {
    public static void main(String[] args) {
        // int[][] arr = new int[row][cloumn] (column is not manditory)
        // Input
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[3][2];
        for(int row = 0; row < arr.length; row++){
            for(int col = 0; col < arr[row].length; col++){
                arr[row][col] = sc.nextInt();
            }
        };

        // Output
        for(int[] num : arr){
            System.out.println(Arrays.toString(num));
        }
        sc.close();
    }
}