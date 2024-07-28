/*
 *   getClasss()
 *   hashCode()
 *   equals()
 *   clone()
 *   finalize()
 * 
 */

class Marvellous
{

}
// clsas ObjectDemo extends Object
class ObjectDemo 
{
    public static void main(String[] args) 
    {
      Object obj =new Marvellous();  //Upcasting
      System.out.println(obj.getClass().getName());  //Reference class  
    }

    
}
