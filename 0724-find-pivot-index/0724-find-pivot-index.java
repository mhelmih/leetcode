class Solution {
    public int pivotIndex(int[] nums) {
        int n = nums.length;
        int[] temp = new int[n];

        for (int i = 1; i < n; i++) {
            temp[i] = temp[i - 1] + nums[i - 1];
        }

        int suffix = 0;
        for (int i = n - 1; i >= 0; i--) {
            temp[i] -= suffix;
            suffix += nums[i];
        }

        for (int i = 0; i < n; i++) {
            if (temp[i] == 0) {
                return i;
            }
        }

        return -1;
    }
}