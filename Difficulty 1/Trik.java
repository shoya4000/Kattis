/*Trik
Jealous of Mirko’s position as head of the village, Borko stormed into his tent and tried to demonstrate Mirko’s incompetence for leadership with a trick.
Borko puts three opaque cups onto the table next to each other (opening facing down) and a small ball under the leftmost cup. He then swaps two cups in one of three possible ways a number of times. Mirko has to tell which cup the ball ends up under.
Wise Mirko grins with his arms crossed while Borko struggles to move the cups faster and faster. What Borko does not know is that programmers in the back are recording all his moves and will use a simple program to determine where the ball is. Write that program.

Input
The first and only line contains a non-empty string of at most 50 characters, Borko’s moves. Each of the characters is ‘A’, ‘B’ or ‘C’ (without quote marks).

Output
Output the index of the cup under which the ball is: 1 if it is under the left cup, 2 if it is under the middle cup or 3 if it is under the right cup.

Sample Input 1 	Sample Output 1
AB 					3

Sample Input 2 	Sample Output 2
CBABCACCC 			1

Solution accepted: 2017-10-16 19:24:43
*/
import java.util.*;
import java.io.*;

public class Trik
{
    public static void main(String [] args)
    {
        BufferedReader scanner = new BufferedReader(new InputStreamReader(System.in));
        try
        {
            String moves = scanner.readLine();
            int position = 1;
            for(int i = 0; i < moves.length(); i++)
            {
                if(moves.charAt(i) == ('A'))
                {
                    if(position == 1)
                    {
                        position = 2;
                    }
                    else if(position == 2)
                    {
                        position = 1;
                    }
                }
                else if(moves.charAt(i) == ('B'))
                {
                    if(position == 2)
                    {
                        position = 3;
                    }
                    else if(position == 3)
                    {
                        position = 2;
                    }
                }
                else if(moves.charAt(i) == ('C'))
                {
                    if(position == 1)
                    {
                        position = 3;
                    }
                    else if(position == 3)
                    {
                        position = 1;
                    }
                }
            }
            System.out.println(position);
        }
        catch (IOException e)
        {
        }
    }
}