class Solution {
    public int longestOnes(int[] nums, int k) {
        int i = 0, j = 0, zeroes = 0;
        while (j < nums.length) {
            if (nums[j] == 0) {
                zeroes++;
            }
            j++;
            if (zeroes > k) {
                if (nums[i] == 0) {
                    zeroes--;
                }
                i++;
            }
        }

        return j - i;
    }
}