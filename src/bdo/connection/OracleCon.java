/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bdo.connection;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author windows
 */
public class OracleCon {
    
    private static Connection con;
    private OracleCon()
    {
        try {
                Class.forName("oracle.jdbc.driver.OracleDriver");
                String url = "jdbc:oracle:thin:@localhost:1521:BDDTP";
                con = DriverManager.getConnection(url, "sys as sysdba", "oracle2019");
                System.out.println("oracle ok");
              
                
            } catch (Exception ex) {
               System.out.println(ex.getMessage()+"ex");
            }      
        }
 
    private static OracleCon base = new OracleCon();
    
    public static Connection getConnexion()
    {
        return con;
    }
    
    public static OracleCon getInstance()
    {
        return base;
    }

    
}
