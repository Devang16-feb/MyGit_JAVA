
import java.sql.*;

class Database
{
    public static void main(String arg[]) throws Exception
    {
        Connection cobj = DriverManager.getConnection("jdbc:mysql://localhost:3306/ppa50","root","root");   // 2
        
        Statement sobj = cobj.createStatement();        // 3

        ResultSet robj = sobj.executeQuery("select * from student");      // 4

        while(robj.next())          // 5
        {
            System.out.println("RNO : "+robj.getInt("rno"));
            System.out.println("Name : "+robj.getString("name"));
            System.out.println("City : "+robj.getString("City"));
        }
    }
}