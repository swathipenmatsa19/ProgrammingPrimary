/*




Given an array of unique elements, construct a Binary Search Tree and check if its a Full Binary Tree [FBT]. A FBT is one in which each node is either a leaf or possesses exactly 2 child nodes. 

Input Format

First line of input contains T - number of test cases. Its followed by 2T lines. First line of each test case contains N - number of nodes in the BST. The next line contains N unique integers - value of the nodes. 

Constraints

1 <= T <= 1000 
1 <= N <= 1000 
0 <= ar[i] <= 10000 

Output Format

For each test case, print "True" if the Binary Search Tree is a FBT, "False" otherwise, separated by newline.

Sample Input 0

3
5
1 2 3 4 5 
11
8 3 30 15 40 18 12 17 25 1 7 
7
4 5 15 0 1 7 17 
Sample Output 0

False
True
False


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
   
    public static Node insert(Node root,int x) {
        if(root == null){
            Node root1 = new Node(x);
            return root1;
        }
        if(x < root.data)
            root.left = insert(root.left,x);
        else if(x > root.data)
             root.right = insert(root.right,x);
        return root;
    }
    public static boolean isfullbinarytree(Node root) {
         if(root.left == null && root.right == null)
           return true;
         else if(root.left == null && root.right != null)
           return false;
         else if(root.left != null && root.right == null)
           return false;
         else if(root.left != null && root.right != null)
             return (isfullbinarytree(root.left) && isfullbinarytree(root.right));
         else 
            return false;
        
    }
     public static void main(String[] args) throws IOException {
     
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
        int t = Integer.parseInt(br.readLine());
        while(t-- != 0) {
            int n = Integer.parseInt(br.readLine());
            String[] inp=br.readLine().split(" ");
        Node root=null;
        for(int i = 0; i < n; i++) {
           int e = Integer.parseInt(inp[i]);
           root = Solution.insert(root,e);
        }
        
        boolean h = Solution.isfullbinarytree(root);
        if(h)
            bw.write("True");
        else
            bw.write("False");
        bw.write("\n");
      }
         
          bw.flush(); 
   
    }
}













