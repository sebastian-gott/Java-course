package ExampleDelete;

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


            int rowsAffected = myStm.executeUpdate(
                    "delete from x where example_lastName='lastname' and example_firstName='firstname'"
            );

        } catch (Exception err) {
            err.printStackTrace();
        }
    }
}
