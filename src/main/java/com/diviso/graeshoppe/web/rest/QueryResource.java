package com.diviso.graeshoppe.web.rest;
import com.diviso.graeshoppe.client.administration.model.CancellationRequest;
import java.time.Instant;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.List;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.diviso.graeshoppe.client.administration.model.About;
import com.diviso.graeshoppe.client.administration.model.Banner;
import com.diviso.graeshoppe.client.administration.model.BannerDTO;
import com.diviso.graeshoppe.client.administration.model.CancellationDetails;
import com.diviso.graeshoppe.client.administration.model.CancellationRequestDTO;
import com.diviso.graeshoppe.client.administration.model.CancelledOrderLine;
import com.diviso.graeshoppe.client.administration.model.CancelledOrderLineDTO;
import com.diviso.graeshoppe.client.administration.model.DataResponse;
import com.diviso.graeshoppe.client.administration.model.Feedback;
import com.diviso.graeshoppe.client.administration.model.NotificationDTO;
import com.diviso.graeshoppe.client.administration.model.RefundDetails;
import com.diviso.graeshoppe.client.administration.model.RefundDetailsDTO;
import com.diviso.graeshoppe.client.aggregator.SubTerm;
import com.diviso.graeshoppe.client.aggregator.Term;
import com.diviso.graeshoppe.client.customer.model.Customer;
import com.diviso.graeshoppe.client.offer.model.DeductionValueTypeDTO;
import com.diviso.graeshoppe.client.offer.model.OfferDTO;
import com.diviso.graeshoppe.client.order.model.Order;
import com.diviso.graeshoppe.client.report.model.AuxItem;
import com.diviso.graeshoppe.client.report.model.CancellationSummary;
import com.diviso.graeshoppe.client.report.model.OfferLine;
import com.diviso.graeshoppe.client.report.model.OrderLine;
import com.diviso.graeshoppe.client.report.model.OrderMaster;
import com.diviso.graeshoppe.client.report.model.OrderMasterDTO;
import com.diviso.graeshoppe.client.report.model.PageOfOrderMaster;
import com.diviso.graeshoppe.client.report.model.ReportSummary;
import com.diviso.graeshoppe.client.store.model.Store;

import com.diviso.graeshoppe.client.store.model.StoreDTO;

import com.diviso.graeshoppe.custommodel.ReportFilter;

import com.diviso.graeshoppe.service.AdministrationQueryService;
import com.diviso.graeshoppe.service.CustomerQueryService;
import com.diviso.graeshoppe.service.OfferQueryService;
import com.diviso.graeshoppe.service.OrderMasterQueryService;
import com.diviso.graeshoppe.service.OrderQueryService;
import com.diviso.graeshoppe.service.ReportQueryService;
import com.diviso.graeshoppe.service.StoreQueryService;
import com.diviso.graeshoppe.service.dto.PdfDTO;

import io.swagger.annotations.ApiParam;

/**
 * REST controller for managing query service.
 */
@RestController
@RequestMapping("/api/query")
public class QueryResource {
	
	@Autowired
	StoreQueryService storeQuerySerice;

	@Autowired
	OrderQueryService orderQueryService;

	@Autowired
	ReportQueryService reportQueryService;

	@Autowired
	OfferQueryService offerQueryService;

	@Autowired
	AdministrationQueryService administrationQueryService;
	
	@Autowired
	CustomerQueryService customerQueryService;
	
	@Autowired
	OrderMasterQueryService orderMasterQueryService;

	private final Logger log = LoggerFactory.getLogger(QueryResource.class);


	@GetMapping("/reportview/{date}")
	public ResponseEntity<ReportSummary> createReportSummary(@PathVariable String date,@RequestParam(value="storeName",required = false)
			 String storeName) {
		return reportQueryService.createReportSummary(date, storeName);
	}

	@GetMapping("/findOrderByDatebetweenAndStoreId/{from}/{storeId}/{to}")
	public ResponseEntity<PageOfOrderMaster> findOrderByDatebetweenAndStoreId(@PathVariable String from,
			@PathVariable String storeId, @PathVariable String to, Pageable pageable) {
		return reportQueryService.findByExpectedDeliveryBetweenAndStoreIdpcode(from, storeId, to, pageable);
	}

