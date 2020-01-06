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

import com.diviso.graeshoppe.client.customer.api.CustomerResourceApi;
import com.diviso.graeshoppe.client.customer.model.Customer;
import com.diviso.graeshoppe.service.CustomerQueryService;
import com.diviso.graeshoppe.config.elasticsearch.ServiceUtility ;
@Service
public class CustomerQueryServiceImpl implements CustomerQueryService{
	
	private final Logger log = LoggerFactory.getLogger(CustomerQueryServiceImpl.class);
	
	@Autowired
	CustomerResourceApi customerResourceApi;
	
	@Autowired
	ServiceUtility serviceUtility;

	@Override
	public ResponseEntity<Customer> findCustomerByIdpCode(String idpCode) {
		log.debug("<<<<<<<<<< findCustomerByIdpCode >>>>>>>> impl {}",idpCode);
		
		QueryBuilder queryBuilder = QueryBuilders.matchQuery("idpCode", idpCode);
		SearchSourceBuilder builder = new SearchSourceBuilder();
		builder.query(queryBuilder);
		SearchResponse response = serviceUtility.searchResponseForObject("customer", queryBuilder);
		return ResponseEntity.ok().body(serviceUtility.getObjectResult(response, new Customer()));
		
	}

}
