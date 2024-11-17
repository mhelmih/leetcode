class Solution {
    public int maxOperations(int[] nums, int k) {
        int ops = 0;
        Map<Integer, ArrayList<Integer>> m = new HashMap<Integer, ArrayList<Integer>>();
        for (int i = 0; i < nums.length; i++) {
            if (m.containsKey(k - nums[i])) {
                m.get(k - nums[i]).remove(0);
                if (m.get(k - nums[i]).isEmpty()) {
                    m.remove(k - nums[i]);
                }
                ops++;
            } else {
                if (m.containsKey(nums[i])) {
                    m.get(nums[i]).add(i);
                } else {
                    m.put(nums[i], new ArrayList<Integer>(Arrays.asList(i)));
                }
            }
        }

        return ops;
    }
}