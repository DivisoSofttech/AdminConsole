package com.diviso.graeshoppe.client.report.api;

import java.time.OffsetDateTime;
import java.util.List;

import javax.validation.Valid;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.diviso.graeshoppe.client.report.model.AuxItem;
import com.diviso.graeshoppe.client.report.model.OfferLine;
import com.diviso.graeshoppe.client.report.model.OrderLine;
import com.diviso.graeshoppe.client.report.model.PageOfOrderMaster;
import com.diviso.graeshoppe.client.report.model.ReportSummary;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-01-03T14:44:34.521+05:30[Asia/Kolkata]")

@Api(value = "QueryResource", description = "the QueryResource API")
public interface QueryResourceApi {

    @ApiOperation(value = "createReportSummary", nickname = "createReportSummaryUsingGET", notes = "", response = ReportSummary.class, tags={ "query-resource", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = ReportSummary.class),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/api/reportview/{expectedDelivery}/{storeName}",
        produces = "*/*", 
        method = RequestMethod.GET)
    ResponseEntity<ReportSummary> createReportSummaryUsingGET(@ApiParam(value = "expectedDelivery",required=true) @PathVariable("expectedDelivery") String expectedDelivery,@ApiParam(value = "storeName",required=true) @PathVariable("storeName") String storeName);


    @ApiOperation(value = "findAuxItemByid", nickname = "findAuxItemByidUsingGET", notes = "", response = AuxItem.class, responseContainer = "List", tags={ "query-resource", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = AuxItem.class, responseContainer = "List"),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/api/findAuxItemByid/{id}",
        produces = "*/*", 
        method = RequestMethod.GET)
    ResponseEntity<List<AuxItem>> findAuxItemByidUsingGET(@ApiParam(value = "id",required=true) @PathVariable("id") Long id);


    @ApiOperation(value = "findOfferLinesByOrderNumber", nickname = "findOfferLinesByOrderNumberUsingGET", notes = "", response = OfferLine.class, responseContainer = "List", tags={ "query-resource", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = OfferLine.class, responseContainer = "List"),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/api/findOfferLinesByOrderNumber/{orderId}",
        produces = "*/*", 
        method = RequestMethod.GET)
    ResponseEntity<List<OfferLine>> findOfferLinesByOrderNumberUsingGET(@ApiParam(value = "orderId",required=true) @PathVariable("orderId") String orderId);


    @ApiOperation(value = "findOrderByDatebetweenAndStoreId", nickname = "findOrderByDatebetweenAndStoreIdUsingGET", notes = "", response = PageOfOrderMaster.class, tags={ "query-resource", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = PageOfOrderMaster.class),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/api/findOrderByDatebetweenAndStoreId/{from}/{to}/{storeId}",
        produces = "*/*", 
        method = RequestMethod.GET)
    ResponseEntity<PageOfOrderMaster> findOrderByDatebetweenAndStoreIdUsingGET(@ApiParam(value = "from",required=true) @PathVariable("from") String from,@ApiParam(value = "storeId",required=true) @PathVariable("storeId") String storeId,@ApiParam(value = "to",required=true) @PathVariable("to") String to,@ApiParam(value = "Page number of the requested page") @Valid @RequestParam(value = "page", required = false) Integer page,@ApiParam(value = "Size of a page") @Valid @RequestParam(value = "size", required = false) Integer size,@ApiParam(value = "Sorting criteria in the format: property(,asc|desc). Default sort order is ascending. Multiple sort criteria are supported.") @Valid @RequestParam(value = "sort", required = false) List<String> sort);


    @ApiOperation(value = "findOrderCountByDateAndStatusName", nickname = "findOrderCountByDateAndStatusNameUsingGET", notes = "", response = Long.class, tags={ "query-resource", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = Long.class),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/api/findOrderCountByDateAndStatusName/{date}/{statusName}",
        produces = "*/*", 
        method = RequestMethod.GET)
    ResponseEntity<Long> findOrderCountByDateAndStatusNameUsingGET(@ApiParam(value = "date",required=true) @PathVariable("date") String date,@ApiParam(value = "statusName",required=true) @PathVariable("statusName") String statusName);


    @ApiOperation(value = "findOrderCountByStatusName", nickname = "findOrderCountByStatusNameUsingGET", notes = "", response = Long.class, tags={ "query-resource", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = Long.class),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/api/indOrderCountByStatusName/{statusName}",
        produces = "*/*", 
        method = RequestMethod.GET)
    ResponseEntity<Long> findOrderCountByStatusNameUsingGET(@ApiParam(value = "statusName",required=true) @PathVariable("statusName") String statusName);


