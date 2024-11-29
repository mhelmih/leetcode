class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer, Integer> temp1 = new HashMap<Integer, Integer>();
        for (int num: arr) {
            temp1.put(num, temp1.getOrDefault(num, 0) + 1);
        }

        Set<Integer> values = new HashSet<Integer>(temp1.values());
        return values.size() == temp1.size();
    }
}