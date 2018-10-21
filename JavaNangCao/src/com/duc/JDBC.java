package com.duc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBC {

	public static Connection getJDBCConnection() {
		final String user = "root";
		final String password = "123456";
		final String url = "jdbc:mysql://localhost:3306/usersouthbank";

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			return DriverManager.getConnection(url, user, password);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	public static void main(String[] args) {
			Connection cn = getJDBCConnection();
			if (cn!=null)
			{
				System.out.println("Thanh cong");
			}
			else
			{
				System.out.println("Khong");
			}
	}
}