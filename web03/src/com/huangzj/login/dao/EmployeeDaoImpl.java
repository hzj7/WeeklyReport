/*
package com.huangzj.login.dao;
 

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.huangzj.login.beans.Department;
import com.huangzj.login.beans.Employee;
import com.huangzj.login.utils.ConnectionUtils;

public class EmployeeDaoImpl implements EmployeeDao{
	List<Employee> empsa = new ArrayList<Employee>();
	@Override
	public List<Employee> selectAllEmps() {
		try {
			Connection conn = ConnectionUtils.getConn();
			String sql = "select e.id eid, e.last_name,e.email,e.gender,d.id did,d.dept_name"
					+ "from tbl_employee e, tbl_dept d where e.d_id = d.id";
			PreparedStatement ps = conn.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				Employee employee = new Employee();
				employee.setId(rs.getInt("eid"));
				employee.setLastName(rs.getString("last_name"));
				employee.setEmail(rs.getString("email"));
				employee.setGender(rs.getInt("gender"));
				
				Department dept = new Department();
				dept.setId(rs.getInt("did"));
				dept.setDepName(rs.getString("dept_name"));
				
				employee.setDept(dept);
				empsa.add(employee);
			}
			return empsa;
			
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
	

}
*/