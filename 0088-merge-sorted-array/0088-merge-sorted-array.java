class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if (n != 0) {
            int length = m;
            int i = 0; // for nums1
            int j = 0; // for nums2
            while (i < nums1.length && length < nums1.length) {
                if (nums1[i] <= nums2[j] && i < length) {
                    i++;
                } else {
                    for (int k = nums1.length - 1; k > i; k--) {
                        nums1[k] = nums1[k - 1];
                    }
                    nums1[i] = nums2[j];
                    i++;
                    j++;
                    length++;
                }
            }
        }
    }
}