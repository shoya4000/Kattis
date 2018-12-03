/*Coloring Socks
Having discolored his white socks in a rather beige shade (as seen on the picture), Luktas Svettocek realised he can’t just throw all his laundry into one machine and expect it to retain its original colors. However, he is also too lazy to do his laundry in several rounds. He would much rather buy more laundry machines!
Each of Luktas’ socks have a color Di which has a number between 0 and 109 assigned to it. After some experimentation, he found that he could wash any socks with a maximum absolute color difference of K in the same machine without any discoloring. The color difference of two socks i and j is |Di−Dj|.
Luktas now needs to know how many washing machines he needs to wash his S socks, given that each machine can take at most C socks a time.

Input
The first line consists of three integers 1 ≤ S,C ≤ 105 and 0 ≤ K ≤ 109, the number of socks, the capacity of a laundry machine and the maximum color difference, respectively. Then follow one line with S integers; these are the color values Di of every sock.

Output
Output a single integer; the number of machines Luktas needs to wash all his socks.

Sample Input 1  Sample Output 1
5 3 0               3
0 0 1 1 2

Sample Input 2  Sample Output 2
5 3 1               2
0 0 1 1 2

Solution accepted: 2017-01-18 20:50:08
*/

import java.util.*;

public class Color
{
    public static void main(String [] args)
    {
        Scanner scanner = new Scanner(System.in);
        int numsocks = scanner.nextInt();
        int maxsocks = scanner.nextInt();
        int difference = scanner.nextInt();

        int[] socks = new int[numsocks];

        for(int k = 0; k < numsocks; k++)
        {
            socks[k] = scanner.nextInt();
        }
        Arrays.sort(socks);

        int group = 0;
        int total = 1;
        int groupstartindex = 0;
        for(int k = 0; k < numsocks; k++)
        {
            if(group == maxsocks)
            {
                group = 0;
                groupstartindex = k;
                total++;
            }
            if(socks[k] <= socks[groupstartindex] + difference)
            {
                group++;
            }
            else
            {
                group = 1;
                groupstartindex = k;
                total++;
            }
        }
        if(numsocks == 0)
        {
            total = 0;
        }
        System.out.println(total);
    }
}