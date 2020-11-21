package com.huangzj.login.utils;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

public class ConnectionUtils {
	private static String driver = null;
	private static String url = null;
	private static String username = null;
	private static String password = null;
	private static Properties props = new Properties();
	
	private static ThreadLocal<Connection> tl = new ThreadLocal<>();
	static {
		try {
			InputStream in = 
			ConnectionUtils.class.getClassLoader().getResourceAsStream("db.properties");
			props.load(in);
			
			driver = props.getProperty("jdbc.driver");
			url = props.getProperty("jdbc.url");
			username = props.getProperty("jdbc.username");
			password = props.getProperty("jdbc.password");
			
			Class.forName(driver);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public static Connection getConn() throws Exception{
		Connection conn = tl.get();
		if(conn == null) {
			conn = DriverManager.getConnection(url,username,password);
			tl.set(conn);
		}
		return conn;
	}
	
	public static void closeConn() throws Exception{
		Connection conn = tl.get();
		if(conn != null) {
			conn.close();
		}
		tl.set(null);
	}
	
	public static void main(String[] args) throws Exception{
		Connection conn = getConn();
		closeConn();
		Connection conn2 = getConn();
		System.out.println(conn == conn2);
		
	}

}
