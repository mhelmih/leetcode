class Solution:
    def isValidSudoku(self, board: List[List[str]]) -> bool:
        row = [[0 for _ in range(9)] for _ in range(9)]
        col = [[0 for _ in range(9)] for _ in range(9)]
        box = [[0 for _ in range(9)] for _ in range(9)]

        for i in range(9):
            for j in range(9):
                if board[i][j] != ".":
                    num = ord(board[i][j]) - ord('1')
                    boxIdx = (i//3) * 3 + (j//3)
                    if row[i][num] or col[j][num] or box[boxIdx][num]:
                        return False
                    else:
                        row[i][num] = 1
                        col[j][num] = 1
                        box[boxIdx][num] = 1

        return True
