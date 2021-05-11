package demo.dao;
	import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

 



import demo.Person;

 


public class PersonDao {

 

    static Connection getConnect() {
        Connection con = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ojas","root","12345");
            System.out.println("connected"+con);
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return con;
    }

 

    public static boolean addPerson(Person person) {
        boolean b =false;
        try {
            Connection connection =getConnect();
            PreparedStatement preparedStatement = connection.prepareStatement("insert into persons (ename,contactno,email,gender,address) values(?,?,?,?,?)");
            preparedStatement.setString(1,person.getEname());
            preparedStatement.setString(2,person.getContactno());
            preparedStatement.setString(3,person.getEmail());
            preparedStatement.setString(4,person.getGender());
            preparedStatement.setString(5,person.getAddress());
            int res = preparedStatement.executeUpdate();
            if(res > 0) {
                b = true;
            }
        } catch (Exception e) {
            // TODO: handle exception
        }
        return b;
    }
}
	        