package com.diviso.graeshoppe.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;

import com.diviso.graeshoppe.client.administration.model.CancellationRequest;
import com.diviso.graeshoppe.client.order.model.Order;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import java.time.LocalDate;
public interface OrderQueryService {

	ResponseEntity<Order> findOrderByOrderId(String orderId);

	ResponseEntity<List<Order>> findByOrdersByOrderId(String orderId);

	Page<CancellationRequest> findCancellationRequestByStatus(String statusName,LocalDate date,Pageable pageable);

}
