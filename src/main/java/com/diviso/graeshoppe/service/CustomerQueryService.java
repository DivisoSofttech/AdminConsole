package com.diviso.graeshoppe.service;

import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;

import com.diviso.graeshoppe.client.administration.model.CancellationRequest;
import com.diviso.graeshoppe.client.customer.model.Customer;

public interface CustomerQueryService {

	ResponseEntity<Customer> findCustomerByCustomerUniqueId(String customerUniqueId);

	

}
