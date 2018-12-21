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

# Solution accepted: 2018-12-09 18:41:48

import sys


def getPoly(input, n):
    poly = []
    for i in range(n):
        x, y = input.readline().strip().split(' ')
        x, y = int(x), int(y)
        poly.append([x, y])
    return poly


def getArea(n, poly):
    # https://en.wikipedia.org/wiki/Shoelace_formula
    area = 0
    for i in range(n):
        area += (poly[i][0] * poly[(i + 1) % n][1]) - \
                (poly[i][1] * poly[(i + 1) % n][0])
    area /= 2
    if area < 0:
        area *= -1
    return area


def getDirection(n, poly):
    # https://en.wikipedia.org/wiki/Shoelace_formula
    # If the points are labeled sequentially in the counterclockwise
    # direction, then the sum of the above determinants is positive and the
    # absolute value signs can be omitted;[1] if they are labeled in the
    # clockwise direction, the sum of the determinants will be negative. This
    # is because the formula can be viewed as a special case of Green's
    # Theorem.
    direction = 0
    for i in range(n):
        direction += (poly[(i + 1) % n][0] - poly[i][0]) * \
            (poly[(i + 1) % n][1] + poly[i][1])
    if direction > 0:
        return "CW"
    else:
        return "CCW"


def main(input):
    n = int(input.readline())
    while n != 0:
        poly = getPoly(input, n)
        direction = getDirection(n, poly)
        area = getArea(n, poly)
        print(direction + " " + str(area))
        n = int(input.readline())

if __name__ == '__main__':
    main(sys.stdin)
