package com.diviso.graeshoppe.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.diviso.graeshoppe.client.report.api.QueryResourceApi;
import com.diviso.graeshoppe.client.report.model.OrderMaster;
import com.diviso.graeshoppe.service.OrderMasterQueryService;

@Service
public class OrderMasterQueryServiceImpl implements OrderMasterQueryService{
	
	@Autowired
	private QueryResourceApi queryResourceApi;

	@Override
	public ResponseEntity<List<OrderMaster>> getOrdersByFilter(String fromDate, String toDate, String storeId, String methodOfOrder,
			String paymentStatus) {
		
		ResponseEntity<List<OrderMaster>> result = null;
		System.out.println(">>>>>>>>>>>>>"+fromDate+">>>>>>>>>"+ toDate+">>>>>>>"+ storeId+">>>>>>>>>>>>>>>>"+ methodOfOrder+">>>>>>>"+paymentStatus);
		
		if(fromDate!=null && toDate!=null && storeId!=null && methodOfOrder!=null && paymentStatus ==null) {
			
			System.out.println("if1");
			
			result=queryResourceApi.getOrdersViewByMethodOfOrderUsingGET(fromDate, methodOfOrder, storeId);
			
		}

		else if(fromDate!=null && toDate!=null && storeId!=null && methodOfOrder==null && paymentStatus !=null) {
			
			System.out.println("if2");
			
			result=queryResourceApi.getOrdersViewByPaymentStatusUsingGET(fromDate, paymentStatus, storeId);
			
		}
		
		else if(fromDate!=null && toDate!=null && storeId==null && methodOfOrder==null && paymentStatus ==null) {
			
			System.out.println("if3");
			result=queryResourceApi.getOrdersViewBetweenDatesUsingGET(fromDate, toDate);
			
		}
		
	
		return result;
		
	
	}

}
