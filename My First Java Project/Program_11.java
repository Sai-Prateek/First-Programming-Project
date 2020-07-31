/**
* This program calculates the total amount to be paid for Train tickets based on the
* Category of tickets and number of tickets needed by the user.
* Author     : Sai Prateek Reddy Annaiahgari
* Date       : 2010-11-30 
* Copyright International Educational Academy, Hyderabad, India
*/
import java.io.*;
public class Program_11
{
	public static void main(String []args)throws Exception
	{
		BufferedReader in = new BufferedReader(new InputStreamReader (System.in));
		int number=0;int tickets=0;int amount=0;
		String strNumber;
		System.out.print("1.Category A"); 
		System.out.print("2.Category B");
		System.out.print("3.Category C");
		System.out.print("4.Category D");
		System.out.print("Enter Choice between 1 & 4 :");
		strNumber=in.readLine();
		number=Integer.parseInt(strNumber);
		switch(number)
		{
			case 1: System.out.print("\nHow many Category A - Tickets ?");
					strNumber=in.readLine();
					tickets=Integer.parseInt(strNumber); 
					amount=tickets*100;
					break;
			case 2: System.out.print("\nHow many Category B - Tickets ?");
					strNumber=in.readLine();
					tickets=Integer.parseInt(strNumber); 
					amount=tickets*150;
					break;     
			case 3: System.out.print("\nHow many Category C - Tickets ?");
					strNumber=in.readLine();
					tickets=Integer.parseInt(strNumber); 
					amount=tickets*200;
					break;         
			case 4: System.out.print("\nHow many Category D - Tickets ?");
					strNumber=in.readLine();
					tickets=Integer.parseInt(strNumber); 
					amount=tickets*500;
					break;
			default: System.out.print("\nUnknown Option");
		}
		System.out.print("The Amount payable is :"+amount);
	}
}        