import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.Date;
public class jdbc
{
	public static void main(String[] args)throws Exception
	{
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/pratik","root","");
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		PreparedStatement stm=con.prepareStatement("Insert into demo (name,id,age) values(?,?,?);");
		do
		{
			System.out.println("Enter name");
			String name=br.readLine();
			stm.setString(1, name);
			
			System.out.println("Enter id");
			int id=Integer.parseInt(br.readLine());
			stm.setInt(2, id);
			
			System.out.println("Enter age");
			int age=Integer.parseInt(br.readLine());
			stm.setInt(3, age);
			
			/*System.out.println("Enter dob");
			String dob=br.readLine();
			SimpleDateFormat sdf=new SimpleDateFormat("YYYY-MM-DD");
			Date d=sdf.parse(dob);
			stm.setString(4, sdf.format(d));*/
			
			int i=stm.executeUpdate();
			System.out.println("No of rows affected"+i);
			System.out.println("do you eant 2 continue y/n");
			String s=br.readLine();
			if(s.startsWith("s"))
			{
				break;
			}
		}while(true);
		con.close();
	}

}
