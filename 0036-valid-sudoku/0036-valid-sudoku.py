class Solution:
    def isValidSudoku(self, board: List[List[str]]) -> bool:
        row = [[0 for _ in range(10)] for _ in range(10)]
        col = [[0 for _ in range(10)] for _ in range(10)]
        box = [[0 for _ in range(10)] for _ in range(10)]

        for i in range(9):
            for j in range(9):
                if board[i][j].isdigit():
                    num = int(board[i][j])
                    if row[i][num] or col[j][num] or box[(i//3) * 3 + (j//3)][num]:
                        return False
                    else:
                        row[i][num] = 1
                        col[j][num] = 1
                        box[(i//3) * 3 + (j//3)][num] = 1

        return True
