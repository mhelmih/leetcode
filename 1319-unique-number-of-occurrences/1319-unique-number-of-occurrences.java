class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer, Integer> temp1 = new HashMap<Integer, Integer>();
        int uniqueCount = 0;

        for (int nums: arr) {
            if (temp1.containsKey(nums)) {
                temp1.put(nums, temp1.get(nums) + 1);
            } else {
                temp1.put(nums, 1);
                uniqueCount++;
            }
        }

        Set<Integer> values = new HashSet<Integer>(temp1.values());
        return values.size() == uniqueCount;
    }
}