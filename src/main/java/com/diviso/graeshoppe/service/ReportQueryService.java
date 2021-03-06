package com.diviso.graeshoppe.service;

import java.time.Instant;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import com.diviso.graeshoppe.client.report.model.AuxItem;
import com.diviso.graeshoppe.client.report.model.CancellationSummary;
import com.diviso.graeshoppe.client.report.model.OfferLine;
import com.diviso.graeshoppe.client.report.model.OrderLine;
import com.diviso.graeshoppe.client.report.model.OrderMaster;
import com.diviso.graeshoppe.client.report.model.OrderMasterDTO;
import com.diviso.graeshoppe.client.report.model.PageOfOrderMaster;
import com.diviso.graeshoppe.client.report.model.ReportSummary;
import com.diviso.graeshoppe.service.dto.PdfDTO;

public interface ReportQueryService {

	public ResponseEntity<ReportSummary> createReportSummary(String date, String storeName);

	public ResponseEntity<PageOfOrderMaster> findByExpectedDeliveryBetweenAndStoreIdpcode(String from, String storeIdpcode, String to, Pageable pageable);
	
	public Long countByExpectedDeliveryAndOrderStatus(String date, String orderStatus);

	public Long countByOrderStatus(String orderStatus);
	
	public ResponseEntity<PageOfOrderMaster> findByExpectedDeliveryBetween(String from, String to,Pageable pageable);

	public ResponseEntity<PdfDTO> getReportSummaryAsPdf(String date,String storeId);

	/**
	 * @param orderNumber
	 * @return
	 */
	public ResponseEntity<byte[]> getReportWithAuxAndComboAsPdf(String orderNumber);
	
	public ResponseEntity<byte[]> getSaleReportAsPdf(String storeidpcode);
	
	ResponseEntity<Long> findOrderMasterCountByExpectedDeliveryBetween(String from,String to);

	public ResponseEntity<List<OrderLine>> findOrderLinesByOrderNumber(String orderId);

	public ResponseEntity<List<OfferLine>> findOfferLinesByOrderNumber(String orderId);

	public ResponseEntity<List<AuxItem>> findOfferLinesById(Long id);

	public ResponseEntity<PdfDTO> getOrderSummaryByDateAndStoreName(String date, String storeId);

	/*
	 * public ResponseEntity<PdfDTO> getAllOrdersByMethodOfOrder(String date, String
	 * methodOfOrder, String storeId);
	 * 
	 * public ResponseEntity<PdfDTO> getAllOrdersBetweenDates(String fromDate,
	 * String toDate);
	 * 
	 * public ResponseEntity<PdfDTO> getAllOrdersByPaymentStatus(String date, String
	 * paymentStatus, String storeId);
	 */
	public ResponseEntity<PdfDTO> getOrdersPdfByFilter(String fromDate, String toDate, String storeId,
			String methodOfOrder, String paymentStatus);

	public ResponseEntity<PdfDTO> getCancellationReportAsPdf(String date, String storeName);

	public ResponseEntity<CancellationSummary> cancellationSummaryForView(String date, String storeName);

	public ResponseEntity<OrderMaster> getOrderMasterByOrderNumber(String orderNumber);
	
	
	
}
