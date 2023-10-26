
package travel.management.system;

import javax.swing.*;
import java.awt.*;
import java.sql.*;
import java.awt.event.*;

public class UpdateDetails extends JFrame implements ActionListener{
    
    JLabel username,name,usernamelabel,namelabel,id,number,gender,country,address,phone,email;
    JTextField idfield,numberfield,genderfield,countryfield,addressfield,phonefield,emailfield;
    JButton update,back;
    String Username;
    UpdateDetails(String Username){
        this.Username=Username;
    setLayout(null);
    getContentPane().setBackground(new Color(221,160,221));   
    
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
     usernamelabel.setBounds(200,30,200,30);
     usernamelabel.setFont(new Font("osward",Font.BOLD,19));
     usernamelabel.setForeground(new Color(25,25,112));
     add(usernamelabel);
     
     //name
     namelabel=new JLabel();
     namelabel.setBounds(200,90,200,30);
     namelabel.setFont(new Font("osward",Font.BOLD,19));
     namelabel.setForeground(new Color(25,25,112));
     add(namelabel);
     
     //id
     idfield=new JTextField();
     idfield.setBounds(200,150,200,30);
     idfield.setFont(new Font("osward",Font.BOLD,19));
     idfield.setForeground(new Color(25,25,112));
     add(idfield);
     
     
     //number
     numberfield=new JTextField();
     numberfield.setBounds(200,210,200,30);
     numberfield.setFont(new Font("osward",Font.BOLD,19));
     numberfield.setForeground(new Color(25,25,112));
     add(numberfield);
    
     //gender
     genderfield=new JTextField();
     genderfield.setBounds(200,270,200,30);
     genderfield.setFont(new Font("osward",Font.BOLD,19));
     genderfield.setForeground(new Color(25,25,112));
     add(genderfield);
    
     //country
     countryfield=new JTextField();
     countryfield.setBounds(200,330,200,30);
     countryfield.setFont(new Font("osward",Font.BOLD,19));
     countryfield.setForeground(new Color(25,25,112));
     add(countryfield);
     
     //address
     addressfield=new JTextField();
     addressfield.setBounds(200,390,200,30);
     addressfield.setFont(new Font("osward",Font.BOLD,19));
     addressfield.setForeground(new Color(25,25,112));
     add(addressfield);
     
     
     //phone
     phonefield=new JTextField();
     phonefield.setBounds(200,450,200,30);
     phonefield.setFont(new Font("osward",Font.BOLD,19));
     phonefield.setForeground(new Color(25,25,112));
     add(phonefield);
     
     
     //email
     emailfield=new JTextField();
     emailfield.setBounds(200,510,200,30);
     emailfield.setFont(new Font("osward",Font.BOLD,19));
     emailfield.setForeground(new Color(25,25,112));
     add(emailfield);
     
     
    
    //update Buttons
     update=new JButton("UPDATE");
     update.setBounds(10,600,100,30);
     update.setForeground(new Color(30,144,255));
     update.setBackground(new Color(135,206,250));
     update.setFont(new Font("osward",Font.BOLD,20));
     update.setBorder(BorderFactory.createEmptyBorder());
     update.addActionListener(this);
     add(update);
     
     //back button
     back=new JButton("BACK");
     back.setBounds(250,600,100,30);
     back.setForeground(new Color(30,144,255));
     back.setBackground(new Color(135,206,250));
     back.setFont(new Font("osward",Font.BOLD,20));
     back.setBorder(BorderFactory.createEmptyBorder());
     back.addActionListener(this);
     add(back);    
     
     //image
     ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("air.png"));
     Image i2=i1.getImage().getScaledInstance(500, 650, Image.SCALE_DEFAULT);
     ImageIcon i3=new ImageIcon(i2);
     JLabel image=new JLabel(i3);
     image.setBounds(410,0,500,650);
     add(image);
      
     
     try{
     Conn c=new Conn();
     ResultSet rs=c.s.executeQuery("select * from Details where Username='"+Username+"'");
     while(rs.next())
     {
     usernamelabel.setText(rs.getString("Username"));
     namelabel.setText(rs.getString("Name"));
     idfield.setText(rs.getString("ID"));
     numberfield.setText(rs.getString("ID_Number"));
     genderfield.setText(rs.getString("Gender"));
     countryfield.setText(rs.getString("Country"));
     addressfield.setText(rs.getString("Address"));
     phonefield.setText(rs.getString("Phone_Number"));
     emailfield.setText(rs.getString("Email"));
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
    }else if(ae.getSource()== update){
    try{
    String user=usernamelabel.getText();
    String name=namelabel.getText();
    String id=idfield.getText();
    String idnumber=numberfield.getText();
    String gender=genderfield.getText();
    String country=countryfield.getText();
    String address=addressfield.getText();
    String phone=phonefield.getText();
    String email=emailfield.getText();
    
    Conn c=new Conn();
    c.s.executeUpdate("update Details set Username='"+user+"',Name='"+name+"',ID='"+id+"',ID_Number='"+idnumber+"',Gender='"+gender+"',Country='"+country+"',Address='"+address+"',Phone_Number='"+phone+"',Email='"+email+"'");
    JOptionPane.showMessageDialog(null, "Details Updated successfully");
    setVisible(false);
    
    }catch(Exception e){
    e.printStackTrace();
    }
    }
    }

public static void main(String [] args){
new UpdateDetails("");
}
}




