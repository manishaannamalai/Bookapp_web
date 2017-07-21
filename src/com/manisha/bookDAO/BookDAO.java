package com.manisha.bookDAO;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

import com.manisha.book.Book;
import com.manisha.user.Users;

import util.ConnectionUtil;

public class BookDAO {
	private JdbcTemplate jdbcTemplate=ConnectionUtil.getJdbcTemplate();
public  void addbook(Book book) throws ClassNotFoundException, SQLException {
	LocalDate p=LocalDate.parse("2015-08-15");
	
	
	String sql = "insert into book ( name, price, published_date) values ( ?, ? ,? )";
	Object[] params={book.getName(),book.getPrice(),book.getPublished_date()};
	int row=jdbcTemplate.update(sql,params);
	System.out.println(row);

}

//public static void main(String[] args)  throws ClassNotFoundException, SQLException{
public  List<Book> listbook() throws ClassNotFoundException, SQLException {


String sql = "select id,name,price,published_date from book ";

List<Book>bookList=jdbcTemplate.query(sql, (rs,rowNo)->{


		int Id=rs.getInt("id");
		String Name=rs.getString("name");
		int Price=rs.getInt("price");
		Date published_date=rs.getDate("published_date");
		Book book=new Book();
		book.setId(Id);
		book.setName(Name);
		book.setPrice(Price);
		book.setPublished_date(published_date.toLocalDate());
		return book;
				
});
System.out.println(bookList);

return bookList;

}
}
