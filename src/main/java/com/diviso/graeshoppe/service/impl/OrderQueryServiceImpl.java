package com.diviso.graeshoppe.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.diviso.graeshoppe.client.administration.model.CancellationRequest;
import com.diviso.graeshoppe.client.order.model.Order;
import com.diviso.graeshoppe.service.OrderQueryService;
import com.diviso.graeshoppe.config.elasticsearch.ServiceUtility ;
import com.fasterxml.jackson.databind.ObjectMapper;

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
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;

@Service
public class OrderQueryServiceImpl implements OrderQueryService {

	private final Logger log = LoggerFactory.getLogger(OrderQueryServiceImpl.class);

	@Autowired
	ServiceUtility serviceUtility;

	@Autowired
	RestHighLevelClient restClient;

	@Autowired
	ObjectMapper objectMapper;

	@Override
	public ResponseEntity<Order> findOrderByOrderId(String orderId) {
		log.debug("<<<<<<<<< findOrderById >>>>>>>>{}", orderId);

		QueryBuilder queryBuilders = QueryBuilders.termQuery("orderId.keyword", orderId);
		SearchSourceBuilder builder = new SearchSourceBuilder();
		builder.query(queryBuilders);
		SearchResponse response = serviceUtility.searchResponseForObject("order", queryBuilders);
		return ResponseEntity.ok().body(serviceUtility.getObjectResult(response, new Order()));
	}

	@Override
	public ResponseEntity<List<Order>> findByOrdersByOrderId(String orderId) {
		log.debug("<<<<<<<<<< findByOrderByOrderId >>>>>>>>>{}", orderId);
		
		List<Order> orders = new ArrayList<Order>();
		QueryBuilder queryBuilders = QueryBuilders.boolQuery().must(QueryBuilders.matchAllQuery())
				.filter(QueryBuilders.termQuery("orderId.keyword", orderId));
		SearchSourceBuilder builder = new SearchSourceBuilder();
		builder.query(queryBuilders);
		SearchRequest request = new SearchRequest("order");
		request.source(builder);

		SearchResponse response = null;
		try {
			response = restClient.search(request, RequestOptions.DEFAULT);
		} catch (IOException e) {
			e.printStackTrace();
		}
		SearchHit[] searchHit = response.getHits().getHits();
		for (SearchHit hit : searchHit) {
			Order order = new Order();
			orders.add(objectMapper.convertValue(hit.getSourceAsMap(), Order.class));
		}
		log.debug("<<<<<<<<<<<<<<<<<outputtttt{}>>>>>>>>", orders);
		return ResponseEntity.ok().body(orders);
	}
	public Page<CancellationRequest> findCancellationRequestByStatus(String statusName,Pageable pageable){
		QueryBuilder dslQuery = QueryBuilders.boolQuery().must(QueryBuilders.matchAllQuery()).filter(QueryBuilders.termQuery("status.keyword",statusName));
		SearchSourceBuilder searchSourceBuilder = new SearchSourceBuilder();
		searchSourceBuilder.query(dslQuery);
		SearchResponse searchResponse = serviceUtility.searchResponseForPage("cancellationrequest", searchSourceBuilder, pageable);

		Page<CancellationRequest> cancellationRequestPage = serviceUtility.getPageResult(searchResponse, pageable, new CancellationRequest());

		log.debug("output", cancellationRequestPage);

		return cancellationRequestPage;
	}



}
