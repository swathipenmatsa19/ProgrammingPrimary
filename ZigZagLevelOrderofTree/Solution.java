/*



Given an array of unique elements, construct a Binary Search Tree and print the Level Order of the tree in a zig-zag fashion. Assume root is at level-1, zig-zag means that nodes at even levels will be printed left to right and the nodes at odd levels will be printed from right to left. 

Input Format

First line of input contains T - number of test cases. Its followed by 2T lines. First line of each test case contains N - number of nodes in the BST. The next line contains N unique integers - value of the nodes. 

Constraints

1 <= T <= 1000 
1 <= N <= 1000 
0 <= ar[i] <= 10000 

Output Format

For each test case, print the Level Order Traversal of the Binary Search Tree in zig-zag fashion, separated by newline.

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
3 2 4 5 1 
4 0 5 15 1 7 17


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
    
    public static void zigZag(Node root, BufferedWriter bw) throws IOException {
        Stack<Node> s1 = new Stack<>();
        Stack<Node> s2 = new Stack<>();
        s1.push(root);
        while((!s1.isEmpty()) || (!s2.isEmpty())) {
            while(!s1.isEmpty()) {
                Node t = s1.pop();
                bw.write(t.data + " ");
                if(t.right != null)
                    s2.push(t.right);
                if(t.left != null)
                    s2.push(t.left);
            }
        
            while(!s2.isEmpty()) {
                Node t = s2.pop();
                bw.write(t.data + " ");
                if(t.left != null)
                    s1.push(t.left);
                if(t.right != null)
                    s1.push(t.right);
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
            
            zigZag(root, bw);
            bw.write("\n");
        }
        bw.flush();
    }
}















