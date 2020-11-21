package com.huangzj.login.dao;
import com.huangzj.login.beans.User;

public interface UserDao {
	public User getUserByUsernameAndPassword(String username,String password);
	
	public User getUserByUsername(String username);
	
	public void insertUser(String username,String password);
	
}
