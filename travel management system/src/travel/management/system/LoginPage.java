
package travel.management.system;

import javax.swing.*;
import java.awt.*; 
import javax.swing.border.*;
import java.awt.event.*;
import java.sql.*;

public class LoginPage extends JFrame implements ActionListener{
   JTextField userfield;
   JPasswordField passwordfield;
   JButton signin,signup,cancel,forget;
   //String Username;
     
   
   LoginPage(){
   //this.Username=Username;
   setLayout(null);
    getContentPane().setBackground(Color.white);
    JPanel panel=new JPanel();
    panel.setBounds(0,0,450,600);
    panel.setBackground(Color.white);
    add(panel);
    
    //login image
    ImageIcon i4=new ImageIcon(ClassLoader.getSystemResource("login.jpg"));
    Image i5=i4.getImage().getScaledInstance(500, 600, Image.SCALE_DEFAULT);
    ImageIcon i6=new ImageIcon(i5);
    JLabel image1=new JLabel(i6);
    image1.setBounds(0,0,450,600);
    panel.add(image1);
    
    //login page image
    ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("travel.png"));
    Image i2=i1.getImage().getScaledInstance(600, 600, Image.SCALE_DEFAULT);
    ImageIcon i3=new ImageIcon(i2);
    JLabel image=new JLabel(i3);
    image.setBounds(450,6,600,600);
    add(image);
    
    //user textfield
    userfield=new JTextField();
    userfield.setBounds(230,215,228,50);
    userfield.setBackground(new Color(70,130,180));
    userfield.setFont(new Font("osward",Font.BOLD,22));
    userfield.setBorder(new LineBorder(new Color(70,130,180)));
    userfield.setForeground(Color.white);
    image1.add(userfield);
    
    //user passwordfield
    passwordfield=new JPasswordField();
    passwordfield.setBounds(230,339,228,50);
    passwordfield.setBackground(new Color(70,130,180));
    passwordfield.setFont(new Font("osward",Font.BOLD,22));
    passwordfield.setBorder(new LineBorder(new Color(70,130,180)));
    passwordfield.setForeground(Color.white);
    image1.add(passwordfield);
    
    //signin button
    signin=new JButton("Signin");
    signin.setBounds(50,450,100,30);
    signin.setBackground(new Color(70,130,180));
    signin.setForeground(Color.white);
    signin.setFont(new Font("system",Font.BOLD,16));
    signin.setBorder(new LineBorder(new Color(70,130,180)));
    signin.addActionListener(this);
    image1.add(signin);
    
    //signup button
    signup=new JButton("Signup");
    signup.setBounds(180,450,100,30);
    signup.setBackground(new Color(70,130,180));
    signup.setForeground(Color.white);
    signup.setFont(new Font("system",Font.BOLD,16));
    signup.setBorder(new LineBorder(new Color(70,130,180)));
    signup.addActionListener(this);
    image1.add(signup);
    
    //clear button
    cancel=new JButton("Cancel");
    cancel.setBounds(310,450,100,30);
    cancel.setBackground(new Color(70,130,180));
    cancel.setForeground(Color.white);
    cancel.setFont(new Font("system",Font.BOLD,16));
    cancel.setBorder(new LineBorder(new Color(70,130,180)));
    image1.add(cancel);
    cancel.addActionListener(this);
    
    //forget button
    forget=new JButton("Forget Password");
    forget.setBounds(140,510,200,30);
    forget.setBackground(new Color(70,130,180));
    forget.setForeground(Color.white);
    forget.setFont(new Font("system",Font.BOLD,16));
    forget.setBorder(new LineBorder(new Color(70,130,180)));
    forget.addActionListener(this);
    image1.add(forget);
    
    //trouble label
    JLabel trouble=new JLabel("Trouble in signing....");
    trouble.setBounds(160,550,400,30);
    trouble.setFont(new Font("osward",Font.PLAIN,18));
    trouble.setForeground(Color.red);
    image1.add(trouble);
    
    
    setSize(900,600);
    setLocation(300,100);
    setUndecorated(true);
    setVisible(true);
    
    
} 
public void actionPerformed(ActionEvent ae){
    if(ae.getSource()== cancel){
    setVisible(false);
    System.exit(0);
    }else if(ae.getSource()==signup){
    setVisible(false);
    new Signup();
    }
    else if(ae.getSource()== signin){
            Conn c=new Conn();
            String Username= userfield.getText();
            String pass=passwordfield.getText();
            if(Username.equals("")){
            JOptionPane.showMessageDialog(null, "Username is required");
            }else if(pass.equals("")){
            JOptionPane.showMessageDialog(null, "Password is required");
            }else{
            String query= "select * from account where Username= '"+Username+"' AND Password= '"+pass+"' ";
            try{
                
            ResultSet rs= c.s.executeQuery(query);
            if(rs.next())
            {
            setVisible(false);
            new Signin(Username).setVisible(true);
            
            }else{
            JOptionPane.showMessageDialog(null, "Incorrect Username or Password");
            userfield.setText("");
            passwordfield.setText("");
            }
            }catch(Exception e)
            {
            System.out.println(e);
            }
            
            }
    }else{
    setVisible(false);
    new ForgetPassword();
    }
    }
        public static void main(String [] args){
                new LoginPage();
}}

    
