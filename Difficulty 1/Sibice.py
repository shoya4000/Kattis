# Sibice
# Young Mirko threw matches all over the floor of his room.
# His mom did not like that and ordered him to put all the matches in a box. Mirko soon noticed that not all of the matches on the floor fit in the box, so he decided to take the matches that don’t fit and throw them in the neighbour’s garbage, where his mom (hopefully) won’t find them.
# Help Mirko determine which of the matches fit in the box his mom gave
# him. A match fits in the box if its entire length can lie on the bottom
# of the box. Mirko examines the matches one by one.

# Input
# The first line of input contains an integer N (1≤N≤50), the number of matches on the floor, and two integers W and H, the dimensions of the box (1≤W≤100, 1≤H≤100).
# Each of the following N lines contains a single integer between 1 and
# 1000 (inclusive), the length of one match.

# Output
# For each match, in the order they were given in the input, output on a
# separate line “DA” if the match fits in the box or “NE” if it does not.

# Sample Input 1  Sample Output 1
# 5 3 4              DA
# 3                  DA
# 4                  DA
# 5                  NE
# 6                  NE
# 7

# Sample Input 2  Sample Output 2
# 2 12 17            NE
# 21                 DA
# 20

# Solution accepted: 2018-12-02 21:58:38

import sys
import math


def main(input):
    n, w, h = input.readline().strip().split(' ')
    w, h = int(w), int(h)
    for i in range(int(n)):
        length = int(input.readline())
        if math.hypot(w, h) >= length:
            print("DA")
        else:
            print("NE")

if __name__ == '__main__':
    main(sys.stdin)
