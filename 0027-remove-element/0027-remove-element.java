import java.util.*;

class Solution {
    public int removeElement(int[] nums, int val) {
        int k = 0;
        int j = nums.length - 1;
        for (int i = 0; i < nums.length; i++) {
            while (nums[j] == val && j > 0) {
                j--;
            }
            if (nums[i] == val && i <= j) {
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
            }
            if (nums[i] != val) {
                k++;
            }
        }

        return k;
    }
}