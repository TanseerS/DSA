// Selection Sort: Select the element and place on the right place
// Find the max element and place at the end of the array
package Sorting;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] nums = {4, 5, 1, 3, 2};
        selectSort(nums);
        System.out.println(Arrays.toString(nums));
    };
    static void selectSort(int[] nums){
        for(int i = 0; i < nums.length-1; i++){
            int maxIndex = 0;
            for(int j = 0; j < nums.length - i; j++){
                if(nums[j] > nums[maxIndex]){
                    maxIndex = j;
                }
            };
            swap(nums, maxIndex, nums.length-i-1);
        }
    };

    static void swap(int[] nums, int a, int b){
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }
}
