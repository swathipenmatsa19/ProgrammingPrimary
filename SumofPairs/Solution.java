/*

Given an array of integers and a number K, check if there exist a pair of indices i,j s.t. a[i] + a[j] = K and i!=j.

Input Format

First line of input contains T - number of test cases. Its followed by 2T lines, first line of each test case contains N - size of the array and K, and the next line contains N integers - the elements of the array. 

Constraints

30 points 
1 <= T <= 100 
2 <= N <= 1000 

70 points 
1 <= T <= 300 
2 <= N <= 10000 

General Constraints 
-108 <= K <= 108 
-108 <= ar[i] <= 108 

Output Format

For each test case, print "True" if such a pair exists, "False" otherwise, separated by newline. 

Sample Input 0

3
5 -15
-30 15 20 10 -10 
2 20
10 10 
4 7
-4 0 10 -7 
Sample Output 0

True
True
False


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
        int p1 = 0, p2 = n - 1;
        while(p1 < p2) {
            if((a[p1] + a[p2]) < k)
                p1++;
            else if((a[p1] + a[p2]) > k)
                p2--;
            else //((a[p1] + a[p2]) == k)
                return true;
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
            if(sumOfPairs(a,k,n))
                System.out.println("True");
            else
                System.out.println("False");
        }
    }
}













