 import Marvellous.Arithmatic;
 import Infosystem.Mathematics;

 class PPA 
{
    public static void main(String[] args) 
    {
        Arithmatic aobj = new Arithmatic();
        Mathematics mobj = new Mathematics();

        System.out.println(aobj.Addition(11,10));
        System.out.println(aobj.Substraction(11,20));

        System.out.println(mobj.Multiplicstion(11,10 ));
        System.out.println(mobj.Division(110, 11));
    }
    
}
