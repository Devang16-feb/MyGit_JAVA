class Demo extends Thread // inbuild class thread
{
    public void run()  
    {
        try
        {
        int i =0;
        String name = Thread.currentThread().getName();

        for(i=0;i<=10;i++)
        {
           System.out.println("Running thread:"+name+"with value"+i);
           Thread.sleep(1000);
        }
        
        }
        catch(Exception obj)
           {
            System.out.println("end ");
            }
        
    }

}

class Multi5 
{
    public static void main(String[] args) throws Exception
    {
        System.out.println("Current thread is:"+Thread.currentThread().getName());
        Demo obj1 = new Demo();  // We Craate 1 Thread 


        obj1.setName("PPA");
        obj1.start();
        obj1.join();  //Main Thread has to wait
        System.out.println("End Thread");
    
        
    }
    
}
