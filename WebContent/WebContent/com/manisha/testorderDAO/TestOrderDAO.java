package com.manisha.testorderDAO;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

import com.manisha.order.Order;
import com.manisha.orderDAO.OrderDAO;
import com.manisha.userdao.UserDAO;

public class TestOrderDAO {
	
		public static void main(String[] args) throws Exception {
			 //LocalDateTime date=LocalDate.parse();
 
	        Order order = new Order();
	        order.setUserId(2);
	        order.setBookId(2);
	        //order.setStatus("delivered");
	        order.setQuantity(2);
	        //order.setOrderDate();
	 
	        OrderDAO orderDAO = new OrderDAO();
	        //orderDAO.add(order);
	        orderDAO.listorder();
	        List<Order> orderList=orderDAO.listorder();
	        for(Order o:orderList){
				System.out.println(o);
			}
	        //System.out.println(order);
	        
	        
	        

}
}
