class Solution {
    public int findNumbers(int[] nums) {
        int count = 0;
        for (int num : nums) {
            int temp = 0;
            while (num > 0) {
                num /= 10;
                temp++;
            }
            if (temp % 2 == 0) {
                count++;
            }
        }

        return count;
    }
}