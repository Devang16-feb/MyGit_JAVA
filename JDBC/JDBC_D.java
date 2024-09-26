// Update the Data from the database means Do Changes in Existing data:

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBC_D 
{
	public static final String url="jdbc:mysql://localhost:3306/Mydata";
	public static final String username="root";
	public static final String Password="Devang@16022004";
	
	public static final String Query = "UPDATE employees\n"+
	                           "SET job_title = 'FULL stack developer', salary = 80000.0\n"+
			                   "WHERE id = 2;";
	
	public static void Update()
	{
		try 
		{
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Drivers Loaded succefully...");
		} 
		catch (ClassNotFoundException e) 
		{
			System.out.println(e.getMessage());
		}
		
		try 
		{
			Connection con = DriverManager.getConnection(url, username, Password);
			System.out.println("Connection established Succefully...");
			
			Statement stat = con.createStatement();
			
			int RowsAffected = stat.executeUpdate(Query);
			
			if(RowsAffected > 0)
			{
				System.out.println("UPDATE Successfull. "+RowsAffected+" row(s) affected.");
			}
			else
			{
				System.out.println("UPDATE faild !!");
			}
			
			stat.close();
			con.close();
			
			System.out.println();
			System.out.println("Connction Closed Succefully !!!!");
		} 
		catch (SQLException e) 
		{
			System.out.println(e.getMessage());
		}
	}
	
	public static void main(String[] args) 
	{
		new JDBC_D();
		
		Update();
	}

}
