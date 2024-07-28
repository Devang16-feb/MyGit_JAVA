class Demo extends Thread // inbuild class thread
{
    public void run()  //Thread cha logic
    {
        int i =0;
        String name = Thread.currentThread().getName();

       for(i=0;i<=1000;i++)
       {
        System.out.println("Running thread:"+name+"with value"+i);
       }
    }

}

class Multi3 
{
    public static void main(String[] args) 
    {
        System.out.println("Current thread is:"+Thread.currentThread().getName());
        Demo obj1 = new Demo();  // We Craate 3 Thread 
        Demo obj2 = new Demo();
        Demo obj3 = new Demo();

        obj1.setName("PPA");
        obj2.setName("LB");
        obj3.setName("Python");

        obj1.start(); //Thread Schedule Internally call Run Method // Runnable State
        obj2.start();
        obj3.start();
        
    }
    
}

