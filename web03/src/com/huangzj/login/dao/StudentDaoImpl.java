package com.huangzj.login.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.PseudoColumnUsage;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import com.huangzj.login.beans.Student;
import com.huangzj.login.utils.ConnectionUtils;

public class StudentDaoImpl implements StudentDao{
	@Override
	public List<Student> selectAllEmps() {
		List<Student> emps = new ArrayList<Student>();
		try {
			Connection conn = ConnectionUtils.getConn();
			String sql = "select stu_name,thisWeekWork,nextWeekWork,explaination,loginDate from weeklyreport";
			PreparedStatement ps = conn.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				Student stu = new Student();
				stu.setStu_name(rs.getString("stu_name"));
				stu.setWorkInThisWeek(rs.getString("thisWeekWork"));
				stu.setWorkInNextWeek(rs.getString("nextWeekWork"));
				stu.setExplaination(rs.getString("explaination"));
				stu.setLoginDate(rs.getString("loginDate"));
				emps.add(stu);
			}
			System.out.println(emps);
			return emps;
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
	public void insertStudent(String stu_name, String workInThisWeek, String workInNextWeek, String explaination,
			String loginDate) {
		try {
			Connection conn = ConnectionUtils.getConn();
			
			String sql = "insert into weeklyreport (stu_name,thisWeekWork,nextWeekWork,explaination,loginDate) values (?,?,?,?,?)";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, stu_name);
			ps.setString(2, workInThisWeek);
			ps.setString(3, workInNextWeek);
			ps.setString(4, explaination);
			ps.setString(5, loginDate);	
			
			ps.executeUpdate();
			ps.executeUpdate();
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
