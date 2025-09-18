class Solution:
    def search(self, nums: List[int], target: int) -> int:
        left = 0
        right = len(nums) - 1

        while left < right:
            mid = left + (right - left) // 2
            print(mid)
            if nums[mid] < nums[right]:
                if nums[mid] < target and target <= nums[right]:
                    left = mid + 1
                elif nums[mid] == target:
                    return mid
                else:
                    right = mid
            else:
                if nums[left] <= target and target < nums[mid]:
                    right = mid
                elif nums[mid] == target:
                    return mid
                else:
                    left = mid + 1
        
        if nums[left] == target:
            return left
        if nums[right] == target:
            return right
        return -1