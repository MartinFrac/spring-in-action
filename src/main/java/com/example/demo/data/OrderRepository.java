package com.example.demo.data;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.example.demo.Order;

public interface OrderRepository 
		extends CrudRepository<Order, Long> {

	List<Order> findByDeliveryZip(String deliveryZip);
	
	@Query("SELECT o FROM Order o WHERE o.deliveryCity='Seattle'")
	List<Order> readOrdersDeliveredInSeattle();
}