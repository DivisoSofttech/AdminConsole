package com.diviso.graeshoppe.service.impl;
import static org.elasticsearch.index.query.QueryBuilders.matchAllQuery;
import static org.elasticsearch.index.query.QueryBuilders.termQuery;
import static org.elasticsearch.index.query.QueryBuilders.matchQuery;
import org.elasticsearch.action.search.SearchResponse;
import org.elasticsearch.search.aggregations.bucket.terms.Terms;
import org.elasticsearch.search.builder.SearchSourceBuilder;
import org.elasticsearch.search.sort.FieldSortBuilder;
import org.elasticsearch.search.sort.SortBuilders;
import org.elasticsearch.search.sort.SortOrder;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort.Order;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.diviso.graeshoppe.client.administration.api.BannerResourceApi;
import com.diviso.graeshoppe.client.administration.api.CancellationRequestResourceApi;
import com.diviso.graeshoppe.client.administration.api.CancelledOrderLineResourceApi;
import com.diviso.graeshoppe.client.administration.api.NotificationResourceApi;
import com.diviso.graeshoppe.client.administration.api.RefundDetailsResourceApi;
import com.diviso.graeshoppe.client.administration.model.Banner;
import com.diviso.graeshoppe.client.administration.model.BannerDTO;
import com.diviso.graeshoppe.client.administration.model.CancellationRequest;
import com.diviso.graeshoppe.client.administration.model.CancellationRequestDTO;
import com.diviso.graeshoppe.client.administration.model.CancelledOrderLineDTO;
import com.diviso.graeshoppe.client.administration.model.DataResponse;
import com.diviso.graeshoppe.client.administration.model.NotificationDTO;
import com.diviso.graeshoppe.client.administration.model.RefundDetailsDTO;
import com.diviso.graeshoppe.client.store.model.Store;
import com.diviso.graeshoppe.service.AdministrationQueryService;
import com.diviso.graeshoppe.config.elasticsearch.ServiceUtility ;

import org.elasticsearch.index.query.QueryBuilder;
import org.elasticsearch.index.query.QueryBuilders;
import org.elasticsearch.search.SearchHit;
@Service
public class AdministrationQueryServiceImpl implements AdministrationQueryService{
	
	private Logger log = LoggerFactory.getLogger(AdministrationQueryServiceImpl.class);
	@Autowired
	
	ServiceUtility serviceUtility;
	@Autowired
	CancellationRequestResourceApi cancellationRequestResourceApi;
	
	@Autowired
	CancelledOrderLineResourceApi cancelledOrderLineResourceApi;
	
	@Autowired
	BannerResourceApi bannerResourceApi;
	
	@Autowired
	NotificationResourceApi notificationResourceApi;
	
	@Autowired
	RefundDetailsResourceApi refundDetailsResourceApi;


	@Override
	public ResponseEntity<List<CancellationRequestDTO>> getAllCancellationRequests(Pageable pageable) {
		
		return cancellationRequestResourceApi.getAllCancellationRequestsUsingGET(null, null, null);
	}

	@Override
	public ResponseEntity<CancellationRequestDTO> findCancellationRequestById(Long id) {
		
		return cancellationRequestResourceApi.getCancellationRequestUsingGET(id);
	}

