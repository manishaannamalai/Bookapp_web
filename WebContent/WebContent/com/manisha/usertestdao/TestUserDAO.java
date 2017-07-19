package com.manisha.usertestdao;

import com.manisha.user.Users;
import com.manisha.userdao.UserDAO;

public class TestUserDAO {
	public static void main(String[] args) throws Exception {
		 
        Users user = new Users();
        user.setName("manisha");
        user.setEmail("manisha@gmail.com");
        user.setPassword("manisha");
        

 
        //UserDAO userDAO = new UserDAO();
        
        
        //String email="manish@gmail.com";
		//String password="adf";
        //String name="manisha";
		//Users user=userDAO.login(email,password);
		System.out.println(user);
        

}

}
