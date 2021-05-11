package sample;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class crudOperations {
	public static void main(String[] args) {
	try {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/java200", "root", "root");
        System.out.println("connected " + con);
        Statement st=con.createStatement();
        
        
        st.executeUpdate("create table information1(sno int,sname varchar(20),marks int)");
        System.out.println("Table created succesfully");
        
        //insertion
        int res=st.executeUpdate("insert into information1 values(1,'anu',80)");
        int res1=st.executeUpdate("insert into information1 values(2,'navya',22)");
        int res2=st.executeUpdate("insert into information1 values(3,'raashee',22)");
        System.out.println(res1+"inserted succesfully");
        
       
        //deleting
        
        st.executeUpdate("delete from information1 where sno=1");
        System.out.println("Record deleted successfully");
        
        
        //updating
        
        st.executeUpdate("update information1 set marks = 98 where sno = 2");
        System.out.println("Updated successfully");
        
        st.close();
    } 
    catch (Exception e) {
        System.out.println(e);
    }
}

}
