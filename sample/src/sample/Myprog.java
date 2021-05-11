package sample;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
public class Myprog {
	public static void main(String[] args) {
		try {
	           
            Class.forName("com.mysql.cj.jdbc.Driver");
           
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/java200","root","root");
           
            System.out.println("Connected" +con);
           
            Statement st = con.createStatement();
           
            st.executeUpdate("Create table info (sno INT,sname VARCHAR(20),marks INT)");
           
            System.out.println("Table is created Successfully");
               
            con.close();
        }
        catch(Exception e) {
           
            e.getMessage();
        }
		
	}

}
