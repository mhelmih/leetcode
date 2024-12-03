class Solution {
    public boolean closeStrings(String word1, String word2) {
        if (word1.length() != word2.length()) {
            return false;
        }

        char[] w1 = word1.toCharArray();
        char[] w2 = word2.toCharArray();
        Set<Character> sw1 = new HashSet<>(); 
        Set<Character> sw2 = new HashSet<>();
        int[] cw1 = new int[26];
        int[] cw2 = new int[26];

        for (char c : w1) {
            sw1.add(c);
            cw1[c - 'a'] += 1;
        }
        for (char c : w2) {
            sw2.add(c);
            cw2[c - 'a'] += 1;
        }
        
        Arrays.sort(cw1);
        Arrays.sort(cw2);

        if (sw1.equals(sw2) && Arrays.equals(cw1, cw2)) {
            return true;
        }

        return false;
    }
}