class Base
{
    public int A,B;
    public Base()
    {
        System.out.println("Base constructor");
    }
    public void Fun()
    {
        System.out.println("Inside Base fun");
    }
}
class Derived extends Base     // class derived : public Base
{
    public int X,Y;
    public Derived()
    {
        System.out.println("derived constructor");
    }
    public void Gun()
    {
        System.out.println("inside derived gun");
    }
}

class single {
    public static void main(String[] args) 
    {
       Derived dobj = new Derived();
       dobj.Fun();
       dobj.Gun();
    }
    
}
