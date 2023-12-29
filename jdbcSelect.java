import java.sql.*;
import java.io.*;
public class jdbcSelect{
public static void main(String args[])throws Exception{
String driver="com.mysql.jdbc.Driver";
String url="jdbc:mysql://localhost:3306/university";
String username="root";
String password="Shekar@30";

Class.forName(driver);
Connection con=DriverManager.getConnection(url,username,password);
Statement stmt=con.createStatement();
ResultSet rs=stmt.executeQuery("select *from Student");
while(rs.next()){
System.out.print(rs.getLong(1)+"	"+rs.getString(2)+"	"+rs.getString(3)+"	"+rs.getString(4)+"	"+rs.getString(5));
System.out.println();
}
con.close();
}
}