
package travel.management.system;
 import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class Signup extends JFrame implements ActionListener{
  JLabel username,name,password,security,answer;
  JButton back,create;
  JTextField usernamefield,namefield,passwordfield,answerfield;
  Choice securityquestion; 
  //String Username;
   Signup(){
   //this.Username=Username;
   setLayout(null);
   getContentPane().setBackground(new Color(255,250,205));
   //signup image
    ImageIcon i4=new ImageIcon(ClassLoader.getSystemResource("signup.jpg"));
    Image i5=i4.getImage().getScaledInstance(500, 600, Image.SCALE_DEFAULT);
    ImageIcon i6=new ImageIcon(i5);
    JLabel image=new JLabel(i6);
    image.setBounds(450,0,600,600);
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
    name.setBounds(10,120,200,30);
    add(name);
    
    //password
    password =new JLabel("Password");
    password.setForeground(new Color(112,128,144));
    password.setFont(new Font("raleway",Font.BOLD,19));
    password.setBounds(10,170,200,30);
    add(password);
    
    //security
    security =new JLabel("Security Question");
    security.setForeground(new Color(112,128,144));
    security.setFont(new Font("raleway",Font.BOLD,19));
    security.setBounds(10,220,200,30);
    add(security);
    
    //answer
    answer =new JLabel("Answer");
    answer.setForeground(new Color(112,128,144));
    answer.setFont(new Font("raleway",Font.BOLD,19));
    answer.setBounds(10,270,200,30);
    add(answer);
    
    //usernamefield
    usernamefield=new JTextField();
    usernamefield.setBounds(260,70,190,30);
    usernamefield.setBackground(new Color(220,220,220));
    usernamefield.setFont(new Font("osward",Font.BOLD,18));
    add(usernamefield);
    
    //namefield
    namefield=new JTextField();
    namefield.setBounds(260,120,190,30);
    namefield.setBackground(new Color(220,220,220));
    namefield.setFont(new Font("osward",Font.BOLD,18));
    add(namefield);
    
    //passwordfield
    passwordfield=new JTextField();
    passwordfield.setBounds(260,170,190,30);
    passwordfield.setBackground(new Color(220,220,220));
    passwordfield.setFont(new Font("osward",Font.BOLD,18));
    add(passwordfield);
    
    //security
    securityquestion=new Choice();
    securityquestion.add("Your fav color");
    securityquestion.add("Your fav number");
    securityquestion.add("Your fav food");
    securityquestion.setBounds(260,220,190,30);
    securityquestion.setFont(new Font("system",Font.PLAIN,15));
    securityquestion.setBackground(new Color(220,220,220));
    add(securityquestion);
    
    //answerfield
    answerfield=new JTextField();
    answerfield.setBounds(260,270,190,30);
    answerfield.setBackground(new Color(220,220,220));
    answerfield.setFont(new Font("osward",Font.BOLD,18));
    add(answerfield);
    
    //create button
    create=new JButton("Create");
    create.setBounds(20,370,100,40);
    create.setBorder(BorderFactory.createEmptyBorder());
    create.setBackground(new Color(220,220,220));
    create.setFont(new Font("osward",Font.BOLD,25));
    create.setForeground(Color.white);
    add(create);
    create.addActionListener(this);
    
    //back button
    back=new JButton("Back");
    back.setBounds(150,370,100,40);
    back.setBorder(BorderFactory.createEmptyBorder());
    back.setBackground(new Color(220,220,220));
    back.setFont(new Font("osward",Font.BOLD,25));
    back.setForeground(Color.white);
    add(back);
    back.addActionListener(this);
    
    setSize(900,600);
    setLocation(300,100);
    setUndecorated(true);
    setVisible(true);
   } 
    
    public void actionPerformed(ActionEvent ae){
    if(ae.getSource()== create){
       
    String Username=usernamefield.getText();
    String Name=namefield.getText();
    String Password=passwordfield.getText();
    String SecurityQuestion=securityquestion.getSelectedItem();
    String SecurityAnswer=answerfield.getText();
    
    
   
     try{
          if(Username.equals("")){
        JOptionPane.showMessageDialog(null,"First fill all information");
        }else if(Name.equals("")){
        JOptionPane.showMessageDialog(null,"First fill all information");
        }else if(Password.equals("")){
        JOptionPane.showMessageDialog(null,"First fill all information");
        }else if(SecurityQuestion.equals("")){
        JOptionPane.showMessageDialog(null,"First fill all information");
        }else if(SecurityAnswer.equals("")){
        JOptionPane.showMessageDialog(null,"First fill all information");
        }else{
     Conn c=new Conn();
     String query="insert into account values('"+Username+"','"+Name+"','"+Password+"','"+SecurityQuestion+"','"+SecurityAnswer+"')";
     c.s.executeUpdate(query);
     JOptionPane.showMessageDialog(null,"Account Created Successfully");
     setVisible(false);
     new LoginPage();
        }
     }catch(Exception e){
     e.printStackTrace();
     }   
       
    }else if(ae.getSource()== back){
    setVisible(false);
    new LoginPage();
    }
    }
    public static void main(String [] args)
    {
    new Signup();
    }
}
