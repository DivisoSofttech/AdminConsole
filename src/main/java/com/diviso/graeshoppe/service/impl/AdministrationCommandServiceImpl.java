package com.diviso.graeshoppe.service.impl;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.diviso.graeshoppe.client.administration.api.AboutResourceApi;
import com.diviso.graeshoppe.client.administration.api.BannerResourceApi;
import com.diviso.graeshoppe.client.administration.api.CancellationRequestResourceApi;
import com.diviso.graeshoppe.client.administration.api.CancelledAuxilaryOrderLineResourceApi;
import com.diviso.graeshoppe.client.administration.api.CancelledOrderLineResourceApi;
import com.diviso.graeshoppe.client.administration.api.NotificationResourceApi;
import com.diviso.graeshoppe.client.administration.api.RefundDetailsResourceApi;
import com.diviso.graeshoppe.client.administration.api.SubTermResourceApi;
import com.diviso.graeshoppe.client.administration.api.TermResourceApi;
import com.diviso.graeshoppe.client.administration.model.AboutDTO;
import com.diviso.graeshoppe.client.administration.model.BannerDTO;
import com.diviso.graeshoppe.client.administration.model.CancellationRequestDTO;
import com.diviso.graeshoppe.client.administration.model.CancelledAuxilaryOrderLineDTO;
import com.diviso.graeshoppe.client.administration.model.CancelledOrderLineDTO;
import com.diviso.graeshoppe.client.administration.model.NotificationDTO;
import com.diviso.graeshoppe.client.administration.model.RefundDetailsDTO;
import com.diviso.graeshoppe.client.administration.model.SubTermDTO;
import com.diviso.graeshoppe.client.administration.model.TermDTO;
import com.diviso.graeshoppe.client.aggregator.SubTerm;
import com.diviso.graeshoppe.client.aggregator.Term;
import com.diviso.graeshoppe.client.payment.api.PaymentResourceApi;
import com.diviso.graeshoppe.client.payment.model.PaymentDTO;
import com.diviso.graeshoppe.service.AdministrationCommandService;
import com.diviso.graeshoppe.service.mapper.SubTermMapper;

@Service
public class AdministrationCommandServiceImpl implements AdministrationCommandService {

	private Logger log = LoggerFactory.getLogger(AdministrationCommandServiceImpl.class);

	@Autowired
	CancellationRequestResourceApi cancellationRequestResourceApi;

	@Autowired
	CancelledOrderLineResourceApi cancelledOrderLineResourceApi;

	@Autowired
	AboutResourceApi aboutResourceApi;
	
	@Autowired
	TermResourceApi termResourceApi;
	
	@Autowired
	SubTermResourceApi subtermResourceApi;
	
	@Autowired
	BannerResourceApi bannerResourceApi;
	
	@Autowired
	SubTermMapper subTermMapper;

	@Autowired
	NotificationResourceApi notificationResourceApi;
	@Autowired
	private PaymentResourceApi paymentResourceApi;

	@Autowired
	RefundDetailsResourceApi refundDetailsResourceApi;

	@Autowired
	CancelledAuxilaryOrderLineResourceApi cancelledAuxilaryOrderLineResourceApi;

	@Override
	public ResponseEntity<CancellationRequestDTO> createCancellationRequest(
			CancellationRequestDTO cancellationRequestDTO) {
		ResponseEntity<PaymentDTO> payment = paymentResourceApi
				.getPaymentUsingGET(Long.parseLong(cancellationRequestDTO.getPaymentId()));
		cancellationRequestDTO.setPaymentId(payment.getBody().getRef());
		return cancellationRequestResourceApi.createCancellationRequestUsingPOST(cancellationRequestDTO);
	}

	@Override
	public ResponseEntity<Void> deleteCancellationRequest(Long id) {

		return cancellationRequestResourceApi.deleteCancellationRequestUsingDELETE(id);
	}

	@Override
	public ResponseEntity<CancellationRequestDTO> updateCancellationRequest(
			CancellationRequestDTO cancellationRequestDTO) {

		return cancellationRequestResourceApi.updateCancellationRequestUsingPUT(cancellationRequestDTO);
	}

	@Override
	public ResponseEntity<CancelledOrderLineDTO> createCancelledOrderLine(CancelledOrderLineDTO cancelledOrderLineDTO) {

		return cancelledOrderLineResourceApi.createCancelledOrderLineUsingPOST(cancelledOrderLineDTO);
	}

	@Override
	public ResponseEntity<Void> deleteCancelledOrderLine(Long id) {

		return cancelledOrderLineResourceApi.deleteCancelledOrderLineUsingDELETE(id);
	}

	@Override
	public ResponseEntity<CancelledOrderLineDTO> updateCancelledOrderLine(CancelledOrderLineDTO cancelledOrderLineDTO) {

		return cancelledOrderLineResourceApi.updateCancelledOrderLineUsingPUT(cancelledOrderLineDTO);
	}

	// banner prince

	@Override
	public ResponseEntity<BannerDTO> createBanner(BannerDTO bannerDTO) {
		log.debug("<<<<<<< createBanner >>>>>>>", bannerDTO);
		return bannerResourceApi.createBannerUsingPOST(bannerDTO);
	}

