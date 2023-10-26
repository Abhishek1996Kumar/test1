
package travel.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class Signin extends JFrame implements ActionListener{
    
    JButton close,AddPersonalDetails,UpdatePersonalDetails,ViewDetails,DeleteDetails,CheckPackage,BookPackage,ViewPackage,ViewHotel,BookHotel,ViewBookedHotel,Destination,Payments,Calculator,Notepad,About;
    String Username;
    Signin(String Username){
        this.Username=Username;
        System.out.println("signin.java username= "+this.Username);
    setLayout(null);
    getContentPane().setBackground(new Color(64,224,208));
    
    JPanel panel1=new JPanel();
    panel1.setBounds(0,0,1600,100);
    panel1.setBackground(new Color(25,25,112));
    panel1.setLayout(null);
    add(panel1);
    
    
    JPanel panel2=new JPanel();
    panel2.setBounds(0,100,250,900);
    panel2.setBackground(new Color(64,224,208));
    panel2.setLayout(null);
    add(panel2);
    
    
    //image
    ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("logo1.png"));
    Image i2= i1.getImage().getScaledInstance(150, 90,Image.SCALE_DEFAULT);
    ImageIcon i3=new ImageIcon(i2);
    JLabel image=new JLabel(i3);
    image.setBounds(5,2,200,90);
    panel1.add(image);
    
    //image
    ImageIcon i4=new ImageIcon(ClassLoader.getSystemResource("vene.jpg"));
    Image i5= i4.getImage().getScaledInstance(1650, 849,Image.SCALE_DEFAULT);
    ImageIcon i6=new ImageIcon(i5);
    JLabel image1=new JLabel(i6);
    image1.setBounds(0,0,1650,849);
    add(image1);
    
    //JLabel travel
    JLabel travel=new JLabel("TRAVELITE");
    travel.setBounds(670,30,1000,50);
    travel.setForeground(Color.white);
    travel.setFont(new Font("algerian",Font.BOLD,60));
    panel1.add(travel);
    
    
    //AddPersonalDetails buttons
    AddPersonalDetails = new JButton("Add Personal Details");
    AddPersonalDetails.setBounds(0,0,300,50);
    AddPersonalDetails.setForeground(Color.white);
    AddPersonalDetails.setFont(new Font("osward",Font.BOLD,20));
    AddPersonalDetails.setBackground(new Color(25,25,112));
    AddPersonalDetails.setMargin(new Insets(0,0,0,60));
    AddPersonalDetails.addActionListener(this);
    panel2.add(AddPersonalDetails);
    
 
    //UpdatePersonalDetails buttons
    UpdatePersonalDetails = new JButton("Update Personal Details");
    UpdatePersonalDetails.setBounds(0,50,300,50);
    UpdatePersonalDetails.setForeground(Color.white);
    UpdatePersonalDetails.setFont(new Font("osward",Font.BOLD,20));
    UpdatePersonalDetails.setBackground(new Color(25,25,112));
    UpdatePersonalDetails.setMargin(new Insets(0,0,0,60));
    UpdatePersonalDetails.addActionListener(this);
    panel2.add(UpdatePersonalDetails);
    
    //ViewDetails button
    ViewDetails = new JButton("View Details");
    ViewDetails.setBounds(0,100,300,50);
    ViewDetails.setForeground(Color.white);
    ViewDetails.setFont(new Font("osward",Font.BOLD,20));
    ViewDetails.setBackground(new Color(25,25,112));
    ViewDetails.setMargin(new Insets(0,0,0,60));
    ViewDetails.addActionListener(this);
    panel2.add(ViewDetails);
    
    //DeleteDetails button
    DeleteDetails = new JButton("Delete Details");
    DeleteDetails.setBounds(0,150,300,50);
    DeleteDetails.setForeground(Color.white);
    DeleteDetails.setFont(new Font("osward",Font.BOLD,20));
    DeleteDetails.setBackground(new Color(25,25,112));
    DeleteDetails.setMargin(new Insets(0,0,0,60));
    DeleteDetails.addActionListener(this);
    panel2.add(DeleteDetails);
    
    //CheckPackage button
    CheckPackage = new JButton("Check Package");
    CheckPackage.setBounds(0,200,300,50);
    CheckPackage.setForeground(Color.white);
    CheckPackage.setFont(new Font("osward",Font.BOLD,20));
    CheckPackage.setBackground(new Color(25,25,112));
    CheckPackage.setMargin(new Insets(0,0,0,60));
    CheckPackage.addActionListener(this);
    panel2.add(CheckPackage);
    
    //BookPackage button
    BookPackage = new JButton("Book Package");
    BookPackage.setBounds(0,250,300,50);
    BookPackage.setForeground(Color.white);
    BookPackage.setFont(new Font("osward",Font.BOLD,20));
    BookPackage.setBackground(new Color(25,25,112));
    BookPackage.setMargin(new Insets(0,0,0,60));
    BookPackage.addActionListener(this);
    panel2.add(BookPackage);
    
    //ViewPackage button
    ViewPackage = new JButton("View Package");
    ViewPackage.setBounds(0,300,300,50);
    ViewPackage.setForeground(Color.white);
    ViewPackage.setFont(new Font("osward",Font.BOLD,20));
    ViewPackage.setBackground(new Color(25,25,112));
    ViewPackage.setMargin(new Insets(0,0,0,60));
    ViewPackage.addActionListener(this);
    panel2.add(ViewPackage);
    
    //ViewHotel button
    ViewHotel = new JButton("View Hotel");
    ViewHotel.setBounds(0,350,300,50);
    ViewHotel.setForeground(Color.white);
    ViewHotel.setFont(new Font("osward",Font.BOLD,20));
    ViewHotel.setBackground(new Color(25,25,112));
    ViewHotel.setMargin(new Insets(0,0,0,60));
    ViewHotel.addActionListener(this);
    panel2.add(ViewHotel);
    
    //BookHotel button
    BookHotel = new JButton("Book Hotel");
    BookHotel.setBounds(0,400,300,50);
    BookHotel.setForeground(Color.white);
    BookHotel.setFont(new Font("osward",Font.BOLD,20));
    BookHotel.setBackground(new Color(25,25,112));
    BookHotel.setMargin(new Insets(0,0,0,60));
    BookHotel.addActionListener(this);
    panel2.add(BookHotel);
    
    //ViewBookedHotel button
    ViewBookedHotel = new JButton("View Booked Hotel");
    ViewBookedHotel.setBounds(0,450,300,50);
    ViewBookedHotel.setForeground(Color.white);
    ViewBookedHotel.setFont(new Font("osward",Font.BOLD,20));
    ViewBookedHotel.setBackground(new Color(25,25,112));
    ViewBookedHotel.setMargin(new Insets(0,0,0,60));
    ViewBookedHotel.addActionListener(this);
    panel2.add(ViewBookedHotel);
    
    //Destination button
    Destination = new JButton("Destination");
    Destination.setBounds(0,500,300,50);
    Destination.setForeground(Color.white);
    Destination.setFont(new Font("osward",Font.BOLD,20));
    Destination.setBackground(new Color(25,25,112));
    Destination.setMargin(new Insets(0,0,0,60));
    Destination.addActionListener(this);
    panel2.add(Destination);
    
    //Payments button
    Payments = new JButton("Payments");
    Payments.setBounds(0,550,300,50);
    Payments.setForeground(Color.white);
    Payments.setFont(new Font("osward",Font.BOLD,20));
    Payments.setBackground(new Color(25,25,112));
    Payments.setMargin(new Insets(0,0,0,60));
    Payments.addActionListener(this);
    panel2.add(Payments);
    
    //Calculator button
    Calculator = new JButton("Calculator");
    Calculator.setBounds(0,600,300,50);
    Calculator.setForeground(Color.white);
    Calculator.setFont(new Font("osward",Font.BOLD,20));
    Calculator.setBackground(new Color(25,25,112));
    Calculator.setMargin(new Insets(0,0,0,60));
    Calculator.addActionListener(this);
    panel2.add(Calculator);
    
    //Notepad button
    Notepad = new JButton("Notepad");
    Notepad.setBounds(0,650,300,50);
    Notepad.setForeground(Color.white);
    Notepad.setFont(new Font("osward",Font.BOLD,20));
    Notepad.setBackground(new Color(25,25,112));
    Notepad.setMargin(new Insets(0,0,0,60));
    Notepad.addActionListener(this);
    panel2.add(Notepad);
    
    //About button
    About = new JButton("About");
    About.setBounds(0,700,300,50);
    About.setForeground(Color.white);
    About.setFont(new Font("osward",Font.BOLD,20));
    About.setBackground(new Color(25,25,112));
    About.setMargin(new Insets(0,0,0,60));
    About.addActionListener(this);
    panel2.add(About);
    
    
    //close buttons
    close = new JButton("Close");
    close.setBounds(1450,70,100,30);
    close.setForeground(Color.white);
    close.setFont(new Font("osward",Font.BOLD,20));
    close.setBackground(new Color(25,25,112));
    close.setBorder(BorderFactory.createEmptyBorder());
    close.addActionListener(this);
    panel1.add(close);
    
    setExtendedState(JFrame.MAXIMIZED_BOTH);
    setUndecorated(true);
    setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae){
     if(ae.getSource()== close){
     System.exit(0);
     }else if(ae.getSource()==AddPersonalDetails){
     new AddPersonalDetails(Username);
     }else if(ae.getSource()==ViewDetails){
     new ViewDetails(Username);
     }else if(ae.getSource()==UpdatePersonalDetails){
     new UpdateDetails(Username);
     }else if(ae.getSource()==CheckPackage){
         new CheckPackage(Username);
     }else if(ae.getSource()==BookPackage){
         new BookPackage(Username);
     }else if(ae.getSource()==ViewPackage){
         new ViewBookedPackage(Username);
     }
    
    
    }
    
    public static void main(String [] args){
    new Signin("");
    }
    }
