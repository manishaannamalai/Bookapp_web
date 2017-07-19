package com.manisha.userdao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.manisha.user.Users;

import util.ConnectionUtil;

public class UserDAO {
	public void register(Users user) throws ClassNotFoundException, SQLException {
	
	
	//public static void main(String[] args) throws Exception, Exception {
		
	
		Connection con = ConnectionUtil.getConnection();
		String sql = "insert into users ( name, email, password) values ( ?, ? ,? )";
		PreparedStatement pst = con.prepareStatement(sql);
		pst.setString(1, user.getName());
		pst.setString(2, user.getEmail());
		pst.setString(3, user.getPassword());
		int rows = pst.executeUpdate();
		System.out.println(rows);
	}
		public Users login(String email, String password) throws ClassNotFoundException, SQLException {
			
			
			//public static void main(String[] args) throws Exception, Exception {
				
			
			Connection con = ConnectionUtil.getConnection();
				String sql = "select id,name,email,password from users where email=? and password=?";
				PreparedStatement pst = con.prepareStatement(sql);
				pst.setString(1, email);
				pst.setString(2, password);
				Users user=null;
				ResultSet rs= pst.executeQuery();
				if(rs.next())
				{
						int id=rs.getInt("id");
						String name=rs.getString("name");
						String Email=rs.getString("email");
						String Password=rs.getString("password");
						user=new Users();
						user.setId(id);
						user.setName(name);
						user.setEmail(Email);
						user.setPassword(Password);
						
	}
				//System.out.println(user);
				return user;
}
}