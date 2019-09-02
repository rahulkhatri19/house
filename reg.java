import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;
class reg extends JFrame
{   JButton b1,b2,b3,b4,b5; 
    JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10;
    JTextField t1,t2,t3; JTextArea t4; 
    JCheckBox c1,c2,c3,c4; 
    JRadioButton r1,r2,r3 ;     ButtonGroup bg;
    Choice li1,li2,li3; 
    String s1,s2,s3,s4,s5,s6,s7="",s8,s9,r;
	
 reg()
 { super("Client Registration");
  setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
  setLocation(60, 70);
  setLayout(null);
  b1=new JButton("Create");    b2=new JButton("Reset");
  b3=new JButton("Update");    b4=new JButton("Delete");  
  b5=new JButton("Cancel");
  l1=new JLabel("Name");            l2=new JLabel("Father's Name");
  l3=new JLabel("Gender");          l4=new JLabel("Salary Per Annum");
  l5=new JLabel("Current Address"); l6=new JLabel("Locking For");
  l7=new JLabel("Desired House");   l8=new JLabel("Preffered House");
  l9=new JLabel("Contact Number *"); l10=new JLabel("Client Registration");
  t1=new JTextField(20);            t2=new JTextField(20);
  t3=new JTextField(20);            t4=new JTextArea("",4,20);
  c1=new JCheckBox(" 1 BHK");        c2=new JCheckBox(" 2 BHK");
  c3=new JCheckBox(" 3 BHK");        c4=new JCheckBox(" 4 BHK");
  r1=new JRadioButton("Male",true);
  r2=new JRadioButton("Female",false);
  r3=new JRadioButton("Other",false);
  bg=new ButtonGroup();
  li1=new Choice();   li2=new Choice();    li3=new Choice(); 

add(li1);  add(li2);  add(li3);  

Box box=Box.createHorizontalBox();
JScrollPane js=new JScrollPane(t4);

b1.setBounds(200,590,80,40);   b2.setBounds(330,590,80,40); 
b3.setBounds(460,590,80,40);   b4.setBounds(590,590,80,40); 
b5.setBounds(720,590,80,40);
l1.setBounds(100,60,160,50);   l2.setBounds(100,120,160,50); 
l3.setBounds(100,170,120,50);  l4.setBounds(100,230,180,50); 
l5.setBounds(100,290,180,50);  l6.setBounds(100,370,160,50);
l7.setBounds(100,420,180,50);  l8.setBounds(100,480,180,50); 
l9.setBounds(600,60,160,50);   l10.setBounds(400,10,300,50); 
t1.setBounds(340,60,180,40);   t2.setBounds(340,120,180,40); 
t3.setBounds(750,60,180,40);    
c1.setBounds(340,370,80,50);   c2.setBounds(440,370,80,50);  
c3.setBounds(540,370,80,50);   c4.setBounds(640,370,80,50);
li1.setBounds(340,240,180,50);
li2.setBounds(340,425,180,50);
li3.setBounds(340,490,180,20);
r1.setBounds(340,180,80,50);   r2.setBounds(440,180,80,50); 
r3.setBounds(540,180,80,50);
box.setBounds(340,300,180,60);

bg.add(r1); bg.add(r2); bg.add(r3);
add(r1); add(r2); add(r3);
add(b1); add(b2); add(b3); add(b4); add(b5);
add(l1); add(l2); add(l3); add(l4); add(l5); add(l6); 
add(l7); add(l8); add(l9); add(l10);
add(t1); add(t2); add(t3); //add(t4);
add(c1); add(c2); add(c3); add(c4);
box.add(js);  add(box);

li1.add("Below 2 Lakh");  li1.add("2-8 Lakh");  li1.add("Above 8 Lakh");
li2.add("Low Price");     li2.add("Medium");    li2.add("Well Furnished");   li2.add("Luxary");
li3.add("House");         li3.add("Flat");      li3.add("Appartment");       li3.add("Villa");

    Font ff=new Font("verdana",Font.BOLD,20);
    l10.setFont(ff); 
  
	setVisible(true);
	setSize(1000,800); 
	setBackground(Color.blue);
  
  ButtonHandler handler=new ButtonHandler();
  b1.addActionListener(handler);
  b2.addActionListener(handler);
  b3.addActionListener(handler);
  b4.addActionListener(handler);
  b5.addActionListener(handler);
  
Scrollbar horzSB = new Scrollbar(Scrollbar.HORIZONTAL);

  t4.add(horzSB);
  
 } public class ButtonHandler implements ActionListener
 {  public void actionPerformed(ActionEvent ae)
	  { 	
		if(ae.getSource()==b1 )
		  { 
			s1=t1.getText();  s2=t2.getText(); 
			s3=t3.getText();
			s5=li1.getSelectedItem().toString();
			s6=t4.getText(); 
			s8=li2.getSelectedItem().toString();
			s9=li3.getSelectedItem().toString();
			 if(c1.isSelected())  { s7= s7 + c1.getText(); }
			 if(c2.isSelected())  { s7= s7 + c2.getText(); }
			 if(c3.isSelected())  { s7= s7 + c3.getText(); }
			 if(c4.isSelected())  { s7= s7 + c4.getText(); }
			 
			if(r1.isSelected())      {s4="Male";}
			else if(r2.isSelected())  {s4="Female";}
			else if(r3.isSelected())  {s4="Other";}
			
			try{
					Class.forName("com.mysql.jdbc.Driver");
					Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/home","root","root");
					
					PreparedStatement pst = con.prepareStatement("insert into creg values(?,?,?,?,?,?,?,?,?)");
					
						pst.setString(1,s1);
						pst.setString(2,s2);
						pst.setString(3,s3);
						pst.setString(4,s4);
						pst.setString(5,s5);
						pst.setString(6,s6);
						pst.setString(7,s7);
						pst.setString(8,s8);
						pst.setString(9,s9);
					
					pst.execute();
					pst.close();
					con.close();
					}
					catch(Exception e){ System.out.println("Error "+e); } 
		  }
		  if(ae.getSource()==b2)
		  {  
	  dispose();
	  reg r=new reg();
    r.setVisible(true);
	r.setSize(1000,800);
  	
	}
	  if(ae.getSource()==b3)
		  { r=t3.getText();
	        s2=t1.getText(); 
			s3=t2.getText();
			s5=li1.getSelectedItem().toString();
			s6=t4.getText(); 
			s8=li2.getSelectedItem().toString();
			s9=li3.getSelectedItem().toString();
			 if(c1.isSelected())  { s7= s7 + c1.getText(); }
			 if(c2.isSelected())  { s7= s7 + c2.getText(); }
			 if(c3.isSelected())  { s7= s7 + c3.getText(); }
			 if(c4.isSelected())  { s7= s7 + c4.getText(); }
			 
			if(r1.isSelected())      {s4="Male";}
			else if(r2.isSelected())  {s4="Female";}
			else if(r3.isSelected())  {s4="Other";}
			try {
				Class.forName("com.mysql.jdbc.Driver");
				Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/home","root","root");
				PreparedStatement pst=con.prepareStatement(" update creg set name='"+s2+"',fathername='"+s3+"',gender='"+s4+"',salary='"+s5+"',address='"+s6+"',looking='"+s7+"',desire='"+s8+"',preffered='"+s9+"' where contact='"+r+"' ");
				pst.execute();
				pst.close();
				con.close();
			} 
			catch(Exception e) { System.out.println("Error "+e); }
	  }
	    if(ae.getSource()==b4)
		  {  r=t3.getText();
	  try {
		  Class.forName("com.mysql.jdbc.Driver");
		  Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/home","root","root");
		  PreparedStatement pst=con.prepareStatement(" delete from creg where contact='"+r+"' ");
		  
		  pst.execute();
		  pst.close();
		  con.close();
	  }
	  catch(Exception e) { System.out.println("Error "+e); }
	  }
	    if(ae.getSource()==b5)
		  { dispose(); }
	  }
 }
}