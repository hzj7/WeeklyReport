package com.huangzj.login.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.huangzj.login.beans.User;
import com.huangzj.login.utils.ConnectionUtils;

public class UserDaoImpl implements UserDao{
	@Override
	public User getUserByUsernameAndPassword(String username, String password) {
		User u = null;
		try {
			Connection conn = ConnectionUtils.getConn();
			String sql ="select id,username,password from tbl_user where username = ? and password = ?";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1,username);
			ps.setString(2, password);
			
			ResultSet rs = ps.executeQuery();
			if(rs.next()) {
				u = new User();
				u.setId(rs.getInt("id"));
				u.setUsername(rs.getString("username"));
				u.setPassword(rs.getString("password"));
				
			}
			return u;
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				ConnectionUtils.closeConn();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		return null;
	}
	@Override
	public User getUserByUsername(String username) {
		User u = null;
		try {
			Connection conn = ConnectionUtils.getConn();
			String sql ="select id,username,password from tbl_user where username = ?";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1,username);
			
			ResultSet rs = ps.executeQuery();
			if(rs.next()) {
				u = new User();
				u.setId(rs.getInt("id"));
				u.setUsername(rs.getString("username"));
				u.setPassword(rs.getString("password"));
				
			}
			return u;
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				ConnectionUtils.closeConn();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return null;
	}
	@Override
	public void insertUser(String username, String password) {
		try {
			Connection conn = ConnectionUtils.getConn();
			
			String sql = "insert into tbl_user (username,password) values(?,?)";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, username);
			ps.setString(2, password);
			
			ps.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				ConnectionUtils.closeConn();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
	}
}
