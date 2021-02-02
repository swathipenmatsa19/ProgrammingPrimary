/*


Given an array of unique elements, construct a Binary Search Tree and print the right-view of the tree. Right view of a Tree is the set of nodes visible when tree is viewed from right side. 

Input Format

First line of input contains T - number of test cases. Its followed by 2T lines. First line of each test case contains N - number of nodes in the BST. The next line contains N unique integers - value of the nodes. 

Constraints

1 <= T <= 1000 
1 <= N <= 1000 
0 <= ar[i] <= 10000 

Output Format

For each test case, print the right-view of the Binary Search Tree, separated by newline. 

Sample Input 0

3
5
1 2 3 4 5 
5
3 2 4 1 5 
7
4 5 15 0 1 7 17 
Sample Output 0

1 2 3 4 5 
3 4 5 
4 5 15 17



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
        
        public Node(int x) {
            data = x;
            left = null;
            right = null;
        }
    }
    
    public static Node insert(Node root, int x) {
        if(root == null) {
            Node root1 = new Node(x);
            return root1;
        }
        
        if(x < root.data)
            root.left = insert(root.left, x);
        else if(x > root.data)
            root.right = insert(root.right, x);
        return root;
    }
    
    public static void rightView(Node root, BufferedWriter bw) throws IOException {
        Queue<Node> q = new LinkedList<Node>();
        q.add(root);
        while(!q.isEmpty()) {
            int s = q.size();
            for(int i = 0; i < s; i++) {
                Node front = q.poll();
                if(i == (s-1))
                    bw.write(front.data + " ");
                if(front.left != null)
                    q.add(front.left);
                if(front.right != null)
                    q.add(front.right);
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int T = Integer.parseInt(br.readLine());
        while(T-- != 0) {
            int n = Integer.parseInt(br.readLine());
            String[] input = br.readLine().split(" ");
            Node root = null;
            for(int i = 0; i < n; i++) {
                int x = Integer.parseInt(input[i]);
                root = insert(root, x);
            }
            rightView(root, bw);
            bw.write("\n");
        }
        bw.flush();
    }
}















