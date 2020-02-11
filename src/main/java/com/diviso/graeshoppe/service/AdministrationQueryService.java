package com.diviso.graeshoppe.service;

import java.util.List;

import javax.validation.Valid;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import com.diviso.graeshoppe.client.administration.model.CancelledOrderLine;
import com.diviso.graeshoppe.client.administration.model.About;
import com.diviso.graeshoppe.client.administration.model.Banner;
import com.diviso.graeshoppe.client.administration.model.BannerDTO;
import com.diviso.graeshoppe.client.administration.model.CancellationDetails;
import com.diviso.graeshoppe.client.administration.model.CancellationRequest;
import com.diviso.graeshoppe.client.administration.model.CancellationRequestDTO;
import com.diviso.graeshoppe.client.administration.model.CancelledOrderLineDTO;
import com.diviso.graeshoppe.client.administration.model.DataResponse;
import com.diviso.graeshoppe.client.administration.model.Feedback;
import com.diviso.graeshoppe.client.administration.model.NotificationDTO;
import com.diviso.graeshoppe.client.administration.model.RefundDetails;
import com.diviso.graeshoppe.client.administration.model.RefundDetailsDTO;
import com.diviso.graeshoppe.client.aggregator.SubTerm;
import com.diviso.graeshoppe.client.aggregator.Term;
import com.diviso.graeshoppe.client.store.model.Store;

public interface AdministrationQueryService {

	public ResponseEntity<List<CancellationRequestDTO>> getAllCancellationRequests(Pageable pageable);
	
	/**
     * Get the "id" cancellationRequest.
     *
     * @param id the id of the entity
     * @return the entity
     */
	public ResponseEntity<CancellationRequestDTO> findCancellationRequestById(Long id);
    
	public  ResponseEntity<DataResponse> getTasks(String name, String nameLike, String description, String priority,
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
			@Valid String candidateOrAssigned, @Valid String category);
	
	/**
     * Search for the cancellationRequest corresponding to the query.
     *
     * @param query the query of the search
     * 
     * @param pageable the pagination information
     * @return the list of entities
     */
	public ResponseEntity<List<CancellationRequestDTO>> searchCancellationRequests(String query,Pageable pageable);

	public ResponseEntity<List<CancelledOrderLineDTO>> findAllCancelledOrderLines(Pageable pageable);
	
	/**
     * Get the "id" cancelledOrderLine.
     *
     * @param id the id of the entity
     * @return the entity
     */
    public ResponseEntity<CancelledOrderLineDTO> findCancelledOrderLine(Long id);
    
    public ResponseEntity<List<CancelledOrderLineDTO>> searchCancelledOrderLines(String query,Pageable pageable);

    ResponseEntity<List<BannerDTO>> findAllBanners(Pageable pageable);

    ResponseEntity<List<BannerDTO>> searchBanners(String query,Pageable pageable);

    ResponseEntity<BannerDTO> findBanner(Long id);

    ResponseEntity<List<NotificationDTO>> findAllNotifications(Pageable pageable);

	ResponseEntity<List<NotificationDTO>> searchNotifications(String query, Pageable pageable);

	ResponseEntity<NotificationDTO> findNotification(Long id);

	ResponseEntity<RefundDetailsDTO> findRefundDetails(Long id);

	ResponseEntity<List<RefundDetailsDTO>> findAllRefundDetails(Pageable pageable);

	ResponseEntity<List<RefundDetailsDTO>> searchRefundDetails(String query, Pageable pageable);
	
	public Page<Store> findStoreByName(String name, Pageable pageable);

	public Page<Banner> findBannerByStoreId(String storeId,Pageable pageable);

	public ResponseEntity<List<CancellationRequestDTO>> findAllCancellationRequests(Pageable pageable);

	public ResponseEntity<CancellationRequest> getCancellationRequest(String orderId);

	//public ResponseEntity<CancellationDetails> findCancellationOrderLinesAndCancelledAuxilaryOrderLinesById(Long id);

	public ResponseEntity<RefundDetails> getRefundDetails(Long id);

	//public ResponseEntity<CancellationRequest> findCancellationRequestByEntityId(Long id);

	public CancellationDetails findCancellationDetailsById(Long id);

	public Page<Feedback> findAllFeedBack(Pageable pageable);

	public About findAboutById(Long id);

	public Term findTermById(Long id);
	
	public SubTerm findSubTermById(Long id);

	List<SubTerm> getSubTermsByTermId(Long id);

	Page<Term> findallterms(Pageable pageable);

	Page<About> findallabout(Pageable pageable);

	public ResponseEntity<List<Term>> getTermByTermId(Long id);
    
}
