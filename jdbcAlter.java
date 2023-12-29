import java.sql.*;
public class jdbcAlter{
public static void main(String args[]){
String driver="com.mysql.jdbc.Driver";
String url="jdbc:mysql://localhost:3306/university";
String username="root";
String password="Shekar@30";
try{
Class.forName(driver);
Connection con=DriverManager.getConnection(url,username,password);
Statement stmt=con.createStatement();
//alter
stmt.executeUpdate("alter table student modify column Registration_number numeric(20)");

stmt.executeUpdate("alter table student rename column LastName to FirstName");
stmt.executeUpdate("alter table student rename column surname to Lastname");

stmt.executeUpdate("alter table student modify column Department varchar(100)");

stmt.executeUpdate("alter table student modify column Stream varchar(100)");


con.close();
}
catch(Exception e){
System.out.println(e);
}
}
}