package org.tiny;

import java.util.Arrays;

public class No1005MaximizeSumOfArrayAfterKNegations {
    public static int largestSumAfterKNegations(int[] nums, int k) {
        Arrays.sort(nums);
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] <= 0 && k > 0) {
                nums[i] = -nums[i];
                k--;
            }
            sum += nums[i];
        }
        if (k <= 0)
            return sum;
        Arrays.sort(nums);
        return sum - (k % 2 == 0 ? 0 : 2 * nums[0]);
    }
}
