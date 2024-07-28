
class Exp8
{
    public static void main(String[] args) {
        int a =10,b=5,c=5;
        int X,Y; 
    try{
        X = a/(b-c);
        System.out.println(X);
    }
    catch(ArithmeticException e)
    {
        System.out.println("e"+e);
    }
        Y=a/(b+c); 
        System.out.println("Y"+Y);
    }
        
    }
    

