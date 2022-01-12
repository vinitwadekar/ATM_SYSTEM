package atmSimulatorSystem;

import java.awt.*;

import java.sql.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;




public class Signup2 extends JFrame implements ActionListener{
	 JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12;
	 JButton b;
	 JRadioButton r1,r2,r3,r4;
	 JTextField t1,t2,t3;
	 JComboBox c1,c2,c3,c4,c5;
	 
	 
	 Signup2()
	 {
		 setFont(new Font("System",Font.BOLD,22));
			Font f=getFont();
			FontMetrics fm=getFontMetrics(f);
			int x=fm.stringWidth("NEW ACCOUNT APPLICATION FORM :PAGE 2");
			int y=fm.stringWidth(" ");
			int z=getWidth() -x;
			int w=z/y;
			String pad=" ";
			pad=String.format("%"+w+"s",pad);
			setTitle(pad+"NEW ACCOUNT APPLICATION FORM :PAGE 2");
			
			l1=new JLabel("PAGE 2: ADDITIONAL DETAILS");
			l1.setFont(new Font("Raleway",Font.BOLD,22));
			
			l2=new JLabel("RELIGION");
			l2.setFont(new Font("Raleway",Font.BOLD,14));
			
			l3=new JLabel("CATEGORY ");
			l3.setFont(new Font("Raleway",Font.BOLD,14));
			
			l4=new JLabel("INCOME:");
			l4.setFont(new Font("Raleway",Font.BOLD,14));
			
			l5=new JLabel("EDUCATIONAL");
			l5.setFont(new Font("Raleway",Font.BOLD,14));
			
			l6=new JLabel("OCCUPATION:");
			l6.setFont(new Font("Raleway",Font.BOLD,14));
			
			l7=new JLabel("PAN NUMBER:");
			l7.setFont(new Font("Raleway",Font.BOLD,14));
			
			l8=new JLabel("ADHAAR NUMBER:");
			l8.setFont(new Font("Raleway",Font.BOLD,14));
			
			l9=new JLabel("SENIOR CITIZEN:");
			l9.setFont(new Font("Raleway",Font.BOLD,14));
			
			l10=new JLabel("EXISTING ACCOUNT:");
			l10.setFont(new Font("Raleway",Font.BOLD,14));
			
			l11=new JLabel("QUALIFICATION:");
			l11.setFont(new Font("Raleway",Font.BOLD,14));
			
			l12=new JLabel("FORM NO:");
			l12.setFont(new Font("Raleway",Font.BOLD,14));
			
			b=new JButton("NEXT");
			b.setFont(new Font("Raleway",Font.BOLD,14));
			b.setBackground(Color.BLACK);
			b.setForeground(Color.WHITE);
			
			t1=new JTextField();
			t1.setFont(new Font("Raleway",Font.BOLD,14));
			
			t2=new JTextField();
			t2.setFont(new Font("Raleway",Font.BOLD,14));
			
			t3=new JTextField();
			t3.setFont(new Font("Raleway",Font.BOLD,14));
			
			r1=new JRadioButton("YES");
			r1.setFont(new Font("Raleway",Font.BOLD,14));
			r1.setBackground(Color.WHITE);
			
			r2=new JRadioButton("NO");
			r2.setFont(new Font("Raleway",Font.BOLD,14));
			r2.setBackground(Color.WHITE);
			
			r3=new JRadioButton("YES");
			r3.setFont(new Font("Raleway",Font.BOLD,14));
			r3.setBackground(Color.WHITE);
			
			r4=new JRadioButton("NO");
			r4.setFont(new Font("Raleway",Font.BOLD,14));
			r4.setBackground(Color.WHITE);
			
			
			String religion[]= {"HINDU","MUSLIM","SIKH","BUDDHA"};
			c1= new JComboBox(religion);
			c1.setBackground(Color.WHITE);
			
			String category[]= {"GENERAL","OBC","SC","VJNT","OTHER"};
			c2= new JComboBox(category);
			c2.setBackground(Color.WHITE);
			
			String income[]= {"Null","<100","<200","<300","300<"};
			c3= new JComboBox(income);
			c3.setBackground(Color.WHITE);
			
			String education[]= {"NON_GRADUATE","GRADUATE","POST_GRADUATE","OTHERS"};
			c4= new JComboBox(education);
			c4.setBackground(Color.WHITE);
			
			String occupation[]= {"SERVICE","SELF-EMPLOYED","GOVT-SERVANT","OTHERS"};
			c5= new JComboBox(occupation);
			c5.setBackground(Color.WHITE);
			
			
			setLayout(null);
			
			l12.setBounds(700,10,60,30);
			add(l1);
			
			t3.setBounds(760,10,60,30);
			add(t3);
			
			l1.setBounds(280,30,600,40);
			add(l1);
	
			l2.setBounds(100,120,100,30);
			add(l2);
			
			c1.setBounds(350,120,320,30);
			add(c1);
			
			l3.setBounds(100,170,100,30);
			add(l3);
			
			c2.setBounds(350,170,320,30);
			add(c2);
			
			l4.setBounds(100,220,100,30);
			add(l4);
			
			c3.setBounds(350,220,320,30);
			add(c3);
			
			l5.setBounds(100,270,150,30);
			add(l5);
			
			c4.setBounds(350,270,320,30);
			add(c4);
			
			l11.setBounds(100,290,150,30);
			add(l11);
			
			l6.setBounds(100,340,150,30);
			add(l6);
			
			c5.setBounds(350,340,320,30);
			add(c5);
			
			l7.setBounds(100,390,150,30);
			add(l7);
			
			t1.setBounds(350,390,320,30);
			add(t1);
			
			l8.setBounds(100,440,180,30);
			add(l8);
			
			t2.setBounds(350,440,320,30);
			add(t2);
			
			l9.setBounds(100,490,150,30);
			add(l9);
			
			r1.setBounds(350,490,100,30);
			add(r1);
			
			r2.setBounds(460,490,100,30);
			add(r2);
			
			l10.setBounds(100,540,180,30);
			add(l10);
			
			r3.setBounds(350,540,100,30);
			add(r3);
			
			r4.setBounds(460,540,100,30);
			add(r4);
			
			b.setBounds(570,600,100,30);
			add(b);
			
			b.addActionListener(this);
			
			getContentPane().setBackground(Color.WHITE);
			setSize(850,850);
			setLocation(500,90);
			setVisible(true);
			
					
	 }
	 public void actionPerformed(ActionEvent ae)
	 {
		 String a=(String)c1.getSelectedItem();
		 String b=(String)c2.getSelectedItem();
		 String c=(String)c3.getSelectedItem();
		 String d=(String)c4.getSelectedItem();
		 String e=(String)c5.getSelectedItem();
		 
		 String f=t1.getText();
		 String g=t2.getText();
		 
		 String h="";
		 if(r1.isSelected())
		 {
			 h="yes";	 
		 }
		 else if(r2.isSelected())
		 {
			 h="no";
		 }
		 
		 
		 String i="";
		 if(r3.isSelected())
		 {
			 i="YES";
		 }
		 else if(r4.isSelected())
		 {
			 i="NO";
		 }
		 
		 String j=t3.getText();
		 
		 try
		 {
			 if(t2.getText().equals("")) {
					JOptionPane.showMessageDialog(null, "fill all the required fields");
				}else  {
					Conn c2=new Conn();
					String q2="insert into signup2 values('"+j+"','"+a+"','"+b+"','"+c+"','"+d+"','"+e+"','"+f+"','"+g+"','"+h+"','"+i+"')";
				
					c2.s.executeUpdate(q2);
					
				}
					
					new Signup3("+formno").setVisible(true);
					setVisible(false);
				
				
		 }
		 catch(Exception ex)
		 {
			 ex.printStackTrace();
		 }
		 
		 
	 }
	
	public static void main(String []args)
	{
		new Signup2().setVisible(true);
	}

}
