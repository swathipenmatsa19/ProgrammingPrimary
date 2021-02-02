/*



Given an array of unique elements, construct a Binary Search Tree and print the Level Order of the tree, not top-down, but bottom-up.

Input Format

First line of input contains T - number of test cases. Its followed by 2T lines. First line of each test case contains N - number of nodes in the BST. The next line contains N unique integers - value of the nodes. 

Constraints

1 <= T <= 1000 
1 <= N <= 1000 
0 <= ar[i] <= 10000 

Output Format

For each test case, print the bottom-up Level Order of the Binary Search Tree, separate each level by newline. Separate the output of different test cases with an extra newline.

Sample Input 0

3
5
1 2 3 4 5 
5
3 2 4 1 5 
7
4 5 15 0 1 7 17 
Sample Output 0

5 
4 
3 
2 
1 

1 5 
2 4 
3 

7 17 
1 15 
0 5 
4


*/




import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
     public static class Node {
        int data; 
        boolean isNull = false;
        Node left, right; 

        public Node(int item) {
            data = item; 
            left = null;
            right = null;
        } 
        public Node(boolean isNullin) {
            left = null;
            right = null;
            isNull = isNullin;
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
    public static void levelOrderBottomUp(Node root, BufferedWriter bw) throws IOException {
        Queue<Node> q = new LinkedList<Node>(); 
        Stack<Node> st = new Stack<>(); 
        q.add(root); 
        while(!q.isEmpty()) {
            int s = q.size();
            for(int i = 0; i < s; i++) {
                Node front=q.poll();
                st.push(front);
                if(front.right!=null)
                  q.add(front.right);  
                if(front.left!=null)
                  q.add(front.left);          
            }
            st.push(null);
        }
       st.pop(); 
        
       while (st.empty() == false)  { 
            Node node = st.peek(); 
            if (node == null) {
                bw.write("\n");
            }
           else{
               bw.write(node.data + " ");               
           }
            st.pop(); 
        } 
        bw.write("\n\n");
    }     
     public static void main(String[] args) throws IOException {
     
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
        int T = Integer.parseInt(br.readLine());
        while(T-- != 0) {
            int n;
            n = Integer.parseInt(br.readLine());
            String[] input = br.readLine().split(" ");
            Node root = null;
            for(int i = 0; i < n; i++) {
               int x = Integer.parseInt(input[i]);
               root = insert(root,x);
            }
            levelOrderBottomUp(root,bw);
        }
         
          bw.flush(); 
   
    }
}















