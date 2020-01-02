package com.diviso.graeshoppe.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.diviso.graeshoppe.client.order.model.Order;
import com.diviso.graeshoppe.service.OrderQueryService;
import com.diviso.graeshoppe.web.rest.util.ServiceUtility;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.elasticsearch.action.search.SearchRequest;
import org.elasticsearch.action.search.SearchResponse;
import org.elasticsearch.client.RequestOptions;
import org.elasticsearch.client.RestHighLevelClient;
import org.elasticsearch.index.query.*;
import org.elasticsearch.search.SearchHit;
import org.elasticsearch.search.builder.SearchSourceBuilder;

@Service
public class OrderQueryServiceImpl implements OrderQueryService{
	
	private final Logger log = LoggerFactory.getLogger(OrderQueryServiceImpl.class);
	
	@Autowired
	ServiceUtility serviceUtility;
	
	@Autowired
	RestHighLevelClient restClient;

	@Override
	public ResponseEntity<Order> findOrderById(String orderId) {
		log.debug("<<<<<<<<< findOrderById >>>>>>>>{}",orderId);
		
		QueryBuilder queryBuilders = QueryBuilders.termQuery("orderId.keyword", orderId);
		SearchSourceBuilder builder = new SearchSourceBuilder();
		builder.query(queryBuilders);
		SearchResponse  response = serviceUtility.searchResponseForObject("order", queryBuilders);
		return ResponseEntity.ok().body(serviceUtility.getObjectResult(response, new Order()));
	}

	/*
	 * @Override public ResponseEntity<List<Order>> findByOrderByOrderId(String
	 * orderId) { log.debug("<<<<<<<<<< findByOrderByOrderId >>>>>>>>>{}",orderId);
	 * List<Order> orders = new ArrayList<>(); QueryBuilder queryBuilders =
	 * QueryBuilders.boolQuery()
	 * .must(QueryBuilders.matchAllQuery()).filter(QueryBuilders.termQuery(
	 * "orderId.keyword", orderId)); SearchSourceBuilder builder = new
	 * SearchSourceBuilder(); builder.query(queryBuilders); SearchRequest request =
	 * new SearchRequest("order"); request.source(builder);
	 * 
	 * SearchResponse response = null; try { response=restClient.search(request,
	 * RequestOptions.DEFAULT); }catch(IOException e) { e.printStackTrace(); }
	 * for(SearchHit hit : response.getHits()) { Order order = new Order();
	 * orders.add(order); } return ResponseEntity.ok().body(orders); }
	 */

}
