
class Base
{
    public void fun()
    {
        System.out.println("inside base Fun");
    }
    public final void gun()
    {
        System.out.println("Inside base Gun");
    }
}
class Derived extends Base{
    public void fun()
    {
        System.out.println("Inside derived fun");
    }
    public void gun()
    {
        System.out.println("Inside derived Gun");
    }
}
public class Final2 {
    public static void main(String[] args)
    {
       
    }
    
}
