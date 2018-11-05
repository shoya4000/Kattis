/*Ones
Given any integer 0≤n≤100000 not divisible by 2 or 5, some multiple of n is a number which in decimal notation is a sequence of 1’s. How many digits are in the smallest such a multiple of n? There are at most 1000 test cases.

Sample Input 1 	Sample Output 1
3					3
7					6
9901				12

Solution submitted: 2017-03-08 19:54:46
*/
import java.util.*;
import java.io.*;

public class Ones
{
    public static void main(String [] args)
    {
        BufferedReader scanner = new BufferedReader(new InputStreamReader(System.in));

        StringBuffer results = new StringBuffer();
        String inputline = new String();
        try
        {
            while ((inputline = scanner.readLine()) != null)
            {
                long inputnumber = Long.parseLong(inputline);
                long testnumber = 1;
                int result = 1;

                while(testnumber % inputnumber != 0)
                {
                    testnumber = (testnumber * 10 + 1) % inputnumber;
                    result++;
                }
                results.append("\n" + result);
            }
            System.out.println(results);
        }
        catch (IOException e)
        {
        }
    }
}