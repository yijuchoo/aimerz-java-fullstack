package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JdbcDemo {

	public static void main(String[] args) throws Exception {

		// Load the driver (translator)
		/*
		 * Get from mysql connector jar > mysql.cj.jdbc > Driver.class Copy
		 * Qualified Name
		 */
		Class.forName("com.mysql.cj.jdbc.Driver");

		// Establish Connection with Connection Object
		Connection conn = DriverManager.getConnection(
				"jdbc.mysql://localhost:3306", "root", "Welcome_1");

		Statement stmt = conn.createStatement(); // Getting the 'ship' ready

		// Run the 'ship' with the 'container' aka ResultSet
		ResultSet rs = stmt.executeQuery("SELECT * FROM Employees");
		

	}
}
