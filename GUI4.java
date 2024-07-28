import java.awt.*;
import java.awt.event.*;

class MarvellousFrame
{
    public MarvellousFrame(String title)
    {
        Frame fobj = new Frame(title);
        fobj.setSize(600,800);
        fobj.setVisible(true);
        fobj.addWindowListener(new MarvellousListener());
    }
}
class MarvellousListener extends WindowAdapter  //MarveListener User Define should Implements
{
    public void windowClosing(WindowEvent obj){}
    {
        System.exit(0);
    }
}
class GUI4 
{
    public static void main(String[] args) 
    {
        MarvellousFrame mobj = new MarvellousFrame("Marvellous");
        

    }
    
}
