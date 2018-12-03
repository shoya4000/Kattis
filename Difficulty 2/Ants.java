/*Ants
An army of ants walk on a horizontal pole of length lcm, each with a constant speed of 1 cm/s. When a walking ant reaches an end of the pole, it immediatelly falls off it.
When two ants meet they turn back and start walking in opposite directions. We know the original positions of ants on the pole, unfortunately, we do not know the directions
in which the ants are walking. Your task is to compute the earliest and the latest possible times needed for all ants to fall off the pole.

Input
The first line of input contains one integer giving the number of cases that follow, at most 100. The data for each case start with two integer numbers: the length l of the
pole (in cm) and n, the number of ants residing on the pole. These two numbers are followed by n integers giving the position of each ant on the pole as the distance measured
from the left end of the pole, in no particular order. All input integers are between 0 and 1000000 and they are separated by whitespace.

Output
For each case of input, output two numbers separated by a single space. The first number is the earliest possible time when all ants fall off the pole (if the directions of
their walks are chosen appropriately) and the second number is the latest possible such time.

Sample Input 1 	Sample Output 1

2					4 8
10 3				38 207
2 6 7
214 7
11 12 7 13
176 23 191

Solution accepted: 2016-10-19 19:09:58
*/

import java.util.*;

public class Ants
{
    public static void main(String [] args)
    {
        Scanner scanner = new Scanner(System.in);
        int cases = scanner.nextInt();
        for(int i = 0; i < cases; i++)
        {
            //key to this problem: treat ants as if they pass through each other.
            int poleLength = scanner.nextInt();
            int numAnts = scanner.nextInt();
            int[] positions = new int[numAnts];
            int earliest = 0;
            int latest = 0;
            for(int j = 0; j < numAnts; j++)
            {
                positions[j] = scanner.nextInt();
            }
            for(int j = 0; j < poleLength / 2; j++)
            {
                if(matchPos(positions, poleLength / 2 + j))
                {
                    earliest = (poleLength - poleLength / 2 - j);
                    break;
                }
                else if(matchPos(positions, poleLength / 2 - j))
                {
                    earliest = poleLength / 2 - j;
                    break;
                }
            }
            for(int j = 0; j < poleLength / 2; j++)
            {
                if(matchPos(positions, poleLength - j))
                {
                    latest = poleLength - j;
                    break;
                }
                else if(matchPos(positions, j))
                {
                    latest = poleLength - j;
                    break;
                }
            }
            System.out.println(earliest + " " + latest);
        }
    }

    public static boolean matchPos(int[] arr, int find)
    {
        boolean flag = false;
        for(int i = 0; i < arr.length; i++)
        {
            if(arr[i] == find)
            {
                flag = true;
                break;
            }
        }
        return flag;
    }
}