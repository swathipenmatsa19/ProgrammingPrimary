/*


Given a sentence containing only uppercase/lowercase english alphabets and spaces, you have to count the number of words, vowels and consonants.

Input Format

First line of input contains T - number of test cases. Its followed by T lines, each line contains a single sentence.

Constraints

1 <= T <= 1000 
1 <= len(sentence) <= 104 

Output Format

For each test case, print the number of words, vowels and consonants, separated by newline. 


*/



import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static boolean isVowel(char c) {
        if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u')
            return true;
        else
            return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t-- != 0) {
            String s = sc.nextLine();
            s = s.trim().toLowerCase();
            int v = 0, c = 0, w = 0, flag = 0;
            for(int i = 0; i < s.length(); i++) {
                char ch = s.charAt(i);
                if(ch >= 'a' && ch <= 'z') {
                  flag = 1;
                  if(isVowel(ch))
                     v++;
                  else
                     c++; 
                } else {
                    if(flag == 1)
                        w++;
                    flag = 0;
                }
            }
            if(flag == 1)
                w++;
            System.out.println(w + " " + v + " " + c);
        }
    }
}






