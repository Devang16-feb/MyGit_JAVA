//ArrayList

import java.util.*;

class Collection2
{
    public static void main(String[] args) 
    {
        ArrayList <String> aobj = new ArrayList<String>();

        aobj.add("PPA");
        aobj.add("LB");
        aobj.add("PYTHON");
        aobj.add("PPA++");
        aobj.add("LB++");

        for(String str : aobj)  //For each loop
        {
            System.out.println(str);
        } 
    }
}

