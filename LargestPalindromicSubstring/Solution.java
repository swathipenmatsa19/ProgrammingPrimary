/*


Given a string, find the length of the largest palindromic substring.

Input Format

First line of input contains T - number of test cases. Its followed by 2T lines. The first line contains N - the size of the string and the second line contains a string of size N, containing only lowercase english alphabets. 

Constraints

30 points 
1 <= T <= 200 
1 <= len(S) <= 102 
'a' <= S[i] <= 'z' 

70 points 
1 <= T <= 200 
1 <= len(S) <= 103 
'a' <= S[i] <= 'z' 

Output Format

For each test case, print the length of the largest palindromic substring, separated by newline.


*/


import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- != 0) {
            int n = sc.nextInt();
            String s = sc.next();
            int len= 1, max = 1;
            int p1, p2;

            for(int i = 0; i < n; i++) {
                p1 = i - 1;
                p2 = i + 1;
                while(p1 >= 0 && p2 <= n - 1 && s.charAt(p1) == s.charAt(p2)) {
                    len = p2 - p1 + 1;
                    p1--;
                    p2++;
                    if(len > max) 
                        max = len;
                }
                p1 = i;
                p2 = i + 1;
                while(p1 >= 0 && p2 <= n - 1 && s.charAt(p1) == s.charAt(p2)) {
                    len = p2 - p1 + 1;
                    p1--;
                    p2++;
                    if(len > max) 
                        max = len;
                } 
            }
            System.out.println(max);
        }
        
    }
}








