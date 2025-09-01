class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans = new ArrayList<>();
        
        int[][] pascal = new int[numRows][numRows];
        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < numRows; j++) {
                pascal[i][j] = 1;
            }
        }

        for (int i = 1; i < numRows; i++) {
            for (int j = 1; j < numRows; j++) {
                pascal[i][j] = pascal[i - 1][j] + pascal[i][j - 1];
            }
        }

        for (int i = 1; i <= numRows; i++) {
            List<Integer> temp = new ArrayList<>();
            
            int j = 0;
            int k = i - 1;
            while (j < i) {
                temp.add(pascal[j][k]);
                j++;
                k--;
            }

            ans.add(temp);
        }

        return ans;
    }
}