// When given nos. in range from 1 to N use Cycle sort 
package Sorting;

import java.util.Arrays;

public class CyclicSort{
    public static void main(String[] args) {
        int[] nums = {3, 5, 2, 1, 6, 4};
        sort(nums);
        System.out.println(Arrays.toString(nums));
    };
    static void sort(int[] nums){
        int i = 0;
        while(i < nums.length){
            int correctIndex = nums[i] - 1;
            if(nums[i] != nums[correctIndex]){
                swap(nums, i, correctIndex);
            }else{
                i++;
            }
            
        }
    };
    static void swap(int[] nums, int a, int b){
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }
}