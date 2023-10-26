
package travel.management.system;

import javax.swing.*;
import java.awt.*;
import java.sql.*;
import java.awt.event.*;

public class ViewDetails extends JFrame implements ActionListener{
    
    String Username;
    JLabel username,name,id,number,gender,country,address,phone,email,usernamelabel,namelabel,idlabel,numberlabel,genderlabel,countrylabel,addresslabel,phonelabel,emaillabel;
    JButton back;
    ViewDetails(String Username){
        this.Username=Username;
    setLayout(null);
    getContentPane().setBackground(new Color(221,160,221));   
    
    
    //image
     ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("road.png"));
     Image i2=i1.getImage().getScaledInstance(500, 650, Image.SCALE_DEFAULT);
     ImageIcon i3=new ImageIcon(i2);
     JLabel image=new JLabel(i3);
     image.setBounds(410,0,500,650);
     add(image);
    
    //username
     username=new JLabel("Username");
     username.setBounds(10,30,100,30);
     username.setFont(new Font("osward",Font.BOLD,19));
     username.setForeground(new Color(25,25,112));
     add(username);
     
     //name
     name=new JLabel("Name");
     name.setBounds(10,90,100,30);
     name.setFont(new Font("osward",Font.BOLD,19));
     name.setForeground(new Color(25,25,112));
     add(name);
     
     //id
     id=new JLabel("ID");
     id.setBounds(10,150,100,30);
     id.setFont(new Font("osward",Font.BOLD,19));
     id.setForeground(new Color(25,25,112));
     add(id);
     
     
     //number
     number=new JLabel("ID Number");
     number.setBounds(10,210,100,30);
     number.setFont(new Font("osward",Font.BOLD,19));
     number.setForeground(new Color(25,25,112));
     add(number);
    
     //gender
     gender=new JLabel("Gender");
     gender.setBounds(10,270,100,30);
     gender.setFont(new Font("osward",Font.BOLD,19));
     gender.setForeground(new Color(25,25,112));
     add(gender);
    
     //country
     country=new JLabel("Country");
     country.setBounds(10,330,100,30);
     country.setFont(new Font("osward",Font.BOLD,19));
     country.setForeground(new Color(25,25,112));
     add(country);
     
     //address
     address=new JLabel("Address");
     address.setBounds(10,390,100,30);
     address.setFont(new Font("osward",Font.BOLD,19));
     address.setForeground(new Color(25,25,112));
     add(address);
     
     
     //phone
     phone=new JLabel("Phone");
     phone.setBounds(10,450,100,30);
     phone.setFont(new Font("osward",Font.BOLD,19));
     phone.setForeground(new Color(25,25,112));
     add(phone);
     
     
     //email
     email=new JLabel("Email");
     email.setBounds(10,510,100,30);
     email.setFont(new Font("osward",Font.BOLD,19));
     email.setForeground(new Color(25,25,112));
     add(email);
     
     
     //usernamelabel
     usernamelabel=new JLabel();
     usernamelabel.setBounds(200,30,100,30);
     usernamelabel.setFont(new Font("osward",Font.BOLD,19));
     usernamelabel.setForeground(new Color(25,25,112));
     add(usernamelabel);
     
     //name
     namelabel=new JLabel();
     namelabel.setBounds(200,90,100,30);
     namelabel.setFont(new Font("osward",Font.BOLD,19));
     namelabel.setForeground(new Color(25,25,112));
     add(namelabel);
     
     //id
     idlabel=new JLabel();
     idlabel.setBounds(200,150,100,30);
     idlabel.setFont(new Font("osward",Font.BOLD,19));
     idlabel.setForeground(new Color(25,25,112));
     add(idlabel);
     
     
     //number
     numberlabel=new JLabel();
     numberlabel.setBounds(200,210,100,30);
     numberlabel.setFont(new Font("osward",Font.BOLD,19));
     numberlabel.setForeground(new Color(25,25,112));
     add(numberlabel);
    
     //gender
     genderlabel=new JLabel();
     genderlabel.setBounds(200,270,100,30);
     genderlabel.setFont(new Font("osward",Font.BOLD,19));
     genderlabel.setForeground(new Color(25,25,112));
     add(genderlabel);
    
     //country
     countrylabel=new JLabel();
     countrylabel.setBounds(200,330,100,30);
     countrylabel.setFont(new Font("osward",Font.BOLD,19));
     countrylabel.setForeground(new Color(25,25,112));
     add(countrylabel);
     
     //address
     addresslabel=new JLabel();
     addresslabel.setBounds(200,390,100,30);
     addresslabel.setFont(new Font("osward",Font.BOLD,19));
     addresslabel.setForeground(new Color(25,25,112));
     add(addresslabel);
     
     
     //phone
     phonelabel=new JLabel();
     phonelabel.setBounds(200,450,100,30);
     phonelabel.setFont(new Font("osward",Font.BOLD,19));
     phonelabel.setForeground(new Color(25,25,112));
     add(phonelabel);
     
     
     //email
     emaillabel=new JLabel();
     emaillabel.setBounds(200,510,100,30);
     emaillabel.setFont(new Font("osward",Font.BOLD,19));
     emaillabel.setForeground(new Color(25,25,112));
     add(emaillabel);
     
     //back button
     back=new JButton("BACK");
     back.setBounds(250,600,100,30);
     back.setForeground(new Color(30,144,255));
     back.setBackground(new Color(135,206,250));
     back.setFont(new Font("osward",Font.BOLD,20));
     back.setBorder(BorderFactory.createEmptyBorder());
     back.addActionListener(this);
     add(back);
    
     
     try{
     Conn c=new Conn();
     String query="Select * from Details where Username='"+Username+"'";
     ResultSet rs=c.s.executeQuery(query);
     while(rs.next()){
     usernamelabel.setText(rs.getString("Username"));
     namelabel.setText(rs.getString("Name"));
     idlabel.setText(rs.getString("ID"));
     numberlabel.setText(rs.getString("ID_Number"));
     genderlabel.setText(rs.getString("Gender"));
     countrylabel.setText(rs.getString("Country"));
     addresslabel.setText(rs.getString("Address"));
     phonelabel.setText(rs.getString("Phone_Number"));
     emaillabel.setText(rs.getString("Email"));
     }
     }catch(Exception e){
     
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
    }
    }
    public static void main(String [] args)
    {
    new ViewDetails("");
    }
}
