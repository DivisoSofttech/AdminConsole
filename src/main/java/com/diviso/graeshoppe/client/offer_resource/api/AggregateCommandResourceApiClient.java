package com.diviso.graeshoppe.client.offer_resource.api;

import org.springframework.cloud.openfeign.FeignClient;
import com.diviso.graeshoppe.client.offer_resource.OfferClientConfiguration;

@FeignClient(name="${OfferResource.name:OfferResource}", url="${OfferResource.url}", configuration = OfferClientConfiguration.class)
public interface AggregateCommandResourceApiClient extends AggregateCommandResourceApi {
}