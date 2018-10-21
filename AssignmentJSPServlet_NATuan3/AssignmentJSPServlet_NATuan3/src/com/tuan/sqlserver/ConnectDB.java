/**
 * 
 */
package com.tuan.sqlserver;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

//import org.apache.log4j.Logger;


public class ConnectDB {
	private final static String DRIVER_CLASS = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
	private final static String DRIVER_URL = "jdbc:sqlserver://localhost:1433;databaseName=FinalExamNATuan";
	private final static String userName = "ka";
	private final static String passWord = "1";
	// static Logger log = Logger.getLogger(ConnectDB.class);

	public static Connection getConnection() {
		Connection conn = null;
		try {
			Class.forName(DRIVER_CLASS);
			conn = DriverManager.getConnection(DRIVER_URL, userName, passWord);
			System.out.println("tim duoc driver class");
		} catch (ClassNotFoundException e) {
			// log.error("Khong tim thay driver class");
			System.out.println("khong tim duoc driver class");
		} catch (SQLException e) {
			System.out.println("khong the ket noi toi database");
			// log.error("Khong the ket noi toi database");
		}
		return conn;
	}

	}

	public static void main(String[] args) {
		Connection cn = getConnection();
		if (cn != null) {
			System.out.println("Thanh cong");
		} else {
			System.out.println("Khong");
		}
	}

}
