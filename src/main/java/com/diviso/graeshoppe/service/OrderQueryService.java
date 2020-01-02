package com.diviso.graeshoppe.service;

import org.springframework.http.ResponseEntity;

import com.diviso.graeshoppe.client.order.model.Order;

public interface OrderQueryService {

	ResponseEntity<Order> findOrderById(Long id);

}
