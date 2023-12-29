import java.sql.*;
public class jdbcCreate{
public static void main(String args[]){
String driver="com.mysql.jdbc.Driver";
String username="root";
String password="Shekar@30";
String url="jdbc:mysql://localhost:3306/university";
//load or Register the Driver
try{
Class.forName(driver);
//establishing connection
Connection con=DriverManager.getConnection(url,username,password);
//creating statement
Statement stmt=con.createStatement();
stmt.executeUpdate("create table Student(Registration_number int primary key,Name varchar(30),Department varchar(30),Stream varchar(20))");
con.close();
}
catch(Exception e){
System.out.println(e);
}
}
}
