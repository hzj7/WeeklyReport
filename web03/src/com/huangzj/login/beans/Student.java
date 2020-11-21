package com.huangzj.login.beans;

public class Student {
	private String stu_name;
	private String workInThisWeek;
	private String workInNextWeek;
	private String explaination;
	private String loginDate;
	public String getWorkInThisWeek() {
		return workInThisWeek;
	}
	public void setWorkInThisWeek(String workInThisWeek) {
		this.workInThisWeek = workInThisWeek;
	}
	public String getWorkInNextWeek() {
		return workInNextWeek;
	}
	public void setWorkInNextWeek(String workInNextWeek) {
		this.workInNextWeek = workInNextWeek;
	}
	public String getLoginDate() {
		return loginDate;
	}
	public void setLoginDate(String loginDate) {
		this.loginDate = loginDate;
	}
	public String getStu_name() {
		return stu_name;
	}
	public void setStu_name(String stu_name) {
		this.stu_name = stu_name;
	}
	public String getExplaination() {
		return explaination;
	}
	public void setExplaination(String explaination) {
		this.explaination = explaination;
	}
	@Override
	public String toString() {
		return "Student [stu_name=" + stu_name + ", workInThisWeek=" + workInThisWeek + ", workInNextWeek="
				+ workInNextWeek + ", explaination=" + explaination + ", loginDate=" + loginDate + "]";
	}
	
	
	
}
