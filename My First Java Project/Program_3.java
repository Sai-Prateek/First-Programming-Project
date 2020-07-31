/**
* This program has a function called datemediumFormat() that takes 3 integer parameters representing date
* month and year and returns in string date format (dd-MMM-YY). The program takes 3 integer inputs
* from the user, calls the function using the inputs and prints out the Formatted date returned from the function.
*
* Author     : Sai Prateek Reddy Annaiahgari
* Date       : 2010-11-30 
* Copyright International Educational Academy, Hyderabad, India
*/
import java.io.*;
public class Program_3
{
	public static void main(String[] args)throws Exception
	{
		BufferedReader buf=new BufferedReader(new InputStreamReader(System.in));
		int dd=0,mm=0,yy=0;
		System.out.println("Enter Date");
		System.out.print("dd :");
		dd=Integer.parseInt(buf.readLine());
		System.out.print("mm :");
		mm=Integer.parseInt(buf.readLine());
		System.out.print("yy :");
		yy=Integer.parseInt(buf.readLine());
		System.out.println();
		String d=datemediumFormat(dd,mm,yy);
		System.out.println("Formatted Date is :"+d);
	}
	
	public static String datemediumFormat(int dd,int mm,int yy)throws Exception
	{
		String 	a[]={"Jan","Feb","Mar","Apr","May","Jun","Jul","Aug","Sep","Oct","Nov","Dec"};
		StringBuffer str=new StringBuffer();
		str.append(Integer.toString(dd));
		str.append("-"); 
		str.append(a[mm - 1]);
		str.append("-");
		str.append(Integer.toString(yy));
		return str.toString();
	}
}