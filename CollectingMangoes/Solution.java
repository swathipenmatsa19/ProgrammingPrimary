/*


One day after storm Mina went to pick up mangoes in the garden with a basket. She began to pick up mangoes from the garden. And if she wants, she can throw away the last picked up mango from the basket. In this way, Mina kept picking up mangoes. She brought you with her to keep track of the biggest size of mango in the basket at that time. At any moment Mina can ask you about the biggest size of mango. Your job is to help Mina. 

Since you are a good programmer, so you write a program by which you are easily able to answer the question of Mina. During picking up mangoes, Mina can have 3 types of question/instruction for you.

Type 1: Put an "x" size mango in the basket, which is picked up form garden.

Type 2: Throw out last picked up mango.

Type 3: Ask for the biggest mango size in the basket at that moment.

Input Format

First line of input contains T - number of test cases. Each case start with a positive integer N, which is number of question/operation Mina will ask during picking up mangoes. Next N lines will contain 3 types of operations (A, R, Q): A x (here x is picked up mango size), R (Throw out last picked up mango from basket), Q (Find out the biggest size mango). Please use fast IO due to large size of input/ouptut.

Constraints

30 points 
1 <= T <= 100 
1 <= N <= 1000 
1 <= x <= 100000 

70 points 
1 <= T <= 100 
1 <= N <= 100000 
1 <= x <= 100000 

Output Format

For each test case, first print the case number and print the answer to each of Mina's questions (Queries of Type 3 - Q). Whenever the basket is empty, then Mina's question's answer will be "Empty".



*/




import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int t = Integer.parseInt(br.readLine());
        for(int i = 1; i <= t; i++) {
            int maxElement = Integer.MIN_VALUE;
            bw.write("Case "+i + ":" + "\n");
            int n = Integer.parseInt(br.readLine());
            Stack<Integer> st = new Stack<Integer>();
            Stack<Integer> max = new Stack<Integer>();
            while(n-- != 0) {
                String[] input = br.readLine().split(" ");
                String op = input[0];
                if(op.equals("A")) {
                    int x = Integer.parseInt(input[1]);
                    st.push(x);
                    if(max.isEmpty())
                        max.push(x);
                    else if(x >= max.peek())
                        max.push(x);
                } if(op.equals("R")) {
                    if(!(st.isEmpty())) {
                        if(st.peek() >= max.peek()) {
                            st.pop();
                            max.pop();
                        } else {
                            st.pop();
                        }
                    }
                } if(op.equals("Q")){
                    if(!(max.isEmpty())) {
                        maxElement = max.peek();
                        bw.write(maxElement + "\n");
                    }
                    else
                        bw.write("Empty" + "\n");
                }
            }
        }
        bw.flush();
    }
}















