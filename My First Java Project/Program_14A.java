/**
* This program has a function called bubbleSort() that uses bubble sorting algorithm to sort
* the elements of the input string array. The program prints out the sorted array. 
*
* Author     : Sai Prateek Reddy Annaiahgari
* Date       : 2010-11-30 
* Copyright International Educational Academy, Hyderabad, India
*/
import java.io.*;
class Program_14A
{
	public static void main(String[] args)  throws IOException
	{
		BufferedReader buf = new BufferedReader (new InputStreamReader (System.in));
		System.out.println("Enter 10 strings");
		String[] a = new String[10];
		for(int i=0;i<10;i++)  
			a[i] = buf.readLine();
		Program_14A st=new Program_14A();
		st.sort(a);
		for(int j=0;j<10;j++)
			System.out.println(a[j]);
	}

	public void sort(String[]  s1)
	{
	  String temp;
	  int i,j ;
	  int n=s1.length;
	  for(i=1;i<=n-1;i++)
		{
			for(j=0;j<=n-i-1;j++)
			{
				if ((s1[j].compareTo(s1[j+1]))  > 0 )
				{
					temp=s1[j];
					s1[j]=s1[j+1];
					s1[j+1]=temp;
				}
			}
		}
	}

}