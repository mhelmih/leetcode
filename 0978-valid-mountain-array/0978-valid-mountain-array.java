class Solution {
    public boolean validMountainArray(int[] arr) {
        if (arr.length < 3) {
            return false;
        }
        int i = 1;
        while (i < arr.length) { // incline
            if (arr[i] < arr[i - 1]) {
                break;
            } else if (arr[i] == arr[i - 1]) {
                return false;
            } else {
                i++;
            }
        }

        if (i == arr.length) {
            return false;
        }

        int j = arr.length - 2;
        while (j >= 0) {
            if (arr[j] < arr[j + 1]) {
                break;
            } else if (arr[j] == arr[j + 1]) {
                return false;
            } else {
                j--;
            }
        }

        if (j == -1) {
            return false;
        }

        return i > j;
    }
}