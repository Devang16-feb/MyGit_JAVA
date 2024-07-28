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
class Derivedx extends Derived     // class derived : public Base
{
    public int P,Q;
    public Derivedx()
    {
        System.out.println("Derivedx constructor");
    }
    public void Sun()
    {
        System.out.println("inside derived sun");
    }
}

class Multilevel {
    public static void main(String[] args) 
    {
       Derivedx dobj = new Derivedx();
       dobj.Fun();
       dobj.Gun();
       dobj.Sun();
    }
    
}
