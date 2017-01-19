import java.sql.*;
import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.Date;
import java.util.Scanner;

import com.mysql.jdbc.JDBC4Connection;
public class jdbc_demo
{
	public static void main(String[] args) throws Exception,ParseException
	{
		Scanner sc=new Scanner(System.in);
		//Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/pratik","root","");
		Statement stm=con.createStatement();
		System.out.println();
		System.out.println("enter data");
		String a,d;
		int b,c;
		d=sc.nextLine();
		a=sc.nextLine();
		b=sc.nextInt();
		c=sc.nextInt();
		
		SimpleDateFormat fd=new SimpleDateFormat("yyyy-mm-dd");
		Date date=fd.parse(d);
		
		int r=stm.executeUpdate("insert into demo values('"+a+"','"+b+"','"+c+"','"+fd.format(date)+"');");
		System.out.println(r+"no of rows updated");
		ResultSet rs=stm.executeQuery("select * from demo");
		while(rs.next())
		{
			System.out.println(rs.getString(1)+"\t"+rs.getInt(2)+"\t"+rs.getInt(3)+"\t"+rs.getDate(4));
		}
		con.close();
		stm.close();
	}

}
