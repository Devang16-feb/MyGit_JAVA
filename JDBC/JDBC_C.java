

// In this example we have to delete the Data from existing Database:

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBC_C 
{
	public static final String url="jdbc:mysql://localhost:3306/Mydata";
	public static final String username="root";
	public static final String Password="Devang@16022004";
	
	public static final String Query = "DELETE FROM employees where id = 3;";
	
	public static void Delete()
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
			System.out.println("Connection established Succefully");
			
			Statement stat = con.createStatement();
			
			int rowsaffected = stat.executeUpdate(Query);
			
			if(rowsaffected > 0)
			{
				System.out.println("Deletion Successfull. "+rowsaffected+" row(s) affected.");
			}
			else
			{
				System.out.println("DELETION Failed !!!");
			}
			
			stat.close();
			con.close();
			
			System.out.println();
			System.out.println("Connction Closed Succefully !!!!");
			
		} catch (SQLException e) 
		{
			System.out.println(e.getMessage());
		}
		
		
	}
	public static void main(String[] args) 
	{
		new JDBC_C();
		
		Delete();
	}

}
