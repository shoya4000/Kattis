/*Carousel Rides
Carl likes to ride the carousel. Carousel operators often offer discounts for buying multiple rides. He wonders which of the discounts provides the best value.
Write a program to help him.

Input
The input will contain multiple test cases, up to 100. A test case starts with a line containing two integers n (1≤n≤10) and m (1≤m≤20). Carl will not take
advantage of offers that require him to buy more than m tickets. Following this are n lines, each with integers a and b which each represent an offer to buy a
tickets for $b.
The input will be terminated by a line containing the characters 0 0.

Output
For each test case, print Buy a tickets for $b for the best offer that matches his requirements. If there are multiple best offers, print the one which buys more tickets.
If there is no suitable offer, print No suitable tickets offered.

Sample Input 1 		Sample Output 1

3 5					Buy 3 tickets for $5
1 3					Buy 1 tickets for $3
3 5					Buy 2 tickets for $4
4 7					No suitable tickets offered
3 2
3 5
1 3
4 7
3 2
3 6
1 2
2 4
1 3
4 10
0 0

Solution accepted: 2016-10-19 20:23:31
*/

import java.util.*;

public class Carousel
{
    public static void main(String [] args)
    {
        Scanner scanner = new Scanner(System.in);
        while(true)
        {
            int cases = scanner.nextInt();
            int maxTix = scanner.nextInt();
            if(cases == 0 && maxTix == 0)
            {
                break;
            }
            int[] solution = {0, 0};
            double bestRatio = 9999;
            for(int i = 0; i < cases; i++)
            {
                int[] offer = new int[2];
                offer[0] = scanner.nextInt();
                offer[1] = scanner.nextInt();
                if(offer[0] <= maxTix && ((double)offer[1] / offer[0]) < bestRatio)
                {
                    solution[1] = offer[1];
                    solution[0] = offer[0];
                    bestRatio = ((double)offer[1] / offer[0]);
                }
                else if(offer[0] <= maxTix && ((double)offer[1] / offer[0]) == bestRatio && offer[0] > solution[0])
                {
                    solution[1] = offer[1];
                    solution[0] = offer[0];
                }
            }
            if(solution[0] == 0 && solution[1] == 0)
            {
                System.out.println("No suitable tickets offered");
            }
            else
            {
                System.out.println("Buy " + solution[0] + " tickets for $" + solution[1]);
            }
        }
    }
}