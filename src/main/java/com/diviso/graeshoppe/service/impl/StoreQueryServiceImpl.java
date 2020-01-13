package com.diviso.graeshoppe.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.diviso.graeshoppe.client.store.api.StoreResourceApi;
import com.diviso.graeshoppe.client.store.model.StoreDTO;
import com.diviso.graeshoppe.service.StoreQueryService;

@Service
public class StoreQueryServiceImpl implements StoreQueryService{
	
	private final Logger log = LoggerFactory.getLogger(StoreQueryServiceImpl.class);
	
	@Autowired
	StoreResourceApi storeResourceApi;

	@Override
	public ResponseEntity<StoreDTO> getStore(Long id) {
		log.debug("<<<<<<<<  getStore >>>>>>>{}",id);
		return storeResourceApi.getStoreUsingGET(id);
	}
	
}
