/*


Given an 2 strings A and B, find the number of occurrences of A in B as a substring. Solve using Rabin-Karp string matching algorithm with multiple hash functions. Do not use inbuilt library. 

Input Format

First line of input contains T - number of test cases. Its followed by T lines. Each line contains 2 strings - A and B, separated by space. 

Constraints

1 <= T <= 2000 
1 <= len(A), len(B) <= 10000 
'a' <= A[i], B[i] <= 'z' 

Output Format

For each test case, print the number of occurrences of A in B, separated by newline.

*/


import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        long m = 1000000007;
        long pow[] = new long[10002];
        pow[0] = 1;
        for(int i = 1; i < 10002; i++) 
            pow[i] = (pow[i-1]*59)%m;
        while(t-- != 0) {
            String sub = sc.next();
            String s = sc.next();
            int N = s.length();
            int M = sub.length();
            char A[] = s.toCharArray();
            char B[] = sub.toCharArray();
            long ha = 0, hb = 0;
            for(int i = 0; i < M; i++) {
                hb += (B[i] * pow[i+1])%m;
                ha += (A[i] * pow[i+1])%m;
            }
            int c = 0;
            if(ha == hb)
                c++;
            for(int i = M; i < N; i++) {
                ha = (ha + (A[i]*pow[i+1])%m - (A[i-M] * pow[i-M+1]) %m+m) % m;
                hb = (hb * 59) % m;
                if(ha == hb)
                    c++;
            }
            System.out.println(c);  
        }
    }
}







