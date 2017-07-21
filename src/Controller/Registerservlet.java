package Controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.time.LocalDate;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.manisha.book.Book;
import com.manisha.bookDAO.BookDAO;
import com.manisha.user.Users;
import com.manisha.userdao.UserDAO;


@WebServlet("/Registerservlet")
public class Registerservlet extends HttpServlet{
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
				
				String name = request.getParameter("name");
				String email = request.getParameter("email");
				String password = request.getParameter("password");
				
				//out.println("Name:"+name);
				//out.println("email:"+email);
				//out.println("password:"+password);
				 Users user = new Users();
			        user.setName(name);
			        user.setEmail(email);
			        user.setPassword(password);
					out.println(user);
					UserDAO userDAO = new UserDAO();
					try {
						userDAO.register(user);
					} catch (ClassNotFoundException | SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
			  
}
}