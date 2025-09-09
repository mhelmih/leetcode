class Solution:
    def longestConsecutive(self, nums: List[int]) -> int:
        numsSet = set(nums)
        starts = []

        for i in range(len(nums)):
            if len(numsSet) > 0:
                num = numsSet.pop()
                if num - 1 not in numsSet:
                    starts.append(num)
                numsSet.add(num)
        
        longest = 0
        for i in range(len(starts)):
            count = 1
            for j in range(1, len(numsSet)):
                if starts[i] + j in numsSet:
                    count += 1
                else:
                    break
            if count >= longest:
                longest = count
        
        return longest
