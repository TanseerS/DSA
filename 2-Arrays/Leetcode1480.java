// 1480. Running Sum of 1d Array

import java.util.Arrays;

public class Leetcode1480 {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};
        int[] ans = runningSum(nums);
        System.out.println(Arrays.toString(ans));
    };
    static int[] runningSum(int[] nums) {
        int[] ans = new int[nums.length];
        ans[0] = nums[0];
        for(int i = 1; i < nums.length; i++){
            ans[i] = ans[i-1] + nums[i];
        };
        return ans;
    };
}
