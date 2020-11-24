/*


Given 2 numbers, find their LCM and HCF.
Note: Do not use any inbuilt functions/libraries for your main logic.

Input Format

First line of input contains T - number of test cases. Its followed by T lines, each contains 2 numbers A and B. 

Constraints

1 <= T <= 105 
1 <= A,B <= 109 

Output Format

For each test case, print their LCM and HCF separated by space, separated by newline. 

Sample Input 0

4
4 710
13 1
6 4
605904 996510762
Sample Output 0

1420 2
13 1
12 2
7740895599216 78




*/




import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static int hcf(int a, int b) {
        if(a%b == 0)
            return b;
        else
            return hcf(b, a%b);
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T-- != 0) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int h;
            if(a > b)
                h = hcf(a, b);
            else
                h = hcf(b, a);
            System.out.println(((long)a * b)/h + " " + h);
        }
    }
}













