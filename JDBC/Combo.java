import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Combo 
{
	public static final String url="jdbc:mysql://localhost:3306/Mydata";
	public static final String username="root";
	public static final String Password="Devang@16022004";
	
	public static final String Query1 = "Create table Dan(id int, name varchar(20), job_title varchar(20), salary int);";
	
	public static final String Query2 = "INSERT INTO Dan(id, name, job_title, salary) VALUES(3, 'Mohit', 'Berojgaar', 30);";
	
	public static void Create() 
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
			
			int RowsAffected1 = stat.executeUpdate(Query1); // If ypu Want to insert Data
			
			if(RowsAffected1 > 0)
			{
				System.out.println("Table create Successfull. "+RowsAffected1+" row(s) affected.");
			}
			else
			{
				System.out.println("Creation faild");
			}
			
			int RowsAffected2 = stat.executeUpdate(Query2);
			
			if(RowsAffected2 > 0)
			{
				System.out.println("Insert Successfull. "+RowsAffected2+" row(s) affected.");
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
		new Combo();
		
		Create();

	}

}
