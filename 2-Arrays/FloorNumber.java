// greatest number smaller than target
public class FloorNumber {

    public static void main(String[] args) {
        int[] nums = {1, 2, 4, 5, 7, 8, 12, 14, 16, 18};
        int target = 15;
        int ans = floor(nums, target);
        System.out.println(ans);
    };
    static int floor(int[] nums, int target){
        int start = 0;
        int end = nums.length-1;

        while(start <= end){
            int mid = start + (end - start)/2;
            if(nums[mid] > target){
                end = mid -1;
            }else if(nums[mid] < target){
                start = mid + 1;
            }else{
                return mid;
            };
        };
        return end;
    }
}