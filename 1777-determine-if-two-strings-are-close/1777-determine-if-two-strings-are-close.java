class Solution {
    public boolean closeStrings(String word1, String word2) {
        if (word1.length() != word2.length()) {
            return false;
        }

        int[] cw1 = new int[26];
        int[] cw2 = new int[26];

        for (char c : word1.toCharArray()) {
            cw1[c - 'a'] += 1;
        }
        for (char c : word2.toCharArray()) {
            cw2[c - 'a'] += 1;
        }

        for (int i = 0; i < 26; i++) {
            if ((cw1[i] != 0 && cw2[i] == 0) || (cw1[i] == 0 && cw2[i] != 0)) {
                return false;
            }
        }
        
        Arrays.sort(cw1);
        Arrays.sort(cw2);

        for (int i = 0; i < 26; i++) {
            if (cw1[i] != cw2[i]) {
                return false;
            }
        }

        return true;
    }
}