/*Happy Happy Prime Prime
RILEY VASHTEE: [reading from display] Find the next number in the sequence:
313 331 367 ...? What?
THE DOCTOR: 379.
MARTHA JONES: What?
THE DOCTOR: It’s a sequence of happy primes – 379.
MARTHA JONES: Happy what?
THE DOCTOR: Any number that reduces to one when you take the sum of the square of its digits and continue iterating it until it yields 1 is a happy number. Any number that doesn’t, isn’t. A happy prime is both happy and prime.
THE DOCTOR: I dunno, talk about dumbing down. Don’t they teach recreational mathematics anymore?
Excerpted from “Dr. Who,” Episode 42 (2007).

The number 7 is certainly prime. But is it happy?
7499713010→→→→→72=4942+92=9792+72=13012+32=1012+02=1
It is happy :-) As it happens, 7 is the smallest happy prime. Please note that for the purposes of this problem, 1 is not prime.
For this problem you will write a program to determine if a number is a happy prime.

Input
The first line of input contains a single integer P, (1≤P≤10000), which is the number of data sets that follow. Each data set should be processed identically and independently.
Each data set consists of a single line of input. It contains the data set number, K, followed by the happy prime candidate, m, (1≤m≤10000).

Output
For each data set there is a single line of output. The single output line consists of the data set number, K, followed by a single space followed by the candidate, m, followed by a single space, followed by YES or NO, indicating whether m is a happy prime.

Sample Input 1 	Sample Output 1
4					1 1 NO
1 1					2 7 YES
2 7					3 383 YES
3 383				4 1000 NO
4 1000

Solution submitted: 2017-03-08 20:56:44
*/
import java.util.*;

public class HappyPrime
{
    public static void main(String [] args)
    {
        Scanner scanner = new Scanner(System.in);

        String[] happyPrimesTo10000 = {"7", "13", "19",  "23",  "31",  "79",  "97",  "103",  "109",  "139",  "167",  "193",  "239",  "263",  "293",  "313",  "331",  "367",  "379",  "383",  "397",  "409",  "487",  "563",  "617",  "653",  "673",  "683",  "709",  "739",  "761",  "863",  "881",  "907",  "937",  "1009",  "1033",  "1039",  "1093",  "1151",  "1277",  "1303",  "1373",  "1427",  "1447",  "1481",  "1487",  "1511",  "1607",  "1663",  "1697",  "1733",  "1847",  "1933",  "2003",  "2039",  "2063",  "2111",  "2221",  "2309",  "2333",  "2339",  "2383",  "2393",  "2417",  "2557",  "2693",  "2741",  "2833",  "2851",  "2903",  "2963",  "3001",  "3019",  "3067",  "3079",  "3083",  "3109",  "3137",  "3209",  "3301",  "3313",  "3319",  "3323",  "3329",  "3331",  "3371",  "3391",  "3463",  "3607",  "3637",  "3643",  "3673",  "3709",  "3779",  "3797",  "3803",  "3823",  "3833",  "3907",  "3923",  "3931",  "4111",  "4127",  "4157",  "4217",  "4271",  "4363",  "4441",  "4447",  "4481",  "4517",  "4663",  "4721",  "4751",  "4817",  "4871",  "5147",  "5227",  "5281",  "5417",  "5471",  "5477",  "5527",  "5569",  "5659",  "5741",  "5821",  "5879",  "5897",  "5987",  "6037",  "6053",  "6073",  "6163",  "6197",  "6203",  "6329",  "6337",  "6343",  "6353",  "6361",  "6367",  "6373",  "6389",  "6637",  "6661",  "6673",  "6701",  "6703",  "6719",  "6733",  "6763",  "6791",  "6803",  "6899",  "6917",  "6971",  "6983",  "7039",  "7127",  "7309",  "7331",  "7451",  "7457",  "7481",  "7541",  "7547",  "7589",  "7603",  "7691",  "7793",  "7841",  "7937",  "8081",  "8147",  "8233",  "8369",  "8521",  "8597",  "8693",  "8699",  "8741",  "8821",  "8929",  "8963",  "8969",  "9001",  "9007",  "9013",  "9103",  "9133",  "9203",  "9323",  "9377",  "9587",  "9623",  "9689",  "9829",  "9857"};
        int cases = scanner.nextInt();

        for(int k = 0; k < cases; k++)
        {
            int caseNumber = scanner.nextInt();
            String testcase = scanner.next();
            scanner.nextLine();

            System.out.print(caseNumber + " " + testcase);
            boolean isIn = Arrays.asList(happyPrimesTo10000).contains(testcase);
            if(isIn == true)
            {
                System.out.println(" YES");
            }
            else
            {
                System.out.println(" NO");
            }
        }
    }
}