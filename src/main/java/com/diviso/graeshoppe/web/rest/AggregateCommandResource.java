package com.diviso.graeshoppe.web.rest;

import java.net.URI;
import java.net.URISyntaxException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.diviso.graeshoppe.client.administration.api.BannerResourceApi;
import com.diviso.graeshoppe.client.administration.model.BannerDTO;
import com.diviso.graeshoppe.client.offer_resource.api.AggregateCommandResourceApi;
import com.diviso.graeshoppe.client.offer_resource.model.OfferModel;

@RestController
@RequestMapping("/api")
public class AggregateCommandResource {
	
	private static final String ENTITY_NAME = "offerApplicationAggregateCommandResource";
	
	private final Logger log = LoggerFactory.getLogger(AggregateCommandResource.class);

	@Autowired
	private AggregateCommandResourceApi aggregateCommandResourceApi;
	
	@Autowired
	private BannerResourceApi bannerResourceApi;
	
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

    /**
     * POST  /command/Banner/create-Banner : Create a new Banner.
     *
     * @param bannerDtol the offerModel to create
     * @return the ResponseEntity with status 201 (Created) and with body the new bannerModel, or with status 400 (Bad Request) if the banner has already an ID
     * @throws URISyntaxException if the Location URI syntax is incorrect
     */
    @PostMapping("/command/banner/create-banner")
    public ResponseEntity<BannerDTO> createBanner(@RequestBody BannerDTO bannerDto) throws URISyntaxException {
        log.debug("REST request to save banner : {}", bannerDto);
       
        return bannerResourceApi.createBannerUsingPOST(bannerDto);
        
   
    }
    

    /**
     * PUT  /command/Banner/update-Banner : update a Banner.
     *
     * @param bannerDto the banner to update
     * @return the ResponseEntity with status 201 (Updated) and with body the new bannerDto, or with status 400 (Bad Request) if the banner has already an ID
     * @throws URISyntaxException if the Location URI syntax is incorrect
     */
    @PutMapping("/command/banner/update-banner")
    public ResponseEntity<BannerDTO> updateBanner(@RequestBody BannerDTO bannerDTO) throws URISyntaxException {
        log.debug("REST request to Update banner : {}", bannerDTO);
       
        return bannerResourceApi.updateBannerUsingPUT(bannerDTO);
        
   
    }
    
   /**
    * DELETE  /command/Banner/Delete-Banner : Delete a Banner.
    *
    * @param bannerDto the banner to delete
    * @return the ResponseEntity with status (Deleted)or with status 400 (Bad Request) if the banner has already an ID
    * @throws URISyntaxException if the Location URI syntax is incorrect
    */
   @DeleteMapping("/command/banner/update-banner/id")
   public ResponseEntity<Void> deleteBanner(@RequestBody Long id) throws URISyntaxException {
       log.debug("REST request to Delete banner : {}", id);
      
       return bannerResourceApi.deleteBannerUsingDELETE(id);
       
  
   }


}
