import java.sql.*;
public class jdbcUpdate{
public static void main(String args[])throws Exception{
String driver="com.mysql.jdbc.Driver";
String url="jdbc:mysql://localhost:3306/university";
String username="root";
String password="Shekar@30";
Class.forName(driver);
Connection con=DriverManager.getConnection(url,username,password);
Statement stmt=con.createStatement();
stmt.executeUpdate("update student set Registration_number=99210041415 where registration_number=99210041465");
con.close();
}
}