/*Ladder
You are attempting to climb up the roof to fix some leaks, and have to go buy a ladder. The ladder needs to reach to the top of the wall, which is h
centimeters high, and in order to be steady enough for you to climb it, the ladder can be at an angle of at most v degrees from the ground. How long does the ladder have to be?

Input
The input consists of a single line containing two integers h
and v, with meanings as described above. You may assume that 1≤h≤10000 and that 1≤v≤89.

Output
Write a single line containing the minimum possible length of the ladder in centimeters, rounded up to the nearest integer.
Sample Input 1 	Sample Output 1

500 70				533

Sample Input 2 	Sample Output 2

1000 10				5759

Solution submitted: 2016-09-21 17:24:38
*/

import java.util.*;

public class Ladder
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        int h = s.nextInt();
        int v = s.nextInt();
        System.out.println((int) Math.ceil(h / Math.sin(Math.toRadians(v))));
    }
}