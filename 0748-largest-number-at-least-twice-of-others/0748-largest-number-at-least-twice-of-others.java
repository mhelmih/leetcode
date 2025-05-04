class Solution {
    public int dominantIndex(int[] nums) {
        int firstMaxIdx = 0;
        int secondMaxIdx = 0;
        if (nums[0] > nums[1]) {
            firstMaxIdx = 0;
            secondMaxIdx = 1;
        } else {
            firstMaxIdx = 1;
            secondMaxIdx = 0;
        }
        for (int i = 2; i < nums.length; i++) {
            if (nums[i] > nums[firstMaxIdx]) {
                secondMaxIdx = firstMaxIdx;
                firstMaxIdx = i;
            } else if (nums[i] > nums[secondMaxIdx]) {
                secondMaxIdx = i;
            }
        }

        if (nums[firstMaxIdx] >= 2 * nums[secondMaxIdx]) {
            return firstMaxIdx;
        } else {
            return -1;
        }
    }
}