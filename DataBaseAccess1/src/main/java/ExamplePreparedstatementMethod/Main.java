package ExamplePreparedstatementMethod;

import java.sql.*;

public class Main {
    public static void main(String[] args) {
        Connection myConn = null;
        PreparedStatement myStm = null;
        ResultSet myRs = null;

        String dbURL = "";
        String user = "root";
        String pass = "root";
    }

    public static void displayEmployee(Connection myConn, String firstName, String lastName) throws SQLException {
        PreparedStatement myStm = null;
        ResultSet myRs = null;

        try {
            myStm = myConn.prepareStatement("select last_name, first_name, email from employee where last_name=? and first_name=?");

            myStm.setString(1, lastName);
            myStm.setString(2, firstName);

            myRs = myStm.executeQuery();

            boolean found = false;

            while (myRs.next()) {
                String theLastName = myRs.getString("last_name");
                String theFirstName = myRs.getString("first_name");
                String email = myRs.getString("email");

            }
        } catch (Exception err) {
            err.printStackTrace();
        }
    }
}


