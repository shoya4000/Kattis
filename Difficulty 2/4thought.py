# 4 thought
# Write a program which, given an integer n as input, will produce a mathematical expression whose solution is n. The solution is restricted to using exactly four 4’s and exactly three of the binary operations selected from the set {∗,+,−,/}. The number 4 is the ONLY number you can use. You are not allowed to concatenate fours to generate other numbers, such as 44 or 444.
# For example given n=0, a solution is 4∗4−4∗4=0. Given n=7, a solution is 4+4−4 / 4=7. Division is considered truncating integer division, so that 1/4 is 0 (instead of 0.25). Assume the usual precedence of operations so that 4+4∗4=20, not 32. Not all integer inputs have solutions using four 4’s with the aforementioned restrictions (consider n=11).
# Hint: Using your forehead and some forethought should make an answer
# forthcoming. When in doubt use the fourth.

# Input
# Input begins with an integer 1≤m≤1000, indicating the number of test
# cases that follow. Each of the next m lines contain exactly one integer
# value for n in the range −1000000≤n≤1000000.

# Output
# For each test case print one line of output containing either an
# equation using four 4’s to reach the target number or the phrase no
# solution. Print the equation following the format of the sample output;
# use spaces to separate the numbers and symbols printed. If there is more
# than one such equation which evaluates to the target integer, print any
# one of them.

# Sample Input 1  Sample Output 1
# 5                  4 + 4 + 4 / 4 = 9
# 9                  4 * 4 - 4 * 4 = 0
# 0                  4 + 4 - 4 / 4 = 7
# 7                  no solution
# 11                 4 * 4 + 4 + 4 = 24
# 24

# Solution accepted: 2018-12-02 01:34:53

import sys


def precalc():
    results = {}
    operations = ["*", "+", "-", "//"]
    for i in range(4):
        for j in range(4):
            for k in range(4):
                line = "4 " + \
                    operations[i] + " 4 " + operations[j] + \
                    " 4 " + operations[k] + " 4"
                index = eval(line)
                if index in results:
                    continue
                else:
                    results[index] = line.replace("//", "/")
    return results
# This returns the only 22 possible values
# 4 * 4 * 4 * 4 = 256
# 4 * 4 * 4 + 4 = 68
# 4 * 4 * 4 - 4 = 60
# 4 * 4 * 4 / 4 = 16
# 4 * 4 + 4 * 4 = 32
# 4 * 4 + 4 + 4 = 24
# 4 * 4 + 4 / 4 = 17
# 4 * 4 - 4 * 4 = 0
# 4 * 4 - 4 - 4 = 8
# 4 * 4 - 4 / 4 = 15
# 4 * 4 / 4 / 4 = 1
# 4 + 4 + 4 / 4 = 9
# 4 + 4 - 4 * 4 = -8
# 4 + 4 - 4 / 4 = 7
# 4 + 4 / 4 / 4 = 4
# 4 - 4 * 4 * 4 = -60
# 4 - 4 * 4 - 4 = -16
# 4 - 4 - 4 / 4 = -1
# 4 / 4 + 4 / 4 = 2
# 4 / 4 - 4 * 4 = -15
# 4 / 4 - 4 - 4 = -7
# 4 / 4 / 4 - 4 = -4


def main(input):
    precalculated = precalc()

    m = input.readline().strip()
    m = int(m)
    result = ""
    for i in range(m):
        n = input.readline()
        n = int(n)
        if n in precalculated:
            result += precalculated[n] + " = " + str(n)
        else:
            result += "no solution"
        if i < (m - 1):
            result += "\n"
    print(result)

if __name__ == '__main__':
    main(sys.stdin)
