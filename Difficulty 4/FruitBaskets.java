/*Fruit Baskets
Marek is a boss of a fruit company and he sometimes has crazy ideas. He wants to introduce a new product – fruit baskets. They will contain all possible combinations of fruits to satisfy different customer needs, but at most one piece of each fruit. He doesn’t want to have small fruit baskets, so all must contain at least 200 grams of fruit.
You have tolerated his crazy ideas before, but you can’t put up with this one. You realized that the company might end up with 2N−1 different baskets, where N is the number of fruits the company sells. You know that Keram will not understand this argument, so you are going to convince him in a different way. You want to tell him the total weight of fruit in the baskets and tell him that he will need a lot of trucks just to carry all baskets from the collection.
For simplicity, you may assume that all fruits of the same kind weigh the same. You also know that all fruits weigh at least 50 grams.

Input
The first line of input contains an integer N,1≤N≤40. The second line contains N integers – weights of available fruits in grams. All weights are integers between 50 and 1000.

Output
Output one line with one integer – the total weight of all fruit in the baskets that have at least 200 grams of fruit.

Sample Input 1 	Sample Output 1
4					1020
50 60 70 120

Solution accepted: 2017-10-02 20:50:40
*/
import java.util.*;
import java.io.*;

public class FruitBaskets
{
    public static void main(String [] args)
    {

        Scanner scanner = new Scanner(System.in);
        int numOfFruits = scanner.nextInt();
        int[] fruitWeights = new int[numOfFruits];
        long totalWeights = 0;
        for(int i = 0; i < numOfFruits; i++)
        {
            fruitWeights[i] = scanner.nextInt();
            totalWeights += fruitWeights[i];
        }

        totalWeights *= Math.pow(2, numOfFruits - 1);

        int tracking = 0;
        for(int i = 0; i < numOfFruits; i++)
        {
            tracking = fruitWeights[i];
            if(tracking < 200)
            {
                totalWeights -= tracking;
            }
            else
            {
                continue;
            }
            for(int j = i + 1; j < numOfFruits; j++)
            {
                tracking = fruitWeights[i] + fruitWeights[j];
                if(tracking < 200)
                {
                    totalWeights -= tracking;
                }
                else
                {
                    continue;
                }
                for(int k = j + 1; k < numOfFruits; k++)
                {
                    tracking = fruitWeights[i] + fruitWeights[j] + fruitWeights[k];
                    if(tracking < 200)
                    {
                        totalWeights -= tracking;
                    }
                    else
                    {
                        continue;
                    }
                }
            }
        }
        System.out.println(totalWeights);
    }
}