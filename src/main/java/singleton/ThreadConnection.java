package singleton;

import java.sql.DriverManager;
import java.sql.*;

public class ThreadConnection {
private static Connection conn;
private static int counter = 0;

private ThreadConnection() {
	try {
		// Code to create a database connection
		Class.forName("com.mysql.cj.jdbc.Driver");
		conn= DriverManager.getConnection("jdbc:mysql://localhost:3306/iiad?useSSL=false", "root", "");
	} catch (ClassNotFoundException | SQLException e) {
		e.printStackTrace();
	}
}

public static Connection getcon() {
	counter++;
	if (conn==null){
		synchronized (ThreadConnection.class) {
			if (conn ==null) {
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}

				new ThreadConnection();
			}
		}
	}
	return conn;
}

public void getDescription() {
	System.out.println("connection" + this.conn);
}


}
