class Solution {
    public int longestSubarray(int[] nums) {
        int i = 0, j = 0, zeroes = 0;
        while (j < nums.length) {
            if (nums[j] == 0) {
                zeroes++;
            }
            j++;
            if (zeroes > 1) {
                if (nums[i] == 0) {
                    zeroes--;
                }
                i++;
            }
        }

        return j - i - 1;
    }
}