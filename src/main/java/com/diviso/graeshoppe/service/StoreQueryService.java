package com.diviso.graeshoppe.service;

import org.springframework.http.ResponseEntity;

import com.diviso.graeshoppe.client.store.model.StoreDTO;

public interface StoreQueryService {

	ResponseEntity<StoreDTO> getStore(Long id);

}
