# Ants
# An army of ants walk on a horizontal pole of length l cm, each with a
# constant speed of 1 cm/s. When a walking ant reaches an end of the pole,
# it immediatelly falls off it. When two ants meet they turn back and
# start walking in opposite directions. We know the original positions of
# ants on the pole, unfortunately, we do not know the directions in which
# the ants are walking. Your task is to compute the earliest and the
# latest possible times needed for all ants to fall off the pole.

# Input
# The first line of input contains one integer giving the number of cases
# that follow, at most 100. The data for each case start with two integer
# numbers: the length l of the pole (in cm) and n, the number of ants
# residing on the pole. These two numbers are followed by n integers
# giving the position of each ant on the pole as the distance measured
# from the left end of the pole, in no particular order. All input
# integers are between 0 and 1000000 and they are separated by whitespace.

# Output
# For each case of input, output two numbers separated by a single space.
# The first number is the earliest possible time when all ants fall off
# the pole (if the directions of their walks are chosen appropriately) and
# the second number is the latest possible such time.

# Solution accepted: 2019-09-20 19:35:16

import sys


def main():
    # key to this problem: treat ants as if they pass through each other.
    cases = int(sys.stdin.readline())
    for i in range(cases):
        length, numAnts = [int(x) for x in sys.stdin.readline().split()]
        pos = []
        while len(pos) < numAnts:
            pos += [int(x) for x in sys.stdin.readline().split()]
        # take ant closest to an edge, then the length - that distance is the
        # longest time
        longest = length - min([min(pos), length - max(pos)])
        # take ant closest to the middle, middle - that distance to middle, is
        # the earliest time
        earliest = length / 2.0 - min([abs(x - (length / 2.0)) for x in pos])
        print str(int(earliest)) + " " + str(longest)

main()
