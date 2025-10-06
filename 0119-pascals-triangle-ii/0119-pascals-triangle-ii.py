class Solution:
    def getRow(self, rowIndex: int) -> List[int]:
        if rowIndex == 0:
            return [1]
            
        ans = [1 for _ in range(rowIndex + 1)]
        previous_row = self.getRow(rowIndex - 1)

        for i in range(1, len(ans) - 1):
            ans[i] = previous_row[i] + previous_row[i - 1]
        
        return ans