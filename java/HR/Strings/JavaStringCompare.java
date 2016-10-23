/*
 * 
 * Given a string, find out the lexicographically smallest and largest substring of length .

[Note: Lexicographic order is also known as alphabetic order dictionary order. So "ball" is smaller than "cat", "dog" is smaller than "dorm". Capital letter always comes before smaller letter, so "Happy" is smaller than "happy" and "Zoo" is smaller than "ball".]

Input Format

First line will consist a string containing english alphabets which has at most  characters. 2nd line will consist an integer .

Output Format

In the first line print the lexicographically minimum substring. In the second line print the lexicographically maximum substring.

Sample Input

welcometojava
3
Sample Output

ava
wel
Explanation

Here is the list of all substrings of length :

wel
elc
lco
com
ome
met
eto
toj
oja
jav
ava
Among them ava is the smallest and wel is the largest.
 * 
 */

package HackerRank.Strings;

import java.util.Scanner;

public class JavaStringCompare {

	public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner scan = new Scanner(System.in);
        
        String input = scan.next();
        int k = Integer.parseInt(scan.next());
        
        
        String min = "|"; // 124
        String max = "-"; // 45
        
        if (input.length()>=k)
            {
            for (int i=0; i<=(input.length()-k); i++)
                {


                    if (max.compareTo(input.substring(i,i+k))<0)
                        max = input.substring(i,i+k);

                    if (min.compareTo(input.substring(i,i+k))>0)
                        min = input.substring(i,i+k);
            }
            System.out.println(min);
            System.out.println(max);
        }
    
    }

}
