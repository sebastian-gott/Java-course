package backend;

import database.DatabaseConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class Insert extends DatabaseConnection {

    public Connection connection;
    static ResultSet myRs = null;


    public void insertEmployee(String lastName, String firstName, String email, String department, String salary) {


        try{
            String query = "insert into employees" +
                    "(last_name, first_name, email, department, salary)" +
                    "values" +
                    "(?, ?, ?, ?, ?)";

            PreparedStatement myStmt = connection.prepareStatement(query);


            myStmt.setString(1, lastName);
            myStmt.setString(2, firstName);
            myStmt.setString(3, email);
            myStmt.setString(4, department);
            myStmt.setDouble(5, Double.parseDouble(salary));

            myRs = myStmt.executeQuery();
        } catch (NumberFormatException | SQLException err1) {
            err1.printStackTrace();
        }

    }

}
