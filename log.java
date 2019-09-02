import java.awt.*;
import java.awt.event.*;
import java.sql.*;
public class log extends Frame implements ActionListener
{ Button b1,b2; Label l1,l2; TextField t1,t2; 
  String s1,s2; Statement st; ResultSet rs;
 log()
 { 
 setLayout(null);
 b1=new Button("Log In");
   b2=new Button("Cancel");
   l1=new Label("User Name : ");
   l2=new Label("Password : ");
   t1=new TextField(20);
   t2=new TextField(20);
   b1.setBounds(150,220,80,40); b2.setBounds(260,220,80,40); //b1.setBounds(x,y,w,h);
   l1.setBounds(100,90,120,50); l2.setBounds(100,140,120,50);
   t1.setBounds(250,100,150,30); 
   t2.setBounds(250,150,150,30);
   
	
 add(b1);add(b2); add(l1);add(l2); add(t1); add(t2); 
 b2.addActionListener(this);
 b1.addActionListener(this);
 try{
Class.forName("com.mysql.jdbc.Driver");
Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","root");
st= con.createStatement();
rs= st.executeQuery("select * from st");
 } catch(Exception e){}
 
 Font ff=new Font("verdana",Font.BOLD,18);
  setFont(ff);
  setBackground(Color.green);
  setSize(550,500);
  setVisible(true);
  setTitle("Login page");
 }// contructor en
 public void actionPerformed(ActionEvent ae)
  {  int y=150; 
try{ while(rs.next())
	{ Label ls= new Label(rs.getString("st_name"));ls.setBounds(100,y,50,50);
     y=y+50; add(ls);
}
} catch(Exception e){}
 if (ae.getSource()==b2 )
	  { dispose();}
   
   if (ae.getSource()== b1 )
   { s1=t1.getText();
	s2=t2.getText();
   if((s1.equals("abc")) && (s2.equals("123")))
	   {
	   hfinal h=new hfinal();
	   //h.setVisible(true);
	   //h.setSize(500,500);
	   }
      } 
  }
 public void paint(Graphics g)
 {g.drawString("By Log In you Accept our Term & Condition",80,300); }
}