	@Override
	public ResponseEntity<DataResponse> getTasks(String name, String nameLike, String description, String priority,
			String minimumPriority, String maximumPriority, String assignee, String assigneeLike, String owner,
			String ownerLike, String unassigned, String delegationState, String candidateUser, String candidateGroup,
			String candidateGroups, String involvedUser, String taskDefinitionKey, String taskDefinitionKeyLike,
			String processInstanceId, String processInstanceBusinessKey, String processInstanceBusinessKeyLike,
			@Valid String processDefinitionId, @Valid String processDefinitionKey,
			@Valid String processDefinitionKeyLike, @Valid String processDefinitionName,
			@Valid String processDefinitionNameLike, @Valid String executionId, @Valid String createdOn,
			@Valid String createdBefore, @Valid String createdAfter, @Valid String dueOn, @Valid String dueBefore,
			@Valid String dueAfter, @Valid Boolean withoutDueDate, @Valid Boolean excludeSubTasks,
			@Valid Boolean active, @Valid Boolean includeTaskLocalVariables, @Valid Boolean includeProcessVariables,
			@Valid String tenantId, @Valid String tenantIdLike, @Valid Boolean withoutTenantId,
			@Valid String candidateOrAssigned, @Valid String category) {
		
		return cancellationRequestResourceApi.getTasksUsingGET(active, assignee, assigneeLike, candidateGroup, candidateGroups, candidateOrAssigned, candidateUser, category, createdAfter, createdBefore, createdOn, delegationState, description, dueAfter, dueBefore, dueOn, excludeSubTasks, executionId, includeProcessVariables, includeTaskLocalVariables, involvedUser, maximumPriority, minimumPriority, name, nameLike, owner, ownerLike, maximumPriority, processDefinitionId, processDefinitionKey, processDefinitionKeyLike, processDefinitionName, processDefinitionNameLike, processInstanceBusinessKey, processInstanceBusinessKeyLike, processInstanceId, taskDefinitionKey, taskDefinitionKeyLike, tenantId, tenantIdLike, unassigned, withoutDueDate, withoutTenantId);
	
	}

	@Override
	public ResponseEntity<List<CancellationRequestDTO>> searchCancellationRequests(String query,Pageable pageable) {
		
		return cancellationRequestResourceApi.searchCancellationRequestsUsingGET(query, null, null, null);
	}

	@Override
	public ResponseEntity<List<CancelledOrderLineDTO>> findAllCancelledOrderLines(Pageable pageable) {
		
		return cancelledOrderLineResourceApi.getAllCancelledOrderLinesUsingGET(null, null, null);
	}

	@Override
	public ResponseEntity<CancelledOrderLineDTO> findCancelledOrderLine(Long id) {
		
		return cancelledOrderLineResourceApi.getCancelledOrderLineUsingGET(id);
	}

	@Override
	public ResponseEntity<List<CancelledOrderLineDTO>> searchCancelledOrderLines(String query, Pageable pageable) {
		
		return cancelledOrderLineResourceApi.searchCancelledOrderLinesUsingGET(query, null, null, null);
	}
	
	 
	
	@Override
	public ResponseEntity<List<BannerDTO>> findAllBanners(Pageable pageable) {
		
		return bannerResourceApi.getAllBannersUsingGET(null, null, null);
	}

	@Override
	public ResponseEntity<BannerDTO> findBanner(Long id) {
		log.debug("<<<<<<<< findOne >>>>>>>>",id);
		return bannerResourceApi.getBannerUsingGET(id);
	}

	@Override
	public ResponseEntity<List<BannerDTO>> searchBanners(String query,Pageable pageable) {
		log.debug("<<<<<<<< searchBanners >>>>>>>>",query);
		return bannerResourceApi.searchBannersUsingGET(query, null, null, null);
	}
	
	
	
	@Override
	public ResponseEntity<NotificationDTO> findNotification(Long id) {
		log.debug("<<<<<<<<<<< findOne >>>>>>>>",id);
		return notificationResourceApi.getNotificationUsingGET(id);
	}

	@Override
	public ResponseEntity<List<NotificationDTO>> findAllNotifications(Pageable pageable) {
		log.debug("<<<<<<<<<< findAllNotifications >>>>>>>>>>>");
		return notificationResourceApi.getAllNotificationsUsingGET(null, null, null);
	}

	@Override
	public ResponseEntity<List<NotificationDTO>> searchNotifications(String query, Pageable pageable) {
		log.debug("<<<<<<<<<<< searchNotifications >>>>>>>>>{}",query);
		return notificationResourceApi.searchNotificationsUsingGET(query, null, null, null);
	}
	

	@Override
	public ResponseEntity<RefundDetailsDTO> findRefundDetails(Long id) {
		log.debug("<<<<<<<<<findRefundDetails >>>>>>>>>>>", id);
		return refundDetailsResourceApi.getRefundDetailsUsingGET(id);
	}

