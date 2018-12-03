# Kolone
# When moving, ants form rows so that each ant except the first is behind another ant. It is not widely known what happens when two rows of ants moving in opposite directions run into each other in a passage too narrow for both rows to pass through. One theory says that, in that situation, ants will jump over each other.
# From the moment the rows meet, each second every ant jumps over (or gets
# jumped over, as they agree upon) the ant in front of himself so that the
# two ants swap places, but only if the other ant is moving in the
# opposite direction. Find the order of the ants after T seconds.

# Input
# The first line contains two integers N1 and N2, the numbers of ants in the first and second rows, respectively.
# The next two rows contain the orders of ants in the first and second row (first to last). Each ant is uniquely determined by an uppercase letter of the English alphabet (this letter is unique between both rows).
# The last line of input contains the integer T(0≤T≤50).

# Output
# Output the order of the ants after T seconds on a single line. Our
# viewpoint is such that the first row of ants comes from our left side
# and the other one from our right side.

# Sample Input 1  Sample Output 1
# 3 3                CBADEF
# ABC
# DEF
# 0

# Sample Input 2  Sample Output 2
# 3 3                CDBEAF
# ABC
# DEF
# 2

# Sample Input 3  Sample Output 3
# 3 4                CARLUJO
# JLA
# CRUO
# 3

# Solution submitted: 2018-12-02 21:39:20

import sys


def reverseString(string):
    return string[::-1]


def main(input):
    n1, n2 = input.readline().strip().split(' ')
    ants1 = input.readline().strip()
    ants1 = reverseString(ants1)
    ants2 = input.readline().strip()
    t = input.readline().strip()
    result = list(ants1 + ants2)
    for i in range(int(t)):
        for index, char in enumerate(result[:(int(n1) + int(n2)) - 1:]):
            print("index " + str(index))
            if char in ants1 and result[index + 1] in ants2:
                result[index] = result[index + 1]
                result[index + 1] = char
    print(''.join(result))

if __name__ == '__main__':
    main(sys.stdin)
