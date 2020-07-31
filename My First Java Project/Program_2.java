/**
* This program takes 4 strings as input and returns concatenated string as output
*
* Author     : Sai Prateek Reddy Annaiahgari
* Date       : 2010-11-30 
* Copyright International Educational Academy, Hyderabad, India
*/
import java.io.*;
public class Program_2
{
	public static String concat(String s1,String s2,String s3,String s4)
	{
		StringBuffer name=new StringBuffer(s1);
		name.append("/");
		name.append(s2);
		name.append("/");
		name.append(s3);
		name.append("/");
		name.append(s4);
		String Str1=name.toString();
		return Str1;
	}
	
	public static void main(String[] args)
	{ 
		String str1=null;   
		String str2=null;    
		String str3=null;    
		String str4=null;
		try
		{
			BufferedReader  inStream = new BufferedReader(new InputStreamReader(System.in) );
			System.out.print("Enter a string & hit <ENTER>:");
			str1=inStream.readLine();
			System.out.print("Enter Second string and hit <ENTER>:");
			str2=inStream.readLine();
			System.out.print("Enter third string and hit <ENTER>:");
			str3=inStream.readLine();
			System.out.print("Enter fourth string and hit <ENTER>:");
			str4=inStream.readLine();
		}
		catch(Exception e)
		{
			System.out.println("Exception:"+e);
			return ;
		}
		String finalstr=concat(str1,str2,str3,str4);
		System.out.println("you entered four strings as:");
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
		System.out.println(str4);
		System.out.println();
		System.out.println("the concatenated string is :"+finalstr);
	}
}