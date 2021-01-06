/*

Given a sentence, reverse the entire sentence word-by-word. 
Note: Solve using stack or in-place swap. Do not simply scan, split and print in reverse order.

Input Format

First line of input contains T - number of test cases. Its followed by T lines, each contains a sentence S of space separated words of lowercase english alphabet. All the words are separated by a single space. 

Constraints

1 <= T <= 1000 
1 <= len(S) <= 1000 

Output Format

For each test case, print the reversed sentence, separated by newline.


*/


import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static void reverseStringWords(String s) {
        String stringReversed = "";
        Stack<String> stack= new Stack<String>();
        String s1[] = s.split(" ");
        for(int i = 0;i < s1.length; i++) {
            stack.push(s1[i]);
        }

        while(!stack.isEmpty()) {
            stringReversed += stack.pop();
            stringReversed += " ";
        }
         System.out.println(stringReversed);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t-- != 0) {
            String s = sc.nextLine();
            reverseStringWords(s);
        } 
    }
}












