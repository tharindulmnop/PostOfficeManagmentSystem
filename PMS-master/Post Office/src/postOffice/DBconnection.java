/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package postOffice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Lakshan
 */
public class DBconnection {
   public static Connection connect(){
       Connection conn=null;
       try {
           
           Class.forName("com.mysql.jdbc.Driver");
           conn=(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/pms","root","123");
       } catch (ClassNotFoundException | SQLException e) {
           System.out.println(e.getMessage());
       }
       
       return conn;
       
   } 
    
}
