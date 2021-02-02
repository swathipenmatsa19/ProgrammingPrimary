/*


Given an array of unique elements, construct a Binary Search Tree. Now, given two nodes u and v of the BST, find their Lowest Common Ancestor (LCA). LCA is defined as the furthest node from the root that is an ancestor for both u and v. 

Input Format

First line of input contains T - number of test cases. First line of each test case contains N, Q - number of nodes in the BST and the number of queries. The next line contains N unique integers - value of the nodes. Its followed by Q lines, each contains 2 nodes of the tree, u and v.

Constraints

1 <= T <= 1000 
1 <= N,Q <= 1000 
0 <= ar[i] <= 10000 

Output Format

For each test case, for each query print the LCA of the given nodes u and v, separated by space. Separate the output of different test cases with a newline.

Sample Input 0

2
5 2
3 2 4 1 5
2 5
1 2
7 3
4 5 15 0 1 7 17
0 15
7 17
17 4
Sample Output 0

3 2 
4 15 4


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
        public Node(int item) {
            data = item;
            left = null;
            right = null;
        }
    }
    
    public static Node lca(Node root, int v1, int v2) {
        if(root.data < v1 && root.data < v2)
            return lca(root.right,v1,v2);
        if(root.data > v1 && root.data > v2)
            return lca(root.left,v1,v2);
    return root;
    }
    
    public static Node insert(Node root, int data) {
        if(root == null) {
            return new Node(data);
        } else {
            Node cur;
            if(data <= root.data) {
                cur = insert(root.left, data);
                root.left = cur;
            } else {
                cur = insert(root.right, data);
                root.right = cur;
            }
            return root;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int t = Integer.parseInt(br.readLine());
        while(t-- != 0) {
            String[] inp = br.readLine().split(" ");
            int n = Integer.parseInt(inp[0]);
            int q = Integer.parseInt(inp[1]);
            inp = br.readLine().split(" ");
            Node root = null;
            for(int i = 0; i < n; i++) {
                int e = Integer.parseInt(inp[i]);
                root = insert(root, e);
            }
            
            while(q-- != 0) {
                inp = br.readLine().split(" ");
                int v1 = Integer.parseInt(inp[0]);
                int v2 = Integer.parseInt(inp[1]);
                Node ans = lca(root, v1, v2);
                bw.write(ans.data + " ");
            }
           bw.write("\n");
        }
        bw.flush();
    }
}












