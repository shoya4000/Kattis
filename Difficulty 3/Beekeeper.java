/*Beekeeper
It’s Bill the beekeeper again. In this problem, we learn that didn’t choose his career for the best reason. Bill chose to be a beekeeper because he really, really likes the look of the double e’s in the word “beekeeper”. Your task is to help identify other words Bill will really like.
Bill’s affinity for a word is determined by how many pairs of double vowels it has, where vowels are the letters {a,e,i,o,u,y}. Given a list of words, find the word that has the most pairs of double vowels, as it will be Bill’s favorite word.
Notes:
    It is guaranteed that there will be a unique correct answer. That is, one word in the list will have strictly more pairs of vowels than all other words in the list.
    No word in the input will have three or more of the same vowel consecutively, because that would just be too much for poor Bill.
Input
The input will contain multiple test cases, up to 10. The first line of each case contains N, the number of words in that case (0<N≤1000). The next N lines will contain the words that make up that case. Each word will contain only lowercase English letters [a-z], and no word will be longer than 80characters. Words will not necessarily be actual English words, but they will contain at least one letter. The input will be terminated by a line containing a single zero.

Output
For each case, print Bill’s favorite word. Each output should be printed on its own line.

Sample Input 1  Sample Output 1
4                   beekeeper
artist              yeehaaw
engineer
beekeeper
programmer
3
bookkatt
jailaikia
yeehaaw
0

Solution accepted: 2017-01-18 20:11:46
*/

import java.util.*;

public class Beekeeper
{
    public static void main(String [] args)
    {
        Scanner scanner = new Scanner(System.in);
        while(true)
        {
            int numwords = scanner.nextInt();
            if(numwords == 0)
            {
                break;
            }

            String[] words = new String[numwords];
            int faveindex = 0;
            int maxnumdoubles = 0;
            for(int i = 0; i < numwords; i++)
            {
                int currentdoubles = 0;
                words[i] = scanner.next();
                for(int j = 0; j < words[i].length() - 1; j++)
                {
                    if(words[i].toLowerCase().charAt(j) == 'a')
                    {
                        if(words[i].toLowerCase().charAt(j + 1) == 'a')
                        {
                            currentdoubles++;
                            j++;
                        }
                    }
                    else if(words[i].toLowerCase().charAt(j) == 'e')
                    {
                        if(words[i].toLowerCase().charAt(j + 1) == 'e')
                        {
                            currentdoubles++;
                            j++;
                        }
                    }
                    else if(words[i].toLowerCase().charAt(j) == 'i')
                    {
                        if(words[i].toLowerCase().charAt(j + 1) == 'i')
                        {
                            currentdoubles++;
                            j++;
                        }
                    }
                    else if(words[i].toLowerCase().charAt(j) == 'o')
                    {
                        if(words[i].toLowerCase().charAt(j + 1) == 'o')
                        {
                            currentdoubles++;
                            j++;
                        }
                    }
                    else if(words[i].toLowerCase().charAt(j) == 'u')
                    {
                        if(words[i].toLowerCase().charAt(j + 1) == 'u')
                        {
                            currentdoubles++;
                            j++;
                        }
                    }
                    else if(words[i].toLowerCase().charAt(j) == 'y')
                    {
                        if(words[i].toLowerCase().charAt(j + 1) == 'y')
                        {
                            currentdoubles++;
                            j++;
                        }
                    }
                }
                if(currentdoubles > maxnumdoubles)
                {
                    faveindex = i;
                    maxnumdoubles = currentdoubles;
                }
            }
            System.out.println(words[faveindex]);
        }
    }
}