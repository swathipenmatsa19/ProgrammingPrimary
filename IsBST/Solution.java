/*



Given a binary tree with unique elements, check if its a Binary Search Tree.
The input is given in form of a complete binary tree, represented using an array. Assuming array index start from 1, root will be at index 1. For every index i, its child nodes will be at 2i and 2i+1.

Input Format

First line of input contains T - number of test cases. Its followed by 2T lines. First line of each test case contains N - number of nodes in the tree. The next line contains N integers - nodes of the binary tree in the form of a Complete Binary Tree. 

Constraints

1 <= T <= 1000 
1 <= N <= 1000 
0 <= ar[i] <= 10000 

Output Format

For each test case, print "True" if the given Binary Tree is a Binary Search Tree, "False" otherwise, separated by newline.

Sample Input 0

5
11
92 10 963 5 334 928 973 2 9 263 860 
9
156 153 6947 149 154 1761 7230 9 152 
4
40 49 87 651 
5
449 792 594 688 618 
15
736 43 882 3 460 741 887 0 42 247 465 739 844 886 888 
Sample Output 0

False
True
False
False
True



*/




import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    
    public static boolean isBST(int a[],int i,int min,int max,int n) {
        if(i >= n)
            return true; 
        else
            return (a[i] > min && a[i]<max && isBST(a,(2*i)+1,min,a[i],n) && 
                   isBST(a,(2*i)+2,a[i],max,n));
    } 
    
     public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
        int T = Integer.parseInt(br.readLine());
        while(T-- != 0) {
            int n = Integer.parseInt(br.readLine());
            String[] input = br.readLine().split(" ");
            int a[] = new int[n]; 
        
        for(int i = 0; i < n; i++) {
            int x = Integer.parseInt(input[i]);
            a[i] = x;
        }
    
        boolean res = isBST(a,0,Integer.MIN_VALUE,Integer.MAX_VALUE,a.length);
        if(res)
            bw.write("True" + "\n");
        else
            bw.write("False" + "\n");   
      }
         
        bw.flush(); 
   
    }

}














