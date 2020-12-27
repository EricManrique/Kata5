/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kata5;

import java.sql.*;

/**
 *
 * @author Ericç
 */
public class Kata5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        // TODO code application logic here
        Class.forName("org.sqlite.JDBC");
        Connection connection = DriverManager.getConnection("jdbc:sqlite:data/people.db");
        
        try (Statement statement = connection.createStatement()){
            ResultSet set = statement.executeQuery("SELECT + FROM people WHERE city ='Hamilton'");
            while (set.next()){
                String email = set.getString("email");
                System.out.println(email);
            }
        }
        
    }
    
}
