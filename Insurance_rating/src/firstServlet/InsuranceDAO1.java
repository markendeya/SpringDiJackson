package firstServlet;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class InsuranceDAO1 {
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
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/insurance_rating","root","root");
			Statement stmt= con.createStatement();
			ResultSet rs=stmt.executeQuery("select role,uname from underwriter where uname='"+uname+"'and pwd='"+pwd+"'");
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