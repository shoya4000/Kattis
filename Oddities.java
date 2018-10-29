import java.util.*;

public class Oddities
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        int j = s.nextInt();
        for(int k = 0; k < j; k++)
        {
            int i = s.nextInt();
            if(i % 2 == 0)
            {
                System.out.println(i + " is even");
            }
            else
            {
                System.out.println(i + " is odd");
            }
        }
    }
}
