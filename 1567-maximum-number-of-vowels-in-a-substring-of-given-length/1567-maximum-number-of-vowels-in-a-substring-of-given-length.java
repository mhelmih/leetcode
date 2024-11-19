class Solution {
    public int maxVowels(String s, int k) {
        boolean[] vowels = new boolean['z' + 1];
        vowels['a'] = true;
        vowels['i'] = true;
        vowels['u'] = true;
        vowels['e'] = true;
        vowels['o'] = true;

        char[] sc = s.toCharArray();
        int res = 0;
        for (int i = 0; i < k; i++) {
            if (vowels[sc[i]]) {
                res += 1;
            }
        }

        int temp = res;
        for (int i = k; i < s.length(); i++) {
            if (vowels[sc[i]]) {
                temp += 1;
            }
            if (vowels[sc[i - k]]) {
                temp -= 1;
            }
            res = Math.max(temp, res);
        }

        return res;
    }
}