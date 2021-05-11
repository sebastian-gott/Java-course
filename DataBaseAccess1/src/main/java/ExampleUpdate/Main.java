package ExampleUpdate;

import java.sql.*;

public class Main {
    public static void main(String[] args) throws SQLException {
        Connection myConn = null;
        Statement myStm = null;
        ResultSet myRs = null;

        String dbURL = "";
        String user = "root";
        String pass = "root";

        try {
            myConn = DriverManager.getConnection(dbURL, user, pass);

            myStm = myConn.createStatement();

            System.out.println("Before update");

            int rowsAffected = myStm.executeUpdate(
                    "update employee " +
                            "set email='johnExample@example.com' " +
                            "where last_name='exampleLastName' and first_name='exampleFirstName'");

        } catch (Exception err) {
            err.printStackTrace();
        }
    }
}
