class StringDemo 
{
    public static void main(String[] args) 
    {
        String s1 = "Hello";                    // if old memory having space available, old memory use 
        String s2 = new String("Hello");  // New memory create & use

        char Arr[] = {'h','e','l','l','o'};
        String s3 = new String(Arr);

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);

        System.out.println(s1.length());
        System.out.println(s2.length());
        System.out.println(s3.length());
    }
    
}
