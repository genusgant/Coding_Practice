/*
 * 
 * The Calendar class is an abstract class that provides methods for converting between a specific instant in time and a set of calendar fields such as YEAR, MONTH, DAY_OF_MONTH, HOUR, and so on, and for manipulating the calendar fields, such as getting the date of the next week.

You are given a date. Your task is to find what the day is on that date.

Input Format

A single line of input containing the space separated month, day and year, respectively, in   format.

Constraints

Output Format

Output the correct day in capital letters.

Sample Input

08 05 2015
Sample Output

WEDNESDAY
Explanation

The day on August th  was WEDNESDAY.
 * 
 */



package HackerRank.Introduction;

import java.util.Scanner;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class JavaDateAndTime {
	
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String month = in.next();
        String day = in.next();
        String year = in.next();
        
        Date date = null;
	        
	    SimpleDateFormat newDateFormat = new SimpleDateFormat("dd/MM/yyyy");
        
        try {
            date = newDateFormat.parse(day+"/"+month+"/"+year);
            
            } catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
		}
        
        System.out.println(new SimpleDateFormat("EEEE").format(date).toUpperCase());
        
        
    }

	/* public static void main(String[] args) {
	        Scanner in = new Scanner(System.in);
	        String month = in.next();
	        String day = in.next();
	        String year = in.next();
	        
	        Date date = null;
	        
	        SimpleDateFormat newDateFormat = new SimpleDateFormat("dd/MM/yyyy");
	        try {
	        	
				date = newDateFormat.parse(day+"/"+month+"/"+year);
				
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	        
	        Calendar cal = Calendar.getInstance();
	        cal.setTime(date);
	        
	        System.out.println(cal.get(Calendar.DAY_OF_WEEK));
	        
	        System.out.println(new SimpleDateFormat("EEEE").format(date).toUpperCase());
	        
	        System.out.println(new SimpleDateFormat("EEEE").format(cal.getTime()).toUpperCase());
	        
	   
	    
	        // full name form of the day
//	        System.out.println(new SimpleDateFormat("EEEE", Locale.ENGLISH).format(date.getTime()));
	    }
	    
	    */

}
