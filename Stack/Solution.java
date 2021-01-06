/*


Perform push and pop operations on stack. Implement Stacks and avoid using inbuilt library.

Input Format

First line of input contains T - number of operations. Its followed by T lines, each line contains either "push x" or "pop". 

Constraints

1 <= T <= 10000 
-100 <= x <= 100

Output Format

For each "pop" operation, print the popped element, separated by newline. If the stack is empty, print "Empty". 

Sample Input 0

8
push 5
pop
pop
push 10
push -15
pop
push -10
pop


*/


import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int top = -1;
        int a[] = new int[10000];
        while(t-- != 0) {
            String s = sc.next();  
            if(s.equals("push")) {
                int x = sc.nextInt();
                a[++top] = x;
            } else {
                if(top == -1)
                    System.out.println("Empty");
                else {
                    System.out.println(a[top]);
                    top--;
                }
            }
        }
    }
}








