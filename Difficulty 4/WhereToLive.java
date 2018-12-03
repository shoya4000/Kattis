/*Where to Live?
Moving to a new town can be difficult. Finding a good place to live which is close to everything you’re interested in is important. However, since you’re a great programmer, you know that you can solve this problem with an algorithm.
Everything in your virtualized town is laid out on a grid, so every place lies on an integer coordinate grid. You’ll be given a list of coordinates of the places you are interested in in the town, and you need to choose a place to live on the grid. Your program should find the grid location that minimizes the average straight-line squared distance to every place you are interested in (squared distance so that you won’t be too far from any one location).
You can live anywhere on the grid, even if something already exists where you want to live (buildings can always be built taller to accommodate you).

Input
Input consists of a list of up to 100 descriptions for towns you are considering moving to. Each town description starts with a line containing 1≤n≤1000, the number of locations you’re interested in. The next n lines each contain two space-separated integer coordinates x and y, each in the range [0,1000]. No location is repeated within a town. Input ends when n is 0.

Output
For each town, print the location you want to live on the grid. If the best location is not exactly on a grid point, choose the grid point closest to the best location. Break ties by choosing the point that has the smallest x coordinate and then the smallest y coordinate.

Sample Input 1 	Sample Output 1
5					51 32
82 25				27 32
25 16
97 59
38 38
15 21
9
51 13
33 2
8 46
64 25
13 40
39 75
17 42
14 6
3 43
0

Solution accepted: 2017-10-23 18:46:09
*/
import java.util.*;
import java.io.*;

public class WhereToLive
{
    public static double round(double input)
    {
        double temp = input % 1;
        if(temp > 0.5) return Math.ceil(input);
        else return Math.floor(input);
    }

    public static void main(String [] args) throws IOException
    {
        BufferedReader scanner = new BufferedReader(new InputStreamReader(System.in));
        int numLines = Integer.parseInt(scanner.readLine());
        while(numLines != 0)
        {
            String[] inputCoords = new String[2];
            double xTotal = 0;
            double yTotal = 0;
            for(int i = 0; i < numLines; i++)
            {
                inputCoords = scanner.readLine().split(" ");
                xTotal += Integer.parseInt(inputCoords[0]);
                yTotal += Integer.parseInt(inputCoords[1]);
            }
            xTotal = round(xTotal / numLines);
            yTotal = round(yTotal / numLines);

            System.out.println((int)xTotal + " " + (int)yTotal);

            numLines = Integer.parseInt(scanner.readLine());
        }
    }
}