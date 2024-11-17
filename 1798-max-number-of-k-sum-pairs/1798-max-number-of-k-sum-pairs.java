class Solution {
    public int maxOperations(int[] nums, int k) {
        int ops = 0;
        int[] sorted = nums.clone();
        Arrays.sort(sorted);

        int i = 0, j = nums.length - 1;
        while (i < j) {
            int sum = sorted[i] + sorted[j];
            if (sum == k) {
                ops++;
                i++;
                j--;
            } else if (sum < k) {
                i++;
            } else {
                j--;
            }
                
        }

        return ops;
    }
}