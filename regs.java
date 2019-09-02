import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;
import java.util.Vector;
class regs extends JFrame implements ActionListener
{      JComboBox c1;
    JButton b1,b2,b3,b4,b5; 
    JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10;
    JTextField t1,t2,t3,t4,t5,t7,t8,t9; 
	JTextArea t6; 
   
    String s1,s2,s3,s4,s5,s6,s7="",s8,s9,r, ids;
	
 regs()
 { super("Client Data");
  setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
  setLocation(60, 70);
  setLayout(null);
  b1=new JButton("Show");    
  b2=new JButton("Cancel");
  l9=new JLabel("Name");            l2=new JLabel("Father's Name");
  l3=new JLabel("Gender");          l4=new JLabel("Salary Per Annum");
  l5=new JLabel("Current Address"); l6=new JLabel("Locking For");
  l7=new JLabel("Desired House");   l8=new JLabel("Preffered House");
  l1=new JLabel("Contact Number *"); l10=new JLabel("Show Client Data");
  
  t1=new JTextField(20);            t2=new JTextField(20);
  //t3=new JTextField(20);          
  t4=new JTextField(20);
  t5=new JTextField(20);            t6=new JTextArea();
  t7=new JTextField(20);            t8=new JTextField(20);
  t9=new JTextField(20);

b1.setBounds(300,590,80,40);   b2.setBounds(430,590,80,40); 

l1.setBounds(100,60,160,50);   l2.setBounds(100,120,160,50); 
l3.setBounds(100,170,120,50);  l4.setBounds(100,230,180,50); 
l5.setBounds(100,290,180,50);  l6.setBounds(100,370,160,50);
l7.setBounds(100,420,180,50);  l8.setBounds(100,480,180,50); 
l9.setBounds(600,60,160,50);   l10.setBounds(350,10,200,50);

t1.setBounds(740,60,180,40);   t2.setBounds(340,120,180,40); 
//t3.setBounds(750,60,180,40);   
t4.setBounds(340,180,180,40);  
t5.setBounds(340,240,180,40);  t6.setBounds(340,300,180,60); 
t7.setBounds(340,370,180,40);  t8.setBounds(340,430,180,40); 
t9.setBounds(340,490,180,40);

add(b1); add(b2); 
add(l1); add(l2); add(l3); add(l4); add(l5); add(l6); 
add(l7); add(l8); add(l9); add(l10); 
add(t1); add(t2);  add(t4); add(t5); 
add(t6); add(t7); add(t8); add(t9);

    Font ff=new Font("verdana",Font.BOLD,20);
    l10.setFont(ff); 
	
	setVisible(true);
	setSize(1000,800); 
	
	try{
	    Class.forName("com.mysql.jdbc.Driver");
         Connection   con = DriverManager.getConnection("jdbc:mysql://localhost:3306/home","root","root");
           Statement st = con.createStatement();
           ResultSet rs = st.executeQuery("select contact from creg");
            Vector v = new Vector();
            while (rs.next()) {
                ids = rs.getString(1);
                v.add(ids);
            }
            c1 = new JComboBox(v);
			add(c1);
            c1.setBounds(340,70,150,20);
           
            
            st.close();
            rs.close();
   }  catch (Exception se) 
		{JOptionPane.showMessageDialog(regs.this,"OOps ! List ","Error in List database",JOptionPane.ERROR_MESSAGE); }
  
 // ButtonHandler handler=new ButtonHandler();
  b1.addActionListener(this);
  b2.addActionListener(this);

  
 } //public class ButtonHandler implements ActionListener
   public void actionPerformed(ActionEvent ae)
	  { 	
		if(ae.getSource()==b1 )
		  { r=(String) c1.getSelectedItem();
	  try {
		  Class.forName("com.mysql.jdbc.Driver");
		  Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/home","root","root");
		  Statement st=con.createStatement();
		  ResultSet rs=st.executeQuery(" select * from creg where contact='"+r+"' ");
		  while(rs.next())
		  { s1=rs.getString("name");
	        s2=rs.getString("fathername");
	        s4=rs.getString("gender");
	        s5=rs.getString("salary");
	        s6=rs.getString("address");
	        s7=rs.getString("looking");
	        s8=rs.getString("desire");
	        s9=rs.getString("preffered");
	        
			t1.setText(s1);
			t2.setText(s2);
			t4.setText(s4);
			t5.setText(s5);
			t6.setText(s6);
			t7.setText(s7);
			t8.setText(s8);
			t9.setText(s9);  
		  }
		  st.close();
		  con.close();
	  } catch (Exception e) { System.out.println("Error "+e); }
		  }
	    if(ae.getSource()==b2)
		  { dispose(); }
	  }
 
}