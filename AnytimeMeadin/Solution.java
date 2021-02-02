/*



Given an integer array, print the median for the sub-array 0 to i, for every i, 0<=i<=N-1. 

Input Format

First line of input contains T - number of test cases. Its followed by 2T lines - the first line contains N - the size of the array. The second line contains N integers - the elements of the array. 

Constraints

30 points 
1 <= T <= 100 
1 <= N <= 103 

70 points 
1 <= T <= 100 
1 <= N <= 104 

General Constraints 
-104 <= A[i] <= 104 

Output Format

For each test case, print the median for the sub-array 0 to i, for every i, separated by space. Print new line between output of different test cases.
Note: In case of even length sub-array, print the smaller element as the median. 

Sample Input 0

2
5
-10 14 11 -5 7 
3
2 -5 14 
Sample Output 0

-10 -10 11 -5 7 
2 -5 2




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
        int q = Integer.parseInt(br.readLine());
        while(q-- != 0) {
            int n = Integer.parseInt(br.readLine());
            String[] inp=br.readLine().split(" ");
            PriorityQueue<Integer> minHeap = new PriorityQueue<Integer>();
            PriorityQueue<Integer> maxHeap = new PriorityQueue<>(10,Collections.reverseOrder());
            maxHeap.add(Integer.parseInt(inp[0]));
            if(maxHeap.size() == 1) {
                bw.write(maxHeap.peek() + " ");
            }
            for(int i = 1; i < n; i++) {
                int x = Integer.parseInt(inp[i]);
                if(x > maxHeap.peek()) {
                    minHeap.add(x);
                    if((maxHeap.size()-minHeap.size() == 0) || (maxHeap.size()-minHeap.size() == 1)) {
                        bw.write(maxHeap.peek() + " ");
                    } else {
                        maxHeap.add(minHeap.peek());
                        minHeap.remove();
                        bw.write(maxHeap.peek() + " ");
                    }
                } else {
                    maxHeap.add(x);
                    if((maxHeap.size()-minHeap.size() == 0) || (maxHeap.size()-minHeap.size() == 1)) {
                        bw.write(maxHeap.peek() + " ");
                    } else {
                        minHeap.add(maxHeap.peek());
                        maxHeap.remove();
                        bw.write(maxHeap.peek() + " ");
                    }
                }
            }
            bw.write("\n");
        }
        bw.flush();
    }
}














