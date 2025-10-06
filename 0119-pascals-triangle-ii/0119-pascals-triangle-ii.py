class Solution:
    def getRow(self, rowIndex: int) -> List[int]:
        temp = [[1 for _ in range(rowIndex + 1)] for _ in range(rowIndex + 1)]
        for i in range(1, rowIndex + 1):
            for j in range(1, rowIndex + 1):
                temp[i][j] = temp[i-1][j] + temp[i][j-1]
        
        ans = []
        i = 0
        j = rowIndex
        while j >= 0:
            ans.append(temp[i][j])
            i += 1
            j -= 1
        
        return ans