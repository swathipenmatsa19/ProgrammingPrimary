/*

Given a number N, print N!.

Input Format

First line of input contains T - number of test cases. Its followed by T lines, each containing a single number N. 

Constraints

1 <= T <= 1000000 
0 <= N <= 1000000 

Output Format

For each test case, print N!. Since the result can be very large, print N! % 1e9+7. 

Sample Input 0

3
5
20
50
Sample Output 0

120
146326063
318608048

*/


import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int t = Integer.parseInt(br.readLine());
        long[] fact = new long[1000001];
        long res = 1;
        fact[0] = res;
        long m = 1000000007;
        for(int i = 1; i <= 1000000; i++) {
            res = (res * (long)i) % m;
            fact[i] = res;
        }
        
        while(t-- != 0) {
            int n = Integer.parseInt(br.readLine());
            bw.write(fact[n]+"\n");
        }
        bw.flush();
    }
}





