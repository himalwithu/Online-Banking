package com.onlinebanking.teamf.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class BankDbUtil {
	

		public static final String URL = "jdbc:mysql://localhost:3306/user_db";
		public static final String DRIVER_NAME = "com.mysql.cj.jdbc.Driver";
		public static final String USER_NAME = "root";
		public static final String PASSWORD = "root1234";
		
		public static Connection getConnection() throws SQLException, ClassNotFoundException {
			Class.forName(DRIVER_NAME);
			return DriverManager.getConnection(URL, USER_NAME, PASSWORD);
			
		

	
	}

}