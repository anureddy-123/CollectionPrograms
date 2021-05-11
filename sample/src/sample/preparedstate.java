package sample;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.Scanner;

public class preparedstate {
	public static void main(String[] args) {
		try {
	           
            Class.forName("com.mysql.cj.jdbc.Driver");
           
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/java200","root","root");
           
            System.out.println("Connected" +con);
            Scanner scn = new Scanner(System.in);
            Statement st = con.createStatement();
            System.out.println("enter num,name,marks?");
            int num = scn.nextInt();
            String name= scn.next();
            int marks = scn.nextInt();
            PreparedStatement st1 = con.prepareStatement("insert into information1 values(?,?,?)");
            st1.setInt(1,num);
            st1.setString(2, name);
            st1.setInt(3, marks);
            int res = st1.executeUpdate();
            if(res > 0) {
            	System.out.println("record inserted successfully");
            }
            else {
            	System.out.println("try again");
            }
		}
		catch(Exception e) {
			e.getMessage();
            
            //int res = st.executeUpdate("update student set sname="+"'"+name+"', marks="+marks+num);
		    //System.out.println(res +"updated successfully");
		    
	}
		
	}

}
