class Solution {
    public String mergeAlternately(String word1, String word2) {
        int longerLen = 0;
        if (word1.length() >= word2.length()) {
            longerLen = word1.length();
        } else {
            longerLen = word2.length();
        }

        int i = 0;
        String res = "";
        while (i < longerLen) {
            if (i < word1.length()) {
                res += word1.charAt(i);
            }
            if (i < word2.length()) {
                res += word2.charAt(i);
            }
            i++;
        }

        return res;
    }
}