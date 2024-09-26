
// in this Example We Learn how to Insert the data in our database:

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBC_B 
{
	public static final String url="jdbc:mysql://localhost:3306/Mydata";
	public static final String username="root";
	public static final String Password="Devang@16022004";
	
	public static final String Query = "INSERT INTO employees(id, name, job_title, salary) VALUES(3, 'Mohit', 'Berojgaar', 30.0);";
	
	public static void Insert() 
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
			
			int RowsAffected = stat.executeUpdate(Query); // If ypu Want to insert Data
			
			if(RowsAffected > 0)
			{
				System.out.println("Insert Successfull. "+RowsAffected+" row(s) affected.");
			}
			else
			{
				System.out.println("Insertion faild");
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
		new JDBC_B();
		
		Insert();
	}

}
