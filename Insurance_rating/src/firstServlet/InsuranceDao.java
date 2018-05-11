package firstServlet;
import java.sql.*;
public class InsuranceDao {
	public Userbeam isUser(String uname, String pwd) 
	{
		Userbeam details=new Userbeam();
        try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/","root","root");
			Statement stmt= con.createStatement();
			ResultSet rs=stmt.executeQuery("select  role, uname from Underwriter");
			while(rs.next())
			{
				details.setRole(rs.getString(1));
				details.setUsername(rs.getString(2));
			}
			rs.close();
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			return details;
		}
		
		
	}

}
