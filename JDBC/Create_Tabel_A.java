import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Create_Tabel_A 
{

	public static void main(String[] args)
	{
		String url="jdbc:mysql://localhost:3306/Students";
		String username="root";
	    String Password="Devang@16022004";
	    
	    try(Connection connection = DriverManager.getConnection(url, username, Password))
	    {
	    	System.out.println("Connected to the database.");
	    	
	    	//Perform Database operations here
	    }
	    catch (SQLException e) 
	    {
			System.err.println("Connection fails: "+e.getMessage());
		}
		
	}
}
