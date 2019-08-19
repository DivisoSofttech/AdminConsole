package com.diviso.graeshoppe.service;

import java.time.Instant;

import org.springframework.data.domain.Page;

import com.diviso.graeshoppe.client.order.model.Order;

public interface AggregateQueryService {

	/**
	 * @param from
	 * @param to
	 * @return
	 */
	public Page<Order> findOrderByDatebetweenAndStoreId(Instant from, Instant to,String storeId);

}
