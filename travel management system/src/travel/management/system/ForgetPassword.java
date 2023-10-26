
package travel.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class ForgetPassword extends JFrame implements ActionListener{
    
    JLabel username,name,password,security,answer,namelabel,passwordlabel,securitylabel;
    JButton search,retrieve,back;
    JTextField usertext,answertext;
  
    
    ForgetPassword(){
     
    setLayout(null);
    getContentPane().setBackground(new Color(230,230,250));
    
    //image
    ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("login1.png"));
    Image i2=i1.getImage().getScaledInstance(400, 400,Image.SCALE_DEFAULT);
    ImageIcon i3=new ImageIcon(i2);
    JLabel image=new JLabel(i3);
    image.setBounds(580,30,400,400);
    add(image);
    
    //username
    username =new JLabel("Username");
    username.setForeground(new Color(112,128,144));
    username.setFont(new Font("raleway",Font.BOLD,19));
    username.setBounds(10,70,200,30);
    add(username);
    
    //name
    name =new JLabel("Name");
    name.setForeground(new Color(112,128,144));
    name.setFont(new Font("raleway",Font.BOLD,19));
    name.setBounds(10,140,200,30);
    add(name);
    
    //security
    security =new JLabel("Security Question");
    security.setForeground(new Color(112,128,144));
    security.setFont(new Font("raleway",Font.BOLD,19));
    security.setBounds(10,210,200,30);
    add(security);
    
    //securitylabel
    securitylabel =new JLabel();
    securitylabel.setForeground(new Color(72,61,139));
    securitylabel.setFont(new Font("raleway",Font.BOLD,19));
    securitylabel.setBounds(250,210,1000,30);
    add(securitylabel);
    
    //answer
    answer =new JLabel("Answer");
    answer.setForeground(new Color(112,128,144));
    answer.setFont(new Font("raleway",Font.BOLD,19));
    answer.setBounds(10,280,200,30);
    add(answer);
    
    //answertext
    answertext=new JTextField();
    answertext.setForeground(new Color(72,61,139));
    answertext.setFont(new Font("raleway",Font.BOLD,19));
    answertext.setBounds(250,280,200,30);
    add(answertext);
    
    //password
    password =new JLabel("Password");
    password.setForeground(new Color(112,128,144));
    password.setFont(new Font("raleway",Font.BOLD,19));
    password.setBounds(10,350,200,30);
    add(password);
    
    //passwordlabel
    passwordlabel =new JLabel();
    passwordlabel.setForeground(new Color(72,61,139));
    passwordlabel.setFont(new Font("raleway",Font.BOLD,19));
    passwordlabel.setBounds(250,350,200,30);
    add(passwordlabel);
    
    //usertext
    usertext=new JTextField();
    usertext.setForeground(new Color(72,61,139));
    usertext.setFont(new Font("raleway",Font.BOLD,19));
    usertext.setBounds(250,70,200,30);
    add(usertext);
    
    //namelabel
    namelabel =new JLabel();
    namelabel.setForeground(new Color(72,61,139));
    namelabel.setFont(new Font("raleway",Font.BOLD,19));
    namelabel.setBounds(250,140,200,30);
    add(namelabel);
    
    
    //search button
    search=new JButton("Search");
    search.setForeground(Color.white);
    search.setBackground(new Color(112,128,144));
    search.setBounds(460,70,100,30);
    search.setFont(new Font("raleway",Font.BOLD,15));
    search.addActionListener(this);
    add(search);
    
    //retrieve button
    retrieve=new JButton("Retrieve");
    retrieve.setForeground(Color.white);
    retrieve.setBackground(new Color(112,128,144));
    retrieve.setBounds(460,280,100,30);
    retrieve.setFont(new Font("raleway",Font.BOLD,15));
    retrieve.addActionListener(this);
    add(retrieve);
    
    //back button
    back=new JButton("Login");
    back.setForeground(Color.white);
    back.setBackground(new Color(112,128,144));
    back.setBounds(250,410,100,30);
    back.setFont(new Font("raleway",Font.BOLD,15));
    back.addActionListener(this);
    add(back);
    
    setSize(1000,500);
    setLocation(300,100);
    setUndecorated(true);
    setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae){
    if(ae.getSource()== search){
    String query="select * from account where Username='"+usertext.getText()+"'";
    try{
    Conn c=new Conn();
    ResultSet rs= c.s.executeQuery(query);
    while(rs.next()){
    namelabel.setText(rs.getString("Name"));
    securitylabel.setText(rs.getString("SecurityQuestion"));
    }
    }catch(Exception e){
            e.printStackTrace();
            }
    }else if(ae.getSource()==retrieve){
    String query="select * from account where SecurityAnswer='"+answertext.getText()+"' AND Username='"+usertext.getText()+"'";
    try{
        Conn c=new Conn();
    ResultSet rs=c.s.executeQuery(query);
    while(rs.next()){
    passwordlabel.setText(rs.getString("Password"));
    }
    }catch(Exception e){
    e.printStackTrace();
    }
    }else{
    setVisible(false);
    new LoginPage();
    }
    }
    
    public static void main(String [] args){
    new ForgetPassword();
    }
}