	@GetMapping("/findOrderCountByDateAndStatusName/{date}/{statusName}")
	public Long findOrderCountByDateAndStatusName(@PathVariable String date, @PathVariable String statusName) {
		return reportQueryService.countByExpectedDeliveryAndOrderStatus(date, statusName);
	}

	@GetMapping("/findOrderCountByStatusName/{statusName}")
	public Long findOrderCountByStatusName(@PathVariable String statusName) {
		return reportQueryService.countByOrderStatus(statusName);
	}

	@GetMapping("/findOrderMasterByOrderNumber/{orderNumber}")
	public ResponseEntity<OrderMasterDTO>  findOrderMasterByOrderMaster(@PathVariable String orderNumber) {
		return orderMasterQueryService.findByOrderNumber(orderNumber);
	}

	@GetMapping("/findOrderMasterByExpectedDeliveryBetween/{from}/{to}")
	public ResponseEntity<PageOfOrderMaster> findOrderMasterByExpectedDeliveryBetween(@PathVariable String from,
			@PathVariable String to, Pageable pageable) {
		return reportQueryService.findByExpectedDeliveryBetween(from, to, pageable);
	}

	@GetMapping("/reportSummary/{date}")
	public ResponseEntity<PdfDTO> getReportSummaryAsPdf(@PathVariable String date, @RequestParam(value = "storeId", required = false) String storeId) {

		return reportQueryService.getReportSummaryAsPdf(date, storeId);
	}

	@GetMapping("/auxcombo/{orderNumber}")
	public ResponseEntity<byte[]> getReportWithAuxAndComboAsPdf(@PathVariable String orderNumber) {

		return reportQueryService.getReportWithAuxAndComboAsPdf(orderNumber);
	}

	@GetMapping("/salereport/{storeidpcode}")
	public ResponseEntity<byte[]> getSaleReportAsPdf(@PathVariable String storeidpcode) {

		return reportQueryService.getSaleReportAsPdf(storeidpcode);
	}

	@GetMapping("/findOrderMasterCountByExpectedDeliveryBetween/{from}/{to}")
	public ResponseEntity<Long> findOrderMasterCountByExpectedDeliveryBetween(@PathVariable String from,
			@PathVariable String to) {

		return reportQueryService.findOrderMasterCountByExpectedDeliveryBetween(from, to);
	}

	/**
	 * GET /deduction-value-types : get all the deductionValueTypes of offers.
	 *
	 * @param pageable the pagination information
	 * @return the ResponseEntity with status 200 (OK) and the list of
	 *         deductionValueTypes in body
	 */
	@GetMapping("/offers/get-all-deduction-value-types")
	public ResponseEntity<List<DeductionValueTypeDTO>> getAllDeductionValueTypes(Pageable pageable) {
		log.debug("REST request to get a page of DeductionValueTypes");

		return offerQueryService.findAllDeductionValueTypes(pageable);
	}

	/**
	 * GET /offers : get all the offers.
	 *
	 * @param pageable the pagination information
	 * @return the ResponseEntity with status 200 (OK) and the list of offers in
	 *         body
	 */
	@GetMapping("/offers/get-all-offers")
	public ResponseEntity<List<OfferDTO>> getAllOffers(Pageable pageable) {
		log.debug("REST request to get a page of Offers");

		return offerQueryService.findAllOffers(pageable);
	}

	/**
	 * GET /query/offers/get-offer-by-id/:id : get the "id" offer.
	 *
	 * @param id the id of the offerDTO to retrieve
	 * @return the ResponseEntity with status 200 (OK) and with body the offerDTO,
	 *         or with status 404 (Not Found)
	 */
	@GetMapping("/offers/get-offer-by-id/{id}")
	public ResponseEntity<OfferDTO> getOfferById(@PathVariable Long id) {

		return offerQueryService.findOfferById(id);
	}

	/**
	 * Get the "promoCode" of the offer.
	 *
	 * @param promoCode the promoCode of the entity
	 * @return the entity
	 */
	ResponseEntity<OfferDTO> getOfferByPromoCode(@PathVariable String promoCode) {

		return offerQueryService.findOfferByPromoCode(promoCode);
	}

	/**
	 * GET /cancellation-requests : get all the cancellationRequests.
	 *
	 * @param pageable the pagination information
	 * @return the ResponseEntity with status 200 (OK) and the list of
	 *         cancellationRequests in body
	 */
	@GetMapping("/cancellation-requests")
	public ResponseEntity<List<CancellationRequestDTO>> getAllCancellationRequests(Pageable pageable) {

		return administrationQueryService.getAllCancellationRequests(pageable);
	}

