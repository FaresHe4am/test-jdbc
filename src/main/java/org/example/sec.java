package org.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class sec {
    private static sec secu;
    private final String user = "root";
    private final String pass ="Fares123";
    private final String add = "jdbc:mysql://localhost:3307/employeee";
    private static Connection con;

    private sec() throws SQLException {
         con = DriverManager.getConnection(add,user,pass);
     }
    public static Connection connect () throws SQLException {
        if(null!= secu){
            return con;
        }
        else {
            secu = new sec();
            return con;
        }
    }
}

