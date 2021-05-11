package com.company;

import java.sql.*;

public class PreparedStatementWithMethod {

    static Connection myConn = null;
    static PreparedStatement myStmt = null;
    static ResultSet myRs = null;

    static String dbURL = "jdbc:mysql://itfag.usn.no/233574";
    static String user = "233574";
    static String pass = "JWeiMrF0";

    static String firstName, lastName, email, department;
    static double salary;
}
