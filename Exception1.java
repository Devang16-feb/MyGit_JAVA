import java.util.Scanner;

public class Exception1 {
    public static void main(String[] args) 
    {
        try (Scanner sobj = new Scanner(System.in)) {
            System.out.println("enter First number :");
            int No1 = sobj.nextInt();

            System.out.println("enter the second number :");
            int No2 = sobj.nextInt();

            float Div = No1 / No2;

            System.out.println("Divsion is:"+Div);
        }

        
    }
    
}
