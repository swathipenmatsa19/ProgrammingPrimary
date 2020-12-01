/*


Implement Insertion Sort and print the index at which the ith element gets inserted [i>=1].

Input Format

First line of input contains T - number of test cases. Its followed by 2T lines. First line of each test case contains N - size of the array. The next line contains N integers - elements of the array.

Constraints

1 <= T <= 100 
2 <= N <= 100 
-1000 <= ar[i] <= 1000 

Output Format

For each test case, print the index at which the ith element gets inserted [i>=1], separated by space. Separate the output of different tests by newline.

Sample Input 0

4
8
176 -272 -272 -45 269 -327 -945 176 
2
-274 161
7
274 204 -161 481 -606 -767 -351
2
154 -109
Sample Output 0

0 1 2 4 0 0 6 
1 
0 0 3 0 0 2 
0

*/



import java.io.*;
import java.util.*;

public class Solution {
    
    public static void insertionSort(int a[], int n) {
        for(int i = 1; i < n; i++) {
            int x = a[i];
            int j;
            for(j = i - 1; j >= 0; j--) {
                if(a[j] > x)
                    a[j + 1] = a[j];
                else
                    break;
            }
            a[j + 1] = x;
            System.out.print((j + 1) + " ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- != 0) {
            int n = sc.nextInt();
            int a[] = new int[n];
            for(int i = 0; i < n; i++) 
                a[i] = sc.nextInt();
            insertionSort(a,n);
            System.out.println();
        }
    }
}

















