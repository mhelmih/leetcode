class Solution {
    public String reverseVowels(String s) {
        char[] word = s.toCharArray();
        String vowels = "aiueoAIUEO";
        int i = 0;
        int j = s.length() - 1;

        while (i < j) {
            while (i < j && !vowels.contains(String.valueOf(word[i]))) {
                i++;
            }

            while (j > i && !vowels.contains(String.valueOf(word[j]))) {
                j--;
            }

            char temp = word[i];
            word[i] = word[j];
            word[j] = temp;
            i++;
            j--;
        }

        return new String(word);
    }
}