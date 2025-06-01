class Solution {
    public void printArr(int[] arr) {
        for (int e: arr) {
            System.out.print(e + ",");
        }
        System.out.println();
    }
    public int[] findDiagonalOrder(int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;
        int[] res = new int[m * n];
        res[0] = mat[0][0];
        int i = 0, j = 0, k = 1;
        boolean goUR = true;
        while (k < m * n) {
            if (goUR) {
                if (i - 1 > -1 && j + 1 < n) {
                    i -= 1;
                    j += 1;
                } else if (i - 1 == -1 && j + 1 < n) {
                    j += 1;
                    goUR = false;
                } else if (i - 1 >= -1 && j + 1 == n) {
                    i += 1;
                    goUR = false;
                }
            } else {
               if (i + 1 < m && j - 1 > -1) {
                    i += 1;
                    j -= 1;
                } else if (i + 1 < m && j - 1 == -1) {
                    i += 1;
                    goUR = true;
                } else if (i + 1 == m && j - 1 >= -1) {
                    j += 1;
                    goUR = true;
                }
            }
            // System.out.println("i: " + i + " j: " + j + " goUR: " + goUR);

            res[k] = mat[i][j];
            k++;
            // printArr(res);
        }

        return res;
    }
}