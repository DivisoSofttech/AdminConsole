package com.diviso.graeshoppe.service;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.diviso.graeshoppe.client.order.model.Order;

public interface OrderQueryService {

	ResponseEntity<Order> findOrderByOrderId(String orderId);

	//ResponseEntity<List<Order>> findByOrderByOrderId(String orderId);

}
