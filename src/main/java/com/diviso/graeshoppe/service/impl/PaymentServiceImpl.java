package com.diviso.graeshoppe.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.diviso.graeshoppe.client.administration.api.RefundDetailsResourceApi;
import com.diviso.graeshoppe.client.administration.model.RefundDetailsDTO;
import com.diviso.graeshoppe.client.payment.api.BraintreeCommandResourceApi;
import com.diviso.graeshoppe.client.payment.model.RefundResponse;
import com.diviso.graeshoppe.service.PaymentService;

@Service
public class PaymentServiceImpl implements PaymentService {

	private final Logger log = LoggerFactory.getLogger(PaymentServiceImpl.class);

	@Autowired
	private BraintreeCommandResourceApi braintreeCommandResourceApi;

	@Autowired
	private RefundDetailsResourceApi refundDetailsResourceApi;

	@Override
	public ResponseEntity<RefundDetailsDTO> createRefund(RefundDetailsDTO refundDetailsDTO, String orderId,
			String paymentId) {

		log.debug("REST request to save createRefundDetails : {}",
				refundDetailsDTO + "\n ## orderId = " + orderId + "\n ## paymentId  " + paymentId);

		RefundDetailsDTO result = new RefundDetailsDTO();
		/* creating an refund request in payment microservice */

		/*
		 * RefundResponse refundResponse = braintreeCommandResourceApi
		 * .createRefundUsingPOST(paymentId, refundDetailsDTO.getAmount()).getBody();
		 */
		
		RefundResponse refundResponse=new RefundResponse();
		refundResponse.setStatus("completed");
		refundResponse.setTransactionId("testtransactionid");

		if (refundResponse.getStatus().equalsIgnoreCase("completed")) {
			refundDetailsDTO.setRefundId(refundResponse.getTransactionId());
			result = refundDetailsResourceApi.createRefundDetailsUsingPOST(orderId, refundDetailsDTO).getBody();
			result.setStatus("completed");
		} else {
			result.setStatus("declined");
		}
		/* transaction id of refund request is set as refund id in refundDetails */

		return ResponseEntity.ok(result);
	}

}