	/**
	 * GET /cancellation-requests/:id : get the "id" cancellationRequest.
	 *
	 * @param id the id of the cancellationRequestDTO to retrieve
	 * @return the ResponseEntity with status 200 (OK) and with body the
	 *         cancellationRequestDTO, or with status 404 (Not Found)
	 */
	@GetMapping("/cancellation-requests/{id}")
	public ResponseEntity<CancellationRequestDTO> getCancellationRequest(@PathVariable Long id) {

		return administrationQueryService.findCancellationRequestById(id);
	}

	@GetMapping("/tasks")
	public ResponseEntity<DataResponse> getTasks(@RequestParam(value = "name", required = false) String name,
			@RequestParam(value = "nameLike", required = false) String nameLike,
			@RequestParam(value = "description", required = false) String description,
			@RequestParam(value = "priority", required = false) String priority,
			@RequestParam(value = "minimumPriority", required = false) String minimumPriority,
			@RequestParam(value = "maximumPriority", required = false) String maximumPriority,
			@RequestParam(value = "assignee", required = false) String assignee,
			@RequestParam(value = "assigneeLike", required = false) String assigneeLike,
			@RequestParam(value = "owner", required = false) String owner,
			@RequestParam(value = "ownerLike", required = false) String ownerLike,
			@RequestParam(value = "unassigned", required = false) String unassigned,
			@RequestParam(value = "delegationState", required = false) String delegationState,
			@RequestParam(value = "candidateUser", required = false) String candidateUser,
			@RequestParam(value = "candidateGroup", required = false) String candidateGroup,
			@RequestParam(value = "candidateGroups", required = false) String candidateGroups,
			@RequestParam(value = "involvedUser", required = false) String involvedUser,
			@RequestParam(value = "taskDefinitionKey", required = false) String taskDefinitionKey,
			@RequestParam(value = "taskDefinitionKeyLike", required = false) String taskDefinitionKeyLike,
			@RequestParam(value = "processInstanceId", required = false) String processInstanceId,
			@RequestParam(value = "processInstanceBusinessKey", required = false) String processInstanceBusinessKey,
			@RequestParam(value = "processInstanceBusinessKeyLike", required = false) String processInstanceBusinessKeyLike,
			@ApiParam(value = "Only return tasks which are part of a process instance which has a process definition with the given id.") @Valid @RequestParam(value = "processDefinitionId", required = false) String processDefinitionId,
			@ApiParam(value = "Only return tasks which are part of a process instance which has a process definition with the given key.") @Valid @RequestParam(value = "processDefinitionKey", required = false) String processDefinitionKey,
			@ApiParam(value = "Only return tasks which are part of a process instance which has a process definition with a key like the given value.") @Valid @RequestParam(value = "processDefinitionKeyLike", required = false) String processDefinitionKeyLike,
			@ApiParam(value = "Only return tasks which are part of a process instance which has a process definition with the given name.") @Valid @RequestParam(value = "processDefinitionName", required = false) String processDefinitionName,
			@ApiParam(value = "Only return tasks which are part of a process instance which has a process definition with a name like the given value.") @Valid @RequestParam(value = "processDefinitionNameLike", required = false) String processDefinitionNameLike,
			@ApiParam(value = "Only return tasks which are part of the execution with the given id.") @Valid @RequestParam(value = "executionId", required = false) String executionId,
			@ApiParam(value = "Only return tasks which are created on the given date.") @Valid @RequestParam(value = "createdOn", required = false) String createdOn,
			@ApiParam(value = "Only return tasks which are created before the given date.") @Valid @RequestParam(value = "createdBefore", required = false) String createdBefore,
			@ApiParam(value = "Only return tasks which are created after the given date.") @Valid @RequestParam(value = "createdAfter", required = false) String createdAfter,
			@ApiParam(value = "Only return tasks which are due on the given date.") @Valid @RequestParam(value = "dueOn", required = false) String dueOn,
			@ApiParam(value = "Only return tasks which are due before the given date.") @Valid @RequestParam(value = "dueBefore", required = false) String dueBefore,
			@ApiParam(value = "Only return tasks which are due after the given date.") @Valid @RequestParam(value = "dueAfter", required = false) String dueAfter,
			@ApiParam(value = "Only return tasks which don�t have a due date. The property is ignored if the value is false.") @Valid @RequestParam(value = "withoutDueDate", required = false) Boolean withoutDueDate,
			@ApiParam(value = "Only return tasks that are not a subtask of another task.") @Valid @RequestParam(value = "excludeSubTasks", required = false) Boolean excludeSubTasks,
			@ApiParam(value = "If true, only return tasks that are not suspended (either part of a process that is not suspended or not part of a process at all). If false, only tasks that are part of suspended process instances are returned.") @Valid @RequestParam(value = "active", required = false) Boolean active,
			@ApiParam(value = "Indication to include task local variables in the result.") @Valid @RequestParam(value = "includeTaskLocalVariables", required = false) Boolean includeTaskLocalVariables,
			@ApiParam(value = "Indication to include process variables in the result.") @Valid @RequestParam(value = "includeProcessVariables", required = false) Boolean includeProcessVariables,
			@ApiParam(value = "Only return tasks with the given tenantId.") @Valid @RequestParam(value = "tenantId", required = false) String tenantId,
			@ApiParam(value = "Only return tasks with a tenantId like the given value.") @Valid @RequestParam(value = "tenantIdLike", required = false) String tenantIdLike,
			@ApiParam(value = "If true, only returns tasks without a tenantId set. If false, the withoutTenantId parameter is ignored.") @Valid @RequestParam(value = "withoutTenantId", required = false) Boolean withoutTenantId,
			@ApiParam(value = "Select tasks that has been claimed or assigned to user or waiting to claim by user (candidate user or groups).") @Valid @RequestParam(value = "candidateOrAssigned", required = false) String candidateOrAssigned,
			@ApiParam(value = "Select tasks with the given category. Note that this is the task category, not the category of the process definition (namespace within the BPMN Xml). ") @Valid @RequestParam(value = "category", required = false) String category) {

		return administrationQueryService.getTasks(name, nameLike, description, priority, minimumPriority,
				maximumPriority, assignee, assigneeLike, owner, ownerLike, unassigned, delegationState, candidateUser,
				candidateGroup, candidateGroups, involvedUser, taskDefinitionKey, taskDefinitionKeyLike,
				processInstanceId, processInstanceBusinessKey, processInstanceBusinessKeyLike, processDefinitionId,
				processDefinitionKey, processDefinitionKeyLike, processDefinitionName, processDefinitionNameLike,
				executionId, createdOn, createdBefore, createdAfter, dueOn, dueBefore, dueAfter, withoutDueDate,
				excludeSubTasks, active, includeTaskLocalVariables, includeProcessVariables, tenantId, tenantIdLike,
				withoutTenantId, candidateOrAssigned, category);
	}

