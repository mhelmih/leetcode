class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        for (int e : nums) {
            int idx = Math.abs(e) - 1;
            nums[idx] = Math.abs(nums[idx]) * (-1);
        }

        List<Integer> ans = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                ans.add(i + 1);
            }
        }

        return ans;
    }
}