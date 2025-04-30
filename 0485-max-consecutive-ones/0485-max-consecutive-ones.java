class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max = 0;
        int i = 0;
        while (i < nums.length) {
            int j = i + 1;
            if (nums[i] == 1) {
                int temp = 1;
                while (j < nums.length && nums[j] != 0) {
                    temp++;
                    j++;
                }
                if (temp > max) {
                    max = temp;
                }
            }
            i = j;
        }
        return max;
    }
}