# Sum Kind of Problem
# For this problem you will compute various running sums of values for
# positive integers.

# Input
# The first line of input contains a single integer P, (1≤P≤10000), which
# is the number of data sets that follow. Each data set should be
# processed identically and independently. Each data set consists of a
# single line of input. It contains the data set number, K, followed by an
# integer N, (1≤N≤10000).

# Output
# For each data set there is one line of output. The single output line consists of the data set number, K, followed by a single space followed by three space separated integers S1, S2 and S3 such that:
#   S1 = The sum of the first N positive integers.
#	S2 = The sum of the first N odd integers.
#	S3 = The sum of the first N even integers.

# Sample Input 1 	Sample Output 1
# 3						1 1 1 2
# 1 1					2 55 100 110
# 2 10					3 501501 1002001 1003002
# 3 1001

# Solution accepted: 2018-12-02 00:00:09

import sys


def main(input):
    p = input.readline().strip()
    result = ""
    for i in range(int(p)):
        k, n = input.readline().split(' ')
        n = int(n)
        # For any Arithemetic Progression, the sum of n terms is given by
        # Sn=(n/2)[2a+(n−1)d], where a is the first term and d is the common
        # difference.
        s1 = int(n * (n + 1) / 2)
        s2 = n * n
        s3 = int(n * (2 * n + 2) / 2)
        result += (k + ' ' + str(s1) + ' ' + str(s2) + ' ' + str(s3) + "\n")
    print(result)

if __name__ == '__main__':
    main(sys.stdin)
