/*



Given 2 strings, check if they are anagrams. An anagram is a rearrangement of the letters of one word to form another word. In other words, some permutation of string A must be same as string B.

Input Format

First line of input contains T - number of test cases. Its followed by T lines, each line containing 2 space separated strings.

Constraints

10 points 
1 <= T <= 100 
1 <= len(S) <= 103 
'a' <= S[i] <= 'z' 

40 points 
1 <= T <= 100 
1 <= len(S) <= 105 
'a' <= S[i] <= 'z' 

Output Format

For each test case, print True/False, separated by newline. 

Sample Input 0

4
a a
b h
stop post
hi hey
Sample Output 0

True
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
    
    public static boolean areAnagrams(String s1, String s2) {
        char a1[] = s1.toCharArray();
        char a2[] = s2.toCharArray();
        HashMap<Character, Integer> hm1 = new HashMap<Character, Integer>();
        HashMap<Character, Integer> hm2 = new HashMap<Character, Integer>();
        
        for(int i = 0; i < s1.length(); i++) {
            char c = a1[i];
            if(hm1.containsKey(c)) {
                int freq = hm1.get(c);
                freq++;
                hm1.put(c, freq);
            } else
                hm1.put(c, 1);
        }
        
        for(int i = 0; i < s2.length(); i++) {
            char c = a2[i];
            if(hm2.containsKey(c)) {
                int freq = hm2.get(c);
                freq++;
                hm2.put(c, freq);
            } else
                hm2.put(c, 1);
        }
        
        if(hm1.equals(hm2))
            return true;
        else
            return false;
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        sc.nextLine();
        while(T-- != 0) {
            String s1 = sc.next();
            String s2 = sc.next();
            if(areAnagrams(s1,s2))
                System.out.println("True");
            else
                System.out.println("False");
        }
    }
}





















