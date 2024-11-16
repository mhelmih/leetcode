class Solution {
    public int compress(char[] chars) {
        int j = 0;
        int len = 0;
        char currChar = chars[0];
        char lastChar = chars[0];
        boolean jIsNumber = false;
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == currChar) {
                len += 1;
            }

            if (chars[i] != currChar || chars.length == 1 || (i == chars.length - 1 && chars[i - 1] == currChar)) {
                chars[j] = currChar;
                lastChar = chars[j];
                currChar = chars[i];
                j++;

                if (len > 1) {
                    char[] length = (String.valueOf(len)).toCharArray();
                    for (int k = 0; k < length.length; k++) {
                        chars[j] = length[k];
                        jIsNumber = true;
                        j++;
                    }

                    len = 1;
                }
            }

            if (currChar != lastChar && i == chars.length - 1) {
                chars[j] = currChar;
                currChar = chars[i];
                j++;
            }
        }

        return j;
    }
}