	/**
	 * SEARCH /_search/cancellation-requests?query=:query : search for the
	 * cancellationRequest corresponding to the query.
	 *
	 * @param query    the query of the cancellationRequest search
	 * @param pageable the pagination information
	 * @return the result of the search
	 */
	@GetMapping("/_search/cancellation-requests")
	public ResponseEntity<List<CancellationRequestDTO>> searchCancellationRequests(@RequestParam String query,
			Pageable pageable) {

		return administrationQueryService.searchCancellationRequests(query, pageable);
	}

	/**
	 * GET /cancelled-order-lines : get all the cancelledOrderLines.
	 *
	 * @param pageable the pagination information
	 * @return the ResponseEntity with status 200 (OK) and the list of
	 *         cancelledOrderLines in body
	 */
	@GetMapping("/cancelled-order-lines")
	public ResponseEntity<List<CancelledOrderLineDTO>> getAllCancelledOrderLines(Pageable pageable) {

		return administrationQueryService.findAllCancelledOrderLines(pageable);
	}

	/**
	 * GET /cancelled-order-lines/:id : get the "id" cancelledOrderLine.
	 *
	 * @param id the id of the cancelledOrderLineDTO to retrieve
	 * @return the ResponseEntity with status 200 (OK) and with body the
	 *         cancelledOrderLineDTO, or with status 404 (Not Found)
	 */
	@GetMapping("/cancelled-order-lines/{id}")
	public ResponseEntity<CancelledOrderLineDTO> getCancelledOrderLine(@PathVariable Long id) {

		return administrationQueryService.findCancelledOrderLine(id);
	}

