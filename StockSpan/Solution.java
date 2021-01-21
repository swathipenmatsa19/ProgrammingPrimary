/*



You are given a series of daily price quotes for a stock and you need to calculate span of stock’s price for each day. The span Si of the stock’s price on current day i is defined as the maximum number of consecutive days just before the current day[including the current day], on which the price of the stock is less than or equal to its price on the current day.

Input Format

First line of input contains T - number of test cases. Its followed by 2T lines, the first line contains N - the size of the array. The second line contains N integers - the elements of the array, ith element denotes the stock price on ith day. 

Constraints

1 <= T <= 200 
1 <= N <= 104 
0 <= A[i] <= 104 

Output Format

For each test case, print space-separated Stock Span Array, separated by new line.

Sample Input 0

2
7
100 80 60 70 60 75 85 
10
0 7 3 6 6 9 18 0 16 0 
Sample Output 0

1 1 1 2 1 4 6 
1 2 1 2 3 6 7 1 2 1


*/




import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.util.Stack;

public class Solution {

    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
        int T = Integer.parseInt(br.readLine());
        while(T-- != 0) {
            Stack<Integer> st = new Stack<Integer>();
            int N = Integer.parseInt(br.readLine());
            int A[] = new int[N];
            int B[] = new int[N];
            String[] inp = br.readLine().split(" ");
            for(int i = 0; i < N; i++)
                A[i] = Integer.parseInt(inp[i]);
            B[0] = 1;
            st.push(0);
            for(int i = 1; i < N; i++) {
                while((!st.empty()) && (A[i] >= A[st.peek()]))
                    st.pop();
                if(st.empty()) {
                    B[i] = i+1;
                    st.push(i);
                } else {
                    B[i] = i-st.peek();
                        st.push(i);
                }
            }
            for(int i = 0; i < N; i++)
                bw.write(B[i] + " ");
            bw.write("\n");
        }
        bw.flush();
    }
}







