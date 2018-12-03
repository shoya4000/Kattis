/*Zamka
The impossible has happened. Bear G. has fallen into his own trap. Lured by a delicious box of Domaćica, without even thinking, he rushed and fell into his trap. In order to get out of the trap, he must solve the following task with your help. You are given three integers L, D and X.
    determine the minimal integer N such that L≤N≤D and the sum of its digits is X
    determine the maximal integer M such that L≤M≤D and the sum of its digits is X
Bear will be able to escape from the trap if he correctly determines numbers N and M. The numbers N and M will always exist.

Input
The first line of input contains the integer L(1 ≤ L ≤ 10000), the number from the task. The second line of input contains the integer D (1 ≤ D ≤ 10000, L≤D), the number from the task. The third line of input contains the integer X (1 ≤ X ≤ 36), the number from the task.

Output
The first line of output must contain the integer N from the task. The second line of output must contain the integer M from the task.

Sample Input 1  Sample Output 1
1                   4
100                 40
4

Sample Input 2  Sample Output 2
100                 129
500                 480
12

Sample Input 3  Sample Output 3
1                   1
10000               10000
1

Solution accepted: 2017-01-04 21:05:02
*/

import java.util.*;
import java.math.*;

public class Zamka
{
    public static int sumofdigits(int tosum)
    {
        int result = 0;
        while(tosum > 0)
        {
            result = result + tosum % 10;
            tosum = tosum / 10;
        }
        return result;
    }

    public static void main(String [] args)
    {
        Scanner scanner = new Scanner(System.in);
        int l = scanner.nextInt();
        int d = scanner.nextInt();
        int x = scanner.nextInt();

        int n = 0;
        if(sumofdigits(l) == x)
        {
            n = l;
        }
        else
        {
            for(int i = l; i <= d; i++)
            {

                if(sumofdigits(i) == x)
                {
                    n = i;
                    break;
                }
            }
        }
        System.out.println(n);

        int m = 0;
        if(sumofdigits(d) == x)
        {
            m = d;
        }
        else
        {
            for(int i = d; i >= l; i--)
            {
                if(sumofdigits(i) == x)
                {
                    m = i;
                    break;
                }
            }
        }
        System.out.println(m);
    }
}