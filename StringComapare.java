class StringComapare 
{
    public static void main(String[] args) 
    {
      String s1  = "Hello";
      String s2 = "Demo";
      String s3 = new String("Hello");
      String s4 = "Hello";
      
      if(s1 == s4)
      {
        System.out.println("S1 And S4 are Same");
      }

      if(s1 == s3)
      {
        System.out.println("S1 and s3 are same");
      }
      if(s1.equals(s3))
      {
        System.out.println("s1 and s3 same using equals method");
      }
    }
    
}
