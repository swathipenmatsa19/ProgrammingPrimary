/*

Print hollow diamond pattern using '*'. See examples for more details.

Input Format

First line of input contains T - number of test cases. Its followed by T lines, each line contains a single odd integer N - the size of the diamond. 

Constraints

1 <= T <= 100 
3 <= N <= 201 

Output Format

For each test case, print the test case number as shown, followed by the diamond pattern, separated by newline. 

Sample Input 0

4
3
7
5
15
Sample Output 0

Case #1:
 *
* *
 *
Case #2:
   *
  * *
 *   *
*     *
 *   *
  * *
   *
Case #3:
  *
 * *
*   *
 * *
  *
Case #4:
       *
      * *
     *   *
    *     *
   *       *
  *         *
 *           *
*             *
 *           *
  *         *
   *       *
    *     *
     *   *
      * *
       *
       
     
     
     
  */
  
  
  
  import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
public class Solution {
    
    public static void printHollowDiamond(int n) {
        StringBuilder str = new StringBuilder();
        int mid = n/2;
        for(int i = 0; i <= n/2; i++) {
            for(int j = 0; j < n; j++) {
                if(j == (mid - i) || j == (mid + i))
                    str.append("*");
                else
                    str.append(" ");        
            }
            System.out.println(str);
            str.setLength(0);
        }
        
        for(int i = n/2 + 1; i < n; i++) {
            for(int j = 0; j < n; j++) {
                if((j == mid - (n - 1 - i)) || (j == mid + (n - 1 - i)))
                            System.out.print("*");
                        else
                            System.out.print(" ");
            }
            System.out.println(str);
            str.setLength(0);
        }
        
        str.setLength(0);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for(int i = 1; i <= T; i++) {
            System.out.println("Case #"+i+":");
            printHollowDiamond(sc.nextInt());
        }
    }
    
}




       
       
       
       
       
       
