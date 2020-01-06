package com.diviso.graeshoppe.service;

import org.springframework.http.ResponseEntity;

import com.diviso.graeshoppe.client.customer.model.Customer;

public interface CustomerQueryService {

	ResponseEntity<Customer> findCustomerByIdpCode(String idpCode);

}
