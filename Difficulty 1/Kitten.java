/*Kitten on a Tree
Ouch! A kitten got stuck on a tree. Fortunately, the tree’s branches are numbered. Given a description of a tree and the position of the kitten, can you write a program to help the kitten down?

Input
The input is a description of a single tree. The first line contains an integer K, denoting the branch on which the kitten got stuck. The next lines each contain two or more integers a,b1,b2,…. Each such line denotes a branching: the kitten can reach a from b1,b2,… on its way down. Thus, a will be closer to the root than any of the bi. The description ends with a line containing -1. Each branch bi will appear on exactly one line. All branch numbers are in the range 1..100, though not necessarily contiguous. You are guaranteed that there is a path from every listed branch to the root. The kitten will sit on a branch that has a number that is different than the root.
The illustration above corresponds to the sample input.

Output
Output the path to the ground, starting with the branch on which the kitten sits.

Sample Input 1 	Sample Output 1
14					14 19 23 24 25
25 24
4 3 1 2
13 9 4 11
10 20 8 7
32 10 21
23 13 19 32 22
19 12 5 14 17 30
14 6 15 16
30 18 31 29
24 23 26
26 27 28
-1

Solution submitted: 2017-03-29 19:44:40
*/
import java.util.*;

public class Kitten
{
    public static boolean isIn(int[] arr, int finding)
    {
        boolean result = false;
        for(int i = 1; i < arr.length; i++)
        {
            if(finding == arr[i])
            {
                result = true;
                break;
            }
        }
        return result;
    }

    public static void main(String [] args)
    {
        Scanner scanner = new Scanner(System.in);

        int kittenPoint = scanner.nextInt();
        scanner.nextLine();

        int[] result = new int[100];
        result[0] = kittenPoint;
        int resultCounter = 1;

        int[][] tree = new int[100][100];

        int row = 0;
        while(scanner.hasNext())
        {
            String inputBranch = scanner.nextLine();
            String[] values = inputBranch.split(" ");
            if(Integer.parseInt(values[0]) == -1)
            {
                break;
            }
            for(int i = 0; i < values.length; i++)
            {
                tree[row][i] = Integer.parseInt(values[i]);
            }
            row++;
        }
        while(kittenPoint != tree[0][0])
        {
            for(int i = 0; i < 100; i++)
            {
                for(int j = 1; j < 100; j++)
                {
                    if(tree[i][j] == 0)
                    {
                        break;
                    }
                    if(tree[i][j] == kittenPoint)
                    {
                        result[resultCounter] = tree[i][0];
                        resultCounter++;

                        kittenPoint = tree[i][0];
                        break;
                    }
                }
            }
        }
        for(int i = 0; i < result.length; i++)
        {
            if(result[i] != 0)
            {
                System.out.print(result[i] + " ");
            }
        }
        System.out.println();
    }
}