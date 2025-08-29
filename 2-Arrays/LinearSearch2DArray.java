import java.util.Arrays;

public class LinearSearch2DArray {
    public static void main(String[] args) {
        int[][] arr = {
            {12, 23, 32},
            {21, 22, 19},
            {16, 44, -1}
        };

        int target = 22;
        int[] ans = linearsearch(arr, target);
        System.out.println(Arrays.toString(ans));
    }
    
    static int[] linearsearch(int[][] arr, int target){
        if(arr.length == 0){
            return new int[]{-1, -1};
        };
        for(int row = 0; row < arr.length; row++){
            for(int col = 0; col < arr[row].length; col++){
                int element = arr[row][col];
                if(element == target){
                    return new int[]{row, col};
                };
            };
        };
        return new int[]{-1, -1};
    }
}
