class Solution {
    public String reverseWords(String s) {
        String[] arr = s.trim().split(" +");
        StringBuilder res = new StringBuilder();
        for (int i = arr.length - 1; i >= 0; i--) {
            if (!arr[i].isEmpty()) {
                res.append(arr[i]);
            }
            if (i != 0) {
                res.append(" ");
            }
        }

        return res.toString();
    }
}