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

	/**
	 * @param statusName
	 * @param date
	 */
	public Long findOrderCountByDateAndStatusName(String statusName, Instant date);

	/**
	 * @param statusName
	 * @return
	 */
	public Long findOrderCountByStatusName(String statusName);

	/**
	 * @param statusName
	 * @param date
	 */
	public Long getOrderCountByDateAndStatusName(String statusName, Instant date);

}
