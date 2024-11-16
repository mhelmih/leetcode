class Solution {
    public int compress(char[] chars) {
        int i = 0, j = 0;
        while (i < chars.length) {
            int groupLen = 1;
            while (i + groupLen < chars.length && chars[i + groupLen] == chars[i]) {
                groupLen++;
            }
            chars[j] = chars[i];
            j += 1;
            if (groupLen > 1) {
                char[] length = (String.valueOf(groupLen)).toCharArray();
                for (char c : length) {
                    chars[j] = c;
                    j++;
                }
            }
            i += groupLen;
        }
        
        return j;
    }
}