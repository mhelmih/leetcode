class Solution {
    public int[] sortedSquares(int[] nums) {
        int[] ans = new int[nums.length];
        int i = 0;
        int j = 0;
        while (i < nums.length && nums[i] < 0) {
            i++;
        }
        if (i >= nums.length) {
            i -= 1;
        }
        j = i - 1;
        for (int k = 0; k < ans.length; k++) {
            if (i < nums.length && j >= 0) {
                if (nums[i] * nums[i] < nums[j] * nums[j]) {
                    ans[k] = nums[i] * nums[i];
                    i++;
                } else {
                    ans[k] = nums[j] * nums[j];
                    j--;
                }
            } else {
                if (i < nums.length) {
                    ans[k] = nums[i] * nums[i];
                    i++;
                }
                if (j >= 0) {
                    ans[k] = nums[j] * nums[j];
                    j--;
                }
            }
        }

        return ans;
    }
}