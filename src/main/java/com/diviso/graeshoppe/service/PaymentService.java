package com.diviso.graeshoppe.service;

import org.springframework.http.ResponseEntity;

import com.diviso.graeshoppe.client.administration.model.RefundDetailsDTO;
import com.diviso.graeshoppe.client.payment.model.RefundResponse;

public interface PaymentService {

	ResponseEntity<RefundDetailsDTO> createRefund(RefundDetailsDTO refundDetailsDTO,String orderId,String paymentId);
	
	
}
