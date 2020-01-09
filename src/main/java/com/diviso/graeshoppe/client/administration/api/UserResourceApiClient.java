package com.diviso.graeshoppe.client.administration.api;

import org.springframework.cloud.openfeign.FeignClient;
import com.diviso.graeshoppe.client.administration.AdministrationClientConfiguration;

@FeignClient(name="${administration.name:administration}", url="${administration.url:dev.ci3.divisosofttech.com:8081/}", configuration = AdministrationClientConfiguration.class)
public interface UserResourceApiClient extends UserResourceApi {
}