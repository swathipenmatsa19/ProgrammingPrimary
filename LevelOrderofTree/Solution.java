/*

Given an array of unique elements, construct a Binary Search Tree and print the Level Order of the tree.

Input Format

First line of input contains T - number of test cases. Its followed by 2T lines. First line of each test case contains N - number of nodes in the BST. The next line contains N unique integers - value of the nodes. 

Constraints

For each test case, print the Level Order of the Binary Search Tree, separate each level by newline. Separate the output of different test cases with an extra newline.

Output Format

1 <= T <= 1000 
1 <= N <= 1000 
0 <= ar[i] <= 10000 

Sample Input 0

3
5
1 2 3 4 5 
5
3 2 4 1 5 
7
4 5 15 0 1 7 17 
Sample Output 0

1 
2 
3 
4 
5 

3 
2 4 
1 5 

4 
0 5 
1 15 
7 17


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
        if(root==null){
            Node root1 = new Node(x);
            return root1;
        }
        if(x<root.data)
            root.left = insert(root.left,x);
        else if(x > root.data)
             root.right = insert(root.right,x);
        return root;
    }
    
    public static void levelorder(Node root, BufferedWriter bw) throws IOException {
        Queue<Node> queue = new LinkedList<Node>(); 
        queue.add(root); 
        while(!queue.isEmpty()) {
            int size = queue.size();
            for(int i=0; i < size; i++) {
                Node front=queue.poll();
                bw.write(front.data+" ");
                if(front.left!=null)
                  queue.add(front.left);
                if(front.right!=null)
                  queue.add(front.right);        
            }
            bw.write("\n");
        }
    }     
     public static void main(String[] args) throws IOException {
     
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int t = Integer.parseInt(br.readLine());
        while(t-- != 0) {
            int n = Integer.parseInt(br.readLine());
            String[] inp = br.readLine().split(" ");
        Node root=null;
        for(int i=0;i<n;i++) {
           int ele=Integer.parseInt(inp[i]);
           root=Solution.insert(root,ele);
        }
            Solution.levelorder(root,bw);
            bw.write("\n");
      }
         
          bw.flush(); 
   
    }
}













