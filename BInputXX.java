import java.io.*;

class BInputXX
{
    public static void main(String Arg[])
    {
        try
        {
            BufferedReader bobj = new BufferedReader(new InputStreamReader(System.in));

            System.out.println("Enter First number: ");
            int No1 = Integer.parseInt(bobj.readLine());

            System.out.println("Enter Second number: ");
            int No2 = Integer.parseInt(bobj.readLine());

            int Ans = No1 + No2;
            System.out.println(Ans);
        }
        catch(IOException obj)
        {}
    }
}