package com.diviso.graeshoppe.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.diviso.graeshoppe.client.report.api.QueryResourceApi;
import com.diviso.graeshoppe.client.report.model.OrderMaster;
import com.diviso.graeshoppe.client.report.model.PageOfOrderMaster;
import com.diviso.graeshoppe.service.OrderMasterQueryService;

import net.bytebuddy.dynamic.scaffold.InstrumentedType.Frozen;

@Service
public class OrderMasterQueryServiceImpl implements OrderMasterQueryService{
	
	@Autowired
	private QueryResourceApi queryResourceApi;

	@Override
	public ResponseEntity<PageOfOrderMaster> getOrdersByFilter(String fromDate, String toDate, String storeId, String methodOfOrder,
			String paymentStatus,Integer pageNumber,Integer size,List<String> sort) {
		
		ResponseEntity<PageOfOrderMaster> result = null;
		System.out.println(">>>>>>>>>>>>>"+fromDate+">>>>>>>>>"+ toDate+">>>>>>>"+ storeId+">>>>>>>>>>>>>>>>"+ methodOfOrder+">>>>>>>"+paymentStatus);
		
		if(fromDate!=null && toDate!=null && storeId!=null && methodOfOrder!=null && paymentStatus ==null) {
			
			System.out.println("if1");
			
			result=queryResourceApi.getOrdersViewByMethodOfOrderUsingGET(fromDate, methodOfOrder, storeId, toDate, pageNumber, size, sort);
			
		}

		else if(fromDate!=null && toDate!=null && storeId!=null && methodOfOrder==null && paymentStatus !=null) {
			
			System.out.println("if2");
						result=queryResourceApi.getOrdersViewByPaymentStatusUsingGET(fromDate, paymentStatus, storeId, toDate, pageNumber, size, sort);

			
		}
		
		else if(fromDate!=null && toDate!=null && storeId==null && methodOfOrder==null && paymentStatus ==null) {
			
			System.out.println("if3");
			result=queryResourceApi.getOrdersViewBetweenDatesUsingGET(fromDate, toDate, pageNumber, size, sort);
			
		}
		
		else if(fromDate!= null && toDate!= null && storeId!= null && methodOfOrder == null && paymentStatus == null ) {
			result=queryResourceApi.getOrdersViewBetweenDatesAndStoreIdpcodeUsingGET(fromDate, storeId, toDate, pageNumber, size, sort);
		}
		
	
		return result;
		
	
	}
	
	

}
