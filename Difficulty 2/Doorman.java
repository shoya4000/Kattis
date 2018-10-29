/*Doorman
The doorman Bruno at the popular night club Heaven is having a hard time fulfilling his duties. He was told by the owner that when the club is full, the number of women and men let into the club should be roughly the same. When the night club opens, people wanting to enter the club are already lined up in a queue, and Bruno can only let them in one-by-one. He lets them in more-or-less in the order they are lined up. He can however decide to let the second person in the queue cut the line and slip into the club before the person in front. This will no doubt upset the person first in line, especially when this happens multiple times, but Bruno is quite a big guy and is capable of handling troublemakers.
Unfortunately though, he is not that strong on mental calculations under these circumstances. He finds keeping track of the difference of the number of women and number of men let into the club a challenging task. As soon as the absolute difference gets too big, he loses track of his counting and must declare to the party people remaining in the queue that the club is full.

Input
The first line of input contains a positive integer X < 100 describing the largest absolute difference between the number of women and number of men let into the club that Bruno can handle.
The second line contains a string consisting solely of the characters ’W’ and ’M’ of length at most 100, describing the genders of the people in the queue, in order of their arrrival. The leftmost character of the string is the gender of the person first in line.
You may assume that the club is large enough to hold all the people in the queue.

Output
The maximum number of people Bruno can let into the club without losing track of his counting.

Sample Input 1 	Sample Output 1
1					9
MWWMWMMWM

Sample Input 2 	Sample Output 2
2					8
WMMMMWWMMMWWMW

Solution submitted: 2016-11-30 18:44:03
*/

import java.util.*;
import java.math.*;

public class Doorman
{
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        int difference = s.nextInt();
        String people = s.next();
        char[] peopleChars = people.toCharArray();

        int women = 0;
        int men = 0;

        for(int i = 0; i < people.length(); i++)
        {
            if(peopleChars[i] == 'W')
            {
                women++;
            }
            else if(peopleChars[i] == 'M')
            {
                men++;
            }

            if(Math.abs(women - men) == difference)
            {
                if(i + 1 >= people.length())
                {
                    break;
                }

                if(men < women && peopleChars[i + 1] == 'M')
                {

                }
                else if(men > women && peopleChars[i + 1] == 'W')
                {

                }
                else if(men < women && peopleChars[i + 1] != 'M')
                {
                    if(peopleChars[i + 2] == 'M')
                    {
                        peopleChars[i + 1] = 'M';
                        peopleChars[i + 2] = 'W';
                    }
                    else
                    {
                        break;
                    }
                }
                else if(men > women && peopleChars[i + 1] != 'W')
                {
                    if(peopleChars[i + 2] == 'W')
                    {
                        peopleChars[i + 1] = 'W';
                        peopleChars[i + 2] = 'M';
                    }
                    else
                    {
                        break;
                    }
                }
                else
                {
                    break;
                }
            }
        }
        System.out.println(women + men);
    }
}