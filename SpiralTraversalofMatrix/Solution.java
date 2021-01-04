/*


Given a 2D square matrix, print the matrix in a spiral order. Refer examples for more details. From interviews point of view, after you scan the matrix in a 2D array, try to print the matrix in a spiral order without using any extra space. 


Input Format

First line of input contains T - number of test cases. First line of each test case contains N - size of the matrix [NxN]. Its followed by N lines each containing N integers - elements of the matrix. 

Constraints

1 <= T <= 100 
1 <= N <= 100 
-100 <= ar[i][j] <= 100 

Output Format

For each test case, print the matrix in a spiral order, separated by newline.


*/


import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    
    public static void printSpriralMatrix(int a[][], int n) {
        int top = 0, left = 0, down = n - 1, right = n - 1, dir = 0;
        while(top <= down && left <= right) {
            if(dir == 0) {
                for(int i = left; i <= right; i++)
                    System.out.print(a[top][i] + " ");
                top++;
            } else if(dir == 1) {
                for(int i = top; i <= down; i++) 
                    System.out.print(a[i][right] + " ");
                right--;
            } else if(dir == 2) {
                for(int i = right; i >= left; i--)
                    System.out.print(a[down][i] + " ");
                down--;
            } else {
                for(int i = down; i >= top; i--)
                    System.out.print(a[i][left]+ " ");
                left++;
            }
            
            dir = ( dir + 1) % 4;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- != 0) {
            int n = sc.nextInt();
            int a[][] = new int[n][n];
            for(int i = 0; i < n; i++) {
                for(int j = 0; j < n; j++)
                    a[i][j] = sc.nextInt();
            } 
            printSpriralMatrix(a, n);
            System.out.println();
        }
    }
}











