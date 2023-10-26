
package travel.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Silver extends JFrame implements ActionListener{
    
    JLabel heading,Silver,l1,l2,l3,l4,l5,l6,l7,l8,price;
    JButton back;
   
    Silver()
    {
   
    setLayout(null);
    getContentPane().setBackground(new Color(230,230,250));
   
   JPanel head=new JPanel();
   head.setBounds(0,30,1200,80);
   head.setLayout(null);
   head.setBackground(new Color(255,250,250));
   add(head);
   
   //heading
   heading=new JLabel("Check Out the SILVER PACKAGE and BOOK YOUR DREAM!");
   heading.setBounds(10,20,1200,40);
   heading.setFont(new Font("Lucida Calligraphy",Font.BOLD,30));
   heading.setForeground(new Color(255,0,0));
   head.add(heading);
   
   
   
   //Silver
   Silver=new JLabel("SILVER PACKAGE");
   Silver.setBounds(50,120,300,30);
   Silver.setFont(new Font("Cooper Black",Font.BOLD,25));
   Silver.setForeground(new Color(72,61,139));
   add(Silver);
   
  
   //features
   l1=new JLabel("3 Days AND 4 Nights");
   l1.setBounds(70,170,300,30);
   l1.setForeground(new Color(255,0,0));
   l1.setFont(new Font("Cascadia Mono SemiBold",Font.BOLD,20));
   add(l1);
   
   l2=new JLabel("English Guide");
   l2.setBounds(70,220,300,30);
   l2.setForeground(new Color(0,0,0));
   l2.setFont(new Font("Cascadia Mono SemiBold",Font.BOLD,20));
   add(l2);
   
   l3=new JLabel("Arrival Drink");
   l3.setBounds(70,270,300,30);
   l3.setForeground(new Color(255,0,0));
   l3.setFont(new Font("Cascadia Mono SemiBold",Font.BOLD,20));
   add(l3);
   
   l4=new JLabel("Famous City Places Tour");
   l4.setBounds(70,320,300,30);
   l4.setForeground(new Color(0,0,0));
   l4.setFont(new Font("Cascadia Mono SemiBold",Font.BOLD,20));
   add(l4);
   
   l5=new JLabel("Museum Tour");
   l5.setBounds(70,370,300,30);
   l5.setForeground(new Color(255,0,0));
   l5.setFont(new Font("Cascadia Mono SemiBold",Font.BOLD,20));
   add(l5);
   
   l6=new JLabel("Airport Assistance");
   l6.setBounds(70,420,300,30);
   l6.setForeground(new Color(0,0,0));
   l6.setFont(new Font("Cascadia Mono SemiBold",Font.BOLD,20));
   add(l6);
   
   l7=new JLabel("Daily Breakfast");
   l7.setBounds(70,470,300,30);
   l7.setForeground(new Color(255,0,0));
   l7.setFont(new Font("Cascadia Mono SemiBold",Font.BOLD,20));
   add(l7);
   
   l8=new JLabel("Half City Tour");
   l8.setBounds(70,520,300,30);
   l8.setForeground(new Color(0,0,0));
   l8.setFont(new Font("Cascadia Mono SemiBold",Font.BOLD,20));
   add(l8);
  
   //price
   price=new JLabel("Rs 100,000");
   price.setBounds(320,355,300,30);
   price.setForeground(Color.yellow);
   price.setFont(new Font("Cascadia Mono SemiBold",Font.BOLD,25));
   add(price);
   
   
   //back button
   back=new JButton("Back");
   back.setBounds(290,610,100,30);
   back.setForeground(new Color(255,20,147));
   back.setFont(new Font("Cascadia Mono SemiBold",Font.BOLD,20));
   back.setBackground(new Color(230,230,250));
   back.setBorder(BorderFactory.createEmptyBorder());
   back.addActionListener(this);
   add(back);
   
    //image
     ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("resort1.jpg"));
     Image i2=i1.getImage().getScaledInstance(700, 650, Image.SCALE_DEFAULT);
     ImageIcon i3=new ImageIcon(i2);
     JLabel image=new JLabel(i3);
     image.setBounds(600,100,700,650);
     add(image);
     
     //image tag
     ImageIcon i4=new ImageIcon(ClassLoader.getSystemResource("tag.png"));
     Image i5=i4.getImage().getScaledInstance(200, 150, Image.SCALE_DEFAULT);
     ImageIcon i6=new ImageIcon(i5);
     JLabel image1=new JLabel(i6);
     image1.setBounds(290,300,200,150);
     add(image1);
   
   
   
   setSize(1200,650);
   setLocation(250,100);
   setUndecorated(true);
   setVisible(true);
   }        
    
     public void actionPerformed(ActionEvent ae)
    {
    if(ae.getSource()==back)
    {
    setVisible(false);
    new CheckPackage("");
    }
    }
    
    public static void main(String [] args)
    {
    new Silver();
    }
}

