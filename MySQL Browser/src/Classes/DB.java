/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Prabhashitha
 */
public class DB {

    private static Connection c;
    public static String hostname;
    public static String port;
    public static String username;
    public static String password;
    
    public static Connection getConnection() throws Exception {
        Class.forName("com.mysql.jdbc.Driver");
        c = DriverManager.getConnection("jdbc:mysql://'" + hostname + "':'" + port + "'/", "'" + username + "'", "'" + password + "'");

        return c;
    }

}
