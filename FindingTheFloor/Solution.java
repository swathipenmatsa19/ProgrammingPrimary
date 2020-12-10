/*


Given an array, you have to find the floor of a number x. The floor of a number x is nothing but the largest number in the array less than or equal to x. 

Input Format

First line of input contains N - size of the array. The next line contains N integers, the elements of the array. The next line contains Q - number of queries. Each of the next Q lines contains a single integer X, for which you have to find the floor of X in the given array.

Constraints

30 points 
1 <= N <= 105 
1 <= Q <= 102 
-108 <= ar[i] <= 108

70 points 
1 <= N <= 105 
1 <= Q <= 105 
-108 <= ar[i] <= 108

Output Format

For each query, print the floor of X, separated by newline. If floor not found, print the value of "INT_MIN"

Sample Input 0

6
-6 10 -1 20 15 5 
5
-1
10
8
-10
-4
Sample Output 0

-1
10
5
-2147483648
-6



*/



import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static int findtheFloor(int a[], int n, int x) {
        int lo = 0, hi = n - 1, ans = Integer.MIN_VALUE;
        while(lo <= hi) {
            int mid = (lo + hi)/2;
            if(a[mid] > x)
                hi = mid - 1;
            else {
                ans = a[mid];
                lo = mid + 1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for(int i = 0; i < n; i++)
            a[i] = sc.nextInt();
        Arrays.sort(a);
        int q = sc.nextInt();
        while(q-- != 0) {
            int x = sc.nextInt();
            System.out.println(findtheFloor(a,n,x));
        }
    }
}











