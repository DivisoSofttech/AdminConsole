package com.diviso.graeshoppe.service;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.diviso.graeshoppe.client.report.model.OrderMaster;


public interface OrderMasterQueryService {

	ResponseEntity<List<OrderMaster>>getOrdersByFilter(String fromDate, String toDate, String storeId, String methodOfOrder,
			String paymentStatus);

}
