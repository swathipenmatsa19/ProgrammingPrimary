/*



Given an array of unique elements, construct a Binary Search Tree and find the height of the tree.

Input Format

First line of input contains T - number of test cases. Its followed by 2T lines. First line of each test case contains N - number of nodes in the BST. The next line contains N unique integers - value of the nodes. 

Constraints

1 <= T <= 1000 
1 <= N <= 1000 
0 <= ar[i] <= 10000 

Output Format

For each test case, print the height of the Binary Search Tree, separated by newline.

Sample Input 0

3
5
1 2 3 4 5 
5
3 2 4 1 5 
7
4 5 15 0 1 7 17 
Sample Output 0

4
2
3


*/


import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public class Node {
        int data;
        Node left, right;
        
        public Node(int item) {
            data = item;
            left = right = null;
        }
    }
    
    public static Node insert(Node root, int x) {
        if(root == null) {
            Solution s = new Solution();
            Solution.Node root1 = s.new Node(x);
            return root1;
        }
        if(x < root.data)
            root.left = insert(root.left, x);
        else if(x > root.data)
            root.right = insert(root.right, x);
        return root;
    }
    
    public static int height(Node root) {
        if(root == null)
            return -1;
        return 1 + Math.max(height(root.left), height(root.right));
    }
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int T = Integer.parseInt(br.readLine());
        while(T-- != 0) {
            int n = Integer.parseInt(br.readLine());
            String inp[] = br.readLine().split(" ");
            Node root = null;
            for(int i = 0; i < n; i++) {
                int e = Integer.parseInt(inp[i]);
                root = Solution.insert(root, e);
            }
            int h = Solution.height(root);
            bw.write(h+"\n");
        }
        bw.flush();
    }
}







