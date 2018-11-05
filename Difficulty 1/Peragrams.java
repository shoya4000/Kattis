/*Peragrams
Per recently learned about palindromes. Now he wants to tell us about it and also has more awesome scientific news to share with us.
“A palindrome is a word that is the same no matter whether you read it backward or forward”, Per recently said in an interview. He continued: “For example, add is not a palindrome, because reading it backwards gives dda and it’s actually not the same thing, you see. However, if we reorder the letters of the word, we can actually get a palindrome. Hence, we say that add is a Peragram, because it is an anagram of a palindrome”. Per gives us a more formal definition of Peragrams: “Like I said, if a word is an anagram of at least one palindrome, we call it a Peragram. And recall that an anagram of a word w contains exactly the same letters as w, possibly in a different order.”

Task
Given a string, find the minimum number of letters you have to remove from it, so that the string becomes a Peragram.

Input
Input consists of a string on a single line. The string will contain at least 1 and at most 1000 characters. The string will only contain lowercase letters a-z.

Output
Output should consist of a single integer on a single line, the minimum number of characters that have to be removed from the string to make it a Peragram.

Sample Input 1 	Sample Output 1
abc 				2

Sample Input 2 	Sample Output 2
aab 				0

Solution submitted: 2017-03-22 19:24:05
*/
import java.util.*;

public class Peragrams
{
    public static void main(String [] args)
    {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        if(input.length() == 1)
        {
            System.out.println(0);
        }
        else
        {
            int result = 0;
            int[] seen = new int[36];
            for(int i = 0; i < input.length(); i++)
            {
                seen[Character.getNumericValue(input.charAt(i))] += 1;
            }
            boolean foundAone = false;
            for(int i = 0; i < 36; i++)
            {
                if(seen[i] % 2 == 1 && foundAone == false)
                {
                    foundAone = true;
                }
                else if(seen[i] % 2 == 1 && foundAone == true)
                {
                    result++;
                }
            }
            System.out.println(result);
        }
    }
}