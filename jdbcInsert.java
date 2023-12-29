import java.sql.*;
public class jdbcInsert{
public static void main(String args[]){
String driver="com.mysql.jdbc.Driver";
String url="jdbc:mysql://localhost:3306/university";
String username="root";
String password="Shekar@30";
try{
Class.forName(driver);
Connection con=DriverManager.getConnection(url,username,password);
Statement stmt=con.createStatement();
stmt.executeUpdate("insert into student values(99210041415,'Shekar Reddy','Computer Science and Engineering','Artificial Intelligence','Ratna')");
con.close();
}
catch(Exception e){
System.out.println(e);
}
}
}