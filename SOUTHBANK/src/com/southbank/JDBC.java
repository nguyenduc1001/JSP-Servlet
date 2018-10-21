package com.southbank;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBC {

	public static Connection getJDBCConnection() {
		final String user = "ka";
		final String password = "1";
		final String url = "jdbc:sqlserver://localhost:1433;databaseName=sb;user="+user+";password="+password;

		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
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
	try {
		Statement stm = cn.createStatement();
		final String sql ="select * from ud;";
		ResultSet rs = stm.executeQuery(sql);
		
		while (rs.next())
		{
			int id = rs.getInt("id");
			String ac = rs.getString("acc");
			String ps = rs.getString("pass");
			System.out.println(id +" "+ ac+" "+ ps);
		}
	} catch (SQLException e) {
		
		e.printStackTrace();
	}
	
	}
}
