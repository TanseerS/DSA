// When a question of sorted array appears apply binary search
// Steps to binary search --> 
// - find mid (mid = target --> return mid)
// - mid < target (start = mid + 1)
// - mid > target (end = mid - 1)
// Time complexity --> O(log N)
public class BinarySearch {
    public static void main(String[] args) {
        int[] nums = {1, 3, 5, 7, 9, 12, 15, 22};
        int target = 7;
        int ans = binarysearch(nums, target);
        System.out.println(ans);
    };

    static int binarysearch(int[] nums, int target){
        int start = 0;
        int end = nums.length -1;

        while(start <= end){
            int mid = start + (end - start) / 2;
            if(nums[mid] < target){
                start = mid + 1;
            }else if(nums[mid] > target){
                end = mid -1;
            }else{
                return mid;
            }
        };
        return -1;

    }
}
