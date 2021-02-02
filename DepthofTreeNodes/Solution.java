/*




Given an array of unique elements, construct a Binary Search Tree and for every node, print the depth of that node.

Input Format

First line of input contains T - number of test cases. Its followed by 2T lines. First line of each test case contains N - number of nodes in the BST. The next line contains N unique integers - value of the nodes. 

Constraints

For each test case, print the depth of every node of the Binary Search Tree, separated by newline.

1 <= T <= 1000 
1 <= N <= 1000 
0 <= ar[i] <= 10000 

Output Format

For each test case, print N integers, where the ith integer denotes the depth of A[i] in the Binary Search Tree, separated by newline.

Sample Input 0

3
5
1 2 3 4 5 
5
3 2 4 1 5 
7
4 5 15 0 1 7 17 
Sample Output 0

0 1 2 3 4 
0 1 1 2 2 
0 1 2 1 2 3 3



*/



import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    
    public static class Node {
        int data; 
        Node left, right; 
        public Node(int item) 
        { 
            data = item; 
            left = null; 
            right = null;
        } 
    }   
   public static Node insert(Node root,int d,int x, BufferedWriter bw) {
        if(root==null){
            Node root1 = new Node(x);
            try { 
                bw.write(d+" ");
            } catch(IOException e) {
                e.printStackTrace();
            }
            return root1;
        }
        if(x < root.data) {
            root.left = insert(root.left,d+1,x,bw);     
        }
        else if(x > root.data) {
             root.right = insert(root.right,d+1,x,bw);
        }
        return root;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int t = Integer.parseInt(br.readLine());
        while(t-- != 0) {
            int n = Integer.parseInt(br.readLine());
            String[] inp =br.readLine().split(" ");
        Node root = null;
        int d = 0;
        for(int i=0;i<n;i++) {
           int e =Integer.parseInt(inp[i]);
           root = insert(root,d,e,bw);
        }
            bw.write("\n");
      }
         
          bw.flush();
    }
}















