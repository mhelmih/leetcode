class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] answer = new int[nums.length];
        int prefixProduct = 1;
        int suffixProduct = 1;

        for (int i = 1; i < nums.length; i++) {
            suffixProduct *= nums[i];
        }

        for (int i = 0; i < nums.length; i++) {
            if (i == 0) {
                answer[i] = suffixProduct;
            } else {
                prefixProduct *= nums[i - 1];
                if (nums[i] == 0) {
                    suffixProduct = 1;
                    for (int j = i + 1; j < nums.length; j++) {
                        suffixProduct *= nums[j];
                    }
                } else {
                    suffixProduct /= nums[i];
                }
                answer[i] = prefixProduct * suffixProduct;
            }
        }

        return answer;
    }
}