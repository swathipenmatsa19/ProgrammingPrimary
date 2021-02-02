/*


Given an array of unique elements, construct a Binary Search Tree and check if its balanced. A tree is said to be balanced if for every node, the difference between the height of its child nodes is not greater than 1. 

Input Format

First line of input contains T - number of test cases. Its followed by 2T lines. First line of each test case contains N - number of nodes in the BST. The next line contains N unique integers - value of the nodes. 

Constraints

1 <= T <= 1000 
1 <= N <= 1000 
0 <= ar[i] <= 10000 

Output Format

For each test case, print "Yes" if the Binary Search Tree is balanced, "No" otherwise, separated by newline. 

Sample Input 0

3
5
1 2 3 4 5 
5
3 2 4 1 5 
7
4 5 15 0 1 7 17 
Sample Output 0

No
Yes
No




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

        Node(int x) {
            data = x; 
            left = null;
            right = null;
        } 
    }   
    
    public static Node insert(Node root,int x) {
        if(root == null){
            Node root1 = new Node(x);
            return root1;
        }
        if(x < root.data)
            root.left = insert(root.left,x);
        else if(x > root.data)
             root.right=insert(root.right,x);
        return root;
    }
   
    public static int isBalanced(Node node) {
        if(node == null)
            return 1;
        
        if(node.left == null && node.right == null)
            return 1;
        
        int l = height(node.left);
        int r = height(node.right);
         
        if((Math.abs(l - r) <= 1) && (isBalanced(node.left) == 1) && (isBalanced(node.right) == 1))
           return 1;
        else
          return 0;
    }
    
     public static int height(Node root) {
        if(root == null)
            return -1;
         return 1+Math.max(height(root.left),height(root.right));    
     }
    
     public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
        int T = Integer.parseInt(br.readLine());
        while(T-- != 0) {
            int n = Integer.parseInt(br.readLine());
            String[] input = br.readLine().split(" ");
        Node root = null;
        for(int i = 0; i < n; i++) {
           int x = Integer.parseInt(input[i]);
           root = insert(root, x);
        }
            
        int result = isBalanced(root);
        if(result == 1)
            bw.write("Yes");
        else
            bw.write("No"); 
        bw.write("\n");
      }
         
          bw.flush();
     }
}

















