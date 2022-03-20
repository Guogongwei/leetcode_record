package org.tiny;

import java.util.HashMap;
import java.util.Map;

public class No1TwoSum {
    public static int[] toSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(target - nums[i], i);
        }

        for (int i = 0; i < nums.length; i++) {
            if (!map.containsKey(nums[i]) || map.get(nums[i]) == i) {
                continue;
            }

            int key = map.get(nums[i]);

            return i < key ? new int[]{i, key} : new int[]{key, i};
        }

        return null;
    }

    //优化版本
    public int[] twoSum2(int[] nums, int target) {
        Map<Integer, Integer> hashtable = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; ++i) {
            if (hashtable.containsKey(target - nums[i])) {
                return new int[]{hashtable.get(target - nums[i]), i};
            }
            hashtable.put(nums[i], i);
        }
        return new int[0];
    }
}
