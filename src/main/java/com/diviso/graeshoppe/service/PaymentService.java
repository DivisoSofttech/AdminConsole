package com.diviso.graeshoppe.service;

import org.springframework.http.ResponseEntity;

import com.diviso.graeshoppe.client.administration.model.RefundDetailsDTO;
import com.diviso.graeshoppe.client.payment.model.RefundResponse;
import com.diviso.graeshoppe.model.RefundDTO;

public interface PaymentService {

	ResponseEntity<RefundDetailsDTO> createRefund(RefundDTO refundDetailsDTO,String orderId,String paymentId);
	
	
}