    @ApiOperation(value = "findOrderLineByOrderNumber", nickname = "findOrderLineByOrderNumberUsingGET", notes = "", response = OrderLine.class, responseContainer = "List", tags={ "query-resource", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = OrderLine.class, responseContainer = "List"),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/api/findOrderLinesByOrderNumber/{orderNumber}",
        produces = "*/*", 
        method = RequestMethod.GET)
    ResponseEntity<List<OrderLine>> findOrderLineByOrderNumberUsingGET(@ApiParam(value = "orderNumber",required=true) @PathVariable("orderNumber") String orderNumber);


    @ApiOperation(value = "findOrderMasterByExpectedDeliveryBetween", nickname = "findOrderMasterByExpectedDeliveryBetweenUsingGET", notes = "", response = PageOfOrderMaster.class, tags={ "query-resource", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = PageOfOrderMaster.class),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/api/findOrderMasterByExpectedDeliveryBetween/{from}/{to}",
        produces = "*/*", 
        method = RequestMethod.GET)
    ResponseEntity<PageOfOrderMaster> findOrderMasterByExpectedDeliveryBetweenUsingGET(@ApiParam(value = "from",required=true) @PathVariable("from") OffsetDateTime from,@ApiParam(value = "to",required=true) @PathVariable("to") OffsetDateTime to,@ApiParam(value = "Page number of the requested page") @Valid @RequestParam(value = "page", required = false) Integer page,@ApiParam(value = "Size of a page") @Valid @RequestParam(value = "size", required = false) Integer size,@ApiParam(value = "Sorting criteria in the format: property(,asc|desc). Default sort order is ascending. Multiple sort criteria are supported.") @Valid @RequestParam(value = "sort", required = false) List<String> sort);


    @ApiOperation(value = "findOrderMasterCountByExpectedDeliveryBetween", nickname = "findOrderMasterCountByExpectedDeliveryBetweenUsingGET", notes = "", response = Long.class, tags={ "query-resource", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = Long.class),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/api/countOrderMasterByDeliveryBetween/{from}/{to}",
        produces = "*/*", 
        method = RequestMethod.GET)
    ResponseEntity<Long> findOrderMasterCountByExpectedDeliveryBetweenUsingGET(@ApiParam(value = "from",required=true) @PathVariable("from") String from,@ApiParam(value = "to",required=true) @PathVariable("to") String to);


    @ApiOperation(value = "getAllOrdersBetweenDatesAsPdf", nickname = "getAllOrdersBetweenDatesAsPdfUsingGET", notes = "", response = byte[].class, tags={ "query-resource", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = byte[].class),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/api/ordersbetweendates/{fromDate}/{toDate}",
        produces = "*/*", 
        method = RequestMethod.GET)
    ResponseEntity<byte[]> getAllOrdersBetweenDatesAsPdfUsingGET(@ApiParam(value = "fromDate",required=true) @PathVariable("fromDate") String fromDate,@ApiParam(value = "toDate",required=true) @PathVariable("toDate") String toDate);


    @ApiOperation(value = "getAllOrdersByDateAndStoreNameAsPdf", nickname = "getAllOrdersByDateAndStoreNameAsPdfUsingGET", notes = "", response = byte[].class, tags={ "query-resource", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = byte[].class),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/api/ordersbydateandstorename/{date}/{storeId}",
        produces = "*/*", 
        method = RequestMethod.GET)
    ResponseEntity<byte[]> getAllOrdersByDateAndStoreNameAsPdfUsingGET(@ApiParam(value = "date",required=true) @PathVariable("date") String date,@ApiParam(value = "storeId",required=true) @PathVariable("storeId") String storeId);


    @ApiOperation(value = "getAllOrdersByDateAsPdf", nickname = "getAllOrdersByDateAsPdfUsingGET", notes = "", response = byte[].class, tags={ "query-resource", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = byte[].class),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/api/ordersbydate/{date}",
        produces = "*/*", 
        method = RequestMethod.GET)
    ResponseEntity<byte[]> getAllOrdersByDateAsPdfUsingGET(@ApiParam(value = "date",required=true) @PathVariable("date") String date);


