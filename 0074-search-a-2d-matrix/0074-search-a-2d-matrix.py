class Solution:
    def searchMatrix(self, matrix: List[List[int]], target: int) -> bool:
        row = 0
        while row < len(matrix) - 1 and matrix[row+1][0] <= target:
            row += 1
        
        left = 0
        right = len(matrix[row]) - 1
        mid = 0
        while left <= right:
            mid = (left + right) // 2
            if matrix[row][mid] < target:
                left = mid + 1
            elif matrix[row][mid] > target:
                right = mid - 1
            else:
                return True

        return False 
                