import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class hfinal extends JFrame
{ 
JMenuBar br; JMenuItem mi1,mi2,mi3,mi4,mi5,mi6,mi7,mi8,mi9,mi10,mi11,mi12,mi13; 
JTabbedPane tp ; JPanel p1,p2,p3,p4,p5,p6;
ImageIcon i1,i2,i3,i4,i5,i6,i7,i8,i9,i10,i11,i12,i13,i14,i15,i16,i17,i18,i19,i20,i21,i22,i23,i24,i25,i26,i27,i28,i29,i30,i31,i32,i33,i34,i41,i42,i43,i44,i45,i46,i47;
JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12,l13,l14,l15,l16,l17,l18,l19,l20,l21,l22,l23,l24,l25,l26,l27,l28,l29,l30,l31,l32,l33,l34,l35,l36,l37,l38,l39,l40,l41;
JToggleButton t1,t2,t3,t4,t5;
hfinal()
{ setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
br=new JMenuBar();
 setJMenuBar(br);
 JMenu a=new JMenu("Register");
  a.add(mi1=new JMenuItem("New Client ") );
  a.add(mi2=new JMenuItem("New User ") );
  JMenu b=new JMenu("Search");
  b.add(mi3=new JMenuItem("Buy House") );
  b.add(mi4=new JMenuItem("House on Rent") );
  b.add(mi5=new JMenuItem("Bye Flat") );
  b.add(mi8=new JMenuItem("About ...") );
  JMenu c=new JMenu("Quit");
  c.add(mi7=new JMenuItem("Close Applecation") );
   JMenu d=new JMenu("Show");
  d.add(mi10=new JMenuItem("Client Data") );
  d.add(mi11=new JMenuItem("User Data") );
  JMenu e=new JMenu("Alter");
  e.add(mi12=new JMenuItem("Client Data") );
  e.add(mi13=new JMenuItem("User Data") );
  
  br.add(a); br.add(b); br.add(d); br.add(e); br.add(c); 
  
  a.setMnemonic('R');mi1.setMnemonic('n');
  b.setMnemonic('s');
  c.setMnemonic('q');mi7.setMnemonic('c');
 
  
  
   mi7.addActionListener(new ActionListener()
  {public void actionPerformed(ActionEvent e)
	  {System.exit(0); }  });
  mi8.addActionListener(new ActionListener ()
  {public void actionPerformed(ActionEvent ea) 
	  {JOptionPane.showMessageDialog(hfinal.this,"This Software was built in JUNE 2017 \n Software built version 2.3.12\n Software by cool & chill pvt. Ltd.","By be cool & chill",JOptionPane.PLAIN_MESSAGE ); }
  });
	 
	 mi1.addActionListener(new ActionListener()
  {public void actionPerformed(ActionEvent e)
	  {  reg a1=new reg();   }  });
	  
	mi2.addActionListener(new ActionListener()
     {public void actionPerformed(ActionEvent e)
	  { logad lo =new logad(); }  });  
	  
	mi10.addActionListener(new ActionListener()
     {public void actionPerformed(ActionEvent e)
	  { regs a2=new regs(); }  }); 
	  
	mi11.addActionListener(new ActionListener()
     {public void actionPerformed(ActionEvent e)
	  { esh ee=new esh(); }  });  
mi12.addActionListener(new ActionListener()
     {public void actionPerformed(ActionEvent e)
	  { reg a1=new reg();  }  }); 
	  
mi13.addActionListener(new ActionListener()
     {public void actionPerformed(ActionEvent e)
	  { logad lo =new logad(); }  });  
	  
/* mi.addActionListener(new ActionListener()
     {public void actionPerformed(ActionEvent e)
	  {  }  });  */
	 
tp=new JTabbedPane();
p1=new JPanel();
p2=new JPanel();
p3=new JPanel();
p4=new JPanel();
p5=new JPanel();
p6=new JPanel();

add(tp);
tp.addTab("House on Rent",null,p1,"First Panel");
tp.addTab("Home",null,p2,"Second Panel");
tp.addTab("Flat",null,p3,"Third Panel");
tp.addTab("Appartment",null,p4,"Fourth Panel");
tp.addTab("Villa",null,p5,"Fifth Panel");
tp.addTab("Luxury",null,p6,"Sixth Panel");

i1=new ImageIcon("img/a1.png"); i2=new ImageIcon("img/a2.png");
i3=new ImageIcon("img/a3.png"); i4=new ImageIcon("img/a4.png");
i5=new ImageIcon("img/a5.png"); i6=new ImageIcon("img/f6.png");
i7=new ImageIcon("img/f2.png"); i8=new ImageIcon("img/f3.png");
i9=new ImageIcon("img/f4.png"); i10=new ImageIcon("img/f5.png");
i11=new ImageIcon("img/f1.png"); i12=new ImageIcon("img/h1.png");
i13=new ImageIcon("img/h2.png"); i14=new ImageIcon("img/h3.png");
i15=new ImageIcon("img/h4.png"); i16=new ImageIcon("img/h5.png");
i17=new ImageIcon("img/h6.png"); i18=new ImageIcon("img/h7.png");
i19=new ImageIcon("img/l9.png"); i20=new ImageIcon("img/l3.png");
i21=new ImageIcon("img/l8.png"); i22=new ImageIcon("img/l7.png");
i23=new ImageIcon("img/l5.png"); i24=new ImageIcon("img/l2.png");
i25=new ImageIcon("img/l6.png"); i26=new ImageIcon("img/l4.png");
i27=new ImageIcon("img/l1.png");
i29=new ImageIcon("img/v6.png"); i30=new ImageIcon("img/v3.png");
i31=new ImageIcon("img/v2.png"); i32=new ImageIcon("img/v4.png");
i33=new ImageIcon("img/v5.png"); i34=new ImageIcon("img/v1.png");
i41=new ImageIcon("img/1.png"); i42=new ImageIcon("img/2.png");
i43=new ImageIcon("img/3.png"); i44=new ImageIcon("img/4.png");
i45=new ImageIcon("img/5.png"); i46=new ImageIcon("img/6.png");
i47=new ImageIcon("img/7.png");

l1=new JLabel(i1); l2=new JLabel(i2); l3=new JLabel(i3); 
l4=new JLabel(i4); l5=new JLabel(i5); l6=new JLabel(i6);
l7=new JLabel(i7);  l8=new JLabel(i8); l9=new JLabel(i9); 
l10=new JLabel(i10); l11=new JLabel(i11); l12=new JLabel(i12);
l13=new JLabel(i13); l14=new JLabel(i14); l15=new JLabel(i15); 
l16=new JLabel(i16); l17=new JLabel(i17);  l18=new JLabel(i18); 
l19=new JLabel(i19); l20=new JLabel(i20); l21=new JLabel(i21); 
l22=new JLabel(i22); l23=new JLabel(i23);  l24=new JLabel(i24); 
l25=new JLabel(i25); l26=new JLabel(i26); l27=new JLabel(i27);  
l28=new JLabel(i28); l29=new JLabel(i29); l30=new JLabel(i30);
l31=new JLabel(i31); l32=new JLabel(i32); l33=new JLabel(i33); 
l34=new JLabel(i34);
l35=new JLabel(i41); l36=new JLabel(i42); l37=new JLabel(i43); 
l38=new JLabel(i44); l39=new JLabel(i45); l40=new JLabel(i46);
l41=new JLabel(i47);


JScrollPane jp1=new JScrollPane(p1,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS); 
tp.add(jp1,"House on Rent");
JScrollPane jp2=new JScrollPane(p2,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS); 
tp.add(jp2,"Home");
JScrollPane jp3=new JScrollPane(p3,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS); 
tp.add(jp3,"Flat");
JScrollPane jp4=new JScrollPane(p4,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS); 
tp.add(jp4,"Appartment");
JScrollPane jp5=new JScrollPane(p5,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS); 
tp.add(jp5,"Villa");
JScrollPane jp6=new JScrollPane(p6,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS); 
tp.add(jp6,"Luxury Home");

p1.setLayout(new GridLayout(4,4)); p2.setLayout(new GridLayout(4,4)); p3.setLayout(new GridLayout(4,4)); p4.setLayout(new GridLayout(4,4)); p5.setLayout(new GridLayout(4,4)); p6.setLayout(new GridLayout(6,2)); 

p2.add(l12); p2.add(l13); p2.add(l14); p2.add(l15); p2.add(l16); 
p2.add(l17); p2.add(l18); 
p3.add(l6); p3.add(l7); p3.add(l8); p3.add(l9); p3.add(l10); p3.add(l11); 
p4.add(l1); p4.add(l2); p4.add(l3); p4.add(l4); p4.add(l5);
p5.add(l29); p5.add(l30); p5.add(l31); p5.add(l32); p5.add(l33); p5.add(l34);  
p6.add(l19);
p6.add(l20); p6.add(l21); p6.add(l22); p6.add(l23); p6.add(l24);
p6.add(l25); p6.add(l26); p6.add(l27); p6.add(l28); //p.add(l);

p1.add(l35);p1.add(l36);p1.add(l37);p1.add(l38);p1.add(l39);p1.add(l40);p1.add(l41);


l1.setText("This Appartment has 2800 sq ft area, 3 BHK");
l2.setText("This Appartment has 4500 sq ft area, 5 BHK");
l3.setText("This Appartment has 1500 sq ft area, 2 BHK");
l4.setText("This Appartment has 3100 sq ft area, 4 BHK");
l5.setText("This Appartment has 1600 sq ft area, 2 BHK");
l6.setText("One of these Flat has 1800 sq ft area, 3 BHK");
l7.setText("One of these Flat has 1500 sq ft area, 2 BHK");
l8.setText("One of these Flat has 1200 sq ft area, 2 BHK");
l9.setText("One of these Flat has 1700 sq ft area, 3 BHK");
l10.setText("One of these Flat has 1600 sq ft area, 2 BHK");
l11.setText("One of these Flat has 1390 sq ft area, 2 BHK");
l12.setText("This House has 1700 sq ft area, 3 BHK");
l13.setText("This House has 1390 sq ft area, 2 BHK");
l14.setText("This House has 1200 sq ft area, 2 BHK");
l15.setText("This House has 2000 sq ft area, 4 BHK");
l16.setText("This House has 1600 sq ft area, 3 BHK");
l17.setText("This House has 1500 sq ft area, 2 BHK");
l18.setText("This House has 1800 sq ft area, 3 BHK");
l19.setText("This Luxury Home has 4000 sq ft area, 5 BHK");
l20.setText("This Luxury Home has 3500 sq ft area, 4 BHK");
l21.setText("This Luxury Home has 2500 sq ft area, 4 BHK");
l22.setText("This Luxury Home has 2000 sq ft area, 3 BHK");
l23.setText("This Luxury Home has 3100 sq ft area, 4 BHK");
l24.setText("This Luxury Home has 3300 sq ft area, 4 BHK");
l25.setText("This Luxury Home has 3000 sq ft area, 4 BHK");
l26.setText("This Luxury Home has 3500 sq ft area, 4 BHK");
l27.setText("This Luxury Home has 4000 sq ft area, 5 BHK");
l29.setText("This Villa has 3000 sq ft area, 3 BHK");
l30.setText("This Villa has 4500 sq ft area, 5 BHK");
l31.setText("This Villa has 5000 sq ft area, 6 BHK");
l32.setText("This Villa has 4500 sq ft area, 6 BHK");
l33.setText("This Villa has 3500 sq ft area, 4 BHK");
l34.setText("This Villa has 2000 sq ft area, 3 BHK");
l35.setText("This Home has 1800 sq ft area, 3 BHK");
l36.setText("This Home has 1500 sq ft area, 2 BHK");
l37.setText("This Villa has 4500 sq ft area, 5 BHK");
l38.setText("This Villa has 2800 sq ft area, 3 BHK");
l39.setText("This Home has 1500 sq ft area, 2 BHK");
l40.setText("This Villa has 2000 sq ft area, 3 BHK");
l41.setText("This Luxury Home has 3000 sq ft area, 4 BHK");

//l.setText("This Villa has  sq ft area,  BHK");

l1.setVerticalTextPosition(SwingConstants.BOTTOM);
l1.setHorizontalTextPosition(SwingConstants.CENTER);
l2.setVerticalTextPosition(SwingConstants.BOTTOM);
l2.setHorizontalTextPosition(SwingConstants.CENTER);
l3.setVerticalTextPosition(SwingConstants.BOTTOM);
l3.setHorizontalTextPosition(SwingConstants.CENTER);
l4.setVerticalTextPosition(SwingConstants.BOTTOM);
l4.setHorizontalTextPosition(SwingConstants.CENTER);
l5.setVerticalTextPosition(SwingConstants.BOTTOM);
l5.setHorizontalTextPosition(SwingConstants.CENTER);
l6.setVerticalTextPosition(SwingConstants.BOTTOM);
l6.setHorizontalTextPosition(SwingConstants.CENTER);
l7.setVerticalTextPosition(SwingConstants.BOTTOM);
l7.setHorizontalTextPosition(SwingConstants.CENTER);
l8.setVerticalTextPosition(SwingConstants.BOTTOM);
l8.setHorizontalTextPosition(SwingConstants.CENTER);
l9.setVerticalTextPosition(SwingConstants.BOTTOM);
l9.setHorizontalTextPosition(SwingConstants.CENTER);
l10.setVerticalTextPosition(SwingConstants.BOTTOM);
l10.setHorizontalTextPosition(SwingConstants.CENTER);
l11.setVerticalTextPosition(SwingConstants.BOTTOM);
l11.setHorizontalTextPosition(SwingConstants.CENTER);
l12.setVerticalTextPosition(SwingConstants.BOTTOM);
l12.setHorizontalTextPosition(SwingConstants.CENTER);
l13.setVerticalTextPosition(SwingConstants.BOTTOM);
l13.setHorizontalTextPosition(SwingConstants.CENTER);
l14.setVerticalTextPosition(SwingConstants.BOTTOM);
l14.setHorizontalTextPosition(SwingConstants.CENTER);
l15.setVerticalTextPosition(SwingConstants.BOTTOM);
l15.setHorizontalTextPosition(SwingConstants.CENTER);
l16.setVerticalTextPosition(SwingConstants.BOTTOM);
l16.setHorizontalTextPosition(SwingConstants.CENTER);
l17.setVerticalTextPosition(SwingConstants.BOTTOM);
l17.setHorizontalTextPosition(SwingConstants.CENTER);
l18.setVerticalTextPosition(SwingConstants.BOTTOM);
l18.setHorizontalTextPosition(SwingConstants.CENTER);
l19.setVerticalTextPosition(SwingConstants.BOTTOM);
l19.setHorizontalTextPosition(SwingConstants.CENTER);
l20.setVerticalTextPosition(SwingConstants.BOTTOM);
l20.setHorizontalTextPosition(SwingConstants.CENTER);
l21.setVerticalTextPosition(SwingConstants.BOTTOM);
l21.setHorizontalTextPosition(SwingConstants.CENTER);
l22.setVerticalTextPosition(SwingConstants.BOTTOM);
l22.setHorizontalTextPosition(SwingConstants.CENTER);
l23.setVerticalTextPosition(SwingConstants.BOTTOM);
l23.setHorizontalTextPosition(SwingConstants.CENTER);
l24.setVerticalTextPosition(SwingConstants.BOTTOM);
l24.setHorizontalTextPosition(SwingConstants.CENTER);
l25.setVerticalTextPosition(SwingConstants.BOTTOM);
l25.setHorizontalTextPosition(SwingConstants.CENTER);
l26.setVerticalTextPosition(SwingConstants.BOTTOM);
l26.setHorizontalTextPosition(SwingConstants.CENTER);
l27.setVerticalTextPosition(SwingConstants.BOTTOM);
l27.setHorizontalTextPosition(SwingConstants.CENTER);
l29.setVerticalTextPosition(SwingConstants.BOTTOM);
l29.setHorizontalTextPosition(SwingConstants.CENTER);
l30.setVerticalTextPosition(SwingConstants.BOTTOM);
l30.setHorizontalTextPosition(SwingConstants.CENTER);
l31.setVerticalTextPosition(SwingConstants.BOTTOM);
l31.setHorizontalTextPosition(SwingConstants.CENTER);
l32.setVerticalTextPosition(SwingConstants.BOTTOM);
l32.setHorizontalTextPosition(SwingConstants.CENTER);
l33.setVerticalTextPosition(SwingConstants.BOTTOM);
l33.setHorizontalTextPosition(SwingConstants.CENTER);
l34.setVerticalTextPosition(SwingConstants.BOTTOM);
l34.setHorizontalTextPosition(SwingConstants.CENTER);
l35.setVerticalTextPosition(SwingConstants.BOTTOM);
l35.setHorizontalTextPosition(SwingConstants.CENTER);
l36.setVerticalTextPosition(SwingConstants.BOTTOM);
l36.setHorizontalTextPosition(SwingConstants.CENTER);
l37.setVerticalTextPosition(SwingConstants.BOTTOM);
l37.setHorizontalTextPosition(SwingConstants.CENTER);
l38.setVerticalTextPosition(SwingConstants.BOTTOM);
l38.setHorizontalTextPosition(SwingConstants.CENTER);
l39.setVerticalTextPosition(SwingConstants.BOTTOM);
l39.setHorizontalTextPosition(SwingConstants.CENTER);
l40.setVerticalTextPosition(SwingConstants.BOTTOM);
l40.setHorizontalTextPosition(SwingConstants.CENTER);
l41.setVerticalTextPosition(SwingConstants.BOTTOM);
l41.setHorizontalTextPosition(SwingConstants.CENTER);




//l.setVerticalTextPosition(SwingConstants.BOTTOM);
//l.setHorizontalTextPosition(SwingConstants.CENTER);

l1.setToolTipText("This is Appartment 'a1' ");
l2.setToolTipText("This is Appartment 'a2' ");
l3.setToolTipText("This is Appartment 'a3' ");
l4.setToolTipText("This is Appartment 'a4' ");
l5.setToolTipText("This is Appartment 'a5' ");
l6.setToolTipText("This is Flat 'f1' ");
l7.setToolTipText("This is Flat 'f2' ");
l8.setToolTipText("This is Flat 'f3' ");
l9.setToolTipText("This is Flat 'f4' ");
l10.setToolTipText("This is Flat 'f5' ");
l11.setToolTipText("This is Flat 'f6' ");
l12.setToolTipText("This is House 'h1' ");
l13.setToolTipText("This is House 'h2' ");
l14.setToolTipText("This is House 'h3' ");
l15.setToolTipText("This is House 'h4' ");
l16.setToolTipText("This is House 'h5' ");
l17.setToolTipText("This is House 'h6' ");
l18.setToolTipText("This is House 'h7' ");
l19.setToolTipText("This is Luxury House 'l1' ");
l20.setToolTipText("This is Luxury House 'l2' ");
l21.setToolTipText("This is Luxury House 'l3' ");
l22.setToolTipText("This is Luxury House 'l4' ");
l23.setToolTipText("This is Luxury House 'l5' ");
l24.setToolTipText("This is Luxury House 'l6' ");
l25.setToolTipText("This is Luxury House 'l7' ");
l26.setToolTipText("This is Luxury House 'l8' ");
l27.setToolTipText("This is Luxury House 'l9' ");
l29.setToolTipText("This is Villa 'v1' ");
l30.setToolTipText("This is Villa 'v2' ");
l31.setToolTipText("This is Villa 'v3' ");
l32.setToolTipText("This is Villa 'v4' ");
l33.setToolTipText("This is Villa 'v5' ");
l34.setToolTipText("This is Villa 'v6' ");
l35.setToolTipText("This is Home 'r1' ");
l36.setToolTipText("This is Home 'r2' ");
l37.setToolTipText("This is Villa 'r3' ");
l38.setToolTipText("This is Villa 'r4' ");
l39.setToolTipText("This is Home 'r5' ");
l40.setToolTipText("This is Villa 'r6' ");
l41.setToolTipText("This is Luxury Home 'r7' ");


//l.setToolTipText("This is Villa 'v' ");


getContentPane().setBackground(Color.cyan);
setVisible(true);
setSize(1390,730);
}
}
