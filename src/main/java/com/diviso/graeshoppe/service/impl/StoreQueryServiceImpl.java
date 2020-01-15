package com.diviso.graeshoppe.service.impl;

import org.elasticsearch.action.search.SearchResponse;
import org.elasticsearch.index.query.QueryBuilder;
import org.elasticsearch.index.query.QueryBuilders;
import org.elasticsearch.search.builder.SearchSourceBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.diviso.graeshoppe.client.store.api.StoreResourceApi;
import com.diviso.graeshoppe.client.store.model.Store;
import com.diviso.graeshoppe.client.store.model.StoreDTO;
import com.diviso.graeshoppe.config.elasticsearch.ServiceUtility;
import com.diviso.graeshoppe.service.StoreQueryService;

@Service
public class StoreQueryServiceImpl implements StoreQueryService{
	
	private final Logger log = LoggerFactory.getLogger(StoreQueryServiceImpl.class);
	
	@Autowired
	StoreResourceApi storeResourceApi;
	
	@Autowired
	ServiceUtility serviceUtility;

	@Override
	public ResponseEntity<StoreDTO> getStore(Long id) {
		log.debug("<<<<<<<<  getStore >>>>>>>{}",id);
		return storeResourceApi.getStoreUsingGET(id);
	}

	@Override
	public ResponseEntity<Store> getStoreByRegNo(String regNo) {
		log.debug("<<<<<<<<<<< getStoreByRegNo >>>>>>>>{}",regNo);
		QueryBuilder queryBuilder = QueryBuilders.boolQuery().must(QueryBuilders.matchQuery("regNo",regNo));
		SearchSourceBuilder builder = new SearchSourceBuilder();
		builder.query(queryBuilder);
		SearchResponse response=serviceUtility.searchResponseForObject("store", queryBuilder);
		
		return ResponseEntity.ok().body(serviceUtility.getObjectResult(response, new Store()));
	}
	
	
}
