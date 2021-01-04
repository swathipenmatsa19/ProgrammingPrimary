/*


You are given a job which has been divide into N tasks. The task cannot be divided any further. Each of the N tasks takes Si number of seconds to complete. Your job will be completed when all your tasks are completed. You have K workers at your disposal to help you complete the tasks. But as per the nature of the job, a worker can only be allocated continuous tasks. A worker can work only on a single task at any given point of time. However, the workers can work in parallel on different tasks. You have to find the minimum possible time in which you can complete the job.


Input Format

First line of input contains T - number of test cases. Its followed by 2T lines. First line of each test case contains N and K - number of tasks and available workers for the current job, separated by space. The next line contains N positive integers - denoting the time taken to complete the ith task.


Constraints

50 points 
1 <= N,K <= 20

150 points 
1 <= N,K <= 10000

General Constraints 
1 <= T <= 50 
1 <= Si <= 103

Output Format

For each test case, print the minimum possible time in which you can complete the job, separated by newline.


*/


import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    
    public static int getMax(int a[], int n) 
    { 
        int max = a[0]; 
        for (int i = 1; i < n; i++) 
            if (a[i] > max) 
                max = a[i]; 
        return max; 
    }
    
    public static int cabinetPartitioning(int a[], int k, int n) {
        int end = 0, start=0; 
        for (int i = 0; i < n; i++) 
            end += a[i]; 
        int ans = end;  
        int job_max = getMax(a, n);
        start = job_max;
        while (start <= end) 
        { 
            int mid = (start + end) / 2; 
            if ( isPossible(mid, k, a, n)) {
                ans = mid;
                end = mid - 1; 
            } else
                start = mid + 1; 
        } 
        return ans;
    }
    
    public static boolean isPossible(int time, int K, int job[], int n) 
    { 
        int cnt = 1; 
        int curr_time = 0; 
        for (int i = 0; i < n;) { 
            if (curr_time + job[i] > time) { 
                curr_time = 0; 
                cnt++; 
            } else { 
                curr_time += job[i]; 
                i++; 
            } 
        } 

        return (cnt <= K); 
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- != 0) {
            int n = sc.nextInt();
            int a[] = new int[n];
            int k = sc.nextInt();
            for(int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }
            System.out.println(cabinetPartitioning(a,k,n));
        }
    }
}









