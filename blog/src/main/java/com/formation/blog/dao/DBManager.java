package com.formation.blog.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBManager {
	private static String url = "jdbc:mysql://localhost:3307/blog?serverTimezone=Europe/Paris&createDatabaseIfNotExist=true";
	private static String user = "root";
	private static String password = "";

	private static Connection conn;

	public static Connection getInstance() {
		if (conn == null) {
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				conn = DriverManager.getConnection(url, user, password);
			} catch (SQLException | ClassNotFoundException e) {
				e.printStackTrace();
			}
		}
		return conn;
	}

	public static void deco() {
		try {
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}

