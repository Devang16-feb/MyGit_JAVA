class Base
{
    public int A,B;

    public void Fun()
    { System.out.println("Inside Base fun");}
    public void Gun()
    { System.out.println("Inside Base Gun");}
    public void Sun()
    { System.out.println("Inside Base Sun");}
    public void Run()
    { System.out.println("Inside Base Run");}

}
class Derived extends Base     // class derived : public Base
{
    public int X,Y;

    public void Gun()
    { System.out.println("inside derived gun"); }
    public void Run()
    { System.out.println("inside derived Run"); }
    public void Mun()
    { System.out.println("inside derived Mun"); }

}

class RMD {
    public static void main(String[] args) 
    {
        Base bobj = new Derived();
        bobj.Fun();
        bobj.Gun();
        bobj.Sun();
        bobj.Run();
        //bobj.Mun();
    }
    
}
