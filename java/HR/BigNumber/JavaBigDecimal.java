package HackerRank.BigNumber;

import java.math.BigDecimal;
import java.util.Scanner;

public class JavaBigDecimal {

	public static void main(String []args){
        //Input
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        String []s=new String[n+2];
        for(int i=0;i<n;i++){
            s[i]=sc.next();
        }
        sc.close();
        
        
      //Write your code here
        
        BigDecimal b1;
        BigDecimal b2;
        

        for( int i =0; i<n;i++)
            {
            b1 = new BigDecimal(s[i]);
            
            for (int j =1; j<n ; j++)
            {
            	b2 = new BigDecimal(s[j]);
            	
            	if (b1.compareTo(b2)>0)
            	{
            		System.out.println("b1-->"+b1+", b2-->"+b2);
            		String temp = s[i];
            		s[i] = s[j];
            		s[j] = temp;
            		
            		
            	}
            }
            
            
//            System.out.println(b1.compareTo(b2));
//            System.out.println(b2.compareTo(b1));
            
        }
        
        
        //Output
        for(int i=0;i<n;i++)
        {
            System.out.println(s[i]);
        }

	}

}