	@Override
	public ResponseEntity<BannerDTO> updateBanner(BannerDTO bannerDTO) {
		log.debug("<<<<<<<<<<< updateBanner >>>>>>>>>", bannerDTO);
		return bannerResourceApi.updateBannerUsingPUT(bannerDTO);
	}

	@Override
	public ResponseEntity<Void> deleteBanner(Long id) {
		log.debug("<<<<<<< deleteBanner >>>>>>>", id);
		return bannerResourceApi.deleteBannerUsingDELETE(id);
	}

	@Override
	public ResponseEntity<NotificationDTO> createNotification(NotificationDTO notificationDTO) {
		log.debug("<<<<<<< createNotification >>>>>>>>>>>>", notificationDTO);
		return notificationResourceApi.createNotificationUsingPOST(notificationDTO);
	}

	@Override
	public ResponseEntity<NotificationDTO> updateNotification(NotificationDTO notificationDTO) {
		log.debug("<<<<<<<< updateNotification >>>>>>>>>", notificationDTO);
		return notificationResourceApi.updateNotificationUsingPUT(notificationDTO);
	}

	@Override
	public ResponseEntity<Void> deleteNotification(Long id) {
		log.debug("<<<<<<<< deleteNotification >>>>>>>>", id);
		return notificationResourceApi.deleteNotificationUsingDELETE(id);
	}

	@Override
	public ResponseEntity<RefundDetailsDTO> createRefundDetails(RefundDetailsDTO refundDetailsDTO, String orderId) {
		log.debug("<<<<<<<<<<<< create RefoundDetails>>>>>>>>>");
		return refundDetailsResourceApi.createRefundDetailsUsingPOST(orderId, refundDetailsDTO);
	}

	@Override
	public ResponseEntity<RefundDetailsDTO> updateRefundDetails(RefundDetailsDTO refundDetailsDTO) {
		log.debug("<<<<<<<<<< updateRefoundDetails >>>>>>>>", refundDetailsDTO);
		return refundDetailsResourceApi.updateRefundDetailsUsingPUT(refundDetailsDTO);
	}

	@Override
	public ResponseEntity<Void> deleteRefundDetails(Long id) {
		log.debug("<<<<<<<<<<<< deleteRefundDetails >>>>>>>>>>", id);
		return refundDetailsResourceApi.deleteRefundDetailsUsingDELETE(id);
	}

	@Override
	public void createCancelledOrderLineByList(List<CancelledOrderLineDTO> cancelledOrderLineDTOList) {
		for (CancelledOrderLineDTO cancelledOrderLineDTO : cancelledOrderLineDTOList) {
			cancelledOrderLineResourceApi.createCancelledOrderLineUsingPOST(cancelledOrderLineDTO);
		}

	}

	@Override
	public void createCancelledAuxOrderLineByList(
			List<CancelledAuxilaryOrderLineDTO> cancelledAuxilaryOrderLineDTOList) {
		for (CancelledAuxilaryOrderLineDTO cancelledOrderLineDTO : cancelledAuxilaryOrderLineDTOList) {
			cancelledAuxilaryOrderLineResourceApi.createCancelledAuxilaryOrderLineUsingPOST(cancelledOrderLineDTO);
		}

	}

	@Override
	public ResponseEntity<AboutDTO> createAboutUs(AboutDTO aboutDTO) {
		return aboutResourceApi.createAboutUsingPOST(aboutDTO);
	}

	@Override
	public ResponseEntity<AboutDTO> updateAboutUs(AboutDTO aboutDTO) {
		return aboutResourceApi.updateAboutUsingPUT(aboutDTO);
	}

	@Override
	public ResponseEntity<Void> deleteAboutUs(Long id) {
		return aboutResourceApi.deleteAboutUsingDELETE(id);
	}
	
	@Override
	public ResponseEntity<TermDTO> createTerm(Term term) {
		
		TermDTO termDTO= new TermDTO();
		termDTO.setTitle(term.getTitle());

		term.getSubTerms().forEach(subTerm -> {
			SubTermDTO subTermDTO = subTermMapper.toDto(subTerm);
			subTermDTO.setTermId(term.getId());
			SubTermDTO resultSubTerm = createSubTerm(subTermDTO);
			SubTerm resultSubTerm1 = subTermMapper.toEntity(resultSubTerm);
	});
		
		
		return termResourceApi.createTermUsingPOST(termDTO);
		
	}

	@Override
	public ResponseEntity<TermDTO> updateTerm(TermDTO termDTO) {
		return termResourceApi.updateTermUsingPUT(termDTO);
	}

	@Override
	public ResponseEntity<Void> deleteTerm(Long id) {
		return termResourceApi.deleteTermUsingDELETE(id);
	}
	
	@Override
	public SubTermDTO createSubTerm(SubTermDTO subTermDTO) {
		return subtermResourceApi.createSubTermUsingPOST(subTermDTO).getBody();
	}

	@Override
	public ResponseEntity<SubTermDTO> updateSubTerm(SubTermDTO subTermDTO) {
		return subtermResourceApi.updateSubTermUsingPUT(subTermDTO);
	}

	@Override
	public ResponseEntity<Void> deleteSubTerm(Long id) {
		return subtermResourceApi.deleteSubTermUsingDELETE(id);
	}

	
	

}
