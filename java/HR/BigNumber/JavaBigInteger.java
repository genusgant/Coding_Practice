/*
 * In this problem, you have to add and multiply huge numbers! These numbers are so big that you can't contain them in any ordinary data types like a long integer.

Use the power of Java's BigInteger class and solve this problem.

Input Format

There will be two lines containing two numbers,  and .

Constraints

 and  are non-negative integers and can have maximum  digits.

Output Format

Output two lines. The first line should contain , and the second line should contain . Don't print any leading zeros.

Sample Input

1234
20
Sample Output

1254
24680
Explanation




 * 
 */

package HackerRank.BigNumber;

import java.util.Scanner;
import java.math.BigInteger;

public class JavaBigInteger {

	public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
		Scanner scan = new Scanner(System.in);
		
		BigInteger b1 = scan.nextBigInteger();
		scan.nextLine();
		BigInteger b2 = scan.nextBigInteger();
		scan.close();
		
		
		System.out.println(b1.add(b2));
		System.out.println(b1.multiply(b2));
    }

}
