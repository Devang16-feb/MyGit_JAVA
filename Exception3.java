import java.util.Scanner;

public class Exception3
 {
    public static void main(String[] args) 
    {
        try
        {
            try (Scanner sobj = new Scanner(System.in)) {
                int Arr[] = {10,20,30,40,50};

                System.out.println("enter the Index number :");
                int i = sobj.nextInt();

                System.out.println(Arr[i]);
            }
        }
        catch(ArrayIndexOutOfBoundsException obj)
        {
            System.out.println("Inside catch block");
        }
        finally
        {
            System.out.println("Inside finally block");
        }

        System.out.println("end of the code!!");
    }
}
        

    

