package com.diviso.graeshoppe.client.administartion.api;

import org.springframework.cloud.openfeign.FeignClient;
import com.diviso.graeshoppe.client.administartion.ClientConfiguration;

@FeignClient(name="${administartion.name:administartion}", url="${administartion.url:dev.ci3.divisosofttech.com:8081/}", configuration = ClientConfiguration.class)
public interface CancellationRequestResourceApiClient extends CancellationRequestResourceApi {
}