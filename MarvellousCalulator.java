import java.awt.*;
import java.awt.event.*;

class Calculator extends WindowAdapter implements ActionListener
{
    public Frame mainFrame;
    public Button b1,b2,b3,b4;
    public TextField t1,t2;
    public Label lobj;
    Integer no1,no2;

    public Calculator (int width,int height,String title)
    {
        mainFrame = new Frame(title);
        mainFrame.setSize(width,height);
        mainFrame.addWindowListener(this);

        b1 = new Button("Add");
        b2 = new Button("Sub");
        b3 = new Button("MULT");
        b4 = new Button("DIV");

        t1 = new TextField();
        t2 = new TextField();

        b1.setBounds(10,280,80,40);
        b2.setBounds(100,280,80,40);
        b3.setBounds(190,280,80,40);
        b4.setBounds(280,280,80,40);

        t1.setBounds(70,100,100,40);
        t1.setBounds(220,100,100,40);

        mainFrame.add(b1);
        mainFrame.add(b2);
        mainFrame.add(b3);
        mainFrame.add(b4);
        
        lobj =new Label();
        lobj.setBounds(150,125,200,100);

        mainFrame.add(lobj);

        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);

        mainFrame.setLayout(null);
        mainFrame.setVisible(true);

        public void actionPerformed(ActionEvent aobj)
        {
            try
            {
                no1 = Integer.parseInt(t1.getText());
                no2 = Integer.parseInt(t2.getText());

                if(aobj.getSource() ==b1)
                {
                    lobj.setText("Addition is:"+(no1+no2));
                }
                if(aobj.getSource() ==b2)
                {
                    lobj.setText("Addition is:"+(no1-no2));
                }
                if(aobj.getSource() ==b3)
                {
                    lobj.setText("Addition is:"+(no1*no2));
                }
                if(aobj.getSource() ==b4)
                {
                    lobj.setText("Addition is:"+(no1/no2));
                }

            }
            catch(Exception obj)
            {}
            no1 = Integer.parseInt(t1.getText());
            no2 = Integer.parseInt(t2.getText());


        }
    }

}
class MarvellousCalulator 
{
    public static void main(String[] args) 
    {
        Calculator cobj = new Calculator(400,400,"Marvellous PPA");

    }
    
}
