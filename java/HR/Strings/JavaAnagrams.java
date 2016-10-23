/*
 * 
 * Two strings  and  are called anagrams if they consist same characters, but may be in different orders. So the list of anagrams of  is .

Given two strings, print Anagrams if they are anagrams, print Not Anagrams if they are not. The strings may consist at most  English characters; the comparison should NOT be case sensitive.

This exercise will verify that you can sort the characters of a string, or compare frequencies of characters.

Sample Input 0

anagram
margana
Sample Output 0

Anagrams
Sample Input 1

anagramm
marganaa
Sample Output 1:

Not Anagrams
 */

package HackerRank.Strings;

import java.util.Scanner;

public class JavaAnagrams {

	public static void main(String[] args) {
	    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
	
static boolean isAnagram(String a, String b) {
        
        if(a.length()==b.length())
            {
            StringBuilder sb = new StringBuilder(b.toLowerCase());
            
            for (char c : a.toLowerCase().toCharArray())
                {
                if (sb.lastIndexOf(""+c)>= 0)
                    {
                    sb.deleteCharAt(sb.lastIndexOf(""+c));
                }
                else 
                    {
                    return false;
                }
                
            }
            
            if (sb.length()==0)
                {
                return true;
            }
            return false;
            
        }
        return false;
             
        
    }

}
