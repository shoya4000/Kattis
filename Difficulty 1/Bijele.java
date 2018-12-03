/*Bijele
Mirko has found an old chessboard and a set of pieces in his attic. Unfortunately, the set contains only white pieces, and apparently an incorrect number of them.
A set of pieces should contain:
    One king
    One queen
    Two rooks
    Two bishops
    Two knights
    Eight pawns
Mirko would like to know how many pieces of each type he should add or remove to make a valid set.

Input
The input consists of 6 integers on a single line, each between 0 and 10 (inclusive). The numbers are, in order, the numbers of kings, queens, rooks, bishops,
knights and pawns in the set Mirko found.

Output
Output should consist of 6 integers on a single line; the number of pieces of each type Mirko should add or remove. If a number is positive, Mirko needs to add
that many pieces. If a number is negative, Mirko needs to remove pieces.

Sample Input 1 	Sample Output 1

0 1 2 2 2 7			1 0 0 0 0 1

Sample Input 2 	Sample Output 2

2 1 2 1 2 1			-1 0 0 1 0 7

Solution accepted: 2016-09-21 17:04:40
*/

import java.util.*;

public class Bijele
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        int [] in = new int[6];

        for(int j = 0; j < 6; j++)
        {
            in[j] = s.nextInt();
        }

        for(int i = 0; i < 2; i++)
        {
            in[i] = 1 - in[i];
        }

        for(int i = 2; i < 5; i++)
        {
            in[i] = 2 - in[i];
        }
        in[5] = 8 - in[5];

        for(int j = 0; j < 6; j++)
        {
            System.out.print(in[j] + " ");
        }
    }
}