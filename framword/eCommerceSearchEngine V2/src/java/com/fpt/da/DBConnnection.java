/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fpt.da;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author dominhduc
 */
public class DBConnnection {
    private static Connection connection;
    public Connection getConnection() throws ClassNotFoundException,
            SQLException{
        if(connection == null){
            Class.forName("org.apache.derby.jdbc.ClientDriver");
            connection = 
                    DriverManager.getConnection("jdbc:derby://localhost:1527/Producst", "sa", "sa");
        }
        return connection;
    }
   
}
