class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> m = new HashMap<>();
        List<List<String>> res = new ArrayList<>();

        for (String s : strs) {
            char[] tempChars = s.toCharArray();
            Arrays.sort(tempChars);
            String sortedStr = String.valueOf(tempChars);
            List<String> temp = new ArrayList<>();
            if (m.containsKey(sortedStr)) {
                temp = m.get(sortedStr);
            }
            temp.add(s);
            m.put(sortedStr, temp);
        }

        Set<String> keys = m.keySet();
        for (String key : keys) {
            res.add(m.get(key));
        }

        return res;
    }
}