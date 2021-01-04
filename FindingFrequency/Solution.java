/*


Given an array, you have to find the frequency of a number x.

Input Format

First line of input contains N - size of the array. The next line contains N integers, the elements of the array. The next line contains Q - number of queries. Each of the next Q lines contains a single integer X, for which you have to find the frequency of X in the given array.

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

For each query, print the frequency of X, separated by newline.


*/


import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        // using Hashing
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for(int i = 0; i < n; i++)
            a[i] = sc.nextInt();
        HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
        for(int i = 0; i < n; i++) {
            if(hm.containsKey(a[i])) {
                int freq = hm.get(a[i]);
                freq ++;
                hm.put(a[i], freq);
            } else {
                hm.put(a[i], 1);
            }
        }
        
        int q = sc.nextInt();
        while(q-- != 0) {
            int x = sc.nextInt();
            if(hm.containsKey(x))
                System.out.println(hm.get(x));
            else
                System.out.println("0");
        }
    }
}


/*
 
using binary search 
 
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
    
    public static int BS1(int a[], int n, int x) {
        int lo = 0, hi = n - 1, ans = 0;
        while(lo <= hi) {
            int mid = (lo + hi) / 2;
            if(a[mid] < x)
                lo = mid + 1;
            else if(a[mid] > x)
                hi = mid - 1;
            else {
                ans = mid;
                hi = mid - 1;
            }
        }
        return ans;
        
    }
    
    public static int BS2(int a[], int n, int x) {
        int lo = 0, hi = n - 1, ans = 0, flag = 0;
        while(lo <= hi) {
            int mid = (lo + hi) / 2;
            if(a[mid] < x)
                lo = mid + 1;
            else if(a[mid] > x)
                hi = mid - 1;
            else {
                ans = mid;
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
        mergeSort(a, 0, n-1);
        int q = sc.nextInt();
        while(q-- != 0) {
            int x = sc.nextInt();
            int p1 = BS1(a,n,x);
            int p2 = BS2(a,n,x);
            if(p1 == 0 && p2 == 0)
                System.out.println("0");
            else 
                System.out.println(p2 - p1 + 1);
        }
        
    }
}



*/




