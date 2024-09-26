import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class JTable_B implements ListSelectionListener 
{
	JFrame f;
	JTable jt;
	JScrollPane sp;
	
	public JTable_B() 
	{
		f = new JFrame("Table Example");
		
        String data[][]={ {"101","Amit","670000"},{"102","Jai","780000"}, {"101","Sachin","700000"}};   
        String column[]={"ID","NAME","SALARY"}; 
        
        jt = new JTable(data,column);
        
        jt.setCellSelectionEnabled(true);
        
        ListSelectionModel select = jt.getSelectionModel();
        select.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        
        select.addListSelectionListener(this);
        
        sp = new JScrollPane(jt);    
        f.add(sp);  
        
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(300, 200);  
        f.setVisible(true);  
	}
	
	@Override
	public void valueChanged(ListSelectionEvent e) 
	{
		String Data = null;
		
		int[]row = jt.getSelectedRows();
		int[]colomns = jt.getSelectedColumns();
		
		for(int i = 0; i<row.length; i++)
		{
			for(int j=0; j<colomns.length; j++)
			{
				Data = (String)jt.getValueAt(row[i],colomns[j]);
			}
		}
		 System.out.println("Table element selected is: " + Data); 
	}
	
	public static void main(String[] args) 
	{
		new JTable_B();
	}



}
