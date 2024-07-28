import java.io.*;

class BInputX
{
    public static void main(String Arg[])
    {
        try
        {
            BufferedReader bobj = new BufferedReader(new InputStreamReader(System.in));

            System.out.println("Enter your name : ");
            String name = bobj.readLine();

            System.out.println("Welcome : "+name);    
        }
        catch(IOException obj)
        {}
    }
}

