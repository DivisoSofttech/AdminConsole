package com.diviso.graeshoppe.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;

import com.diviso.graeshoppe.client.report.api.QueryResourceApi;
import com.diviso.graeshoppe.client.report.model.OrderMaster;
import com.diviso.graeshoppe.service.OrderMasterQueryService;

public class OrderMasterQueryServiceImpl implements OrderMasterQueryService{
	
	@Autowired
	private QueryResourceApi queryResourceApi;

	@Override
	public ResponseEntity<List<OrderMaster>> getOrdersByFilter(String fromDate, String toDate, String storeId, String methodOfOrder,
			String paymentStatus) {
		
		if(fromDate!=null && toDate!=null && storeId!=null && methodOfOrder!=null && paymentStatus ==null) {
			
			queryResourceApi.getOrdersViewByMethodOfOrderUsingGET(fromDate, methodOfOrder, storeId);
			
		}

		else if(fromDate!=null && toDate!=null && storeId!=null && methodOfOrder==null && paymentStatus !=null) {
			
			queryResourceApi.getOrdersViewByPaymentStatusUsingGET(fromDate, paymentStatus, storeId);
			
		}
		
		else if(fromDate!=null && toDate!=null && storeId==null && methodOfOrder==null && paymentStatus ==null) {
			
			queryResourceApi.getOrdersViewBetweenDatesUsingGET(fromDate, toDate);
			
		}
		
	
		
		
		
		
		
		return null;
	}

}
