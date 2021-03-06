/*DVDs
Dezider is very unhappy as he just discovered that his DVDs got unsorted. Dezider is (occasionally) very organized and during one of his get-organized spells he numbered the DVDs from 1 to n. He keeps the DVDs in a tall stack and he wants to have them sorted in increasing order by their number, with 1 at the bottom and n at the top of the stack. The trouble is that his space allows him to perform only one type of sorting operation: take a DVD, pull it out of the stack while the DVDs above it fall down by one position, then place it at the top of the stack. What is the smallest number of such operations he needs to do to sort the DVD stack?

Input
The first line contains k, the number of input instances. Each input instance is described on two lines. The first line contains 1 ≤ n ≤ 1000000. The second line lists the DVDs in the initial order on the stack, from the bottom to the top.

Output
The output contains k lines. The i-th line corresponds to the i-th input. It contains the smallest number of operations needed to sort the stack.

Note
In the first sample input it suffices to take DVD 4 and move it to the top of the stack; then the stack is sorted. In the second sample input one can first move DVD 4 and then DVD 5 to get a sorted stack.

Sample Input 1  Sample Output 1
2                   1
4                   2
1 4 2 3
5
5 1 2 4 3

Solution accepted: 2017-01-18 20:20:09
*/

import java.util.*;

public class DVDs
{
    public static void main(String [] args)
    {
        Scanner scanner = new Scanner(System.in);
        int cases = scanner.nextInt();

        for(int k = 0; k < cases; k++)
        {
            int finder = 1;
            int total = 0;
            int numdvds = scanner.nextInt();
            scanner.nextLine();

            StringTokenizer dvds = new StringTokenizer(scanner.nextLine());
            while (dvds.hasMoreTokens())
            {
                if(Integer.parseInt(dvds.nextToken()) == finder)
                {
                    finder++;
                }
                else
                {
                    total++;
                }
            }
            System.out.println(total);
        }
    }
}