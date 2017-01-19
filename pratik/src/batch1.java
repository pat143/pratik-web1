
import java.sql.*;  
class batch1
{  
public static void main(String args[])throws Exception
{  
	Class.forName("com.mysql.jdbc.Driver");
	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/pratik","root","");
con.setAutoCommit(false);  
  
Statement stmt=con.createStatement();  
stmt.addBatch("insert into demo values('deep1',99,40,'1998-01-01');");  
stmt.addBatch("insert into demo values('deep2',100,50,'1999-01-01');");  
  
stmt.executeBatch();//executing the batch  
  
con.commit();  
con.close();  
}}  