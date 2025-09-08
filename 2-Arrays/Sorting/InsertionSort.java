// Time Complexity: o(n^2)
package Sorting;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] nums = {3,5,2,1,4};
        sort(nums);
        System.out.println(Arrays.toString(nums));
    };
    static void sort(int[] nums){
        for(int i = 0; i < nums.length -1; i++){
            for(int j = i+1; j > 0; j--){
                if(nums[j] < nums[j-1]){
                    swap(nums , j, j-1);
                }else{
                    break;
                }
            }
        }
    };
    static void swap(int[] nums, int a, int b){
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }
}
