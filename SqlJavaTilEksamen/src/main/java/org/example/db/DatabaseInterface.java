package org.example.db;

import java.sql.SQLException;
import java.util.List;

public interface DatabaseInterface {

    //	open connection
    void open() throws SQLException;

    // close connection
    void close() throws SQLException;

    // test connection
    void test() throws SQLException;

    // get list of all employees
    List<Employee> getEmployees() throws SQLException;

    //add employee with name
    void addEmployee(String firstName, String LastName) throws SQLException;

    //add employee with all details
    void addEmployee(String firstName, String LastName, String department, String email, double salary) throws SQLException;
}
