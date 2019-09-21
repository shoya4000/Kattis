# Pairing Socks
# Simone’s mother often complains about how Simone never helps with chores at home. In return, Simone often points out that many of the chores her mother assigns her are NP-complete to perform optimally (like cleaning the house, seating her little brothers around the dinner table in a conflict-free way, splitting the brothers’ Halloween loot in a fair manner and so on).
# Being a computer scientist, her mother finds this a fair objection. Looking over her list of potential chores, she picked one she thinks should be easy to solve – pairing a number of different kinds of socks.
# In the beginning, there are 2n socks stacked in a pile. To pair the socks, Simone can repeatedly make one of three moves:
# 1. Move the sock from the top of the original pile to the top of an auxiliary pile (which is originally empty).
# 2. Move the sock from the top of the auxiliary pile to the top of the original pile.
# 3. Pair the top socks from each pile together, if they are of the same type.
# Simone only has one auxiliary pile, for a total of two piles. There may be more than two socks of each type. In this case, Simone can pair them up however she wants.
# Your task is to help Simone to determine the least number of moves she needs to pair the socks, if it is possible at all.

# Input
# The first line of input contains the integer n (1≤n≤105) as described above. The next line contains 2n integers a1,…,a2n (1≤ai≤109 for each i), where ai denotes the type of sock number i. Initially, sock 1 is at the top of the pile and sock 2n is at the bottom.

# Output
# If Simone can pair all the socks, output the least number of moves she needs to do this. If it is impossible to do so, output “impossible” (without the quotes).

# Solution accepted:

import sys


def main(input):
    print("Hello World")

if __name__ == '__main__':
    main(sys.stdin)
