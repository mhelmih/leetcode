class Solution {
    public int removeDuplicates(int[] nums) {
        int k = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] <= nums[i - 1]) {
                int m = i;
                for (int j = m + 1; j < nums.length; j++) {
                    if (nums[m] < nums[j] && nums[j] > nums[k - 1]) {
                        int temp = nums[m];
                        nums[m] = nums[j];
                        nums[j] = temp;
                        k++;
                        break;
                    }
                }
            } else if (nums[i] > nums[k - 1]) {
                k++;
            }
        }

        return k;
    }
}