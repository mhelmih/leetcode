class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        Map<Integer, Integer> temp = new HashMap<Integer, Integer>();
        List<List<Integer>> res = new ArrayList<>();
        res.add(new ArrayList<Integer>());
        res.add(new ArrayList<Integer>());

        for (int i = 0; i < nums1.length; i++) {
            if (!temp.containsKey(nums1[i])) {
                temp.put(nums1[i], 1);
            }
        }

        for (int i = 0; i < nums2.length; i++) {
            if (!temp.containsKey(nums2[i])) {
                temp.put(nums2[i], -1);
            } else if (temp.get(nums2[i]) == 1) {
                temp.put(nums2[i], 0);
            }
        }

        List<Integer> keys = new ArrayList<Integer>(temp.keySet());
        for (Integer key : keys) {
            if (temp.get(key) == 1) {
                res.get(0).add(key);
            } else if (temp.get(key) == -1) {
                res.get(1).add(key);
            }
        }

        return res;
    }
}