	@Override
	public ResponseEntity<List<RefundDetailsDTO>> findAllRefundDetails(Pageable pageable) {
		log.debug("<<<<<<findAllRefundDetails >>>>>>>>>>");
		return refundDetailsResourceApi.getAllRefundDetailsUsingGET(null, null, null);
	}

	@Override
	public ResponseEntity<List<RefundDetailsDTO>> searchRefundDetails(String query,Pageable pageable) {
		log.debug("<<<<<<<<<<< searchRefundDetails >>>>>>>>{}",query);
		return refundDetailsResourceApi.searchRefundDetailsUsingGET(query, null, null, null);
	}

	@Override
	public Page<Store> findStoreByName(String name, Pageable pageable) {
		
		log.debug("<<<<<<<<< findStoreByName>>>>>>>>>{}", name);
		QueryBuilder queryDsl =QueryBuilders.matchQuery("name", name).prefixLength(3);

		SearchSourceBuilder builder = new SearchSourceBuilder();
		builder.query(queryDsl);
		SearchResponse sr = serviceUtility.searchResponseForPage("store", builder, pageable);

		return serviceUtility.getPageResult(sr, pageable, new Store());
		
	}

	@Override
	public Page<Banner> findBannerByStoreId(String storeId,Pageable pageable) {
		log.debug("<<<<<<<<<findBannerByStoreId impl >>>>>>>{}",storeId);
		
		QueryBuilder queryBuilder = QueryBuilders.matchQuery("storeId", storeId).prefixLength(3);
		SearchSourceBuilder builder = new SearchSourceBuilder();
		builder.query(queryBuilder);
		SearchResponse response = serviceUtility.searchResponseForPage("premiumbanner", builder, pageable);
		return serviceUtility.getPageResult(response, pageable, new Banner());
	}

	@Override
	public ResponseEntity<List<CancellationRequestDTO>> findAllCancellationRequests(Pageable pageable) {
		log.debug("<<<<<<<<<< findCancellationRequestByOrderId >>>>>>>impl {}",pageable);
		
		ArrayList<Order> list=new ArrayList<Order>();
		pageable.getSort().stream().forEach(list::add);
		List<String> sortlist=new ArrayList<String>();
		list.stream().map(x->x.toString()).forEach(sortlist::add);
		
		return cancellationRequestResourceApi.getAllCancellationRequestsUsingGET(pageable.getPageNumber(), pageable.getPageSize(), sortlist);
	}

	@Override
	public ResponseEntity<CancellationRequest> getCancellationRequest(String orderId) {
		log.debug("<<<<<<<<<< getCancellationRequest >>>>>>{}",orderId);
		QueryBuilder dslQuery = QueryBuilders.boolQuery()
				.must(QueryBuilders.matchAllQuery()).filter(QueryBuilders.termQuery("orderId.keyword", orderId));
		SearchSourceBuilder builder =new SearchSourceBuilder();
		builder.query(dslQuery);
		SearchResponse response = serviceUtility.searchResponseForObject("cancellationrequest", dslQuery);
		
		return ResponseEntity.ok().body(serviceUtility.getObjectResult(response, new CancellationRequest()));
	}

	@Override
	public ResponseEntity<CancellationRequest> findCancellationOrderLinesAndCancelledAuxilaryOrderLinesById(Long id) {
		log.debug("<<<<<<<<<findCancellationOrderLinesAndCancelledAuxilaryOrderLinesById >>>>>>{}",id );
		QueryBuilder dslQuery = QueryBuilders.termQuery("id", id);
		SearchSourceBuilder builder =new SearchSourceBuilder();
		builder.query(dslQuery);
		SearchResponse response = serviceUtility.searchResponseForObject("cancellationrequest", dslQuery);
		return ResponseEntity.ok().body(serviceUtility.getObjectResult(response, new CancellationRequest()));
	}
	

	
	
	
	
	
	
}
