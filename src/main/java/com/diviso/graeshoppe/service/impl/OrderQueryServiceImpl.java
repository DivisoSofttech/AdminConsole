package com.diviso.graeshoppe.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.diviso.graeshoppe.client.order.model.Order;
import com.diviso.graeshoppe.service.OrderQueryService;
import com.diviso.graeshoppe.web.rest.util.ServiceUtility;
import org.elasticsearch.index.query.*;

@Service
public class OrderQueryServiceImpl implements OrderQueryService{
	
	private final Logger log = LoggerFactory.getLogger(OrderQueryServiceImpl.class);
	
	@Autowired
	ServiceUtility serviceUtility;

	@Override
	public ResponseEntity<Order> findOrderById(Long id) {
		log.debug("<<<<<<<<< findOrderById >>>>>>>>{}",id);
		
		//QueryBuilder queryBuilders = QueryBuilders.
		return null;
	}

}
