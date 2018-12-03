/*T9 Spelling
The Latin alphabet contains 26 characters and telephones only have ten digits on the keypad. We would like to make it easier to write a message to your friend using a sequence of keypresses to indicate the desired characters. The letters are mapped onto the digits as shown below. To insert the character ‘B’ for instance, the program would press “22”. In order to insert two characters in sequence from the same key, the user must pause before pressing the key a second time. The space character ‘ ’ should be printed to indicate a pause. For example, “2 2” indicates “AA” whereas “22” indicates “B”.

Input
The first line of input gives the number of cases, N,1≤N≤100. N test cases follow. Each case is a line of text containing the desired message, which will be at most 1000 characters long. Each message will consist of only lowercase characters ‘a’–‘z’ and space characters ‘ ’. Pressing zero emits a space.

Output
For each test case, output one line containing “Case #x: ” followed by the message translated into the sequence of key presses.

Sample Input 1 	Sample Output 1
4					Case #1: 44 444
hi					Case #2: 999337777
yes					Case #3: 333666 6660 022 2777
foo  bar 			Case #4: 4433555 555666096667775553
hello world

Solution accepted: 2017-05-03 17:33:19
*/
import java.util.*;

public class T9Spelling
{
    public static void main(String [] args)
    {
        Scanner scanner = new Scanner(System.in);

        int cases = scanner.nextInt();
        scanner.nextLine();

        for(int i = 0; i < cases; i++)
        {
            String input = scanner.nextLine();

            System.out.print("Case #" + (i + 1) + ": ");

            for(int j = 0; j < input.length(); j++)
            {
                char toCheck = input.charAt(j);
                if(toCheck == ' ')
                {
                    if(j > 0)
                    {
                        if(input.charAt(j - 1) == ' ')
                        {
                            System.out.print(" ");
                        }
                    }
                    System.out.print("0");
                }
                else if(toCheck == 'a')
                {
                    if(j > 0)
                    {
                        if(input.charAt(j - 1) == 'a' || input.charAt(j - 1) == 'b' || input.charAt(j - 1) == 'c')
                        {
                            System.out.print(" ");
                        }
                    }
                    System.out.print("2");
                }
                else if(toCheck == 'b')
                {
                    if(j > 0)
                    {
                        if(input.charAt(j - 1) == 'a' || input.charAt(j - 1) == 'b' || input.charAt(j - 1) == 'c')
                        {
                            System.out.print(" ");
                        }
                    }
                    System.out.print("22");
                }
                else if(toCheck == 'c')
                {
                    if(j > 0)
                    {
                        if(input.charAt(j - 1) == 'a' || input.charAt(j - 1) == 'b' || input.charAt(j - 1) == 'c')
                        {
                            System.out.print(" ");
                        }
                    }
                    System.out.print("222");
                }
                else if(toCheck == 'd')
                {
                    if(j > 0)
                    {
                        if(input.charAt(j - 1) == 'd' || input.charAt(j - 1) == 'e' || input.charAt(j - 1) == 'f')
                        {
                            System.out.print(" ");
                        }
                    }
                    System.out.print("3");
                }
                else if(toCheck == 'e')
                {
                    if(j > 0)
                    {
                        if(input.charAt(j - 1) == 'd' || input.charAt(j - 1) == 'e' || input.charAt(j - 1) == 'f')
                        {
                            System.out.print(" ");
                        }
                    }
                    System.out.print("33");
                }
                else if(toCheck == 'f')
                {
                    if(j > 0)
                    {
                        if(input.charAt(j - 1) == 'd' || input.charAt(j - 1) == 'e' || input.charAt(j - 1) == 'f')
                        {
                            System.out.print(" ");
                        }
                    }
                    System.out.print("333");
                }
                else if(toCheck == 'g')
                {
                    if(j > 0)
                    {
                        if(input.charAt(j - 1) == 'g' || input.charAt(j - 1) == 'h' || input.charAt(j - 1) == 'i')
                        {
                            System.out.print(" ");
                        }
                    }
                    System.out.print("4");
                }
                else if(toCheck == 'h')
                {
                    if(j > 0)
                    {
                        if(input.charAt(j - 1) == 'g' || input.charAt(j - 1) == 'h' || input.charAt(j - 1) == 'i')
                        {
                            System.out.print(" ");
                        }
                    }
                    System.out.print("44");
                }
                else if(toCheck == 'i')
                {
                    if(j > 0)
                    {
                        if(input.charAt(j - 1) == 'g' || input.charAt(j - 1) == 'h' || input.charAt(j - 1) == 'i')
                        {
                            System.out.print(" ");
                        }
                    }
                    System.out.print("444");
                }
                else if(toCheck == 'j')
                {
                    if(j > 0)
                    {
                        if(input.charAt(j - 1) == 'j' || input.charAt(j - 1) == 'k' || input.charAt(j - 1) == 'l')
                        {
                            System.out.print(" ");
                        }
                    }
                    System.out.print("5");
                }
                else if(toCheck == 'k')
                {
                    if(j > 0)
                    {
                        if(input.charAt(j - 1) == 'j' || input.charAt(j - 1) == 'k' || input.charAt(j - 1) == 'l')
                        {
                            System.out.print(" ");
                        }
                    }
                    System.out.print("55");
                }
                else if(toCheck == 'l')
                {
                    if(j > 0)
                    {
                        if(input.charAt(j - 1) == 'j' || input.charAt(j - 1) == 'k' || input.charAt(j - 1) == 'l')
                        {
                            System.out.print(" ");
                        }
                    }
                    System.out.print("555");
                }
                else if(toCheck == 'm')
                {
                    if(j > 0)
                    {
                        if(input.charAt(j - 1) == 'm' || input.charAt(j - 1) == 'n' || input.charAt(j - 1) == 'o')
                        {
                            System.out.print(" ");
                        }
                    }
                    System.out.print("6");
                }
                else if(toCheck == 'n')
                {
                    if(j > 0)
                    {
                        if(input.charAt(j - 1) == 'm' || input.charAt(j - 1) == 'n' || input.charAt(j - 1) == 'o')
                        {
                            System.out.print(" ");
                        }
                    }
                    System.out.print("66");
                }
                else if(toCheck == 'o')
                {
                    if(j > 0)
                    {
                        if(input.charAt(j - 1) == 'm' || input.charAt(j - 1) == 'n' || input.charAt(j - 1) == 'o')
                        {
                            System.out.print(" ");
                        }
                    }
                    System.out.print("666");
                }
                else if(toCheck == 'p')
                {
                    if(j > 0)
                    {
                        if(input.charAt(j - 1) == 'p' || input.charAt(j - 1) == 'q' || input.charAt(j - 1) == 'r' || input.charAt(j - 1) == 's')
                        {
                            System.out.print(" ");
                        }
                    }
                    System.out.print("7");
                }
                else if(toCheck == 'q')
                {
                    if(j > 0)
                    {
                        if(input.charAt(j - 1) == 'p' || input.charAt(j - 1) == 'q' || input.charAt(j - 1) == 'r' || input.charAt(j - 1) == 's')
                        {
                            System.out.print(" ");
                        }
                    }
                    System.out.print("77");
                }
                else if(toCheck == 'r')
                {
                    if(j > 0)
                    {
                        if(input.charAt(j - 1) == 'p' || input.charAt(j - 1) == 'q' || input.charAt(j - 1) == 'r' || input.charAt(j - 1) == 's')
                        {
                            System.out.print(" ");
                        }
                    }
                    System.out.print("777");
                }
                else if(toCheck == 's')
                {
                    if(j > 0)
                    {
                        if(input.charAt(j - 1) == 'p' || input.charAt(j - 1) == 'q' || input.charAt(j - 1) == 'r' || input.charAt(j - 1) == 's')
                        {
                            System.out.print(" ");
                        }
                    }
                    System.out.print("7777");
                }
                else if(toCheck == 't')
                {
                    if(j > 0)
                    {
                        if(input.charAt(j - 1) == 't' || input.charAt(j - 1) == 'u' || input.charAt(j - 1) == 'v')
                        {
                            System.out.print(" ");
                        }
                    }
                    System.out.print("8");
                }
                else if(toCheck == 'u')
                {
                    if(j > 0)
                    {
                        if(input.charAt(j - 1) == 't' || input.charAt(j - 1) == 'u' || input.charAt(j - 1) == 'v')
                        {
                            System.out.print(" ");
                        }
                    }
                    System.out.print("88");
                }
                else if(toCheck == 'v')
                {
                    if(j > 0)
                    {
                        if(input.charAt(j - 1) == 't' || input.charAt(j - 1) == 'u' || input.charAt(j - 1) == 'v')
                        {
                            System.out.print(" ");
                        }
                    }
                    System.out.print("888");
                }
                else if(toCheck == 'w')
                {
                    if(j > 0)
                    {
                        if(input.charAt(j - 1) == 'w' || input.charAt(j - 1) == 'x' || input.charAt(j - 1) == 'y' || input.charAt(j - 1) == 'z')
                        {
                            System.out.print(" ");
                        }
                    }
                    System.out.print("9");
                }
                else if(toCheck == 'x')
                {
                    if(j > 0)
                    {
                        if(input.charAt(j - 1) == 'w' || input.charAt(j - 1) == 'x' || input.charAt(j - 1) == 'y' || input.charAt(j - 1) == 'z')
                        {
                            System.out.print(" ");
                        }
                    }
                    System.out.print("99");
                }
                else if(toCheck == 'y')
                {
                    if(j > 0)
                    {
                        if(input.charAt(j - 1) == 'w' || input.charAt(j - 1) == 'x' || input.charAt(j - 1) == 'y' || input.charAt(j - 1) == 'z')
                        {
                            System.out.print(" ");
                        }
                    }
                    System.out.print("999");
                }
                else if(toCheck == 'z')
                {
                    if(j > 0)
                    {
                        if(input.charAt(j - 1) == 'w' || input.charAt(j - 1) == 'x' || input.charAt(j - 1) == 'y' || input.charAt(j - 1) == 'z')
                        {
                            System.out.print(" ");
                        }
                    }
                    System.out.print("9999");
                }
            }
            System.out.println();
        }
    }
}