class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double res = 0;
        for (int i = 0; i < k; i++) {
            res += nums[i];
        }

        double temp = res;
        for (int i = k; i < nums.length; i++) {
            temp += nums[i] - nums[i - k];
            res = Math.max(res, temp);
        }
        return res / k;
    }
}