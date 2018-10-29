/*Babelfish
You have just moved from Waterloo to a big city. The people here speak an incomprehensible dialect of a foreign language. Fortunately, you have a dictionary to help you understand them.

Input
Input consists of up to 100000 dictionary entries, followed by a blank line, followed by a message of up to 100000 words. Each dictionary entry is a line containing an English word, followed by a space and a foreign language word. No foreign word appears more than once in the dictionary. The message is a sequence of words in the foreign language, one word on each line. Each word in the input is a non-empty sequence of at most 10 lowercase letters.

Output
Output is the message translated to English, one word per line. Foreign words not in the dictionary should be translated as “eh”.

Sample Input 1  Sample Output 1
dog ogday           cat
cat atcay           eh
pig igpay           loops
froot ootfray
loops oopslay

atcay
ittenkay
oopslay

Solution submitted: 2017-01-11 20:32:27
*/

import java.util.*;

public class Babelfish
{
    public static void main(String [] args)
    {
        Scanner scanner = new Scanner(System.in);
        Hashtable<String, String> words = new Hashtable<String, String>();
        int addindex = 0;
        while(true)
        {
            String line = scanner.nextLine();
            if(line.isEmpty())
            {
                break;
            }
            else
            {
                String splitter[] = line.split(" ", 2);
                words.put(splitter[1], splitter[0]);
            }
        }
        String[] message = new String[100000];
        while(scanner.hasNext())
        {
            String wordtochange = scanner.next();
            if(!words.containsKey(wordtochange))
            {
                wordtochange = "eh";
            }
            else
            {
                wordtochange = words.get(wordtochange);
            }
            message[addindex] = wordtochange;
            addindex++;
        }
        for(int i = 0; i < addindex; i++)
        {
            System.out.println(message[i]);
        }
    }
}