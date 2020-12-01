/*


Given a number, swap the adjacent bits in the binary representation of the number, and print the new number formed after swapping. 

Input Format

First line of input contains T - number of test cases. Each of the next T lines contains a number N. 

Constraints

1 <= T <= 100000 
0 <= N <= 109 

Output Format

For each test case, print the new integer formed after swapping adjacent bits, separated by new line. 

Sample Input

4
10
7
43
100

Sample Output

5
11
23
152

Explanation

Test Case 1

Binary Representation of 10: 000...1010
After swapping adjacent bits: 000...0101 (5)

Test Case 2

Binary Representation of 7: 000...0111
After swapping adjacent bits: 000...1011 (11)


*/




import java.io.*;
import java.util.*;

public class Solution {
    
    public static int swapBits(int n) {
        int oddbits = n & 0xAAAAAAAA;
        oddbits >>= 1;
        int evenbits = n & 0x55555555;
        evenbits <<= 1;
        return (oddbits | evenbits);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- != 0) {
            int n = sc.nextInt();
            System.out.println(swapBits(n));
        }
    }
}











