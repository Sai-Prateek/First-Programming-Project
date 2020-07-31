/**
* This program has a method named num_calc with an overload. One method takes 2 srings as  
* input and compares them for equality and the other method takes two integers and a character input 
* with the character input idicating the arithmatic operation to do on the integers and returns the result
* 
* Author     : Sai Prateek Reddy Annaiahgari
* Date       : 2010-11-30 
* @modified  : None
* Copyright International Educational Academy, Hyderabad, India
*/
import java.io.*;
class Program_20
{
	void num_calc(int a,int b,char ch)
	{
		int r;
		if(ch=='s')
			r=a+b;
		else
			r=a*b;
		System.out.println(r);
	}
	
	void num_calc(String s1,String s2)
	{
		if(s1==s2)
			System.out.println("The strings are equal");
		else
			System.out.println("Strings are not equal");
	}
}
