package com.manisha.bookDAO;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import com.manisha.book.Book;
import com.manisha.user.Users;

import util.ConnectionUtil;

public class BookDAO {
public  void addbook(Book book) throws ClassNotFoundException, SQLException {
	LocalDate p=LocalDate.parse("2015-08-15");
	Connection con = ConnectionUtil.getConnection();
	String sql = "insert into book ( name, price, published_date) values ( ?, ? ,? )";
	PreparedStatement pst = con.prepareStatement(sql);
	pst.setString(1,book.getName());
	pst.setInt(2, book.getPrice());
	pst.setDate(3,Date.valueOf(p));
	int row=pst.executeUpdate();
	System.out.println(row);

}

//public static void main(String[] args)  throws ClassNotFoundException, SQLException{
public  List<Book> listbook() throws ClassNotFoundException, SQLException {

Connection con = ConnectionUtil.getConnection();
String sql = "select id,name,price,published_date from book ";
PreparedStatement pst = con.prepareStatement(sql);
List<Book>bookList=new ArrayList<Book>();
ResultSet rs= pst.executeQuery();
while(rs.next())
{
		int Id=rs.getInt("id");
		String Name=rs.getString("name");
		int Price=rs.getInt("price");
		Date published_date=rs.getDate("published_date");
		Book book=new Book();
		book.setId(Id);
		book.setName(Name);
		book.setPrice(Price);
		book.setPublished_date(published_date.toLocalDate());
		bookList.add(book);
				
}
System.out.println(bookList);

return bookList;

}
}
