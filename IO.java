import java.util.Scanner;

public class IO {
    public static void main(String[] args) 
    {
        try (Scanner sobj = new Scanner(System.in)) {
            System.out.println("enter First number :");
            int No1 = sobj.nextInt();

            System.out.println("enter the second number :");
            int No2 = sobj.nextInt();

            int Ans = No1+No2;

            System.out.println("Ans is:"+Ans);
        }

        
    }
    
}
