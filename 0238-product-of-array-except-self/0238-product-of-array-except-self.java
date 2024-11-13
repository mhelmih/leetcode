class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] answer = new int[nums.length];
        int[] prefixes = new int[nums.length];
        int[] suffixes = new int[nums.length];

        prefixes[0] = 1;
        suffixes[nums.length - 1] = 1;

        for (int i = 1; i < nums.length; i++) {
            prefixes[i] = prefixes[i - 1] * nums[i - 1];
        }

        for (int i = nums.length - 2; i > -1; i--) {
            suffixes[i] = suffixes[i + 1] * nums[i + 1];
        }

        for (int i = 0; i < nums.length; i++) {
            answer[i] = prefixes[i] * suffixes[i];
        }

        return answer;
    }
}