package com.manisha.userdao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.JdbcTemplate;

import com.manisha.user.Users;

import util.ConnectionUtil;

public class UserDAO {
	private JdbcTemplate jdbcTemplate=ConnectionUtil.getJdbcTemplate();
	public void register(Users user) throws ClassNotFoundException, SQLException {
	
	
	//public static void main(String[] args) throws Exception, Exception {
		
	
		
		String sql = "insert into users ( name, email, password) values ( ?, ? ,? )";
		Object[] params={user.getName(),user.getEmail(),user.getPassword()};
		int rows = jdbcTemplate.update(sql,params);
		System.out.println(rows);
	}
		public Users login(String email, String password) throws ClassNotFoundException, SQLException {
			
			
			//public static void main(String[] args) throws Exception, Exception {
				
			
				String sql = "select id,name,email,password from users where email=? and password=?";
				Object[] params={email,password};
				Users userclass=jdbcTemplate.queryForObject(sql, params,(rs,rowno)->{
				
						int id=rs.getInt("id");
						String name=rs.getString("name");
						String Email=rs.getString("email");
						String Password=rs.getString("password");
						Users user=new Users();
						user.setId(id);
						user.setName(name);
						user.setEmail(Email);
						user.setPassword(Password);
						return user;			
	});
				//System.out.println(user);
				

return userclass; 
}
}
