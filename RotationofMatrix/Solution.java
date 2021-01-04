/*

Given a 2D square matrix, rotate the matrix by 90 degrees in clockwise manner. 
Note: Try to solve it by first scanning the matrix, then do an in-place rotation and then print the rotated matrix.

Input Format

First line of input contains T - number of test cases. First line of each test case contains N - size of the matrix [NxN]. Its followed by N lines each containing N integers - elements of the matrix. 

Constraints

1 <= T <= 100 
1 <= N <= 100 
-100 <= ar[i][j] <= 100 

Output Format

For each test case, print the rotated matrix, separated by newline.

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
        for(int test = 1; test <= t; test++) {
            int n = sc.nextInt();
            int a[][] = new int[n][n];
            for(int i = 0; i < n; i++) {
                for(int j = 0; j < n; j++) {
                    a[i][j] = sc.nextInt();
                }
            }
            System.out.println("Test Case #" + (test) +":");
            for(int i = 0; i < n; i++) {
                for(int j = i; j < n; j++) {
                    int temp = a[i][j];
                    a[i][j] = a[j][i];
                    a[j][i] = temp;
                    
                }  
            }
            
            for(int i = 0; i < n; i++) {
                for(int j = 0; j < n/2; j++) {
                    if(j != n-1-j) {
                        int temp = a[i][j];
                        a[i][j] = a[i][n-1-j];
                        a[i][n-1-j] = temp;
                    }
                }
            }
            
            for(int i = 0; i < n; i++) {
                for(int j = 0; j < n; j++) 
                    System.out.print(a[i][j] + " ");
                System.out.println();
            }
        }
    } 
}









