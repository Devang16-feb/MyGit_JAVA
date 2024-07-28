
class Marvellous
{
  public int i,j;

  public Marvellous()
  {
    System.out.println("Marvellous Constructor!!");
  }
  protected void finalize()
  {
    System.out.println("Inside Finize method!!");
  }

}
// claas ObjectDemo1 extends Object
class ObjectDemo1 
{
    public static void main(String[] args) 
    {
      Marvellous obj =new Marvellous();  //Upcasting
      System.out.println(obj.hashCode());  // It will give hashcode
      obj = null;
      System.gc();  // BAi la phone kelyavar ti garbege collect karayla ali
    }

    
}
