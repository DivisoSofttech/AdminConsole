package com.diviso.graeshoppe.client.administration.api;

import org.springframework.cloud.openfeign.FeignClient;
import com.diviso.graeshoppe.client.administration.ClientConfiguration;

@FeignClient(name="${administration.name:administration}", url="${administration.url:localhost:8081/}", configuration = ClientConfiguration.class)
public interface UserResourceApiClient extends UserResourceApi {
}