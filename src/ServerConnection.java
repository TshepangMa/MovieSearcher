
import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.logging.Level;
import java.util.logging.Logger;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tshep
 */

/**.
  Class for connection 
 */

public class ServerConnection {
    
    
    
   public static Connection getConnection() {
   
        Connection con = null;
       try {
           Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
           con = DriverManager.getConnection("jdbc:sqlserver://DESKTOP-Q19MT48:1433;databaseName=Movies;user=tshepang;password=Tshepang@1234567;");
        } catch (Exception ex) {
           System.out.println(ex.getMessage());
        }
       return con;
       
   }
   
   Connection con = null;
   void close() {
        try {
            if (con != null) {
                con.close();
            }

        } catch (SQLException ex) {
            System.out.println(ex);
        }
   }
   
}