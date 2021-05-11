package sample;
import java.sql.*;
public class MyDBprog {


	 public static void main(String args[]) {
	        try {
	            Class.forName("com.mysql.cj.jdbc.Driver");
	            Connection sc = DriverManager.getConnection("jdbc:mysql://localhost:3306/anusha","root","root");
	            System.out.println("connected "+sc);
	        }
	        catch(Exception e) {
	            System.out.println(e);
	        }
	    }
	}