	/**
	 * SEARCH /_search/cancelled-order-lines?query=:query : search for the
	 * cancelledOrderLine corresponding to the query.
	 *
	 * @param query    the query of the cancelledOrderLine search
	 * @param pageable the pagination information
	 * @return the result of the search
	 */
	@GetMapping("/_search/cancelled-order-lines")
	public ResponseEntity<List<CancelledOrderLineDTO>> searchCancelledOrderLines(
			@RequestParam(value = "query", required = true) String query, Pageable pageable) {

		return administrationQueryService.searchCancelledOrderLines(query, pageable);
	}

	/**
	 * @author Prince
	 * 
	 */
	@GetMapping("/banners")
	public ResponseEntity<List<BannerDTO>> getAllBanners(Pageable pageable) {
		log.debug("<<<<<<<<<  getAllBanners >>>>>>>>>>>>");
		return administrationQueryService.findAllBanners(pageable);

	}

	@GetMapping("/banners/{id}")
	public ResponseEntity<BannerDTO> getBanner(@PathVariable Long id) {
		log.debug("<<<<<<<< getBanner >>>>>>>", id);
		return administrationQueryService.findBanner(id);

	}

	@GetMapping("/_search/banners/")
	public ResponseEntity<List<BannerDTO>> searchBanner(@PathVariable String query, Pageable pageable) {
		log.debug("<<<<<<< searchBanner >>>>>>>{}", query);
		return administrationQueryService.searchBanners(query, pageable);
	}

	@GetMapping("/notifications/{id}")
	public ResponseEntity<NotificationDTO> getNotification(@PathVariable Long id) {
		log.debug("<<<<<<<<<<< getNotification >>>>>>>>>>", id);
		return administrationQueryService.findNotification(id);
	}

	@GetMapping("/notifications")
	public ResponseEntity<List<NotificationDTO>> getAllNotifications(Pageable pageable) {
		log.debug("<<<<<<<<< getAllNotifications >>>>>>>>>");
		return administrationQueryService.findAllNotifications(pageable);

	}

	@GetMapping("/_search/notifications")
	public ResponseEntity<List<NotificationDTO>> searchNotifications(@RequestParam String query, Pageable pageable) {
		log.debug("<<<<<<<<<<<  searchNotifications >>>>>>>>>{}", query);
		return administrationQueryService.searchNotifications(query, pageable);
	}

	@GetMapping("/refund-details/{id}")
	public ResponseEntity<RefundDetailsDTO> getRefundDetails(@PathVariable Long id) {
		log.debug("<<<<<<<<<<< getRefundDetails >>>>>>>>>>", id);
		return administrationQueryService.findRefundDetails(id);
	}

	@GetMapping("/refund-details")
	public ResponseEntity<List<RefundDetailsDTO>> getAllRefundDetails(Pageable pageable) {
		log.debug("<<<<<<<<< getAllRefundDetails >>>>>>>>>");
		return administrationQueryService.findAllRefundDetails(pageable);

	}

	@GetMapping("/_search/refund-details")
	public ResponseEntity<List<RefundDetailsDTO>> searchRefundDetails(@RequestParam String query, Pageable pageable) {
		log.debug("<<<<<<<<<<<  searchRefundDetails >>>>>>>>>{}", query);
		return administrationQueryService.searchRefundDetails(query, pageable);
	}

	@GetMapping("/findStore/{name}")
	public Page<Store> findStoreBySearchTerm(@PathVariable String name, Pageable pageable) {
		return administrationQueryService.findStoreByName(name, pageable);
	}

	@GetMapping("/findOrderLinesByOrderNumber/{orderId}")
	public ResponseEntity<List<OrderLine>> findOrderLinesByOrderNumber(@PathVariable String orderId) {
		log.debug("<<<<<<<<<< findOrderLinesByOrderNumber >>>>>>>>>{}", orderId);
		return reportQueryService.findOrderLinesByOrderNumber(orderId);

	}

	@GetMapping("/findOfferLinesByOrderNumber/{orderId}")
	public ResponseEntity<List<OfferLine>> findOfferLinesByOrderNumber(@PathVariable String orderId) {
		log.debug("<<<<<<<<<< findOfferLinesByOrderNumber >>>>>>>>>{}", orderId);
		return reportQueryService.findOfferLinesByOrderNumber(orderId);

	}

