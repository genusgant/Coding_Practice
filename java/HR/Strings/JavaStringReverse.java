/*
 * A palindrome is a word, phrase, number, or other sequence of characters which reads the same backward or forward.(Wikipedia)
Given a string , print Yes if it is a palindrome, print No otherwise.

Constraints

 will consist at most  lower case english letters.
Sample Input

madam
Sample Output

Yes
 * 
 */


package HackerRank.Strings;

import java.util.Scanner;

public class JavaStringReverse {

public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        
        boolean flag = true;
            
        if (A.length()>0 && A.length()<=50) 
            {
            
            char[] arr = A.toCharArray();
            
            for (int i = 0; i<(A.length()/2)+1; i++)
               {
               if(arr[i] != arr[A.length()-1-i])
                  {
                      flag = false;
               }
            }
            if (flag)
                System.out.println("Yes");
            else
                System.out.println("No");
        }
   
    }

}
