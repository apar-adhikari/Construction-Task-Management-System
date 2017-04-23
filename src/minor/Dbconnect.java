/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minor;

/**
 *
 * @author Bikash
 */
import java.sql.*;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;



public class Dbconnect {
     
    public Connection con;
    public static void main(String[] args) {
    /*    try{
             Connection con; //connection db with java
             Statement stmt; //insert data from java to mysql
             Class.forName("com.mysql.jdbc.Driver");//driver load
             String str=("jdbc:mysql://127.0.0.1:3306/minor");//path of db
             con=DriverManager.getConnection(str,"root","");
             stmt=con.createStatement();
             ResultSet rs = stmt.executeQuery("Select * from register");
             
             while(rs.next())
             {
                 String name = rs.getString("firstname");
                 System.out.println(name);
             }
             
             
         
          
    }
    catch(Exception e){
}
        */
           
           
     }
     
     public void connect()
     {
        try {
            //connection db with java
            Statement stmt; //insert data from java to mysql
            Class.forName("com.mysql.jdbc.Driver");//driver load
            String str=("jdbc:mysql://127.0.0.1:3306/minor");//path of db
            con=DriverManager.getConnection(str,"root","");
            stmt=con.createStatement();
            
            /*ResultSet rs = stmt.executeQuery("Select * from register");
            
            while(rs.next())
            {
            String name = rs.getString("firstname");
            System.out.println(name);
            }
            */
        } catch (Exception e) {
            Logger.getLogger(Dbconnect.class.getName()).log(Level.SEVERE, null, e);
        }
     
              
    }
     
}
