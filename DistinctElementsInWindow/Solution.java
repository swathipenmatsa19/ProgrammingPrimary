/*


Given an array of integers and a window size K, find the number of distinct elements in every window of size K of the given array.

Input Format

First line of input contains T - number of test cases. Its followed by 2T lines. First line of each test case contains N - size of the array and K - size of the window. The second line contains N integers - elements of the array. 

Constraints

1 <= T <= 1000 
1 <= N <= 10000 
1 <= K <= N 
-100 <= ar[i] <= 100 

Output Format

For each test case, print the number of distinct elements in every window of size K, separated by newline. 


*/


import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
        int t = Integer.parseInt(br.readLine());
        while(t-- != 0) {
            int n, k;
            String[] inp=br.readLine().split(" ");
            n = Integer.parseInt(inp[0]);
            k = Integer.parseInt(inp[1]);
            inp = br.readLine().split(" ");
            int a[] = new int[n];
            for(int j = 0;j < n;j++)
                a[j] = Integer.parseInt(inp[j]);
            HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
          
            for(int i = 0; i < k; i++) {
                if(hm.containsKey(a[i])) {
                    int f = hm.get(a[i]);
                    f++;
                    hm.put(a[i],f);
                }
                else {
                    hm.put(a[i], 1);
                }
            }
            
            bw.write(hm.size()+ " ");
            
            for(int i = k; i < n; i++) {
                if(hm.get(a[i-k]) == 1)
                    hm.remove(a[i-k]);
                else {
                    int f = hm.get(a[i-k]); 
                    f--;
                    hm.put(a[i-k], f);
                }
                if(hm.containsKey(a[i])) {
                    int f = hm.get(a[i]);
                    f ++;
                    hm.put(a[i], f);
                } else 
                    hm.put(a[i], 1); 
            
                bw.write(hm.size()+ " ");
            }
            bw.write("\n");
            bw.flush();
        }
    }
}






