
// In this Example We Learn how to retrive data from database 
import java.sql.*;

public class JDBC_A 
{
	public static final String url="jdbc:mysql://localhost:3306/Mydata";
	public static final String username="root";
	public static final String Password="Devang@16022004";
	
	public static final String Query = "select * from employees;";
    
    
	public static void dataBase() 
	{
		try 
		{
			Class.forName("com.mysql.jdbc.Driver"); // For Load the Driver
			System.out.println("Drivers Loaded succefully...");
		} 
		
		catch (ClassNotFoundException e) 
		{
			System.out.println(e.getMessage());
		}
		
		try // Driver Manager which Creates Connections
		{
			Connection con = DriverManager.getConnection(url, username, Password);
			System.out.println("Connection established Succefully");
			
			Statement  stat = con.createStatement(); // Create Statement
			ResultSet rs = stat.executeQuery(Query); // Execute Query and Store data int resultSet
			
			while(rs.next())
			{
				int id = rs.getInt("id");
				String name = rs.getString("name");
				String job_title = rs.getString("job_title");
				double salary = rs.getDouble("salary");
				
				System.out.println();
				System.out.println("========================");
				System.out.println("ID: "+id);
				System.out.println("Name: "+name);
				System.out.println("Job_Title: "+job_title);
				System.out.println("salary: "+salary);
			}
			
			rs.close();
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
	
	public static void main(String[] args)  throws ClassNotFoundException
	{
		new JDBC_A();
		
		dataBase();
	}

}
