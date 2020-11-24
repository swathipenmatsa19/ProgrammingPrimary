/*


Given a string of characters, find the first repeating character.

Input Format

First line of input contains T - number of test cases. Its followed by T lines, each line contains a single string of characters. 

Constraints

1 <= T <= 1000 
'a' <= str[i] <= 'z'
1 <= len(str) <= 104

Output Format

For each test case, print the first repeating character, separated by newline. If there are none, print '.'. 

Sample Input 0

3
smartinterviews
algorithms
datastructures
Sample Output 0

s
.
a



*/




import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    
    public static char repeatedChar(String s) {
        char a[] = s.toCharArray();
        char ch = '.';
        HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
        
        for(int i = 0; i < s.length(); i++) {
            char c = a[i];
            if(hm.containsKey(c)) {
                int freq = hm.get(c);
                freq++;
                hm.put(c, freq);
            } else
                hm.put(c, 1);
        }
        for(int i = 0; i < s.length(); i++) {
            char c = a[i];
            if(hm.get(c) > 1) {
                ch = a[i];
                return ch;
            }
        }
        
        return ch;
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        sc.nextLine();
        while(T-- != 0) {
            String s = sc.next();
            System.out.println(repeatedChar(s));
        }
    }
}


















