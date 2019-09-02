import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import javax.swing.*;
class logad extends JFrame
{ 
	JLabel l1,l2,l3,l4,l5,l6,l7,l8; 
	JButton b1,b2,b3,b4,b5; 
	JTextField t1,t2; JPasswordField p1,p2;
    Choice li1,li2;  
	String s1,s2,s3,s4,s5,s6,r;
logad()  
{ super("New User Registration") ;
 setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
 setLayout(null);
 setLocation(60, 70);
 l1=new JLabel("User Name");           l2=new JLabel("Password");
 l3=new JLabel("Reenter Password");    l4=new JLabel("Security Question"); 
 l5=new JLabel("Security Answer");     l6=new JLabel("Position"); 
 l7=new JLabel("User Registration");
 
  t1=new JTextField(30);       t2=new JTextField(30);  
  li1=new Choice();            li2=new Choice();
  p1=new JPasswordField(30);   p2=new JPasswordField(30); 
  b1=new JButton("Create");    b2=new JButton("Reset");
  b3=new JButton("Update");    b4=new JButton("Delete");  
  b5=new JButton("Cancel");

 add(l1);  add(l2);  add(l3);  add(l4);   add(l5);  add(l6);  add(l7);       
 add(t1);  add(t2);  add(p1);  add(p2);  
 add(li1);  add(li2); add(b1);  add(b2); add(b3);  add(b4);  add(b5);  
 
 
 l1.setBounds(100,80,100,50);  l2.setBounds(100,150,150,50); 
 l3.setBounds(100,220,150,50);  l4.setBounds(100,290,150,50);  
 l5.setBounds(100,350,150,50);  l6.setBounds(100,410,150,50);  
 l7.setBounds(200,20,200,60);   
 
 t1.setBounds(300,80,200,40);   t2.setBounds(300,360,200,40); 
 p1.setBounds(300,150,200,40);   p2.setBounds(300,220,200,40); 
 li1.setBounds(300,300,200,40);  li2.setBounds(300,420,200,40); 
 
 b1.setBounds(90,490,80,40);  b2.setBounds(180,490,80,40); 
 b3.setBounds(270,490,80,40);  b4.setBounds(360,490,80,40); 
 b5.setBounds(450,490,80,40); 
 
 li1.add("Enter First School name");  li1.add("Enter Grand mother name");  li1.add("Enter Place of Birth");  li1.add("Your Favorite Food");  
 li2.add("Adminstrator"); li2.add("Accountant"); li2.add("Salesman");  
 
 ButtonHandler handler =new ButtonHandler();
 b1.addActionListener(handler);
 b2.addActionListener(handler);
 b3.addActionListener(handler);
 b4.addActionListener(handler);
 b5.addActionListener(handler);
 
  Font ff=new Font("verdana",Font.BOLD,20);
    l7.setFont(ff); 
 setVisible(true);
 setSize(600,700);
}
  public class ButtonHandler implements ActionListener
  { public void actionPerformed(ActionEvent ee)
	  { if(ee.getSource()==b1 )
		  { s1=t1.getText();
	        s2=p1.getText();
			s3=p2.getText();
	        s4=li1.getSelectedItem().toString();
			s5=t2.getText();
			s6=li2.getSelectedItem().toString();
			try{
				
					Class.forName("com.mysql.jdbc.Driver");
					Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/home","root","root");
					
					PreparedStatement pst = con.prepareStatement("insert into ureg values(?,?,?,?,?,?)");
					
						pst.setString(1,s1);
						pst.setString(2,s2);
						pst.setString(3,s3);
						pst.setString(4,s4);
					    pst.setString(5,s5);
						pst.setString(6,s6);
						
						pst.execute();
					pst.close();
					con.close();
			}
			catch(Exception e){ System.out.println("Error"+e); }
		  }
		  if(ee.getSource()==b2)
		  {  
	  dispose();
	  logad r=new logad();
    r.setVisible(true);
	r.setSize(1000,800);
	}
	if(ee.getSource()==b3)
	{  r=t1.getText();
       s2=p1.getText();
	   s3=p2.getText();
	   s4=li1.getSelectedItem().toString();
	   s5=t2.getText();
	   s6=li2.getSelectedItem().toString();
	   try{
					Class.forName("com.mysql.jdbc.Driver");
					Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/home","root","root");
					
					PreparedStatement pst = con.prepareStatement("update ureg set pwd='"+s2+"',rpsw='"+s3+"',sq='"+s4+"',sa='"+s5+"',pos='"+s6+"' where uname='"+r+"' ");
					
					pst.execute();
					pst.close();
					con.close();
			}
			catch(Exception e){ System.out.println("Error"+e); }
		  }
	
 if(ee.getSource()==b4)
		  {  r=t1.getText();
	  try {
		  Class.forName("com.mysql.jdbc.Driver");
		  Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/home","root","root");
		  PreparedStatement pst=con.prepareStatement(" delete from ureg where uname='"+r+"' ");
		  
		  pst.execute();
		  pst.close();
		  con.close();
	  }
	  catch(Exception e) { System.out.println("Error "+e); }
	  }
		  if(ee.getSource()==b5)
		  {  dispose();  }
  }
  }
  
}