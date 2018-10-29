/*I've Been Everywhere, Man
Alice travels a lot for her work. Each time she travels, she visits a single city before returning home.
Someone recently asked her "how many different cities have you visited for work?"" Thankfully Alice has kept a log of her trips. Help Alice figure out the number
of cities she has visited at least once.

Input
The first line of input contains a single positive integer T≤50 indicating the number of test cases. The first line of each test case also contains a single
positive integer n indicating the number of work trips Alice has taken so far. The following n lines describe these trips. The ith such line simply contains
the name of the city Alice visited on her ith trip.
Alice’s work only sends her to cities with simple names: city names only contain lowercase letters, have at least one letter, and do not contain spaces.
The number of trips is at most 100 and no city name contains more than 20 characters.

Output
For each test case, simply output a single line containing a single integer that is the number of distinct cities that Alice has visited on her work trips.

Sample Input 1 	Sample Output 1

2					4
7					1
saskatoon
toronto
winnipeg
toronto
vancouver
saskatoon
toronto
3
edmonton
edmonton
edmonton

Solution submitted: 2016-09-22 13:31:31
*/

import java.util.*;

public class Everywhere
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        int count;
        int trips = s.nextInt();
        int[] results = new int[trips];
        for(int i = 0; i < trips; i++)
        {
            count = 0;
            int cities = s.nextInt();
            String[] cityBuffer = new String[cities];
            for(int j = 0; j < cities; j++)
            {
                cityBuffer[j] = s.next();
                count++;
                for(int k = 0; k < j; k++)
                {
                    if(cityBuffer[k].equals(cityBuffer[j]))
                    {
                        count--;
                        break;
                    }
                }
            }
            results[i] = count;
        }
        for(int i = 0; i < trips; i++)
        {
            System.out.println(results[i]);
        }
    }
}