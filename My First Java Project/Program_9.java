/**
* This program takes a two dates as input and calculates the difference between the two dates
*
* Author     : Sai Prateek Reddy Annaiahgari
* Date       : 2010-11-30 
* Copyright International Educational Academy, Hyderabad, India
*/
import java.util.Calendar;
import java.io.*;
public class Program_9
{    
	public static void main(String[ ] args)
	{ 	
		BufferedReader inStream = new BufferedReader(new InputStreamReader(System.in));
		int yyyy1 = 0, mm1 = 0,dd1 = 0, yyyy2 = 0, mm2 = 0, dd2 = 0 ; 
		String str;
		System.out.print("Enter Date1 : ");
		try	
		{	
			System.out.print("Enter year of date1 in yyyy format and hit <ENTER> : ");
			str = inStream.readLine( ) ;
			yyyy1 = Integer.parseInt(str);
			System.out.print("Enter month of date1 in mm format and hit <ENTER>: ");   
			str = inStream.readLine( ) ;
			mm1 = Integer.parseInt(str);
			System.out.print("Enter day of date1 in dd format and hit <ENTER> : ");            			
			str = inStream.readLine( ) ;
			dd1 = Integer.parseInt(str);
			System.out.print("Now Enter Date2 : ");     		
			System.out.print("Enter year of date2 in yyyy format and hit <ENTER> : ");  
			str = inStream.readLine( ) ;
			yyyy2 = Integer.parseInt(str);
			System.out.print("Enter month of date2 in mm format and hit <ENTER> : ");       	    	
			str = inStream.readLine( ) ;
			mm2 = Integer.parseInt(str);
			System.out.print("Enter day of date2 in dd format and hit <ENTER> : ");  	     	
			str = inStream.readLine( ) ;
			dd2 = Integer.parseInt(str);
		}
		catch(Exception e) 
		{   	
			System.out.println("Error in data entry!!");
			System.out.println("Exception : "+e);
		}
		calcDateDiff(yyyy2,mm2,dd2, yyyy1,mm1,dd1)	;
	}
	
	public static void calcDateDiff(int y2, int m2, int d2, int y1, int m1, int d1)
	{	
		Calendar calendar1 = Calendar.getInstance();
		Calendar calendar2 = Calendar.getInstance();
		calendar1.set(y1, m1, d1);
		calendar2.set(y2, m2, d2);
		long milliseconds1 = calendar1.getTimeInMillis();
		long milliseconds2 = calendar2.getTimeInMillis();
		long diff = milliseconds2 - milliseconds1;
		long diffSeconds = diff / 1000;
		long diffMinutes = diff / (60 * 1000);
		long diffHours = diff / (60 * 60 * 1000);
		long diffDays = diff / (24 * 60 * 60 * 1000);
		System.out.println("\nDifference in given two dates");
		System.out.println("Time in milliseconds:" + diff  + "milliseconds.");
		System.out.println("Time in seconds:" + diffSeconds + "seconds.");
		System.out.println("Time in minutes:" + diffMinutes + "minutes.");
		System.out.println("Time in hours:" + diffHours + "hours.");
		System.out.println("Time in days:" + diffDays + "days.");
	}
}
