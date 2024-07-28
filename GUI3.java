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
class MarvellousListener implements WindowListener  //MarveListener User Define should Implements
{
    public void  windowDeactivated(WindowEvent obj){}
    public void  windowActivated(WindowEvent obj){}
    public void  windowDeiconified(WindowEvent obj){}
    public void  windowIconified(WindowEvent obj){}
    public void windowClosed(WindowEvent obj){}
    public void windowClosing(WindowEvent obj){}
    {
        System.exit(0);
    }
    public void windowOpened(WindowEvent obj){}


}
class GUI3 
{
    public static void main(String[] args) 
    {
        MarvellousFrame mobj = new MarvellousFrame("Marvellous");
        

    }
    
}
