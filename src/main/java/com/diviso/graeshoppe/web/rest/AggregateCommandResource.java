package com.diviso.graeshoppe.web.rest;

import java.net.URI;
import java.net.URISyntaxException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.diviso.graeshoppe.client.offer_resource.api.AggregateCommandResourceApi;
import com.diviso.graeshoppe.client.offer_resource.model.OfferModel;

@RestController
@RequestMapping("/api")
public class AggregateCommandResource {
	
	private static final String ENTITY_NAME = "offerApplicationAggregateCommandResource";
	
	private final Logger log = LoggerFactory.getLogger(AggregateCommandResource.class);

	@Autowired
	private AggregateCommandResourceApi aggregateCommandResourceApi;
	
	 /**
     * POST  /command/offers/create-offer : Create a new offer.
     *
     * @param offerModel the offerModel to create
     * @return the ResponseEntity with status 201 (Created) and with body the new offerModel, or with status 400 (Bad Request) if the offer has already an ID
     * @throws URISyntaxException if the Location URI syntax is incorrect
     */
    @PostMapping("/command/offers/create-offer")
    public ResponseEntity<OfferModel> createOffer(@RequestBody OfferModel offerModel) throws URISyntaxException {
        log.debug("REST request to save Offer : {}", offerModel);
       
        return aggregateCommandResourceApi.createOfferUsingPOST(offerModel);
        
   
    }


}
