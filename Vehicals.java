class vehical
{
    public void Names()
    {
        System.out.println("Vehicals are nexon and mhindra");
    }
}
class Drived extends vehical
{
    
    public void Names()
    {
        super.Names();
        System.out.println("derived vehicals are safari and fortuner");
    }
}

public class Vehicals {
    public static void main(String[] args) {
        //vehical bobj = new vehical();
        Drived dobj = new Drived();
        //bobj.Names();
        dobj.Names();
    }
    
}
