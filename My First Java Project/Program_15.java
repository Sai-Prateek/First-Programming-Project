/**
* This program has a function called bubbleSort() that uses bubble sorting algorithm to sort
* the elements of the input array. The program prints out the sorted array. 
*
* Author     : Sai Prateek Reddy Annaiahgari
* Date       : 2010-11-30 
* Copyright International Educational Academy, Hyderabad, India
*/
public class Program_15 
{
  	public static void main(String[] args) 
	{
  		int intArray[] = new int[]{5,90,35,45,150,3};
  		System.out.println("Array Before Bubble Sort");
  		for(int i=0; i < intArray.length; i++){
  			System.out.print(intArray[i] + " ");
  		}
  		bubbleSort(intArray);
        System.out.println("");
 		System.out.println("Array After Bubble Sort");
 		for(int i=0; i < intArray.length; i++){
  			System.out.print(intArray[i] + " ");
  		}
   
  	}
   
 	private static void bubbleSort(int[] intArray) 
	{
  		int n = intArray.length;
  		int temp = 0;
 		for(int i=0; i < n; i++)
		{
  			for(int j=1; j < (n-i); j++)
			{
  				if(intArray[j-1] < intArray[j])
				{
 					temp = intArray[j-1];
 					intArray[j-1] = intArray[j];
  					intArray[j] = temp;
  				}
 			}
  		}
  	}
}
