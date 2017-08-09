package com.manisha.order;


import java.time.LocalDateTime;

public class Order {
	 private int id;
	 private int userId;
	private int bookId;
	private String status;
	
	private int quantity;
	private LocalDateTime orderDate ;
	private String Bookname;
	public String getBookname() {
		return Bookname;
	}
	public void setBookname(String bookname) {
		Bookname = bookname;
	}
	public String getUsername() {
		return Username;
	}
	public void setUsername(String username) {
		Username = username;
	}
	private String Username;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public int getBookId() {
		return bookId;
	}
	public void setBookId(int bookId) {
		this.bookId = bookId;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public LocalDateTime getOrderDate() {
		return orderDate;
	}
	public void setOrderDate(LocalDateTime orderDate) {
		this.orderDate = orderDate;
	}
	@Override
	public String toString() {
		return "Order [id=" + id + ", userId=" + userId + ", bookId=" + bookId + ", status=" + status + ", quantity="
				+ quantity + ", orderDate=" + orderDate + ", Bookname=" + Bookname + ", Username=" + Username + "]";
	}
	
	

}
