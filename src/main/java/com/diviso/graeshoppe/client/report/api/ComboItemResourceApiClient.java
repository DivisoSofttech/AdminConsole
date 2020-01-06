package com.diviso.graeshoppe.client.report.api;

import org.springframework.cloud.openfeign.FeignClient;
import com.diviso.graeshoppe.client.report.ClientConfiguration;

@FeignClient(name="${report.name:report}", url="${report.url:34.66.8.163:8077/}", configuration = ClientConfiguration.class)
public interface ComboItemResourceApiClient extends ComboItemResourceApi {
}