	@GetMapping("/findAuxItemsLinesById/{id}")
	public ResponseEntity<List<AuxItem>> findAuxItemsById(@PathVariable Long id) {
		log.debug("<<<<<<<<<< findAuxItemsById >>>>>>>>>{}", id);
		return reportQueryService.findOfferLinesById(id);

	}

	@GetMapping("/findOrderByOrderId/{orderId}")
	public ResponseEntity<Order> findOrderByOrderId(@PathVariable  String orderId) {
		log.debug("<<<<<<<<<< findOrderById >>>>>>>>>{}", orderId);
		return orderQueryService.findOrderByOrderId(orderId);

	}

	@GetMapping("/findOrdersByOrderId/{orderId}")
	public ResponseEntity<List<Order>> findOrdersByOrderId(@PathVariable String orderId) {
		log.debug("<<<<<<<<< findOrdersByOrderId >>>>>>>>>{}", orderId);
		return orderQueryService.findByOrdersByOrderId(orderId);
	}
	
	@GetMapping("/findBannerByStoreId/{storeId}")
	public Page<Banner> findBannerByStoreId(@PathVariable String storeId,Pageable pageable){
		log.debug("<<<<<<<<< findBannerByStoreId >>>>>>>>>{}",storeId);
		return administrationQueryService.findBannerByStoreId(storeId,pageable);

	}
	
	@GetMapping("/getOrderSummaryByDateAndStoreName/{date}/{storeId}")
	public ResponseEntity<PdfDTO> getOrderSummaryByDateAndStoreName(@PathVariable String date, @PathVariable String storeId) {
		return reportQueryService.getOrderSummaryByDateAndStoreName(date, storeId);
		
	}

	@GetMapping("/findAllCancellationRequests")
	public ResponseEntity<List<CancellationRequestDTO>> findAllCancellationRequests(Pageable pageable){
		log.debug("<<<<<<<<<< findCancellationRequest >>>>>>>>{}",pageable);
		
		return administrationQueryService.findAllCancellationRequests(pageable);
	}
	
	@GetMapping("/findCustomerByCustomerUniqueId/{customerUniqueId}")
	public ResponseEntity<Customer> findCustomerByCustomerUniqueId(@PathVariable String customerUniqueId){
		log.debug("<<<<<<<<<< findCancellationRequest >>>>>>>>{}",customerUniqueId);
		
		return customerQueryService.findCustomerByCustomerUniqueId(customerUniqueId);
	}
	@GetMapping("/findCancellationRequestByStatus/{statusName}/{date}")
	public Page<CancellationRequest> findCancellationRequestByStatus(@PathVariable String statusName,@PathVariable LocalDate date,Pageable pageable){
		log.debug("<<<<<<<<<< findCancellationRequestByStatus>>>>>>>>{}",statusName);
		return orderQueryService.findCancellationRequestByStatus(statusName,date,pageable);
	}

