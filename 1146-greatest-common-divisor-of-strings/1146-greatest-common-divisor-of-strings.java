class Solution {
    public boolean isDivisible(String str1, String str2, int i) {
        if (str1.length() % i > 0 && str2.length() % i > 0) {
            return false;
        }
        String prefix = str1.substring(0, i);
        return str1.replace(prefix, "").isEmpty() && str2.replace(prefix, "").isEmpty();
    }

    public String gcdOfStrings(String str1, String str2) {
        String res = "";
        for (int i = Math.min(str1.length(), str2.length()); i > 0; i--) {
            if (isDivisible(str1, str2, i)) {
                res = str1.substring(0, i);
                break;
            }
        }

        return res;
    }
}