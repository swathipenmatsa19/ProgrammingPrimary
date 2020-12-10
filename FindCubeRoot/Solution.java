/*

Find the cube root of the given number. Assume that all the input test cases will be a perfect cube.
Note: Do not use any inbuilt functions/libraries for your main logic.

Input Format

First line of input contains T - number of test cases. Its followed by T lines, each containing a single integer. 

Constraints

30 points 
1 <= T <= 103 
-109 <= N <= 109 

70 points 
1 <= T <= 106 
-1018 <= N <= 1018 

Output Format

For each test case, print the cube root of the number, separated by newline.

Sample Input 0

5
-27
-125
1000
6859
-19683
Sample Output 0

-3
-5
10
19
-27



*/



import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static long cuberoot(long n) {
        long val = (long)Math.abs(n);
        long low = 1;
        long high=(long)Math.pow(10, 6);
        //long high = (long)val;
        while(low <= high) {
            long mid = (low + high)/2;
            long temp = (mid * mid * mid);
            if(temp > val) 
                high = mid - 1;
            else if(temp < val) 
                low = mid + 1;
            else {
                if(n < 0)
                    mid = -1 * mid;
                return mid;
            }
        }
        return -1;
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- != 0) {
            long n = sc.nextLong();
            System.out.println(cuberoot(n));
        }
    }
}
















