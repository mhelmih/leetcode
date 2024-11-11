import java.util.*;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        Hashtable<Integer, Integer> numsDict = new Hashtable<Integer, Integer>();

        for (int i = 0; i < nums.length; i++) {
            if (numsDict.containsKey(target - nums[i]) && numsDict.get(target - nums[i]) != i) {
                return new int[]{i, numsDict.get(target - nums[i])};
            }
            numsDict.put(nums[i], i);
        }

        return new int[]{};
    }
}