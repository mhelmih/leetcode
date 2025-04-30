class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if (n != 0) {
            int i = m-1; // for nums1
            int j = n-1; // for nums2
            int k = m + n - 1;
            
            while (j >= 0) {
                if (i >= 0 && nums1[i] > nums2[j]) {
                    nums1[k] = nums1[i];
                    i--;
                } else {
                    nums1[k] = nums2[j];
                    j--;
                }
                k--;
            }
        }
    }
}