/*

You are given an integer array and a positive integer K. You have to tell if there exists a pair of integers in the given array such that ar[i]-ar[j]=K and i≠j. 

Input Format

First line of input contains T - number of test cases. Its followed by 2T lines, the first line contains N and K - the size of the array and the number K. The second line contains the elements of the array. 

Constraints

1 <= T <= 50 
2 <= N <= 100000 
1 <= K <= 100000 
-100000 <= A[i] <= 100000 

Output Format

For each test case, print "true" if the arrays contains such elements, false otherwise, separated by new line. 

Sample Input 0

2
5 60
1 20 40 100 80 
10 11
12 45 52 65 21 645 234 14 575 112 
Sample Output 0

true
false

*/



import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    
    public static boolean diffOfPairs(int a[], int k, int n) {
        for(int j = 0; j < n; j++)
        {
            int b = a[j] - k;
            int lo = 0, hi = n - 1;
            while(lo <= hi)
            {
                int m = (lo + hi)/2;
                if(a[m] == b)
                    return true;
                if(a[m] < b)
                    lo = m+1;
                else
                    hi = m-1;
            } 
        }
        return false; 
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- != 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            int a [] = new int[n];
            for(int i = 0; i < n; i++)
                a[i] = sc.nextInt();
            Arrays.sort(a);
            System.out.println(diffOfPairs(a,k,n));
        }
    }
}


























