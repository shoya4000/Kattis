/*Yoda
A long, long time ago in a galaxy far, far away a big collision of integers is taking place right now. What happens when two integers collide? During collision, each digit of one number compares itself to the corresponding digit of the other number (the least significant digit with the other’s least significant digit, and so on). The smaller digit “falls out” of the number containing it. Additionally, if the digits are the same, nothing happens. If a number doesn’t consist of a corresponding digit, then we consider it to be zero. After all comparisons of corresponding digits, the leftover digits in the number come closer and create a new number. See Figure 1 for an example.
Figure 1: Collision example
Write a programme that will, for two given integers, determine their values after collision. If it happens that all the digits of one number fell out, then for that number output the message “YODA”.

Input
The first line of input contains the integer N(1 ≤ N ≤ 109), one of the integers from the task. The second line of input contains the integer M (1 ≤ N ≤ 109), one of the integers from the task.

Output
The first line of output must contain the new value of the first given integer from the task. The second line of output must contain the new value of the second given integer from the task.

Sample Input 1  Sample Output 1
300                 0
500                 500

Sample Input 2  Sample Output 2
65743               673
9651                95

Sample Input 3  Sample Output 3
2341                YODA
6785                6785

Solution accepted: 2017-01-11 00:49:49
*/

import java.util.*;

public class Yoda
{
    public static int cutofflastdigit(int tocut)
    {
        return tocut / 10;
    }
    public static int givedigitforoutput1(int num1, int num2)
    {
        int result = 0;
        int lastdigitof1 = num1 % 10;
        int lastdigitof2 = num2 % 10;

        if(lastdigitof1 >= lastdigitof2)
        {
            result = lastdigitof1;
        }
        return result;
    }
    public static int givedigitforoutput2(int num1, int num2)
    {
        int result = 0;
        int lastdigitof1 = num1 % 10;
        int lastdigitof2 = num2 % 10;

        if(lastdigitof2 >= lastdigitof1)
        {
            result = lastdigitof2;
        }
        return result;
    }
    public static void main(String [] args)
    {
        Scanner scanner = new Scanner(System.in);
        int input1 = scanner.nextInt();
        int input2 = scanner.nextInt();

        int result1 = 0;
        int result2 = 0;
        int factor1 = 1;
        int factor2 = 1;
        boolean yoda = true;

        while(!(input1 == 0 && input2 == 0))
        {
            result1 = (result1) + givedigitforoutput1(input1, input2) * factor1;
            result2 = (result2) + givedigitforoutput2(input1, input2) * factor2;

            if(input1 % 10 == 0 && input2 % 10 == 0 )
            {
                factor1 *= 10;
                factor2 *= 10;
                yoda = false;
            }
            else
            {
                if(input1 % 10 >= input2 % 10)
                {
                    factor1 *= 10;
                }
                if(input2 % 10 >= input1 % 10)
                {
                    factor2 *= 10;
                }
            }
            input1 = cutofflastdigit(input1);
            input2 = cutofflastdigit(input2);
        }
        if(result1 != 0 && result2 != 0)
        {
            while(result1 % 10 == 0)
            {
                result1 = cutofflastdigit(result1);
            }
            while(result2 % 10 == 0)
            {
                result2 = cutofflastdigit(result2);
            }
        }
        if(result1 == 0 && yoda == true)
        {
            System.out.println("YODA");
        }
        else
        {
            System.out.println(result1);
        }
        if(result2 == 0 && yoda == true)
        {
            System.out.println("YODA");
        }
        else
        {
            System.out.println(result2);
        }
    }
}