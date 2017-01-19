import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.sql.ResultSet;




public class empdata {

	/**
	 * @param args
	 * @throws ClassNotFoundException 
	 * @throws SQLException 
	 */
	
	public static Connection myconnection()
	{
		Connection con=null;
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/pratik","root","");
		}
		catch(ClassNotFoundException | SQLException exception)
		{
			exception.printStackTrace();
		}
		return con;
	}
	
	public static int save(empmethod e)throws ClassNotFoundException, SQLException
	{
		Connection con=empdata.myconnection();
		//System.out.println("a");
		int status=0;
		PreparedStatement ps=con.prepareStatement("insert into emp (id,name,password,phone) values(?,?,?,?);");
		ps.setInt(1, e.getid());
		ps.setString(2, e.getname());
		ps.setString(3, e.getpassword());
		ps.setInt(4, e.getphone());
		
		status=ps.executeUpdate();
		
		con.close();
		return status;
		
		
	}
	
	public static empmethod getemployeesbyid(int id)
	{
		empmethod e=new empmethod();  
        
        try{  
            Connection con=empdata.myconnection();  
            PreparedStatement ps=con.prepareStatement("select * from emp where id=?");  
            ps.setInt(1,id);  
            ResultSet rs=ps.executeQuery();  
            if(rs.next()){  
                e.setid(rs.getInt(1));  
                e.setname(rs.getString(2));  
                e.setpassword(rs.getString(3));  
                e.setphone(rs.getInt(4));  
            }  
            con.close();  
        }catch(Exception ex){ex.printStackTrace();}  
          
        return e;  
	}
	
	public static int update(empmethod e)throws ClassNotFoundException, SQLException
	{
		Connection con=empdata.myconnection();
		int status=0;
		PreparedStatement ps=con.prepareStatement("update emp set name=?,password=?,phone=? where id=?;");
		ps.setInt(4, e.getid());
		ps.setString(1, e.getname());
		ps.setString(2, e.getpassword());
		ps.setInt(3, e.getphone());
		
		status=ps.executeUpdate();
		
		con.close();
		return status;
	}
	
	public static int delete(int id)throws ClassNotFoundException,SQLException
	{
		Connection con=empdata.myconnection();
		int status=0;
		PreparedStatement ps=con.prepareStatement("delete from emp where id=?;");
		ps.setInt(1,id);
		status=ps.executeUpdate();
		
		con.close();
		return status;
		
		
	}
	
	
	public static List<empmethod> getAllEmployees()
	{  
        List<empmethod> list=new ArrayList<empmethod>();  
          
        try{  
        	Connection con=empdata.myconnection();
            PreparedStatement ps=con.prepareStatement("select * from emp");  
            ResultSet rs=ps.executeQuery();  
            while(rs.next()){  
            	empmethod e=new empmethod();  
                e.setid(rs.getInt(1));  
                e.setname(rs.getString(2));  
                e.setpassword(rs.getString(3));  
                e.setphone(rs.getInt(4));   
                list.add(e);  
            }  
            con.close();  
        }catch(Exception e){e.printStackTrace();}  
          
        return list;  
    }  
}
