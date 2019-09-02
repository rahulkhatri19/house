import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class wel 
{ JButton b1,b2; JLabel l1,l2,l3;
wel()
{ 
  JFrame jf= new JFrame("Welcome");
  jf.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
  jf.setLayout(null);
  Icon b3=new ImageIcon(getClass().getResource("img/02.png") );
  b1=new JButton("Login Page ");
  b2=new JButton("Exit");
  l1=new JLabel("WELCOME TO ");
  l2=new JLabel("House Rent & Sale");
  l3=new JLabel(b3);
  b1.setBounds(1200,40,120,40);
  b2.setBounds(1200,90,100,40);
  l1.setBounds(120,40,200,60);
  l2.setBounds(150,120,200,60);
  l3.setBounds(0,0,1400,706);
  l1.setFont( new Font( "Serif", Font.PLAIN, 25 ) );
  l2.setFont( new Font( "Serif", Font.PLAIN, 20 ) );
  jf.add(b1); jf.add(b2); jf.add(l1); jf.add(l2); jf.add(l3);
  jf.setVisible(true);
  jf.setSize(1366,776);
  jf.getContentPane().setBackground(Color.blue);
  ButtonHandler handler=new ButtonHandler();
  b1.addActionListener(handler);
  
  b2.addActionListener(new ActionListener()
  {public void actionPerformed(ActionEvent e)
	  {System.exit(0); }  });
	}
	public class ButtonHandler implements ActionListener
	{ public void actionPerformed(ActionEvent ae)
  { if (ae.getSource()==b1 )
	  { logsw a1=new logsw();
  a1.setVisible(true);  
  }	
} }
}
class welcome
{ public static void main(String args[])
{
wel w1=new wel();
  
}
}