package org.example;

import java.sql.*;

/**
 * Hello world!
 *
 */
public class Main {
    public static void main( String[] args ) throws SQLException {
        // write your code here
        Connection myConn = null;
        Statement myStm = null;
        ResultSet myRs = null;

        try {
            // Get a connection to database
            myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/databaseName", "root", "root");

            // Create a statement

            myStm = myConn.createStatement();

            // Execute SQL query
            myRs = myStm.executeQuery("select * from x");

            // Process the result set

            while(myRs.next()) {
                System.out.println(myRs.getString("examble_name") + ", " + myRs.getString("example_firstName"));
            }
        } catch (Exception err) {
            err.printStackTrace();
        }
        finally {
            if(myRs != null){
                myRs.close();
            }
            if(myStm != null){
                myStm.close();
            }
        }
        }



}
