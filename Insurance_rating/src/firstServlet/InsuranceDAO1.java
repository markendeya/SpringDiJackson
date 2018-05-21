package firstServlet;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

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
	
	public ArrayList<String> autoModelList()
	{
		ArrayList<String> models=new ArrayList<String>();
		try{ 
			Class.forName("com.mysql.jdbc.Driver");  
			Connection con=DriverManager.getConnection(  
			"jdbc:mysql://localhost:3306/insurance_rating","root","root");  
			//here sonoo is database name, root is username and password  
			
			Statement stmt=con.createStatement();  
			ResultSet rs=stmt.executeQuery("select Vehicle_Model_Name from auto_rates");  
			
			while(rs.next())  
			{
		models.add(rs.getString(1));
			}
			rs.close();
			con.close(); 
		}
			catch(Exception e){ System.out.println(e);} 
		finally {
			return models;
		}
}
	public int basePremium(String models)
	{
		int base=0;
		try{ 
			Class.forName("com.mysql.jdbc.Driver");  
			Connection con=DriverManager.getConnection(  
			"jdbc:mysql://localhost:3306/insurance_rating","root","root");  
			//here sonoo is database name, root is username and password  
			
			Statement stmt=con.createStatement();  
			ResultSet rs=stmt.executeQuery("select Auto_base_Premium  from auto_rates where Vehicle_Model_Name='"+models+"'");  
			
			while(rs.next())  
			{
		base=(rs.getInt(1));
			}
			rs.close();
			con.close(); 
		}
			catch(Exception e){ System.out.println(e);} 
		finally {
			return base;
		}
		
	}
	public double premiumCalculator(String vehicle, String earlierInsurance,String driverClass,String advSecurity,String antiTheft,String violation,String policyTerm)
	{  double ratingFactor=0;
		try{ 
		Class.forName("com.mysql.jdbc.Driver");  
		Connection con=DriverManager.getConnection(  
		"jdbc:mysql://localhost:3306/insurance_rating","root","root");  
		//here sonoo is database name, root is username and password  
		
		Statement stmt=con.createStatement();  
		ResultSet rs=stmt.executeQuery("select Impact_Type,impact_pct from auto_rating_factors where (Rating_Factor_Name='Vehicle Type'and Option_desc='"+vehicle+"')or(Rating_Factor_Name='Proof for Earlier Insurance' and  Option_desc='"+earlierInsurance+"')or(Rating_Factor_Name='Driver Class' and  Option_desc='"+driverClass+"')or(Rating_Factor_Name='Advanced Security Features' and  Option_desc='"+advSecurity+"')or(Rating_Factor_Name='Anti Theft Alarm' and  Option_desc='"+antiTheft+"')or(Rating_Factor_Name='Violation History' and  Option_desc='"+violation+"')or(Rating_Factor_Name='Policy Term' and  Option_desc='"+policyTerm+"')");  
	float f=1000*rs.getInt(2);
		while(rs.next()) {
		if(rs.getInt(1)==0)
		{
			ratingFactor-=f;
			
		}
		else
		{
			ratingFactor+=f;
		}
	}
		rs.close();
		con.close(); 
	}
		catch(Exception e){ System.out.println(e);} 
	finally {
	return  ratingFactor;
	}
		
	}
}