	@GetMapping("/getStore/{id}")
	public ResponseEntity<StoreDTO> getStore(@PathVariable Long id){
		log.debug("<<<<<<<<<<< getStore >>>>>>>>{}",id);
		return storeQuerySerice.getStore(id);
	}

	
	@GetMapping("/getOrdersByFilter/{fromDate}/{toDate}")
	public ResponseEntity<PageOfOrderMaster> getOrdersByFilter(@PathVariable String fromDate,
			@PathVariable String toDate,
			@RequestParam(value = "storeId", required = false) String storeId,
			@RequestParam(value = "methodOfOrder", required = false) String methodOfOrder,
			@RequestParam(value = "paymentStatus", required = false) String paymentStatus,
			@RequestParam(value = "pageNumber", required = false) Integer pageNumber,
			@RequestParam(value = "size", required = false) Integer size,
			@RequestParam(value = "sort", required = false)  List<String> sort) {
	
		log.debug("<<<<<<<<<< getOrdersByReportFilter>>>>>>>>{}");
		
		return orderMasterQueryService.getOrdersByFilter(fromDate, toDate, storeId, methodOfOrder, paymentStatus, pageNumber, size, sort);			
	}
	@GetMapping("/getStoreByRegNo/{regNo}")
	public ResponseEntity<Store> getStoreByRegNo(@PathVariable String regNo){
		log.debug("<<<<<<<<<<< getStore >>>>>>>>{}",regNo);
		return storeQuerySerice.getStoreByRegNo(regNo);
	}
	@GetMapping("/getCancellationRequest/{orderId}")
	public ResponseEntity<CancellationRequest> getCancellationRequestByOrderId(@PathVariable String orderId){
		log.debug("<<<<<<<<< getCancellationRequest >>>>>>>{}",orderId);
		return administrationQueryService.getCancellationRequest(orderId);
		
	}
	
	
	@GetMapping("/getOrdersPdfByFilter/{fromDate}/{toDate}")
	public ResponseEntity<PdfDTO> getOrdersPdfByFilter(@PathVariable String fromDate,
			@PathVariable String toDate,
			@RequestParam(value = "storeId", required = false) String storeId,
			@RequestParam(value = "methodOfOrder", required = false) String methodOfOrder,
			@RequestParam(value = "paymentStatus", required = false) String paymentStatus) {
	
		log.debug("<<<<<<<<<< getOrdersPdfByReportFilter>>>>>>>>{}");
		return reportQueryService.getOrdersPdfByFilter(fromDate,toDate, storeId, methodOfOrder, paymentStatus);
		
		
	}
	@GetMapping("/getRefundDetailById/{id}")
	public ResponseEntity<RefundDetails> findRefundDetail(Long id){
		log.debug("<<<<<<<<<<< findRefundDetail>>>>>>>>>{}",id);
		return administrationQueryService.getRefundDetails(id);
	}
	@GetMapping("/findCancellationDetailsById/{id}")
	public CancellationDetails findCancellationDetailsById(@PathVariable Long id){
		log.debug("<<<<<<<<<findCancellationDetailsById>>>>{}",id);
		return administrationQueryService.findCancellationDetailsById(id);
		
	}

	@GetMapping("/findAllFeedBack")
	public Page<Feedback> findAllFeedBack(Pageable pageable){
		log.debug("<<<<<<<<<findAllFeedBack >>>>>>>{}",pageable);
		return administrationQueryService.findAllFeedBack(pageable);
	}
	
	@GetMapping("/cancellationSummary/{date}/{storeName}")
	public ResponseEntity<PdfDTO> getCancellationReportAsPdf(@PathVariable String date, @PathVariable String storeName) {

		
		System.out.println("<<<<<<<<<cancellation report >>>>>>>{}"+date +""+storeName);
		return reportQueryService.getCancellationReportAsPdf(date, storeName);
	}

	@GetMapping("/about/{id}")
	public About findAboutById(@PathVariable Long id) {
		return administrationQueryService.findAboutById(id);
		
	}

	@GetMapping("/term/{id}")
	public Term findTermById(@PathVariable Long id) {
		return administrationQueryService.findTermById(id);
	}
	
	@GetMapping("/findallterms")
	Page<Term> findallterms(Pageable pageable){
			return administrationQueryService.findallterms(pageable);
		
	}

	@GetMapping("/findallabout")
	Page<About> findallabout(Pageable pageable){
		return administrationQueryService.findallabout(pageable);
	}
	
	@GetMapping("/subTerm/{id}")
	public SubTerm findSubTermById(Long id) {
		return administrationQueryService.findSubTermById(id);
	}
	
	@GetMapping("/findSubTermByTermId/{id}")
	public List<SubTerm> getSubTermsByTermId(@PathVariable Long id) {
		return administrationQueryService.getSubTermsBySubtermId(id);
	}
	
	@GetMapping("/cancellationview/{date}/{storeName}")
	public ResponseEntity<CancellationSummary> cancellationSummaryForView(@PathVariable String date,@PathVariable String storeName) {
		return reportQueryService.cancellationSummaryForView(date, storeName);
	}
	@GetMapping("/getOrderMasterByOrderNumber/{orderNumber}")
	public ResponseEntity<OrderMaster> getOrderMasterByOrderNumber(@PathVariable String orderNumber){
		log.debug("<<<<<<<<<<<findOrderMasterByOrderNumber>>>>>>>{}",orderNumber);
		return reportQueryService.getOrderMasterByOrderNumber(orderNumber);
		
	}
	@GetMapping("/findTermByTermId/{id}")
	public ResponseEntity<List<Term>> getTermByTermId(@PathVariable Long id){
		log.debug("<<<<<<<<< getTermById >>>>>>>{}",id);
		return administrationQueryService.getTermByTermId(id);
	}
	
}
