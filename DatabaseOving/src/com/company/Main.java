package com.company;

import java.sql.*;
import java.util.Scanner;

public class Main {

    static Connection myConn = null;
    static PreparedStatement myStmt = null;
    static ResultSet myRs = null;

    static String dbURL = "jdbc:mysql://itfag.usn.no/233574";
    static String user = "233574";
    static String pass = "JWeiMrF0";

    static String firstName, lastName, email, department;
    static double salary;
    static int id;

    public static void main(String[] args) throws SQLException {
	// write your code here


        try {
            myConn = DriverManager.getConnection(dbURL, user, pass);
            myStmt = myConn.prepareStatement("SELECT * from employees where salary > ? AND department=?");
            myStmt.setDouble(1, 50000);
            myStmt.setString(2, "Legal");

            myRs = myStmt.executeQuery();
            displayEmployee(myRs);

            Scanner newScanner = new Scanner(System.in);
            System.out.println("Enter id: ");
            id = newScanner.nextInt();
            System.out.print("");
            firstName = newScanner.nextLine();
            System.out.println("Enter first name bitch: ");
            firstName = newScanner.nextLine();
            System.out.println("Enter last name: ");
            lastName = newScanner.nextLine();
            System.out.println("Enter email: ");
            email = newScanner.nextLine();
            System.out.println("Enter department: ");
            department = newScanner.nextLine();
            System.out.println("Enter salary: ");
            salary = newScanner.nextDouble();


            updateEmployeeData(firstName, lastName, email, department, salary, id);
            //insertEmployeeData(firstName, lastName, email, department, salary);

            newScanner.close();

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if(myRs != null) {
                myRs.close();
            }

            if(myStmt != null) {
                myStmt.close();
            }

            if(myConn != null) {
                myConn.close();
            }
        }
    }

    public static void displayEmployee(ResultSet myRs) throws SQLException {

        while (myRs.next()) {
            String lastName = myRs.getString("last_name");
            String firstName = myRs.getString("first_name");
            double salary = myRs.getDouble("salary");
            String department = myRs.getString("department");
            System.out.printf("%s, %s, %.2f, %s\n", lastName, firstName, salary, department);
        }
    }

    public static void insertEmployeeData(String firstName, String lastName, String email, String department, double salary) throws SQLException {
        try {

            myConn = DriverManager.getConnection(dbURL, user, pass);

            String query = "INSERT INTO employees (first_name, last_name, email, department, salary) VALUES (?,?,?,?,?)";

            myStmt = myConn.prepareStatement(query);

            myStmt.setString(1, firstName);
            myStmt.setString(2, lastName);
            myStmt.setString(3, email);
            myStmt.setString(4, department);
            myStmt.setDouble(5, salary);

            myStmt.execute();

            System.out.println("Sukksexfull");


        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if(myRs != null) {
                myRs.close();
            }

            if(myStmt != null) {
                myStmt.close();
            }

            if(myConn != null) {
                myConn.close();
            }
        }
    }

    public static void updateEmployeeData(String firstName, String lastName, String email, String department, double salary, int id) throws SQLException {
        try {
            myConn = DriverManager.getConnection(dbURL, user, pass);

            String query = "UPDATE employees SET first_name=?, last_name=?, email=?, department=?, salary=? WHERE id=?";

            myStmt = myConn.prepareStatement(query);

            myStmt.setString(1, firstName);
            myStmt.setString(2, lastName);
            myStmt.setString(3, email);
            myStmt.setString(4, department);
            myStmt.setDouble(5, salary);
            myStmt.setInt(6, id);

            myStmt.execute();

            System.out.println("Sukksexfull update");

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } finally {
            if(myRs != null) {
                myRs.close();
            }

            if(myStmt != null) {
                myStmt.close();
            }

            if(myConn != null) {
                myConn.close();
            }
        }
    }


}
