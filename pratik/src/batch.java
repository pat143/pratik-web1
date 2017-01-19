import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
public class batch 
{
	public static void main(String[] args)throws Exception
	{
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/pratik","root","");
		con.setAutoCommit(false);
		
		PreparedStatement stm=con.prepareStatement("insert into demo values(?,?,?,?)");
		stm.setString(1, "pat1");
		stm.setInt(2, 29);
		stm.setInt(3, 23);
		Date date=new Date(1992-02-03);
		stm.setDate(4, date);
		stm.addBatch();
		
		//stm=con.prepareStatement("insert into demo values(?,?,?,?)");
		stm.setString(1, "pat2");
		stm.setInt(2, 30);
		stm.setInt(3, 23);
		Date date1=new Date(1992-02-03);
		stm.setDate(4, date1);
		stm.addBatch();
		stm.executeBatch();
		con.commit();
		ResultSet rs=stm.executeQuery("select * from demo");
		while(rs.next())
		{
			System.out.println(rs.getString(1)+"\t"+rs.getInt(2)+"\t"+rs.getInt(3)+"\t"+rs.getDate(4));
		}
		con.close();
		stm.close();
	}

}
