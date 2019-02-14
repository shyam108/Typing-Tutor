/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package typingdbutil;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author Shayam
 */
public class Dbconnection {
    
    
    
    
     private static Connection conn;
    static
    {
//        connection code
        
        try
        {
            Class.forName("oracle.jdbc.OracleDriver");
            conn=DriverManager.getConnection("jdbc:oracle:thin:@//DESKTOP-7UA6Q8N:1521/xe","system","abcde");
            JOptionPane.showMessageDialog(null,"Connected Successfully");
            
        }
        
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,"Error in Connection shyam");
        }
    }
    public static Connection getConnection()
    {
        return conn;
    }
     public static void closeConnection ()
    {
       try
       {
           conn.close();
           JOptionPane.showMessageDialog(null,"Disconnected successfully");
           
       }
       catch(Exception e)
       {
           e.printStackTrace();
           JOptionPane.showMessageDialog(null,"cannot close connection");
       }

    
}
}
