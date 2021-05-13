package org.example.db;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DatabaseH implements DatabaseInterface {

    private final String DB_URL = "jdbc:mysql://itfag.usn.no/233574";
    private static final String USER = "233574";
    private static final String PASSWORD = "JWeiMrF0";

    private Connection conn = null;
    private Statement stmt = null;
    private PreparedStatement prepStmt = null;
    private ResultSet rSet = null;


    @Override
    public void open() throws SQLException {
        try {
            conn = DriverManager.getConnection(DB_URL, USER, PASSWORD);

            stmt = conn.createStatement();
        } catch (SQLException err) {
            err.printStackTrace();
        }
    }

    @Override

    public void close() throws SQLException {
        try {
            stmt.close();
            conn.close();
        } catch (SQLException err2) {
            err2.printStackTrace();
        }
    }

    public List<Employee> getEmployees(double minSalary, String department) throws SQLException {
        ArrayList<Employee> employees = new ArrayList<Employee>();
        this.open();
        try {
            prepStmt = conn.prepareStatement("select * from employees where salary > = and department = ?");
            prepStmt.setDouble(1, minSalary);
            prepStmt.setString(2, department);

            rSet = prepStmt.executeQuery();

            while (rSet.next()) {
                String lastName = rSet.getString("last_name");
                String firstName = rSet.getString("first_name");
                String email = rSet.getString("email");
                double salary = rSet.getDouble("salary");

                Employee newEmployeeList = new Employee(lastName, firstName, department, salary, email);
            }
            return employees;
        } catch (Exception err3) {
            err3.printStackTrace();
        }
        return null;
    }

    @Override
    public List<Employee> getEmployees() throws SQLException {
        ArrayList<Employee> employees = new ArrayList<Employee>();
        this.open();
        try {
            prepStmt = conn.prepareStatement("select * from employees");
            rSet = prepStmt.executeQuery();

            while (rSet.next()) {
                String lastName = rSet.getString("last_name");
                String firstName = rSet.getString("first_name");
                String email = rSet.getString("email");
                double salary = rSet.getDouble("salary");
                String department = rSet.getString("department");

                Employee currentEmployees = new Employee(lastName, firstName, department, salary, email);
            }
            return employees;
        } catch (SQLException err4) {
            err4.printStackTrace();
        }
        return null;
    }

    @Override
    public void addEmployee(String firstName, String LastName, String department, String email, double salary) throws SQLException{
        try {
            open();
            prepStmt = conn.prepareStatement(
                    "insert into employees " +
                            "(last_name, first_name, department, email, salary) " +
                            "values " +
                            "(?, ?, ?, ?, ?)");
            prepStmt.setString(1, firstName);
            prepStmt.setString(2, LastName);
            prepStmt.setString(4, department);
            prepStmt.setString(3, email);
            prepStmt.setDouble(5, salary);

            prepStmt.executeUpdate();

            close();
        } catch (SQLException err5) {
            err5.printStackTrace();
        }
    }

    @Override
    public void test() throws SQLException{
        try {
            String sql;
            sql = "SELECT * FROM employees";
            ResultSet rs = stmt.executeQuery(sql); // DML
            // stmt.executeUpdate(sql); // DDL

            //STEP 5: Extract data from result set
            while(rs.next()){
                //Display values
                System.out.println(rs.getString("last_name") + ", " + rs.getString("first_name"));
            }
            //STEP 6: Clean-up environment
            rs.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public void addEmployee(String firtsName, String lastName) throws SQLException {
        // TODO Auto-generated method stub
        try {
            open();
            prepStmt = conn.prepareStatement("insert into employees (last_name, first_name) values (?, ?)");
            prepStmt.setString(1,firtsName);
            prepStmt.setString(2, lastName);

            prepStmt.executeQuery();
            close();
        } catch (SQLException err6) {
            err6.printStackTrace();
        }
    }

}
