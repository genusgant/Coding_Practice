package HackerRank.Strings;

import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class JavaStringTokens {

	 public static void main(String[] args) {
         Scanner scan = new Scanner(System.in);
       String s = scan.nextLine();
       scan.close();

       // Write your code here.
      String[] str_arr = s.split(" |!|,|\\?|\\.|_|'|@",-1);
       
       Stream<String> st = Stream.of(str_arr);

       
       st = (st.filter(s1 -> !(s1.trim()).equals("")));
       
 

       System.out.println(st.count());
       
//       st.forEach(s2 -> System.out.println(s2)); 
       for( String str : str_arr)
           {
           if (str != null && !(str.trim()).equals("")  )
               {
               System.out.println(str);
           }
           
           
       }
   }

}
