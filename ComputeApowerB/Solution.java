/*


Given 2 numbers - a and b, evaluate ab. 
Note: Do not use any inbuilt functions/libraries for your main logic.

Input Format

First line of input contains T - number of test cases. Its followed by T lines, each line containing 2 numbers - a and b, separated by space. 

Constraints

30 points 
1 <= T <= 1000 
0 <= a <= 106 
0 <= b <= 103 

70 points 
1 <= T <= 1000 
0 <= a <= 106 
0 <= b <= 109 

Output Format

For each test case, print ab, separated by new line. Since the result can be very large, print result % 1000000007 

Sample Input 0

4
5 2
1 10
2 30
10 10
Sample Output 0

25
1
73741817
999999937


*/




import java.io.*;
import java.util.*;


public class Solution {
    
    public static boolean checkBit(int N, int i) {
        return (N & (1 << i)) != 0;
    }
    
    public static long power(int a, int b) {
        long ans = 1, x = a % 1000000007;
        for(int i = 0; i < 31; i++) {
            if(checkBit(b,i) == true) {
                ans = (ans * x) % 1000000007;
            }
            x = (x * x) % 1000000007 ;
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- != 0) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.println(power(a,b));
        }
    }
}
















