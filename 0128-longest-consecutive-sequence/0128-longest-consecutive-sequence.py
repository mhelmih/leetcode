class Solution:
    def longestConsecutive(self, nums: List[int]) -> int:
        if len(nums) == 0:
            return 0
        
        nums_set = set(nums)
        longest = 0

        for num in nums_set:
            if num - 1 not in nums_set:
                count = 1
                curr_num = num
                while curr_num + 1 in nums_set:
                    count += 1
                    curr_num += 1
                longest = max(longest, count)
        
        return longest
