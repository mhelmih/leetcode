class Solution {
    public String reverseVowels(String s) {
        List<String> vowels = Arrays.asList("a", "e", "i", "o", "u", "A", "I", "U", "E", "O");
        List<String> vowelsInS = new ArrayList<String>();
        List<Integer> vowelsIdx = new ArrayList<Integer>();
        for (int i = 0; i < s.length(); i++) {
            if (vowels.contains(String.valueOf(s.charAt(i)))) {
                vowelsInS.add(String.valueOf(s.charAt(i)));
                vowelsIdx.add(i);
            }
        }

        List<String> reversed = new ArrayList<String>();
        for (int i = vowelsInS.size() - 1; i >= 0; i--) {
            reversed.add(vowelsInS.get(i));
        }

        StringBuilder res = new StringBuilder(s);
        for (int i = 0; i < vowelsInS.size(); i++) {
            res.setCharAt(vowelsIdx.get(i), reversed.get(i).charAt(0));
        }
        return res.toString();
    }
}