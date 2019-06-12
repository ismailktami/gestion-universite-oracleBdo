/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bdo;

import bdo.connection.OracleCon;
import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;
import oracle.jdbc.OracleTypes;
/**
 *
 * @author ORACLE
 */
public class test {
           public static void main(String args[]) throws SQLException {
                
        String deleteetudiant = 
        " declare " +  
        "    obj t_module := t_module(); "
         + 
        " begin " +
        "   ?:=obj.deleteemodule(?);" +
        "     commit;" +
        " end;";
         CallableStatement cs=null;
            cs = OracleCon.getInstance().getConnexion().prepareCall(deleteetudiant);
            cs.setString(1, "IA");
            cs.registerOutParameter(2, OracleTypes.NUMBER);
        cs.execute();
       
        cs.close();
      }
}
