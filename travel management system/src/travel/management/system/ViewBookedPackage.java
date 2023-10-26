
package travel.management.system;


import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;


  
   
    
    public class ViewBookedPackage extends JFrame implements ActionListener{
    
    JLabel username,name,phone,pack,person,price,usertext,nametext,phonetext,packtext,persontext,pricetext;
    
    JButton back;
    
    String Username;
        
    ViewBookedPackage(String Username)
    {
        this.Username=Username;
        System.out.println("this.Username= "+this.Username);
    setLayout(null);
    getContentPane().setBackground(new Color(64,224,208));
    
    
     username=new JLabel("Username");
     username.setBounds(10,60,100,30);
     username.setFont(new Font("osward",Font.BOLD,19));
     username.setForeground(new Color(25,25,112));
     add(username);
     
     name=new JLabel("Name");
     name.setBounds(10,120,100,30);
     name.setFont(new Font("osward",Font.BOLD,19));
     name.setForeground(new Color(25,25,112));
     add(name);
     
     phone=new JLabel("Phone");
     phone.setBounds(10,180,100,30);
     phone.setFont(new Font("osward",Font.BOLD,19));
     phone.setForeground(new Color(25,25,112));
     add(phone);
     
     pack=new JLabel("Package");
     pack.setBounds(10,240,100,30);
     pack.setFont(new Font("osward",Font.BOLD,19));
     pack.setForeground(new Color(25,25,112));
     add(pack);
     
     person=new JLabel("Person");
     person.setBounds(10,300,100,30);
     person.setFont(new Font("osward",Font.BOLD,19));
     person.setForeground(new Color(25,25,112));
     add(person);
     
     price=new JLabel("Price");
     price.setBounds(10,360,100,30);
     price.setFont(new Font("osward",Font.BOLD,19));
     price.setForeground(new Color(25,25,112));
     add(price);
     
     
      //usertext
     usertext=new JLabel();
     usertext.setBounds(200,60,200,30);
     usertext.setForeground(Color.blue);
     usertext.setFont(new Font("raleway",Font.PLAIN,19));
     add(usertext);
        
     //nametext
     nametext=new JLabel();
     nametext.setBounds(200,120,200,30);
     nametext.setForeground(Color.blue);
     nametext.setFont(new Font("raleway",Font.PLAIN,19));
     add(nametext);
     
     //phonetext
     phonetext=new JLabel();
     phonetext.setBounds(200,180,200,30);
     phonetext.setForeground(Color.blue);
     phonetext.setFont(new Font("raleway",Font.PLAIN,19));
     add(phonetext);
     
     //packtext 
     packtext=new JLabel();
     packtext.setBounds(200,240,200,30);
     packtext.setForeground(Color.blue);
     packtext.setFont(new Font("raleway",Font.PLAIN,19));
     packtext.setBorder(BorderFactory.createEmptyBorder());
     add(packtext);
     
     
     //persontext 
     persontext=new JLabel();
     persontext.setBounds(200,300,200,30);
     persontext.setForeground(Color.blue);
     persontext.setFont(new Font("raleway",Font.PLAIN,19));
     persontext.setBorder(BorderFactory.createEmptyBorder());
     add(persontext);
     
     //pricepacktexttext
     pricetext=new JLabel();
     pricetext.setBounds(200,360,200,30);
     pricetext.setForeground(Color.blue);
     pricetext.setFont(new Font("raleway",Font.PLAIN,19));
     add(pricetext);
     
    
   
      //image
     ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("hotel1.jpg"));
     Image i2=i1.getImage().getScaledInstance(500, 650, Image.SCALE_DEFAULT);
     ImageIcon i3=new ImageIcon(i2);
     JLabel image=new JLabel(i3);
     image.setBounds(410,0,500,650);
     add(image);
     
     
      //image
     ImageIcon i4=new ImageIcon(ClassLoader.getSystemResource("dashboard.png"));
     Image i5=i4.getImage().getScaledInstance(300, 250, Image.SCALE_DEFAULT);
     ImageIcon i6=new ImageIcon(i5);
     JLabel image1=new JLabel(i6);
     image1.setBounds(30,420,300,150);
     add(image1);
    
    
     
    //back button
     back=new JButton("BACK");
     back.setBounds(135,600,100,30);
     back.setForeground(new Color(30,144,255));
     back.setBackground(new Color(135,206,250));
     back.setFont(new Font("osward",Font.BOLD,20));
     back.setBorder(BorderFactory.createEmptyBorder());
     back.addActionListener(this);
     add(back);        
        
  
   
     
   
    
      
     try{
    Conn c=new Conn();
    String query= "select * from Booking where Username = '"+Username+"'";
           
    ResultSet rs=c.s.executeQuery(query);
    while(rs.next())
    {
    usertext.setText(rs.getString("Username"));
    nametext.setText(rs.getString("Name"));
    phonetext.setText(rs.getString("Phone_Number"));
    packtext.setText(rs.getString("Package"));
    persontext.setText(rs.getString("Person"));
    pricetext.setText(rs.getString("Price"));
    }
    }catch(Exception e){
    e.printStackTrace();
    }   
    setSize(900,650);
    setLocation(250,100);
    setUndecorated(true);
    setVisible(true);
     
     
    }
    public void actionPerformed(ActionEvent ae){
      if(ae.getSource()==back)
      {
      setVisible(false);
      new Signin("");
      }
        
    }
    
public static void main(String [] args)
{

new ViewBookedPackage("");
}
    }
