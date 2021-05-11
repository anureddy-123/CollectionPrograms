package second_assessment;

import java.util.Scanner;

public class MaskedMailid{
	
	    static String printMaskedMail(String mail) {
	        StringBuffer sb = new StringBuffer(mail);
	        String result = "";
	        int count = mail.indexOf("@");
	        for (int i = 2; i < count; i++) {
	            sb.setCharAt(i, '*');           
	        }       
	        result = sb.toString();
	        
	        return result;
	        
	    }
	 
	    public static void main(String[] args) {
	        System.out.println("Enter mail id ");
	        Scanner sc = new Scanner(System.in);
	        String mail_id = sc.next();
	        System.out.println(printMaskedMail(mail_id));
	 
	    }
	 
}
