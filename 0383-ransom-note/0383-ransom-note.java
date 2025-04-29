class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        char[] c = magazine.toCharArray();
        char[] r = ransomNote.toCharArray();
        int[] alphabetCount = new int[26];

        for (int i = 0; i < c.length; i++) {
            alphabetCount[c[i] - 'a']++;
        }

        boolean ans = true;
        for (int i = 0; i < r.length; i++) {
            alphabetCount[r[i] - 'a'] -= 1;
            if (alphabetCount[r[i] - 'a'] < 0) {
                ans = false;
                break;
            }
        }
        
        return ans;
    }
}