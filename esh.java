import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;
import javax.swing.table.DefaultTableModel;
import java.util.Vector;

public class esh extends JFrame implements ActionListener
{   static JTable table;
    JComboBox c1;
    String[] columnNames = {"User name", "Security Question", "Security Answer", "Position"};
    String r="",s1,s2,s3,s4,ids;
	JButton b1,b2;
 esh()	
 { super("Page data");
   setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
   setLocation(60, 70);
   setLayout(null);
   JLabel l1= new JLabel("Select User Name");
    b1=new JButton("Submit");
    b2=new JButton("Cancel");
   add(l1); add(b1); add(b2); 
   l1.setBounds(150,85,200,50);
   b1.setBounds(200,150,90,35); 
   b2.setBounds(320,150,90,35); 
   
   try{
	    Class.forName("com.mysql.jdbc.Driver");
         Connection   con = DriverManager.getConnection("jdbc:mysql://localhost:3306/home","root","root");
           Statement st = con.createStatement();
           ResultSet rs = st.executeQuery("select uname from ureg");
            Vector v = new Vector();
            while (rs.next()) {
                ids = rs.getString(1);
                v.add(ids);
            }
            c1 = new JComboBox(v);
            c1.setBounds(295, 100, 150, 20);
 
            add(c1);
            st.close();
            rs.close();
   }  catch (Exception se) 
		{JOptionPane.showMessageDialog(esh.this,"OOps ! List ","Error in List database",JOptionPane.ERROR_MESSAGE); }
   
   setVisible(true);
   setSize(600,400);
   
   
   b1.addActionListener(this);
   b2.addActionListener(this);
 }
 
  public void actionPerformed(ActionEvent ae)
	 { if(ae.getSource()== b1)
		  
		 { showtable(); }
	 
	  if(ae.getSource()== b2)
		 { dispose();   }
	 
 } 
  public void showtable()
 { JFrame fr=new JFrame("User Database");
   fr.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
   fr.setLocation(100, 120);
   fr.setLayout(new BorderLayout());
   DefaultTableModel model=new DefaultTableModel();
   model.setColumnIdentifiers(columnNames);
  
   table=new JTable();
   table.setModel(model);
   table.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
   JScrollPane scroll=new JScrollPane(table);
	
	 scroll.setHorizontalScrollBarPolicy(
                JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        scroll.setVerticalScrollBarPolicy(
                JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
				
		r=(String) c1.getSelectedItem();		
		try{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/home","root","root");
			
			Statement st=con.createStatement();
			ResultSet rs=st.executeQuery("select * from ureg where uname='"+r+"'");
			
			while(rs.next() )
			{  s1=rs.getString("uname");
		       s2=rs.getString("sq");
			   s3=rs.getString("sa");
		       s4=rs.getString("pos");
			    model.addRow(new Object[]{s1,s2,s3,s4 } );
		
			}
			st.close();
			con.close();
		} catch (Exception e) 
		{JOptionPane.showMessageDialog(esh.this,"OOps !","Error in Calling of data",JOptionPane.ERROR_MESSAGE); } 
		fr.add(scroll);
		fr.setVisible(true);
		fr.setSize(500,400);
 }
}