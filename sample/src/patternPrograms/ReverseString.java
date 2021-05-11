package patternPrograms;

import java.util.Scanner;

public class ReverseString {
	public static void main(String[] args) {
		 String rev="";
		Scanner sc=new Scanner(System.in);
	     System.out.println("enter the string");
	     String str=sc.nextLine();
	     for(int i=str.length()-1;i>=0;i--)
	   {
	    	 	 rev=rev+str.charAt(i);
	    	 		
	    			 
	    		 }
	     System.out.println(rev);
	}

}
