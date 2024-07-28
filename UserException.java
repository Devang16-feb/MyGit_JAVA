import java.util.*;

class AgeInvalid extends Exception
{

}
class UserException
{
    public static void main(String[] args) 
    {
        try
        {
           Scanner sobj = new Scanner(System.in);

           System.out.println("Please enter your age:");
           int Age = sobj.nextInt();

           if(Age<18)
           {
              throw new AgeInvalid();
           }
           else
           {
            System.out.println("You are eligible !!");
           }
        }
        
    
        catch(AgeInvalid obj)
        {
            System.out.println("age is Invalid to register for this site!!");
        }
    }
    
}
