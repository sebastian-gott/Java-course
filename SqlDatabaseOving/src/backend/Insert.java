package backend;

import database.DatabaseConnection;

import javax.xml.crypto.Data;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class Insert extends DatabaseConnection {

    static ResultSet myRs = null;

    DatabaseConnection myConn = new DatabaseConnection();


    public void insertEmployee(String lastName, String firstName, String email, String department, String salary) {


        try{
            String query = "insert into employees" +
                    "(last_name, first_name, email, department, salary)" +
                    "values" +
                    "(?, ?, ?, ?, ?)";

            PreparedStatement myStmt = myConn.connection().prepareStatement(query);


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
