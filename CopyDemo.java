class Student implements Cloneable  //Parent Class //Clonable Interface
{
    public String Name;
    public int Age;
    public int Marks;

    public Student (String str, int A, int B)
    {
        this.Name = str;
        this.Marks = A;
        this.Age  = B;
    }
    //Object is return valeu
    public Object clone() throws CloneNotSupportedException
    {
        return super.clone();
    }
}
class CopyDemo 
{
    public static void main(String[] args) 
    {
        try
        {
        Student sobj = new Student("Devang", 87, 23);
        System.out.println("Name of Student :"+sobj.Name);
        System.out.println("Marks obtained by students :"+sobj.Marks);
        System.out.println("age of Student :"+sobj.Age);

        Student sobjx = (Student)sobj.clone();  //copy clonning with seperate memory
        System.out.println("Name of Student :"+sobjx.Name);
        System.out.println("Marks obtained by students :"+sobjx.Marks);
        System.out.println("age of Student :"+sobjx.Age);


        }
        catch(Exception obj) // genric catch
        {

        }

        
    }
    
}
