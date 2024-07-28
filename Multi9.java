class Marvellous
{
    synchronized public void Display(int no)
    {
        try
        {
            int i = 0;
        for(i=1;i<=10;i++)
        {
            System.out.println(i*no);
            Thread.sleep(1000);
        }
        
        }
        catch(Exception obj)
        { }
        
    }
}

class Demo extends Thread
{
    public void run()
    {
        Marvellous mobj = new Marvellous(); // 1nd Water tank
        mobj.Display(5);
    }
}
class Hello extends Thread
{
    public void run()
    {
        Marvellous mobj = new Marvellous();  // 2nd Water tank
        mobj.Display(2);
    }
}

class Multi9
{
    public static void main(String[] args) 
    {
       Demo dobj = new Demo();
       Hello hobj = new Hello();  //New state
       
       dobj.start();   // runable State
       hobj.start();
    }
    
}
