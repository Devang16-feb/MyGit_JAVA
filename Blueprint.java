interface Circle
{
    public float Radius = 10.5f;
    public float PI = 3.14f;

    public float Area();
    public float Circumference();
}
class Marvellous implements Circle
{
    public float Area()
    {
        return PI*Radius*Radius;
    }
    public float Circumference()
    {
        return 2 * PI * Radius;
    }

}
class Blueprint 
{
    public static void main(String[] args) 
    {
        Marvellous mobj = new Marvellous();
        System.out.println("Area is:"+mobj.Area());
        System.out.println("Circumferrence is:"+mobj.Circumference());
        System.out.println("Value of radius is:"+Circle.Radius);
        System.out.println("Value of PI is"+Circle.PI);

        //Circle.PI = 7.12;  Error becaue 
    }
    
}
