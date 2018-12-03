/*Sheba's Amoebas
After a successful Kickstarter campaign, Sheba Arriba has raised enough money for her mail-order biology supply company. “Sheba’s Amoebas” can ship Petri dishes already populated with a colony of those tiny one-celled organisms. However, Sheba needs to be able to verify the number of amoebas her company sends out. For each dish she has a black-and-white image that has been pre-processed to show each amoeba as a simple closed loop of black pixels. (A loop is a minimal set of black pixels in which each pixel is adjacent to exactly two other pixels in the set; adjacent means sharing an edge or corner of a pixel.) All black pixels in the image belong to some loop.
Sheba would like you to write a program that counts the closed loops in a rectangular array of black and white pixels. No two closed loops in the image touch or overlap. One particularly nasty species of cannibalistic amoeba is known to surround and engulf its neighbors; consequently there may be amoebas within amoebas. For instance, each of the images in Figure 1 contains four amoebas.

Input
The first line of input contains two integers m and n, (1≤m,n≤100). This is followed by m lines, each containing n characters. A ‘#’ denotes a black pixel, a ‘.’ denotes a white pixel. For every black pixel, exactly two of its eight neighbors are also black.

Output
Display a single integer representing the number of loops in the input.

Sample Input 1 	Sample Output 1
12 12				4
.##########.
#..........#
#..#...##..#
#.##..#..#.#
#......#.#.#
#....#..#..#
#...#.#....#
#..#...#...#
.#..#.#....#
#....#.....#
#.........#.
.#########..

Sample Input 2 	Sample Output 2
12 10				4
.#####....
#.....#...
#..#..#...
#.#.#.#...
#..#..#...
.#...#....
..###.....
......#...
.##..#.#..
#..#..#...
.##.......
..........

Solution accepted: 2017-11-04 12:21:08
*/
import java.util.*;
import java.io.*;

public class Amoebas
{
    static void traceFrom(char[][] dish, int i, int j, int height, int width)
    {
        if(dish[i][j] == '#')
        {
            dish[i][j] = '.';
        }
        if(i + 1 != height && dish[i + 1][j] == '#')
        {
            traceFrom(dish, i + 1, j, height, width);
        }
        if(i - 1 != -1 && dish[i - 1][j] == '#')
        {
            traceFrom(dish, i - 1, j, height, width);
        }
        if(j + 1 != width && dish[i][j + 1] == '#')
        {
            traceFrom(dish, i, j + 1, height, width);
        }
        if(j - 1 != -1 && dish[i][j - 1] == '#')
        {
            traceFrom(dish, i, j - 1, height, width);
        }
        if(i + 1 != height && j + 1 != width && dish[i + 1][j + 1] == '#')
        {
            traceFrom(dish, i + 1, j + 1, height, width);
        }
        if(i - 1 != -1 && j + 1 != width && dish[i - 1][j + 1] == '#')
        {
            traceFrom(dish, i - 1, j + 1, height, width);
        }
        if(i - 1 != -1 && j - 1 != -1 && dish[i - 1][j - 1] == '#')
        {
            traceFrom(dish, i - 1, j - 1, height, width);
        }
        if(i + 1 != height && j - 1 != -1 && dish[i + 1][j - 1] == '#')
        {
            traceFrom(dish, i + 1, j - 1, height, width);
        }
        return;
    }

    public static void main(String [] args) throws IOException
    {
        BufferedReader scanner = new BufferedReader(new InputStreamReader(System.in));

        String[] size = scanner.readLine().split(" ");
        int height = Integer.parseInt(size[0]);
        int width = Integer.parseInt(size[1]);

        char[][] dish = new char[height][width];

        for(int i = 0; i < height; i++)
        {
            String line = scanner.readLine();
            for(int j = 0; j < width; j++)
            {
                dish[i][j] = line.charAt(j);
            }
        }
        int total = 0;
        for(int i = 0; i < height; i++)
        {
            for(int j = 0; j < width; j++)
            {
                if(dish[i][j] == '#')
                {
                    total++;
                    traceFrom(dish, i, j, height, width);
                }
            }
        }
        System.out.println(total);
    }
}