    @ApiOperation(value = "getAllOrdersByMethodOfOrderAsPdf", nickname = "getAllOrdersByMethodOfOrderAsPdfUsingGET", notes = "", response = byte[].class, tags={ "query-resource", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = byte[].class),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/api/orders/{storeId}/{date}/{methodOfOrder}",
        produces = "*/*", 
        method = RequestMethod.GET)
    ResponseEntity<byte[]> getAllOrdersByMethodOfOrderAsPdfUsingGET(@ApiParam(value = "date",required=true) @PathVariable("date") String date,@ApiParam(value = "methodOfOrder",required=true) @PathVariable("methodOfOrder") String methodOfOrder,@ApiParam(value = "storeId",required=true) @PathVariable("storeId") String storeId);


    @ApiOperation(value = "getAllOrdersByPaymentStatusAsPdf", nickname = "getAllOrdersByPaymentStatusAsPdfUsingGET", notes = "", response = byte[].class, tags={ "query-resource", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = byte[].class),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/api/ordersbypayment/{storeId}/{date}/{paymentStatus}",
        produces = "*/*", 
        method = RequestMethod.GET)
    ResponseEntity<byte[]> getAllOrdersByPaymentStatusAsPdfUsingGET(@ApiParam(value = "date",required=true) @PathVariable("date") String date,@ApiParam(value = "paymentStatus",required=true) @PathVariable("paymentStatus") String paymentStatus,@ApiParam(value = "storeId",required=true) @PathVariable("storeId") String storeId);


    @ApiOperation(value = "getOrderSummaryBetweenDatesAsPdf", nickname = "getOrderSummaryBetweenDatesAsPdfUsingGET", notes = "", response = byte[].class, tags={ "query-resource", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = byte[].class),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/api/ordersummarybetweendates/{fromDate}/{toDate}/{storeId}",
        produces = "*/*", 
        method = RequestMethod.GET)
    ResponseEntity<byte[]> getOrderSummaryBetweenDatesAsPdfUsingGET(@ApiParam(value = "fromDate",required=true) @PathVariable("fromDate") String fromDate,@ApiParam(value = "storeId",required=true) @PathVariable("storeId") String storeId,@ApiParam(value = "toDate",required=true) @PathVariable("toDate") String toDate);


    @ApiOperation(value = "getOrderSummaryByDateAndStoreNameAsPdf", nickname = "getOrderSummaryByDateAndStoreNameAsPdfUsingGET", notes = "", response = byte[].class, tags={ "query-resource", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = byte[].class),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/api/ordersummarybydateandstorename/{date}/{storeId}",
        produces = "*/*", 
        method = RequestMethod.GET)
    ResponseEntity<byte[]> getOrderSummaryByDateAndStoreNameAsPdfUsingGET(@ApiParam(value = "date",required=true) @PathVariable("date") String date,@ApiParam(value = "storeId",required=true) @PathVariable("storeId") String storeId);


    @ApiOperation(value = "getReportSummaryAsPdf", nickname = "getReportSummaryAsPdfUsingGET", notes = "", response = byte[].class, tags={ "query-resource", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = byte[].class),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/api/reportSummary/{date}/{storeId}",
        produces = "*/*", 
        method = RequestMethod.GET)
    ResponseEntity<byte[]> getReportSummaryAsPdfUsingGET(@ApiParam(value = "date",required=true) @PathVariable("date") String date,@ApiParam(value = "storeId",required=true) @PathVariable("storeId") String storeId);


    @ApiOperation(value = "getReportWithAuxAndComboAsPdf", nickname = "getReportWithAuxAndComboAsPdfUsingGET", notes = "", response = byte[].class, tags={ "query-resource", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = byte[].class),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/api/auxcombo/{orderNumber}",
        produces = "*/*", 
        method = RequestMethod.GET)
    ResponseEntity<byte[]> getReportWithAuxAndComboAsPdfUsingGET(@ApiParam(value = "orderNumber",required=true) @PathVariable("orderNumber") String orderNumber);


    @ApiOperation(value = "getSaleReportAsPdf", nickname = "getSaleReportAsPdfUsingGET", notes = "", response = byte[].class, tags={ "query-resource", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = byte[].class),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/api/salereport/{storeidpcode}",
        produces = "*/*", 
        method = RequestMethod.GET)
    ResponseEntity<byte[]> getSaleReportAsPdfUsingGET(@ApiParam(value = "storeidpcode",required=true) @PathVariable("storeidpcode") String storeidpcode);

}
