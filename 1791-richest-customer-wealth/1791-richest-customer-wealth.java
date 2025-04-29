class Solution {
    public int maximumWealth(int[][] accounts) {
        int max = 0;
        for (int i = 0; i < accounts.length; i++) {
            int accountWealth = 0;
            for (int j = 0; j < accounts[i].length; j++) {
                accountWealth += accounts[i][j];
            }
            if (accountWealth > max) {
                max = accountWealth;
            }
        }

        return max;
    }
}