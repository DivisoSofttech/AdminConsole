package com.diviso.graeshoppe.web.rest;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.diviso.graeshoppe.client.offer_resource.api.AggregateQueryResourceApi;
import com.diviso.graeshoppe.client.offer_resource.api.DeductionValueTypeResourceApi;
import com.diviso.graeshoppe.client.offer_resource.model.DeductionValueTypeDTO;
/**
 * REST controller for managing Offer query service.
 */
@RestController
@RequestMapping("/api")
public class AggregateQueryResource {
	
	 private final Logger log = LoggerFactory.getLogger(AggregateQueryResource.class);

	 @Autowired
	 private AggregateQueryResourceApi aggregateQueryResourceApi;
	 	 
	 /**
	     * GET  /deduction-value-types : get all the deductionValueTypes of offers.
	     *
	     * @param pageable the pagination information
	     * @return the ResponseEntity with status 200 (OK) and the list of deductionValueTypes in body
	     */
	    @GetMapping("/query/offers/get-all-deduction-value-types")
	    public ResponseEntity<List<DeductionValueTypeDTO>> getAllDeductionValueTypes(Pageable pageable) {
	        log.debug("REST request to get a page of DeductionValueTypes");
	        List<DeductionValueTypeDTO> deductionValueList = aggregateQueryResourceApi.getAllDeductionValueTypesUsingGET(null, null, null, null, null, null, null, null, null, null).getBody();
	        		
	        return ResponseEntity.ok().body(deductionValueList);
	    }
}
