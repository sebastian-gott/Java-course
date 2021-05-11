package ExamplePreparedstatement;

import java.sql.*;

public class Main {
    public static void main(String[] args){
        Connection myConn = null;
        PreparedStatement myStm = null;
        ResultSet myRs = null;

        String dbURL = "";
        String user = "root";
        String pass = "root";

        try {
            myConn = DriverManager.getConnection(dbURL, user, pass);

            myStm = myConn.prepareStatement("select * from x where salary > ? and y = ?");

            myStm.setDouble(1, 80000);
            myStm.setString(2, "Legal");

            myRs = myStm.executeQuery();

            System.out.println("Reyse the prepared statement");

            myStm.setDouble(1, 25000);
            myStm.setString(2, "HR");

            myRs = myStm.executeQuery();

            //System.out.printf(%s, %s, %.2f, %s\n, lastName, firstName, salary, department);
            //Prints string, string, double, string

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

    }
}
