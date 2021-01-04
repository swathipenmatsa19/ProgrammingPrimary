/*


You are given the heights of N buildings. All the buildings are of width 1 and are adjacent to each other with no empty space in between. Assume that its raining heavily, and as such water will be accumulated on top of certain buildings. Your task is to find the total amount of water accumulated.

Input Format

First line of input contains T - number of test cases. Its followed by 2T lines, the first line contains N - the number of buildings. The second line contains N elements denoting the height of the buildings. 

Constraints

30 points
1 <= T <= 1000 
1 <= N <= 1000 
1 <= a[i] <= 1000 

70 points
1 <= T <= 1000 
1 <= N <= 100000 
1 <= a[i] <= 1000 

Output Format

For each test case, print the units of water accumulated, separated by newline.


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
        while(t-- != 0) {
            int n = sc.nextInt();
            int a[] = new int[n];
            int pm[] = new int[n];
            int sm[] = new int[n];
            int ans = 0;
            for(int i = 0; i < n; i++) 
                a[i] = sc.nextInt();
            pm[0] = a[0];
            for(int i = 1; i < n; i++)
                pm[i] = Math.max(pm[i - 1], a[i]);
            
            sm[n - 1] = a[n - 1];
            for(int i = n - 2; i >= 0; i --)
                sm[i] = Math.max(sm[i + 1], a[i]);
            for(int i = 0; i < n; i++)
                ans += Math.min(pm[i], sm[i]) - a[i];
            System.out.println(ans);
        }
        
    }
}








