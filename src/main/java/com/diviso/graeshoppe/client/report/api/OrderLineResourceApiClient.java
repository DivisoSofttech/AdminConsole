package com.diviso.graeshoppe.client.report.api;

import org.springframework.cloud.openfeign.FeignClient;
import com.diviso.graeshoppe.client.report.ReportClientConfiguration;

@FeignClient(name="${report.name:report}", url="${report.url:dev.ci3.divisosofttech.com:8077/}", configuration = ReportClientConfiguration.class)
public interface OrderLineResourceApiClient extends OrderLineResourceApi {
}