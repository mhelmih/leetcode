class Solution {
    public int searchInsert(int[] nums, int target) {
        int i = 0;
        while (nums[i] < target && i < nums.length - 1) {
            i++;
        }

        if (nums[i] < target && i == nums.length - 1) {
            i++;
        }

        return i;
    }
}