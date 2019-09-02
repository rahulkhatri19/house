import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;
class fp extends JFrame
{ JLabel l1,l2,l3,l4,l5,l6;  JTextField t1,t2,t3,t4; 
 Choice li1; JButton b1,b2; String s1,s2,s3,s4;
fp()
{ super("Forgot Password");
setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
setLayout(null);
setLocation(60, 100);
l1=new JLabel("User Name");    l2=new JLabel("Sequrity Question"); 
l3=new JLabel("Sequrity Answer"); l4=new JLabel("New Password");  
l5=new JLabel("Re-Enter Password"); l6=new JLabel("Forgot Password");  

t1=new JTextField(30);  t2=new JTextField(30);  
t3=new JTextField(30);  t4=new JTextField(30);  

li1=new Choice();  add(li1);

b1=new JButton("Submit");  b2=new JButton("Cancel");

li1.add("Enter First School name");  li1.add("Enter Grand mother name");  
li1.add("Enter Place of Birth");  li1.add("Your Favorite Food");

add(l1);  add(l2);  add(l3);  add(l4);  add(l5);  add(l6);  
add(t1);  add(t2);  add(t3);  add(t4);  
add(li1);  add(b1);  add(b2);  


 l1.setBounds(100,100,100,50);  l2.setBounds(100,170,150,50); 
 l3.setBounds(100,240,150,50);  l4.setBounds(100,310,150,50);   
 l5.setBounds(100,370,150,50);  l6.setBounds(250,40,150,50); 
 
 t1.setBounds(300,100,200,40);  li1.setBounds(300,180,200,40);
 t2.setBounds(300,240,200,40);  t3.setBounds(300,310,200,40);  
 t4.setBounds(300,370,200,40); 
  b1.setBounds(150,450,100,40);   b2.setBounds(310,450,100,40); 
  
  
	setVisible(true);
	setSize(600,600);
	setLayout(null);
  
  ButtonHandler handler=new ButtonHandler();
	b1.addActionListener(handler);
	b2.addActionListener(handler);
}
 public class ButtonHandler implements ActionListener
  { 
	public void actionPerformed(ActionEvent ae)
	  { 	
		if(ae.getSource()==b1 )
		  { 
			s1=t1.getText(); 
			s2=li1.getSelectedItem().toString();
			s3=t2.getText(); 
			s4=t3.getText();
			try{
					Class.forName("com.mysql.jdbc.Driver");
					Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/testing","root","root");
					
					PreparedStatement pst = con.prepareStatement("insert into t1 values(?,?,?,?)");
					
						pst.setString(1,s1);
						pst.setString(2,s2);
						pst.setString(3,s3);
						pst.setString(4,s4);
					
						pst.execute();
					pst.close();
					con.close();
					}
					catch(Exception e){ System.out.println("Error "+e); } 
		  }	
if(ae.getSource()==b2)
		  { dispose(); }		  
		}
  }
}