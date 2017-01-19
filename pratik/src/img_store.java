import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;


public class img_store
{
	public static void main(String[] args)throws Exception
	{
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/pratik","root","");
		PreparedStatement stm=con.prepareStatement("Insert into img values(?);");
		FileInputStream fis=new FileInputStream("D:\\Working data\\Admin\\Desktop\\Chrysanthemum.jpg");
		stm.setBinaryStream(1,fis,fis.available());
		int i=stm.executeUpdate();
		System.out.println("Afected"+i);
		con.close();
	}

}
