package com.diviso.graeshoppe.service;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.diviso.graeshoppe.client.report.model.OrderMaster;
import com.diviso.graeshoppe.client.report.model.OrderMasterDTO;
import com.diviso.graeshoppe.client.report.model.PageOfOrderMaster;


public interface OrderMasterQueryService {

	public ResponseEntity<PageOfOrderMaster> getOrdersByFilter(String fromDate, String toDate, String storeId, String methodOfOrder,
			String paymentStatus,Integer pageNumber,Integer size,List<String> sort);

	public ResponseEntity<OrderMasterDTO>  findByOrderNumber(String orderNumber);

}
