class Solution {
    public boolean validMountainArray(int[] arr) {
        if (arr.length < 3) {
            return false;
        }
        Boolean incline = false;
        Boolean decline = false;
        for (int i = 1; i < arr.length; i++) {
            System.out.println("i:" + i + " decline: " + decline);
            if (!decline) {
                if (arr[i] < arr[i - 1]) {
                    decline = true;
                } else if (arr[i] == arr[i - 1]) {
                    return false;
                } else {
                    incline = true;
                }
            } else {
                if (arr[i] > arr[i - 1]) {
                    return false;
                } else if (arr[i] == arr[i - 1]) {
                    return false;
                }
            }
        }

        return incline && decline;
    }
}