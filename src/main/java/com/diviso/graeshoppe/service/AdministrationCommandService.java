package com.diviso.graeshoppe.service;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.diviso.graeshoppe.client.administration.model.AboutDTO;
import com.diviso.graeshoppe.client.administration.model.BannerDTO;
import com.diviso.graeshoppe.client.administration.model.CancellationRequestDTO;
import com.diviso.graeshoppe.client.administration.model.CancelledAuxilaryOrderLineDTO;
import com.diviso.graeshoppe.client.administration.model.CancelledOrderLineDTO;
import com.diviso.graeshoppe.client.administration.model.NotificationDTO;
import com.diviso.graeshoppe.client.administration.model.RefundDetailsDTO;
import com.diviso.graeshoppe.client.administration.model.SubTermDTO;
import com.diviso.graeshoppe.client.administration.model.TermDTO;
import com.diviso.graeshoppe.client.aggregator.Term;
public interface AdministrationCommandService {

	public ResponseEntity<CancellationRequestDTO> createCancellationRequest(CancellationRequestDTO cancellationRequestDTO);
	
	/**
    * Delete the "id" cancellationRequest.
    *
    * @param id the id of the entity
    */
    public ResponseEntity<Void> deleteCancellationRequest(Long id);
    
    public ResponseEntity<CancellationRequestDTO> updateCancellationRequest(CancellationRequestDTO cancellationRequestDTO);
    
    public ResponseEntity<CancelledOrderLineDTO> createCancelledOrderLine(CancelledOrderLineDTO cancelledOrderLineDTO);

    /**
     * Delete the "id" cancelledOrderLine.
     *
     * @param id the id of the entity
     */
     public ResponseEntity<Void> deleteCancelledOrderLine(Long id);
     
     public ResponseEntity<CancelledOrderLineDTO> updateCancelledOrderLine(CancelledOrderLineDTO cancelledOrderLineDTO);
     
     //banner-prince
     

 	ResponseEntity<BannerDTO> createBanner(BannerDTO bannerDTO);

 	ResponseEntity<BannerDTO> updateBanner(BannerDTO bannerDTO);

	ResponseEntity<Void> deleteBanner(Long id);
	
	ResponseEntity<NotificationDTO> createNotification(NotificationDTO notificationDTO);

	ResponseEntity<NotificationDTO> updateNotification(NotificationDTO notificationDTO);

	ResponseEntity<Void> deleteNotification(Long id);

	ResponseEntity<RefundDetailsDTO> createRefundDetails(RefundDetailsDTO refundDetailsDTO, String orderId);

	ResponseEntity<RefundDetailsDTO> updateRefundDetails(RefundDetailsDTO refundDetailsDTO);

	ResponseEntity<Void> deleteRefundDetails(Long id);
	
	void createCancelledOrderLineByList(List<CancelledOrderLineDTO> cancelledOrderLineDTOList);

	void createCancelledAuxOrderLineByList(List<CancelledAuxilaryOrderLineDTO> cancelledAuxilaryOrderLineDTOList);
	
	ResponseEntity<AboutDTO> createAboutUs(AboutDTO aboutDTO);
	
	ResponseEntity<AboutDTO> updateAboutUs(AboutDTO aboutDTO);
	
	ResponseEntity<Void> deleteAboutUs(Long id);

	Term createTerm(Term term);

	ResponseEntity<TermDTO> updateTerm(TermDTO termDTO);

	ResponseEntity<Void> deleteTerm(Long id);

	SubTermDTO createSubTerm(SubTermDTO subTermDTO);

	ResponseEntity<SubTermDTO> updateSubTerm(SubTermDTO subTermDTO);

	ResponseEntity<Void> deleteSubTerm(Long id);
	
}
