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

import com.manisha.book.Book;
import com.manisha.order.Order;

import util.ConnectionUtil;

public class OrderDAO {
	
		
	
	public void add(Order order) throws SQLException, ClassNotFoundException  {
		
		
	//	public static void main(String[] args) throws Exception, Exception {
		Connection con = ConnectionUtil.getConnection();
		//LocalDateTime p=LocalDate.parse("2015-08-15");
		String sql = "insert into orders (user_id,book_id,quantity)values(?,?,?)"; 

		PreparedStatement pst = con.prepareStatement(sql);
		pst.setInt(1, order.getUserId());
		pst.setInt(2, order.getBookId());
		//pst.setString(3, order.getStatus());
		pst.setInt(3,order.getQuantity() );
		//pst.setDate(5,Date.valueOf(p) );
		int rows = pst.executeUpdate();
		System.out.println(rows);
	}

	//public static void main(String[] args)  throws ClassNotFoundException, SQLException{
		public  List<Order> listorder() throws ClassNotFoundException, SQLException {

		Connection con = ConnectionUtil.getConnection();
		String sql = "select id,user_id,book_id,status,quantity,order_date from orders ";
		PreparedStatement pst = con.prepareStatement(sql);
		List<Order>orderList=new ArrayList<Order>();
		ResultSet rs= pst.executeQuery();
		while(rs.next())
		{
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
				orderList.add(order);
						
		}
		System.out.println(orderList);
		
	
	return orderList;		
}
}

