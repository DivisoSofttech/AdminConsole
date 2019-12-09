package com.diviso.graeshoppe.service;

import java.time.Instant;
import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.diviso.graeshoppe.client.administration.model.BannerDTO;
import com.diviso.graeshoppe.client.order.model.Order;
import com.diviso.graeshoppe.client.store.domain.Store;

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

	public Page<Store> findStoreBySearchTerm(String searchTerm, Pageable pageable);

	public Page<Order> findOrderByDatebetween(Instant from, Instant to);

	/**
	 * @param statusName
	 * @param date
	 */
	public Long getOrderCountByDateAndStatusName(String statusName, Instant date);

	public List<BannerDTO> getAllPremiumBanners(Pageable pageable);
}
