/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Factory;

/**
 *
 * @author lucas
 */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
    public Connection getConnection(){
        try {
            return DriverManager.getConnection("jdbc:mysql://localhost/PCI_v2", "root", "");
         
        }
        catch(SQLException excecao){
            throw new RuntimeException(excecao);
        
        }
    }
    
}
