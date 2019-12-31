/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (3.0.0-SNAPSHOT).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package com.diviso.graeshoppe.client.report.api;

import com.diviso.graeshoppe.client.report.model.OfferLineDTO;
import io.swagger.annotations.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;
import java.util.Map;
import java.util.Optional;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-12-26T12:52:53.808+05:30[Asia/Calcutta]")

@Api(value = "OfferLineResource", description = "the OfferLineResource API")
public interface OfferLineResourceApi {

    @ApiOperation(value = "createOfferLine", nickname = "createOfferLineUsingPOST", notes = "", response = OfferLineDTO.class, tags={ "offer-line-resource", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = OfferLineDTO.class),
        @ApiResponse(code = 201, message = "Created"),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/api/offer-lines",
        produces = "*/*", 
        consumes = "application/json",
        method = RequestMethod.POST)
    ResponseEntity<OfferLineDTO> createOfferLineUsingPOST(@ApiParam(value = "offerLineDTO" ,required=true )  @Valid @RequestBody OfferLineDTO offerLineDTO);


    @ApiOperation(value = "deleteOfferLine", nickname = "deleteOfferLineUsingDELETE", notes = "", tags={ "offer-line-resource", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK"),
        @ApiResponse(code = 204, message = "No Content"),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden") })
    @RequestMapping(value = "/api/offer-lines/{id}",
        method = RequestMethod.DELETE)
    ResponseEntity<Void> deleteOfferLineUsingDELETE(@ApiParam(value = "id",required=true) @PathVariable("id") Long id);


    @ApiOperation(value = "getAllOfferLines", nickname = "getAllOfferLinesUsingGET", notes = "", response = OfferLineDTO.class, responseContainer = "List", tags={ "offer-line-resource", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = OfferLineDTO.class, responseContainer = "List"),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/api/offer-lines",
        produces = "*/*", 
        method = RequestMethod.GET)
    ResponseEntity<List<OfferLineDTO>> getAllOfferLinesUsingGET(@ApiParam(value = "Page number of the requested page") @Valid @RequestParam(value = "page", required = false) Integer page,@ApiParam(value = "Size of a page") @Valid @RequestParam(value = "size", required = false) Integer size,@ApiParam(value = "Sorting criteria in the format: property(,asc|desc). Default sort order is ascending. Multiple sort criteria are supported.") @Valid @RequestParam(value = "sort", required = false) List<String> sort);


    @ApiOperation(value = "getOfferLine", nickname = "getOfferLineUsingGET", notes = "", response = OfferLineDTO.class, tags={ "offer-line-resource", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = OfferLineDTO.class),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/api/offer-lines/{id}",
        produces = "*/*", 
        method = RequestMethod.GET)
    ResponseEntity<OfferLineDTO> getOfferLineUsingGET(@ApiParam(value = "id",required=true) @PathVariable("id") Long id);


    @ApiOperation(value = "searchOfferLines", nickname = "searchOfferLinesUsingGET", notes = "", response = OfferLineDTO.class, responseContainer = "List", tags={ "offer-line-resource", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = OfferLineDTO.class, responseContainer = "List"),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/api/_search/offer-lines",
        produces = "*/*", 
        method = RequestMethod.GET)
    ResponseEntity<List<OfferLineDTO>> searchOfferLinesUsingGET(@NotNull @ApiParam(value = "query", required = true) @Valid @RequestParam(value = "query", required = true) String query,@ApiParam(value = "Page number of the requested page") @Valid @RequestParam(value = "page", required = false) Integer page,@ApiParam(value = "Size of a page") @Valid @RequestParam(value = "size", required = false) Integer size,@ApiParam(value = "Sorting criteria in the format: property(,asc|desc). Default sort order is ascending. Multiple sort criteria are supported.") @Valid @RequestParam(value = "sort", required = false) List<String> sort);


    @ApiOperation(value = "updateOfferLine", nickname = "updateOfferLineUsingPUT", notes = "", response = OfferLineDTO.class, tags={ "offer-line-resource", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = OfferLineDTO.class),
        @ApiResponse(code = 201, message = "Created"),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/api/offer-lines",
        produces = "*/*", 
        consumes = "application/json",
        method = RequestMethod.PUT)
    ResponseEntity<OfferLineDTO> updateOfferLineUsingPUT(@ApiParam(value = "offerLineDTO" ,required=true )  @Valid @RequestBody OfferLineDTO offerLineDTO);

}
