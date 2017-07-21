package com.manisha.orderDAO;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

import com.manisha.book.Book;
import com.manisha.order.Order;

import util.ConnectionUtil;

public class OrderDAO {
	
	private JdbcTemplate jdbcTemplate=ConnectionUtil.getJdbcTemplate();
	
	public void add(Order order) throws SQLException, ClassNotFoundException  {
		
		
	//	public static void main(String[] args) throws Exception, Exception {
		
		//LocalDateTime p=LocalDate.parse("2015-08-15");
		String sql = "insert into orders (user_id,book_id,quantity)values(?,?,?)"; 
		Object[] params={order.getUserId(),order.getBookId(),order.getQuantity()};
		
		
		int rows = jdbcTemplate.update(sql,params);
		System.out.println(rows);
	}

	//public static void main(String[] args)  throws ClassNotFoundException, SQLException{
		public  List<Order> listorder() throws ClassNotFoundException, SQLException {

		
		String sql = "select id,user_id,book_id,status,quantity,order_date from orders ";
		
		List<Order>orderList=jdbcTemplate.query(sql, (rs,rowNo)->{
		
				int Id=rs.getInt("id");
				int  userId=rs.getInt("user_id");
				int bookId=rs.getInt("book_id");
				String status=rs.getString("status");
				int Quantity=rs.getInt("quantity");
				Timestamp order_date=rs.getTimestamp("order_date");
				Order order=new Order();
				order.setId(Id);
				order.setUserId(userId);
				order.setBookId(bookId);
				order.setStatus(status);
				order.setQuantity(Quantity);
				order.setOrderDate(order_date.toLocalDateTime());
				return order;
						
		});
		System.out.println(orderList);
		
	
	return orderList;		
}
		public  List<Order> listorder(int Userid) throws ClassNotFoundException, SQLException {

			
			String sql = "select id,user_id,book_id,status,quantity,order_date from orders where userid=? ";
			Object[] params={order.getuserid()};
			List<Order>orderList=jdbcTemplate.query(sql, (rs,rowNo)->{
			
					int Id=rs.getInt("id");
					int  userId=rs.getInt("user_id");
					int bookId=rs.getInt("book_id");
					String status=rs.getString("status");
					int Quantity=rs.getInt("quantity");
					Timestamp order_date=rs.getTimestamp("order_date");
					Order order=new Order();
					order.setId(Id);
					order.setUserId(userId);
					order.setBookId(bookId);
					order.setStatus(status);
					order.setQuantity(Quantity);
					order.setOrderDate(order_date.toLocalDateTime());
					return order;
							
			});
			System.out.println(orderList);
			
		
		return orderList;		
	}
}

