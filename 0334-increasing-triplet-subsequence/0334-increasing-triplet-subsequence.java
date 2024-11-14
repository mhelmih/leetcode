class Solution {
    public boolean increasingTriplet(int[] nums) {
        int n = nums.length;
        if (n < 3) {
            return false;
        }

        int min1 = nums[0], min2 = Integer.MAX_VALUE, candMin1 = nums[0], candMin2 = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            if (nums[i] < candMin1 && nums[i] < candMin2) {
                candMin1 = nums[i];
                candMin2 = Integer.MAX_VALUE;
            } else if (nums[i] < candMin2 && nums[i] > candMin1) {
                candMin2 = nums[i];
            }

            if (candMin1 <= min1 && candMin2 <= min2) {
                min1 = candMin1;
                min2 = candMin2;
            }

            if (min1 < min2 && min2 < nums[i]) {
                return true;
            }
        }

        return false;
    }
}