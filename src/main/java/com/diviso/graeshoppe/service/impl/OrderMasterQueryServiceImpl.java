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
		
		return queryResourceApi.getOrdersByFilterUsingGET(fromDate, toDate, methodOfOrder, pageNumber, paymentStatus, size, sort, storeId);
		
	
	}
	
	

}
