
import java.sql.*;
public class prepare 
{
	public static void main(String[] args)throws Exception
	{
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/pratik","root","");
		PreparedStatement stm=con.prepareStatement("insert into demo values(?,?,?,?)");
		stm.setString(1, "pat");
		stm.setInt(2, 20);
		stm.setInt(3, 23);
		Date date=new Date(1992-02-03);
		stm.setDate(4, date);
		stm.executeUpdate();
		ResultSet rs=stm.executeQuery("select * from demo");
		while(rs.next())
		{
			System.out.println(rs.getString(1)+"\t"+rs.getInt(2)+"\t"+rs.getInt(3)+"\t"+rs.getDate(4));
		}
		con.close();
		stm.close();
	}

}
