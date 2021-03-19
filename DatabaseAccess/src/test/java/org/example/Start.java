package org.example;

import java.sql.*;

public class Start {

	public static void main(String[] args) throws SQLException {
		// write your code here
		Connection myConn = null;
		Statement myStm = null;
		ResultSet myRs = null;

		// Get a connection to database
		myConn = DriverManager.getConnection("", "root", "password");

		// Create a statement

		myStm = myConn.createStatement();

		// Execute SQL query
		myRs = myStm.executeQuery("select * from x");

		// Process the result set

		while(myRs.next()) {
			System.out.println(myRs.getString("examble_name") + ", " + myRs.getString("example_firstName"));
		}
	}
    catch (Exception err) {
		err.printStackTrace();
	}
    finally {
		if(myRs != null){
			myRs.close();
		}
	}
}
