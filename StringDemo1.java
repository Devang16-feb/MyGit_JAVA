class StringDemo1 
{
    public static void main(String[] args) 
    {
        String s1 = "Hello";                    // if old memory having space available, old memory use 
        String s2 = new String("Hello");  // New memory create & use
        String s3 = "Demo";
        String s4 = new String("Java");
        String s5 = "Hello";
        String s6 = "Demo";
        String s7 = "Marvellous";
        String s8 = new String("Hello");
        String s9 = new String("PPA");
        String s10 = "PPA";
        

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);

        System.out.println(s1.length());
        System.out.println(s2.length());
        System.out.println(s3.length());
    }
    
}
