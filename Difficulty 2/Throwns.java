/*Game of Throwns
Daenerys frequently invents games to help teach her second grade Computer Science class about various aspects of the discipline. For this week’s lesson she has the children form a circle and (carefully) throw around a petrified dragon egg.
The n children are numbered from 0 to n−1 (it is a Computer Science class after all) clockwise around the circle. Child 0 always starts with the egg. Daenerys will call out one of two things:
    a number t, indicating that the egg is to be thrown to the child who is t positions clockwise from the current egg holder, wrapping around if necessary. If t is negative, then the throw is to the counter-clockwise direction.
	the phrase undo m, indicating that the last m throws should be undone. Note that undo commands never undo other undo commands; they just undo commands described in item 1 above.
For example, if there are 5 children, and the teacher calls out the four throw commands 8 -2 3 undo 2, the throws will start from child 0 to child 3, then from child 3 to child 1, then from child 1 to child 4. After this, the undo 2 instructions will result in the egg being thrown back from child 4 to child 1 and then from child 1 back to child 3. If Daenerys calls out 0 (or n,−n,2n,−2n, etc.) then the child with the egg simply throws it straight up in the air and (carefully) catches it again.
Daenerys would like a little program that determines where the egg should end up if her commands are executed correctly. Don’t ask what happens to the children if this isn’t the case.

Input
Input consists of two lines. The first line contains two positive integers n k (1≤n≤30, 1≤k≤100) indicating the number of students and how many throw commands Daenerys calls out, respectively. The following line contains the k throw commands. Each command is either an integer p (−10000≤p≤10000) indicating how many positions to throw the egg clockwise or undo m (m≥1) indicating that the last m throws should be undone. Daenerys never has the kids undo beyond the start of the game.

Output
Display the number of the child with the egg at the end of the game.

Sample Input 1 	Sample Output 1
5 4					3
8 -2 3 undo 2

Sample Input 2 	Sample Output 2
5 10				2
7 -3 undo 1 4 3 -9 5 undo 2 undo 1 6

Solution accepted: 2017-11-04 11:10:04
*/
import java.util.*;
import java.io.*;

public class Throwns
{
    public static void main(String [] args) throws IOException
    {
        BufferedReader scanner = new BufferedReader(new InputStreamReader(System.in));

        String[] childrenAndMoves = scanner.readLine().split(" ");
        int children = Integer.parseInt(childrenAndMoves[0]);
        int moves = Integer.parseInt(childrenAndMoves[1]);

        String[] instructions = scanner.readLine().split(" ");

        for(int i = 0; i < instructions.length; i++)
        {
            if(instructions[i].equals("undo"))
            {
                int toUndo = Integer.parseInt(instructions[i + 1]);
                int j = 1;
                while(instructions[i - j] == null)
                {
                    j++;
                }
                for(int k = 0; k < toUndo; k++)
                {
                    if(instructions[i - j - k] == null)
                    {
                        toUndo++;
                    }
                    instructions[i - j - k] = null;
                }
                instructions[i] = null;
                instructions[i + 1] = null;
                i++;
            }
        }
        int position = 0;
        for(int i = 0; i < instructions.length; i++)
        {
            if(instructions[i] != null)
            {
                int currentMove = Integer.parseInt(instructions[i]);
                if(currentMove < 0)
                {
                    currentMove = currentMove % children;
                    currentMove = children - Math.abs(currentMove);
                }
                position = position + currentMove;
                if(position >= children)
                {
                    position = position % children;
                }
            }
        }
        System.out.println(position);
    }
}