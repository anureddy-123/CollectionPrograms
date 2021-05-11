package practice;

import java.io.IOException;
import java.util.Scanner;

public class SumOfElements{
	public static void main(String[] args) { 
		int sum = 0;
		Scanner scn = new Scanner(System.in);
	 
		System.out.print("  enter Number of elements in an array  ");
		int Size = scn.nextInt();	
		
		int [] a = new int[Size];
		
		System.out.print("  enter " + Size + " elements of an Array ");
		for (int i = 0; i < a.length; i++)
		{
			a[i] = scn.nextInt();
		}   

		for(int i = 0; i < Size; i++)
		{
		 sum = sum + a[i]; 
		}		
		System.out.println("Sum of  Elements in  Array is..  " +sum);
	}
}




