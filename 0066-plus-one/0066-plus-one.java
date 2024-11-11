import java.util.*;

class Solution {
    public int[] plusOne(int[] digits) {
        int i = digits.length - 1;
        int remainder = (digits[i] + 1) / 10;
        digits[i] = (digits[i] + 1) % 10;
        i--;
        
        while (remainder > 0 && i >= 0) {
            int tmp = digits[i] + remainder;
            remainder = tmp / 10;
            digits[i] = tmp % 10;
            i--;
        }

        if (remainder > 0 && i == -1) {
            int[] ans = new int[digits.length + 1];
            ans[0] = 1;
            for (int j = 0; j < digits.length; j++) {
                ans[j + 1] = digits[j];
            }
            return ans;
        }

        return digits;
    }
}