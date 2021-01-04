/*



There are 2 teams, each having N players. There will be N rounds played between the 2 teams. In every round, a player from team A plays against a player from team B. The more powerful player wins the game. Given the strength of the players of both the teams, you have to find the maximum number of rounds team A can win. Note that a player cannot play more than 1 round. 

Input Format

First line of input contains T - number of test cases. Its followed by 3T lines. The first line contains N - size of the team. The next 2 lines contains N numbers each - strength of the players of team A and team B respectively. 

Constraints

1 <= T <= 500 
1 <= N <= 10000 
0 <= A[i], B[i] <= 10000 

Output Format

For each test case, print the maximum number of rounds team A can win, separated by newline.


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
            int A[] = new int[n];
            int B[] = new int[n];
            for(int i = 0; i < n; i++) 
                A[i] = sc.nextInt();
            for(int i = 0; i < n; i++) 
                B[i] = sc.nextInt();
            Arrays.sort(A);
            Arrays.sort(B);
            int p1 = 0, p2 = 0, count = 0;
            while(p1 < n && p2 < n) {
                if(A[p1] <= B[p2])
                    p1++;
                else {
                    count++;
                    p2++;
                    p1++;
                }
            }
            System.out.println(count);  
        }
    }
}








