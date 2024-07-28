public class Command 
{
    public static void main(String[] args) 
    {
        System.out.println("Number of command  line Argumentss are :"+args.length);
        int i = 0;
        for(i =0; i < args.length; i++)
        {
            System.out.println(args[i]);
        }
        
    }
    
}
