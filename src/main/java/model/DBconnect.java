
package model;

import java.sql.Connection;
import java.sql.DriverManager;


public class DBconnect {
    Connection con;
    public void connect(){
    

            try {
                String url = "jdbc:mysql://localhost/tutora";
                String user1 = "root";
                String pass = "";
                con = DriverManager.getConnection(url, user1, pass);

                System.out.println("CONNECTED!");
                
                
                 } catch (Exception ex) {

                System.err.println("Error" + ex.getMessage());

            }
                
}
    
    
    
    
}
