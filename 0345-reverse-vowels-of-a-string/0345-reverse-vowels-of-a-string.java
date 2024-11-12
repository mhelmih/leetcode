class Solution {
    public String reverseVowels(String s) {
        List<String> vowels = Arrays.asList("a", "e", "i", "o", "u", "A", "I", "U", "E", "O");
        StringBuilder res = new StringBuilder(s);
        int i = 0, j = s.length() - 1;
        while (i < j && i < s.length() && j > 0) {
            while (i < s.length() && !vowels.contains(String.valueOf(s.charAt(i)))) {
                i++;
            }
            while (j >= 0 && !vowels.contains(String.valueOf(s.charAt(j)))) {
                j--;
            }
            if (i < j && i < s.length() && j > 0) {
                res.setCharAt(i, s.charAt(j));
                res.setCharAt(j, s.charAt(i));
                i++;
                j--;
            }
        }

        return res.toString();
    }
}