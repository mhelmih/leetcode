class Solution:
    def twoSum(self, numbers: List[int], target: int) -> List[int]:
        idx1 = 0
        idx2 = len(numbers) - 1

        attempt = numbers[idx1] + numbers[idx2]
        while attempt != target and idx2 - idx1 != 1:
            if numbers[idx1] + numbers[idx2] > target:
                idx2 -= 1
            elif numbers[idx1] + numbers[idx2] < target:
                idx1 += 1

            attempt = numbers[idx1] + numbers[idx2]

        return [idx1 + 1, idx2 + 1]