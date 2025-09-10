class Solution:
    def threeSum(self, nums: List[int]) -> List[List[int]]:
        ans = []
        sorted_nums = sorted(nums)
        for i in range(len(nums)):
            if i > 0 and sorted_nums[i] == sorted_nums[i-1]:
                continue

            j = i + 1
            k = len(nums) - 1
            target = -sorted_nums[i]
            while j < k:
                attempt = sorted_nums[j] + sorted_nums[k]

                if attempt == target:
                    ans.append([sorted_nums[i], sorted_nums[j], sorted_nums[k]])
                    j += 1
                    while sorted_nums[j] == sorted_nums[j-1] and j < k:
                        j += 1
                elif attempt > target:
                    k -= 1
                else:
                    j += 1
        
        return ans
