class Solution:
    def findMedianSortedArrays(self, nums1: List[int], nums2: List[int]) -> float:
        if len(nums1) > len(nums2):
            return self.findMedianSortedArrays(nums2, nums1)

        A = nums1
        B = nums2
        total = len(nums1) + len(nums2)
        half = total // 2

        left = 0
        right = len(A) - 1
        while True:
            i = (left + right) // 2  # mid of A
            j = half - i - 2  # mid of B

            leftA = A[i] if i >= 0 else float("-infinity")
            rightA = A[i+1] if i+1 < len(A) else float("infinity")

            leftB = B[j] if j >= 0 else float("-infinity")
            rightB = B[j+1] if j + 1 < len(B) else float("infinity")
            
            if leftA <= rightB and leftB <= rightA:
                if total % 2 == 1:
                    return min(rightA, rightB)
                else:
                    return (max(leftA, leftB) + min(rightA, rightB)) / 2
            elif leftA > rightB:
                right = i - 1
            else:
                left = i + 1
