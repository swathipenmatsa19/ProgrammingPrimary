/*


Given an array of size 3X+1, where every element occurs three times, except one element, which occurs only once. Find the element that occurs only once.

Input Format

First line of input contains T - number of test cases. Its followed by 2T lines, the first line contains N - the size of the array (of the form 3X + 1) and second line contains the elements of the array. 

Constraints

1 <= T <= 300
1 <= N <= 104
1 <= A[i] <= 109 

Output Format

For each test case, print the number which occurs only once, separated by new line. 

Sample Input 0

2
10
5 7 8 7 7 5 5 9 8 8 
7
10 20 20 30 20 10 10 
Sample Output 0

9
30

*/



import java.io.*;
import java.util.*;

public class Solution {
    
    public static boolean checkBit(int n, int i) {
        return (n & (1 << i)) != 0;
    }
    
    public static int tripleTrouble(int ar[], int N) {
        int ans = 0;
        for(int i = 0; i < 31; i++) {
            int c = 0;
            for(int j = 0; j < N; j++) {
                if(checkBit(ar[j],i)) {
                    c++;
                }
            }
            if(c % 3 != 0)
                ans = ans + (1 << i);
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- != 0) {
            int N = sc.nextInt();
            int a[] = new int[N];
            for(int i = 0; i < N; i++)
                a[i] = sc.nextInt();
            System.out.println(tripleTrouble(a, N));
        }
    }
}












