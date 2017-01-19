import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.mysql.jdbc.Blob;
import com.mysql.jdbc.BlobFromLocator;


public class img_retriew
{
	public static void main(String[] args)throws Exception
	{
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/pratik","root","");
		PreparedStatement stm=con.prepareStatement("Select * from img;");
		ResultSet rs=stm.executeQuery();
		
			rs.next();
			java.sql.Blob b=rs.getBlob(1);
			byte by[]=b.getBytes(1,(int)b.length());
			
			FileOutputStream fs=new FileOutputStream("D:\\Working data\\Admin\\Desktop\\pk1.jpg");
			fs.write(by);
			fs.close();
		
		
		//System.out.println("Afected"+i);
		con.close();
	}

}
