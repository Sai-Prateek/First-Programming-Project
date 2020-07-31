/**
* This program takes a input streamfrom the user and prints out
* the total number of words and total number of words that start with a vowel
*
* Author     : Sai Prateek Reddy Annaiahgari
* Date       : 2010-11-30 
* Copyright International Educational Academy, Hyderabad, India
*/
import java.io.*;
class Program_1
{
	public void main()throws IOException
	{
		InputStreamReader isr=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(isr);
		String M="";
		char v;
		int t=0;
		int k=0;
		int i=0;
		int l=0;
		int a=0;

		String s=br.readLine();
		s=s+" ";
		l=s.length();
		for(i=0;i<l;i++)
		{
			char c=s.charAt(i);
			if(c==' ')
			{
				k=k+1;
				v=M.charAt(a);
				if(v=='a'||v=='e'||v=='i'||v=='o'||v=='u'||v=='A'||v=='E'||v=='I'||v=='O'||v=='U')
				{
					t=t+1;
				}
				M=" ";
			}
			else
			{
				M=M+c;
			}
		}
		System.out.println("Total Number of Words="+k);
		System.out.println("Total Number of Words starting with vowels="+t);
	}
}
