/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author zihad
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.*;
import javax.swing.*;
public class connectjava {
    
    Connection conn= null;
    
    public static Connection ConnecrDb(){
        try{
            Class.forName("org.sqlite.JDBC");
             Connection conn =DriverManager.getConnection("jdbc:sqlite:C:\\Users\\Aavi Jit\\Desktop\\ProjectS\\nstuBlood.sqlite");
            
            //JOptionPane.showMessageDialog(null, "Connection Established");
            
            return conn;
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
            return null;
        }
    }
        
    
    
}