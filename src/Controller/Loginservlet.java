package Controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.manisha.user.Users;
import com.manisha.userdao.UserDAO;

@WebServlet("/Loginservlet")
public class Loginservlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		PrintWriter out = response.getWriter();
		// Users user = new Users();
		String email = request.getParameter("email");
		String password = request.getParameter("password");

		UserDAO userDAO = new UserDAO();
		Users user1 = null;
		try {

			// After getting form values, do validation
			/*if (email == null || email.equals("") || email.trim().equals("")) {
				throw new Exception("Email cannot be empty");
			}
			else if (password == null || password.equals("") || password.trim().equals("")) {
				throw new Exception("password cannot be empty");
			}
			*/
			UserValidation.validateLoginFields(email, password);

			// if all fields are valid, then call DAO method

			user1 = userDAO.login(email, password);

			// if user is null, then throw message "Invalid Login"
			if (user1 == null) {
				throw new Exception("Invalid Login");
			}

			// If user is valid
			HttpSession session = request.getSession();
			session.setAttribute("Logged_in_user", user1);
			response.sendRedirect("listbook.jsp");

		} catch (Exception e1) {

			// If any exception, set the error message and go back to the same
			// page

			e1.printStackTrace();

			request.setAttribute("error message", e1.getMessage());
			RequestDispatcher dispatcher = request.getRequestDispatcher("login.jsp");
			dispatcher.forward(request, response);
		}

	}
}
