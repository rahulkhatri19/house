import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;
class logsw extends JFrame
{ JButton b1,b2,b3; JTextField t1; JPasswordField t2; 
JLabel l1,l2,l3,l4; String u,p,s1,s2;
logsw()
{super("Login Page") ;
setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
setLocation(60, 70);
setLayout(null);
b1=new JButton("Sign In");
b2=new JButton("Cancel");
b3=new JButton("Forgot password");
t1=new JTextField(20);
t2=new JPasswordField(20);
l1=new JLabel("User Name");
l2=new JLabel("Password");

t1.setToolTipText("Enter User Name");
t2.setToolTipText("Enter Password");

ImageIcon i1=new ImageIcon("b5.png");
l4=new JLabel(i1);
b1.setBounds(170,220,80,40); b2.setBounds(280,220,80,40); //b1.setBounds(x,y,w,h);
b3.setBounds(170,270,190,40);
l1.setBounds(120,90,120,50); l2.setBounds(120,140,120,50);
l4.setBounds(40,0,600,500);
t1.setBounds(270,100,150,30); 
t2.setBounds(270,150,150,30);
add(b1);add(b2);add(b3);add(t1);add(t2);
add(l1);add(l2);add(l4);
ButtonHandler handler=new ButtonHandler();
b1.addActionListener(handler);
b2.addActionListener(handler);
b3.addActionListener(handler);
setVisible(true);
setSize(650,600);

 }
 public class ButtonHandler implements ActionListener
 { public void actionPerformed(ActionEvent e)
 { if(e.getSource()==b1 )
	{ 
				u=t1.getText();
				p=t2.getText();
	 try {
		  Class.forName("com.mysql.jdbc.Driver");
		  Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/home","root","root");
		  Statement st=con.createStatement();
		  ResultSet rs=st.executeQuery(" select * from ureg where uname='"+u+"' " );
		 
		  while(rs.next())
		  { s1=rs.getString("uname");
		    s2=rs.getString("pwd"); }
			st.close();
		  con.close();
	         if((u.equals(s1)) && (p.equals(s2)))
	   { JOptionPane.showMessageDialog(logsw.this,"Successfull Login \n Welcome to House Rent & Sale ","Warning",JOptionPane.PLAIN_MESSAGE );   
   hfinal hm=new hfinal();  
         }
			else
			{System.out.println("Oh NO !"); 
		JOptionPane.showMessageDialog(logsw.this,"You Entered a wrong Username or Password \n Please Check Caps Lock is on or not ","Warning",JOptionPane.ERROR_MESSAGE ); 
		}				
		  
	  } catch (Exception ae) { System.out.println("Error "+ae); }
   } 
 if(e.getSource()==b2 ) { dispose(); }
 if(e.getSource()==b3 ) { fp pass=new fp(); }
 }  }
}