package com.manisha.testbookDAO;

import java.time.LocalDate;
import java.util.List;

import com.manisha.book.Book;
import com.manisha.bookDAO.BookDAO;


public class TestBookDAO {
	public static void main(String[] args) throws Exception {
		 LocalDate date=LocalDate.parse("2017-12-04");
        Book book = new Book();
        book.setName("manisha");
        book.setPrice(450);
        book.setPublished_date(date);
 
        BookDAO bookDAO = new BookDAO();
        //bookDAO.addbook(book);
        List<Book> bookList=bookDAO.listbook();
        for(Book b:bookList){
        	System.out.println(b);
        }

        
}
}
