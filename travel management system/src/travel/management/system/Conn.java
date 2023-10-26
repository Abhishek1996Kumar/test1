
package travel.management.system;

import java.sql.*;

public class Conn {
    Connection c;
    Statement s;
  public Conn(){
    
      try{
      Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
      c=DriverManager.getConnection("jdbc:sqlserver://localhost;databaseName=travelmanagementsystem", "sa","niitpatna");
      s=c.createStatement(); 
    }catch(Exception e){
        
        System.out.println(e);
    }
  }
    
}
