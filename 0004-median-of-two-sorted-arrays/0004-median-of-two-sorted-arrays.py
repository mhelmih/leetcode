class Solution:
    def findMedianSortedArrays(self, nums1: List[int], nums2: List[int]) -> float:
        if len(nums1) == 0:
            return median(nums2)
        if len(nums2) == 0:
            return median(nums1)

        return median(sorted(nums1 + nums2))
        