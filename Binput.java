import java.io.*;

class BInput
{
    public static void main(String Arg[])
    {
        //InputStreamReader iobj = new InputStreamReader(System.in);
        //BufferedReader bobj = new BufferedReader(iobj);

        BufferedReader bobj = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter your name : ");
        String name = bobj.readLine();  // Exception

        System.out.println("Welcome : "+name);
    }
}