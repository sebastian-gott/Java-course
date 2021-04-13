package database;


import java.sql.*;



public class DatabaseConnection {


    static String dbUrl = "jdbc:mysql://itfag.usn.no/233574";
    static String user = "233574";
    static String pass = "JWeiMrF0";





    public Connection getConnection() {
        try {
            return DriverManager.getConnection(dbUrl, user, pass);

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }




}
