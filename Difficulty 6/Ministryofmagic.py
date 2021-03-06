# Ministry of Magic
# Many countries have a system of government where the parliament chooses the prime minister, who then forms a government. Generally, the parliament needs to elect the prime minister by majority vote. When no single party manages to get a majority in parliament, parties have to form a coalition that gets a majority vote. As a result, some countries have been without a government for years during negotiations!
# The wizarding world realized that lacking a government for years is not sustainable because dark wizards could easily use the lack of government to take over the wizarding world without anyone fighting back. Thus it was decided that the minister of magic would be determined automatically as soon as everyone has cast their votes. The system they use for this is called instant-runoff voting.
# In instant-runoff voting, C candidates compete against each other in up to C−1 rounds. After each round, if one of the candidates gets a majority vote, that candidate is elected. Otherwise, the least popular candidate is eliminated. If two candidates both are equally unpopular, the lowest numbered one is eliminated. Here, a majority vote requires a strict majority, i.e. more than half of the votes.
# Votes for all the rounds are specified before the first round by giving a ranking of all the C candidates. Given such a ranking, a voter will vote for the highest ranked candidate in their ranking that hasn’t been eliminated. For example, if a voter has the ranking 4,1,2,3,5 and the candidates 1,4,5 have been eliminated, the voter will vote for candidate 2 in the next round.
# Just as in the normal world, the wizarding world has a number of parties
# (more specifically P parties). Each party has a number of
# representatives in the parliament that choose the minister. You will be
# given the candidate rankings for each party. Can you determine who will
# win the election?

# Explanation of Sample 1
# The favourite candidate of the four parties are 1, 4, 1 and 4. Each
# party have a single vote, so candidates 1 and 4 get two votes each in
# the first round. In the first two rounds, this means candidates 2 and 3
# have zero votes, so they will be eliminiated (first 2 since it is the
# lower-numbered candidate). Finally, candidate 1 is eliminated since
# candidates 1 and 4 are both equally unpopular with 2 votes, but 1 is the
# lower-numbered candidate. This means candidate 4 wins.

# Input
# The first line contains two integers – the number of candidates C
# (1≤C≤10000) and parties P (1≤P≤100). The next P lines describe each
# party. Each line starts with an integer v (1≤v≤106), the number of votes
# that the party has in the parliament, followed by a permutation of the
# numbers 1,2,…,C, the party’s ranking of the candidates. The ranking is
# given from most preferred candidate to least preferred candidate.

# Output
# Output a single integer, the number of the candidate that is elected.

# Sample Input 1 	Sample Output 1
# 4 4					4
# 1 1 2 3 4
# 1 4 3 2 1
# 1 1 3 2 4
# 1 4 2 3 1

# Solution accepted: 2018-12-09

import sys


def main(input):
    c, p = input.readline().strip().split(' ')
    c, p = int(c), int(p)
    candidates = [0] * c
    partyVotes = []
    votes = []
    for i in range(int(p)):
        row = input.readline().strip().split(' ')
        partyVotes.append(row.pop(0))
        votes.append(row)


if __name__ == '__main__':
    main(sys.stdin)
