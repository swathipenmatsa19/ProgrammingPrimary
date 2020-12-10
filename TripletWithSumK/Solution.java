/*

You are given an integer array and a number K. You have to tell if there exists i,j,k in the given array such that ar[i]+ar[j]+ar[k]=K, i≠j≠k. 

Input Format

First line of input contains T - number of test cases. Its followed by 2T lines, the first line contains N and K - the size of the array and the number K. The second line contains the elements of the array. 

Constraints

30 points
1 <= T <= 100 
3 <= N <= 100 

70 points
1 <= T <= 100 
3 <= N <= 1000 

General
-100000 <= A[i] <= 100000 
0 <= K <= 100000 

Output Format

For each test case, print "true" if the arrays contains such elements, false otherwise, separated by new line. 

Sample Input 0

3
5 60
1 20 40 100 80 
12 54
12 45 52 65 21 645 234 -100 14 575 -80 112 
3 15
5 5 5
Sample Output 0

false
true
true


*/




import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

   public static void mergeSort(int a[], int lo, int hi) {
        if(lo == hi)
            return;
        int mid = (lo + hi)/2;
        mergeSort(a, lo, mid);
        mergeSort(a, mid + 1, hi);
        merge(a, lo, mid, hi);
    }
    
    public static void merge(int a[], int lo, int mid, int hi) {
        int i = lo, j = mid + 1, k = 0;
        int temp[] = new int[hi-lo+1];
        while(i <= mid && j <= hi) {
            if(a[i] < a[j]) 
                temp[k++] = a[i++];
            else
                temp[k++] = a[j++];
        }
        
        while(i <= mid)
            temp[k++] = a[i++];
        
        while(j <= hi)
            temp[k++] = a[j++];
        
        for(i = 0; i < hi-lo+1; i++)
            a[lo + i] = temp[i];
        
        
    }
    
    public static boolean sumOfPairs(int a[], int k, int n) {
        for(int i = 0; i < n; i++) {
            int p1 = i + 1, p2 = n - 1;
            int key = k - a[i];
            while(p1 < p2) {
                if((a[p1] + a[p2]) < key) 
                    p1++;
                else if((a[p1] + a[p2]) > key)
                    p2--;
                else 
                    return true;
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
            mergeSort(a, 0, n-1);
            System.out.println(sumOfPairs(a,k,n));
        }
    }
}













