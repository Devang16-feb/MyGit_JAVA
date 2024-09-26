import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class JTable_A 
{
    JFrame f;
    JTable jt;
    JScrollPane sp;
    
    public JTable_A() 
    {
        f = new JFrame();
        
        String data[][]={{"101","Amit","670000"},{"102","Jai","780000"},{"101","Sachin","700000"}};   
        
        String column[]={"ID","NAME","SALARY"};  
        
        jt = new JTable(data,column);
        jt.setBounds(30,40,200,300);
        
        sp = new JScrollPane(jt);
        
        f.add(sp); // Add the JScrollPane only
        
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(300,400);
        f.setVisible(true);
    }
    
    public static void main(String[] args) 
    {
        new JTable_A();
    }
}
