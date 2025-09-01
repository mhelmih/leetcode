class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> ans = new ArrayList<>();
        int hLength = matrix[0].length;
        int vLength = matrix.length;

        int i = 0;
        int j = 0;
        while (hLength > 0 && vLength > 0) {
            // left to right
            for (int k = 0; k < hLength; k++) {
                ans.add(matrix[j][i]);
                i++;
            }
            hLength -= 1;

            // top to bottom
            i -= 1;
            j += 1;
            for (int k = 0; k < vLength - 1; k++) {
                ans.add(matrix[j][i]);
                j++;
            }
            vLength -= 1;

            if (hLength == 0 || vLength == 0) {
                continue;
            }

            // right to left
            j -= 1;
            i -= 1;
            for (int k = 0; k < hLength; k++) {
                ans.add(matrix[j][i]);
                i--;
            }
            hLength -= 1;

            // bottom to top
            i += 1;
            j -= 1;
            for (int k = 0; k < vLength - 1; k++) {
                ans.add(matrix[j][i]);
                j--;
            }
            vLength -= 1;
            j += 1;
            i += 1;
        }

        return ans;
    }
}