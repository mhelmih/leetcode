class Solution {
    public int maxVowels(String s, int k) {
        Map<String, Boolean> vowels = new HashMap<String, Boolean>();
        vowels.put("a", true);
        vowels.put("i", true);
        vowels.put("u", true);
        vowels.put("e", true);
        vowels.put("o", true);

        int res = 0;
        for (int i = 0; i < k; i++) {
            if (vowels.containsKey(String.valueOf(s.charAt(i)))) {
                res += 1;
            }
        }

        int temp = res;
        for (int i = k; i < s.length(); i++) {
            if (vowels.containsKey(String.valueOf(s.charAt(i)))) {
                temp += 1;
            }
            if (vowels.containsKey(String.valueOf(s.charAt(i - k)))) {
                temp -= 1;
            }
            res = Math.max(temp, res);
        }

        return res;
    }
}