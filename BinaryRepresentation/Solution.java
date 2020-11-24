/*



Given a positive integer, print its binary representation. 
Note: Do not use any inbuilt functions/libraries for your main logic.

Input Format

First line of input contains T - number of test cases. Its followed by T lines, each line containing a single integer. 

Constraints

1 <= T <= 10000 
0 <= N <= 109 

Output Format

For each test case, print binary representation, separated by new line. 

Sample Input 0

5
10
15
7
1
120
Sample Output 0

1010
1111
111
1
1111000



*/




import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    
    public static void binaryRepresentation(int n) {
        if(n > 1)
            binaryRepresentation(n >> 1);   
        System.out.print(n & 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T-- != 0) {
            int n = sc.nextInt();
            binaryRepresentation(n);
            System.out.println();
        }
    }
}

















