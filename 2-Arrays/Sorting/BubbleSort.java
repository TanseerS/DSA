// Bubble Sort --> Compare two elements, sort, move to next element(1 pass)
// With 1 pass or loop the largest element will be at the very end
// Do this for the length of array times and all the elements are sorted
// Sinking Sort OR Exchange Sort
package Sorting;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] nums = {3, 1, 5, 4, 2, 12, 22, -1, 564, 423, -8765};
        bubblSort(nums);
        System.out.println(Arrays.toString(nums));
    };
    static void bubblSort(int[] nums){
        boolean swapped = false;
        for(int i = 0; i < nums.length -1; i++){
            for(int j = 0; j< nums.length-i-1; j++){
                if(nums[j] > nums[j+1]){
                    swap(nums, j, j+1);
                    swapped = true;

                }
            }
            if(!swapped){
            break;
        }
        };
        
    };
    static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    };
}
