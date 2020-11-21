package com.huangzj.login.dao;

import java.util.List;

import com.huangzj.login.beans.Student;

public interface StudentDao {
	public List<Student> selectAllEmps();
	
	public void insertStudent(String stu_name,String workInThisWeek,String workInNextWeek,String explaination,String loginDate);

}
