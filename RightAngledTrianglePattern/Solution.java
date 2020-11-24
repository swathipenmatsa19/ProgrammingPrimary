/*


Print mirror image of right-angled triangle using '*'. See examples for more details. 

Input Format

First line of input contains T - number of test cases. Its followed by T lines, each line contains a single integer N - the size of the pattern.

Constraints

1 <= T <= 100 
1 <= N <= 100 

Output Format

For each test case, print the test case number as shown, followed by the pattern, separated by newline.

Sample Input 0

4
2
1
5
10
Sample Output 0

Case #1:
 *
**
Case #2:
*
Case #3:
    *
   **
  ***
 ****
*****
Case #4:
         *
        **
       ***
      ****
     *****
    ******
   *******
  ********
 *********
**********


*/




import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    
    public static void printTriangle(int n) {
        StringBuilder str = new StringBuilder();
        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= n; j++) {
                if(j <= (n - i))
                    str.append(" ");
                else
                    str.append("*");
            }
            System.out.println(str);
            str.setLength(0);
        }
            
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            int T = sc.nextInt();
            for(int k = 1; k <= T; k++) {
                int n = sc.nextInt();
                System.out.println("Case #" + k +":");
                printTriangle(n);
            }
        }
}






