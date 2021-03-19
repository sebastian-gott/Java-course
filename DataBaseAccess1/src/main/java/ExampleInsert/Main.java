package ExampleInsert;

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

            System.out.println("Inserting new employee");

            int rowsAffected = myStm.executeUpdate(
                    "insert into x " +
                            "(last_name, first_name, email, department, salary) " +
                            "values " +
                            "('Example', 'firstName', 'Example@email.com', 'ExampleJob', '100000')");
            myRs = myStm.executeQuery("select * from example order by firstName");

            while(myRs.next()) {
                System.out.println(myRs.getString("Example") + ", " + myRs.getString("firstName"));
            }
        } catch (Exception err) {
            err.printStackTrace();
        } finally {
            if(myRs != null) {
                myRs.close();
            }
            if(myStm != null) {
                myRs.close();
            }
            if(myConn != null) {
                myRs.close();
            }
        }
    }
}
