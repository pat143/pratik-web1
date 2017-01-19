import java.sql.*;
public class Data {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try
		{   
			Class.forName("com.mysql.jdbc.Driver");
			System.out.print("Check");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/pratik","root","");
			Statement st=con.createStatement();
			ResultSet rs=st.executeQuery("select * from demo");
			while(rs.next())
			{
				System.out.println(rs.getString(1)+" "+rs.getInt(2)+" "+rs.getInt(3)+" "+rs.getDate(4));
			}
			con.close();
			st.close();
			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}

	}

}
