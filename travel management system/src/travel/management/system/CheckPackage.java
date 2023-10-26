
package travel.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CheckPackage extends JFrame implements ActionListener{
   JLabel heading,silver,gold,platinum,l1,l2,l3,l4,l5,l6,label1,label2,label3,label4; 
   JButton book1,book2,book3,back;
   String s1,s2,s3;
   String Username;
   CheckPackage(String Username)
   {
       this.Username=Username;
     setLayout(null);  
      getContentPane().setBackground(new Color(255,255,224)); 
       
     l1=new JLabel("Check");
     l1.setBounds(700,50,300,60);
     l1.setFont(new Font("Bradley Hand ITC",Font.BOLD,40));
     l1.setForeground(new Color(255,0,255));
     add(l1);
     
     l2=new JLabel("OUR");
     l2.setBounds(705,120,300,60);
     l2.setFont(new Font("Bradley Hand ITC",Font.BOLD,40));
     l2.setForeground(new Color(255,0,255));
     add(l2);
       
     l3=new JLabel("Packages");
     l3.setBounds(675,180,300,40);
     l3.setFont(new Font("Bauhaus 93",Font.BOLD,40));
     l3.setForeground(new Color(255,0,255));
     add(l3);
       
      
     label1=new JLabel("CLICK");
     label1.setBounds(700,280,600,30);
     label1.setFont(new Font("Californian FB",Font.BOLD,30));
     label1.setForeground(new Color(255,0,0));
     add(label1);
     
     
     label2=new JLabel("on the");
     label2.setBounds(750,320,600,30);
     label2.setFont(new Font("Californian FB",Font.BOLD,30));
     label2.setForeground(new Color(255,0,0));
     add(label2);
     
     
      label2=new JLabel("Packages");
     label2.setBounds(700,370,600,30);
     label2.setFont(new Font("Californian FB",Font.BOLD,30));
     label2.setForeground(new Color(255,0,0));
     add(label2);
     
     
     //image
     ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("resort7.jpg"));
     Image i2=i1.getImage().getScaledInstance(600, 650, Image.SCALE_DEFAULT);
     ImageIcon i3=new ImageIcon(i2);
     JLabel image=new JLabel(i3);
     image.setBounds(0,10,600,650);
     add(image);  
       
      
    //book1 
 
   book1=new JButton("PLATINUM PACKAGE");
   book1.setBounds(610,450,300,30);
   book1.setForeground(new Color(0,255,127));
   book1.setFont(new Font("Cascadia Mono SemiBold",Font.BOLD,20));
   book1.setBackground(new Color(255,255,224));
   book1.setBorder(BorderFactory.createEmptyBorder());
   book1.addActionListener(this);
   add(book1);
   
   
    //book2 
 
   book2=new JButton("GOLD PACKAGE");
   book2.setBounds(610,500,300,30);
   book2.setForeground(new Color(0,255,127));
   book2.setFont(new Font("Cascadia Mono SemiBold",Font.BOLD,20));
   book2.setBackground(new Color(255,255,224));
   book2.setBorder(BorderFactory.createEmptyBorder());
    book2.addActionListener(this);
   add(book2);
   
   
    //book3
 
   book3=new JButton("SILVER PACKAGE");
   book3.setBounds(610,550,300,30);
   book3.setForeground(new Color(0,255,127));
   book3.setFont(new Font("Cascadia Mono SemiBold",Font.BOLD,20));
   book3.setBackground(new Color(255,255,224));
   book3.setBorder(BorderFactory.createEmptyBorder());
    book3.addActionListener(this);
   add(book3);
   
   
   //back
 
   back=new JButton("BACK");
   back.setBounds(700,620,100,30);
   back.setForeground(new Color(139,69,19));
   back.setFont(new Font("Cascadia Mono SemiBold",Font.BOLD,20));
   back.setBackground(new Color(255,228,181));
    back.addActionListener(this);
   add(back);
     
     
    setSize(900,650);
    setLocation(250,100);
    setUndecorated(true);
    setVisible(true);
   }
   public void actionPerformed(ActionEvent ae)
   {
   if(ae.getSource()==book1)
   {
   setVisible(false);
   new Platinum();
   }else if(ae.getSource()==book2)
   {
   setVisible(false);
   new Gold(Username);
   }else if(ae.getSource()==book3){
   setVisible(false);
   new Silver();
   }else if(ae.getSource()==back){
   setVisible(false);
   new Signin(Username);
   }
   
   
   }
    
    public static void main(String [] args)
    {
    new CheckPackage("");
    }
}
