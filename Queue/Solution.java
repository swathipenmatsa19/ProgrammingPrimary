/*


Perform Enqueue and Dequeue operations on a queue. Implement Queue and avoid using inbuilt library.

Input Format

First line of input contains T - number of operations. Its followed by T lines, each line contains either "Enqueue x" or "Dequeue". 

Constraints

1 <= T <= 10000 
-100 <= x <= 100

Output Format

For each "Dequeue" operation, print the dequeued element, separated by newline. If the queue is empty, print "Empty". 


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
        int f = -1, r = -1;
        int a[] = new int[10000];
        while(t-- != 0) {
            String s = sc.next();
            if(s.equals("Enqueue")) {
                int x = sc.nextInt();
                a[++r] = x;
            } else {
                if(f == r)
                    System.out.println("Empty");
                else {
                    System.out.println(a[f+1]);
                    f++;
                }
            }
        }
    }
}











