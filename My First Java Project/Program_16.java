/**
* This program takes the 3X3 matrix array input from the user and prints the sum of
* elements in left diagonal and right diagonal
*
* Author     : Sai Prateek Reddy Annaiahgari
* Date       : 2010-11-30 
* Copyright International Educational Academy, Hyderabad, India
*/
import java.io.*;
class Program_16
{
	public static void main(String args[])  throws IOException
	{
	BufferedReader buf = new BufferedReader(new InputStreamReader(System.in)); 
	int sum=0;
	int sum1=0;
	System.out.println("Enter the elements for 3x3 array");
	int a[][] = new int [3][3];
	for(int i=0;i<3;i++)
		for(int j=0;j<3;j++)
	a[i][j]=Integer.parseInt(buf.readLine());

	for(int k=0;k<3;k++)
	    for(int l=0;l<3;l++)
		{
		   if(k==l)
		   sum+=a[k][l];
		}

	int x=0,y=0;
	for(x=0,y=2;y>=0;x++,y--)
		sum1+=a[x][y];

	System.out.println("Sum of Left Diagonal is "+sum);
	System.out.println("Sum of Right Diagonal is "+sum1);   
	}
}      
