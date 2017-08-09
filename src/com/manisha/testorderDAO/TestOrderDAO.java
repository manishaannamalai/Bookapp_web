package com.manisha.testorderDAO;

import java.util.List;

import com.manisha.order.Order;
import com.manisha.orderDAO.OrderDAO;

public class TestOrderDAO {

	public static void main(String[] args) throws Exception {

		OrderDAO dao = new OrderDAO();
		List<Order> listorder = dao.listorder(2);

		System.out.println(listorder.size());
		for (Order o : listorder) {
			System.out.println(o);
		}

		/*
		 * //LocalDateTime date=LocalDate.parse();
		 * 
		 * Order order = new Order(); order.setUserId(2); order.setBookId(2);
		 * //order.setStatus("delivered"); order.setQuantity(2);
		 * //order.setOrderDate();
		 * 
		 * OrderDAO orderDAO = new OrderDAO(); //orderDAO.add(order);
		 * orderDAO.listorder(); List<Order> orderList=orderDAO.listorder();
		 * for(Order o:orderList){ System.out.println(o); }
		 * //System.out.println(order);
		 */

	}
}
