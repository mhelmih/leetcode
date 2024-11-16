class Solution {
    public void moveZeroes(int[] nums) {
        if (nums.length > 1) {
            for (int i = 0; i < nums.length; i++) {
                int j = i;
                if (nums[i] == 0) {
                    while (j < nums.length && nums[j] == 0) {
                        j++;
                    }

                    if (j < nums.length) {
                        int temp = nums[i];
                        nums[i] = nums[j];
                        nums[j] = temp;
                    }
                }
            }
        }
    }
}