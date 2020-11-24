/*


Given an array of integers, find the sum of the elements of the given array.
Note: Try to solve this without declaring/storing the array elements.

Input Format

First line of input contains T - number of test cases. Its followed by 2T lines, the first line contains N - the size of the array and second line contains the elements of the array. 

Constraints

1 <= T <= 100 
1 <= N <= 1000 
1 <= ar[i] <= 1e15 

Output Format

For each test case, print the sum of the elements of the array, separated by new line. 

Sample Input 0

2
3
5 15 3 
2
70 100 
Sample Output 0

23
170



*/





import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(sc.hasNextInt()) {
            int N = sc.nextInt();
            long sum = 0;
            for(int i = 0; i < N ; i++) {
                sum += sc.nextLong();
                 
            }
            System.out.println(sum);
            
        }
    }
}










