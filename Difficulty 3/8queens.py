# Eight Queens
# In the game of chess, the queen is a powerful piece. It can attack by moving any number of spaces in its current row, in its column or diagonally.
# In the eight queens puzzle, eight queens must be placed on a standard
# 8×8 chess board so that no queen can attack another. The center figure
# below shows an invalid solution; two queens can attack each other
# diagonally. The figure on the right shows a valid solution. Given a
# description of a chess board, your job is to determine whether or not it
# represents a valid solution to the eight queens puzzle.

# Input
# Input will contain a description of a single chess board, given as eight
# lines of eight characters each. Input lines will consist of only the
# characters ‘.’ and ‘*’. The ‘.’ character represents an empty space on
# the board, and the ‘*’ character represents a queen.

# Output
# Print a single line of output. Print the word “valid” if the given chess
# board is a valid solution to the eight queens problem. Otherwise, print
# “invalid”.

# Sample Input 1  Sample Output 1
# *.......            invalid
# ..*.....
# ....*...
# ......*.
# .*......
# .......*
# .....*..
# ...*....

# Sample Input 2  Sample Output 2
# *.......            valid
# ......*.
# ....*...
# .......*
# .*......
# ...*....
# .....*..
# ..*.....

# Solution accepted: 2018-12-22 16:02:37

import sys


def check(chessboard, position):
    row = position[0]
    column = position[1]
    for i in range(7):
        if column - i - 1 >= 0:
            if chessboard[row][column - i - 1] == "*":
                return False
        if row - i - 1 >= 0:
            if chessboard[row - i - 1][column] == "*":
                return False
        if column - i - 1 >= 0 and row - i - 1 >= 0:
            if chessboard[row - i - 1][column - i - 1] == "*":
                return False
        if row + i + 1 <= 7 and column - i - 1 >= 0:
            if chessboard[row + i + 1][column - i - 1] == "*":
                return False
    return True


def main(input):
    chessboard = []
    result = "valid"
    for i in range(8):
        row = input.readline().strip()
        chessboard.append(list(row))
    queens = 0
    for i in range(8):
        if result == "invalid":
            break
        for j in range(8):
            if chessboard[i][j] == "*":
                queens += 1
                if not check(chessboard, [i, j]):
                    result = "invalid"
                    break
    if queens != 8:
        result = "invalid"
    print(result)

if __name__ == '__main__':
    main(sys.stdin)
