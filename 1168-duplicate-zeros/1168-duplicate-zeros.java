class Solution {
    public void duplicateZeros(int[] arr) {
        int[] temp = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            temp[i] = arr[i];
        }

        int i = 0;
        int j = 0;
        while (i < arr.length) {
            arr[i] = temp[j];
            if (temp[j] == 0 && i < arr.length - 1) {
                i += 1;
                arr[i] = 0;
            }
            
            j++;
            i++;
        }
    }
}