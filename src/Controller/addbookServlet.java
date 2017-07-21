package Controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.manisha.book.Book;
import com.manisha.bookDAO.BookDAO;


@WebServlet("/addbook")
public class addbookServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		//LocalDate p=LocalDate.parse("2015-08-15");
		String name = request.getParameter("name");
		String price = request.getParameter("price");
		String publishedDate = request.getParameter("published_date");
		
		int p =Integer.parseInt(price);
		LocalDate d=LocalDate.parse(publishedDate);
		Book book = new Book();
        book.setName(name);
        book.setPrice(p);
        book.setPublished_date(d);
		out.println(book);
		BookDAO bookDAO = new BookDAO();
		try {
			bookDAO.addbook(book);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		response.sendRedirect("listbook.jsp");

}
}

