
package travel.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class AddPersonalDetails extends JFrame implements ActionListener{
    
    JLabel username, usertext,nametext,name,id,number,gender,country,address,phone,email;
    JButton add,back;
    JTextField numberfield,countryfield,addressfield,phonefield,emailfield;
    Choice idchoice;
    JRadioButton male,female;
    String Username;
    AddPersonalDetails(String Username){
    this.Username=Username;
     setLayout(null);   
     getContentPane().setBackground(new Color(221,160,221));    
     
     username=new JLabel("Username");
     username.setBounds(10,30,100,30);
     username.setFont(new Font("osward",Font.BOLD,19));
     username.setForeground(new Color(25,25,112));
     add(username);
     
     name=new JLabel("Name");
     name.setBounds(10,90,100,30);
     name.setFont(new Font("osward",Font.BOLD,19));
     name.setForeground(new Color(25,25,112));
     add(name);
     
     id=new JLabel("ID");
     id.setBounds(10,150,100,30);
     id.setFont(new Font("osward",Font.BOLD,19));
     id.setForeground(new Color(25,25,112));
     add(id);
     
     number=new JLabel("ID Number");
     number.setBounds(10,210,100,30);
     number.setFont(new Font("osward",Font.BOLD,19));
     number.setForeground(new Color(25,25,112));
     add(number);
     
     gender=new JLabel("Gender");
     gender.setBounds(10,270,100,30);
     gender.setFont(new Font("osward",Font.BOLD,19));
     gender.setForeground(new Color(25,25,112));
     add(gender);
     
     country=new JLabel("Country");
     country.setBounds(10,330,100,30);
     country.setFont(new Font("osward",Font.BOLD,19));
     country.setForeground(new Color(25,25,112));
     add(country);
     
     address=new JLabel("Address");
     address.setBounds(10,390,100,30);
     address.setFont(new Font("osward",Font.BOLD,19));
     address.setForeground(new Color(25,25,112));
     add(address);
     
     phone=new JLabel("Phone");
     phone.setBounds(10,450,100,30);
     phone.setFont(new Font("osward",Font.BOLD,19));
     phone.setForeground(new Color(25,25,112));
     add(phone);
     
     email=new JLabel("Email");
     email.setBounds(10,510,100,30);
     email.setFont(new Font("osward",Font.BOLD,19));
     email.setForeground(new Color(25,25,112));
     add(email);
     
     //add Buttons
     add=new JButton("ADD");
     add.setBounds(10,600,100,30);
     add.setForeground(new Color(30,144,255));
     add.setBackground(new Color(135,206,250));
     add.setFont(new Font("osward",Font.BOLD,20));
     add.setBorder(BorderFactory.createEmptyBorder());
     add.addActionListener(this);
     add(add);
     
     //back button
     back=new JButton("BACK");
     back.setBounds(250,600,100,30);
     back.setForeground(new Color(30,144,255));
     back.setBackground(new Color(135,206,250));
     back.setFont(new Font("osward",Font.BOLD,20));
     back.setBorder(BorderFactory.createEmptyBorder());
     back.addActionListener(this);
     add(back);
     
     //usertext
     usertext=new JLabel();
     usertext.setBounds(200,30,200,30);
     usertext.setForeground(Color.blue);
     usertext.setFont(new Font("raleway",Font.PLAIN,19));
     add(usertext);
        
     //nametext
     nametext=new JLabel();
     nametext.setBounds(200,90,200,30);
     nametext.setForeground(Color.blue);
     nametext.setFont(new Font("raleway",Font.PLAIN,19));
     add(nametext);
        
     
     //id choice
     idchoice=new Choice();
     idchoice.add("Passport");
     idchoice.add("Aadhar Card");
     idchoice.add("PAN Card");
     idchoice.setBounds(200,150,200,30);
     idchoice.setForeground(Color.blue);
     idchoice.setFont(new Font("raleway",Font.PLAIN,19));
     add(idchoice);
     
     //id number
     numberfield=new JTextField();
     numberfield.setBounds(200,210,200,30);
     numberfield.setForeground(Color.blue);
     numberfield.setFont(new Font("raleway",Font.PLAIN,19));
     numberfield.setBorder(BorderFactory.createEmptyBorder());
     add(numberfield);
     
     //gender
       male=new JRadioButton("Male");
       female=new JRadioButton("Female");
 
       ButtonGroup genderGroup=new ButtonGroup();
       genderGroup.add(male);
       genderGroup.add(female);
       
       male.setBounds(200,270,100,30);
       male.setBackground(new Color(221,160,221));
       male.setForeground(Color.blue);
       add(male);
       female.setBounds(300,270,100,30);
       female.setBackground(new Color(221,160,221));
       female.setForeground(Color.blue);
       add(female);
       
     //country
     countryfield=new JTextField();
     countryfield.setBounds(200,330,200,30);
     countryfield.setFont(new Font("osward",Font.BOLD,19));
     countryfield.setForeground(new Color(25,25,112));
     countryfield.setBorder(BorderFactory.createEmptyBorder());
     add(countryfield);
     
     //address
     addressfield=new JTextField();
     addressfield.setBounds(200,390,200,30);
     addressfield.setFont(new Font("osward",Font.BOLD,19));
     addressfield.setForeground(new Color(25,25,112));
     addressfield.setBorder(BorderFactory.createEmptyBorder());
     add(addressfield);
     
     
     //phone
     phonefield=new JTextField();
     phonefield.setBounds(200,450,200,30);
     phonefield.setFont(new Font("osward",Font.BOLD,19));
     phonefield.setForeground(new Color(25,25,112));
     phonefield.setBorder(BorderFactory.createEmptyBorder());
     add(phonefield);
     
     
     //email
     emailfield=new JTextField();
     emailfield.setBounds(200,510,200,30);
     emailfield.setFont(new Font("osward",Font.BOLD,19));
     emailfield.setForeground(new Color(25,25,112));
     emailfield.setBorder(BorderFactory.createEmptyBorder());
     add(emailfield);
     
     //image
     ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("family.png"));
     Image i2=i1.getImage().getScaledInstance(500, 650, Image.SCALE_DEFAULT);
     ImageIcon i3=new ImageIcon(i2);
     JLabel image=new JLabel(i3);
     image.setBounds(410,0,500,650);
     add(image);
     
     try{
         
     String user=usertext.getText();
     Conn c=new Conn();
     String query="select * from account where Username='"+Username+"' ";
     ResultSet rs=c.s.executeQuery(query);
     while(rs.next()){
     usertext.setText(rs.getString("Username"));
     nametext.setText(rs.getString("Name"));
     }
     }catch(Exception e){
     e.printStackTrace();
     }
     
    setSize(900,650);
    setLocation(250,100);
    setUndecorated(true);
    setVisible(true);
    }
    public void actionPerformed(ActionEvent ae)
    {
    if(ae.getSource()==back){
    setVisible(false);
    new Signin(Username);
    }  else if(ae.getSource()==add){
    String user=usertext.getText();
    String uname=nametext.getText();
    String id=idchoice.getSelectedItem();
    String number=numberfield.getText();
    String gender=(null);
    if(male.isSelected()){
    gender="Male";
    }else{
    gender="Female";
    }
    String country=countryfield.getText();
    String address=addressfield.getText();
    String phone=phonefield.getText();
    String email=emailfield.getText();
    try{
    if(user.equals(""))
    {
    JOptionPane.showMessageDialog(null,"All Informations are neccessary");
    }else if(uname.equals(""))
    {
    JOptionPane.showMessageDialog(null,"All Informations are neccessary");
    }else if(id.equals(""))
    {
    JOptionPane.showMessageDialog(null,"All Informations are neccessary");
    }else if(number.equals(""))
    {
    JOptionPane.showMessageDialog(null,"All Informations are neccessary");
    }else if(gender.equals(""))
    {
    JOptionPane.showMessageDialog(null,"All Informations are neccessary");
    }else if(country.equals(""))
    {
    JOptionPane.showMessageDialog(null,"All Informations are neccessary");
    }else if(address.equals(""))
    {
    JOptionPane.showMessageDialog(null,"All Informations are neccessary");
    }else if(phone.equals(""))
    {
    JOptionPane.showMessageDialog(null,"All Informations are neccessary");
    }else if(email.equals(""))
    {
    JOptionPane.showMessageDialog(null,"All Informations are neccessary");
    }else{
     
     Conn c=new Conn();
     String query="insert into Details values('"+ user+"','"+uname +"','"+ id+"','"+number+"','"+gender +"','"+country +"','"+address +"','"+ phone+"','"+email +"')";
     c.s.executeUpdate(query);
     JOptionPane.showMessageDialog(null,"Details Added Successfully");
     setVisible(false);
     }}catch(Exception e){
     e.printStackTrace();
     }
    }
    }  
    
 
    public static void main(String [] args)
    {
    new AddPersonalDetails("");
    }
}
