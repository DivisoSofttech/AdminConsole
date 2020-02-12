/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (3.0.0-SNAPSHOT).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package com.diviso.graeshoppe.client.administration.api;

import com.diviso.graeshoppe.client.administration.model.TicketIdGeneratorDTO;
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
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-02-11T16:00:16.475+05:30[Asia/Calcutta]")

@Api(value = "TicketIdGeneratorResource", description = "the TicketIdGeneratorResource API")
public interface TicketIdGeneratorResourceApi {

    @ApiOperation(value = "createTicketIdGenerator", nickname = "createTicketIdGeneratorUsingPOST", notes = "", response = TicketIdGeneratorDTO.class, tags={ "ticket-id-generator-resource", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = TicketIdGeneratorDTO.class),
        @ApiResponse(code = 201, message = "Created"),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/api/ticket-id-generators",
        produces = "*/*", 
        consumes = "application/json",
        method = RequestMethod.POST)
    ResponseEntity<TicketIdGeneratorDTO> createTicketIdGeneratorUsingPOST(@ApiParam(value = "ticketIdGeneratorDTO" ,required=true )  @Valid @RequestBody TicketIdGeneratorDTO ticketIdGeneratorDTO);


    @ApiOperation(value = "deleteTicketIdGenerator", nickname = "deleteTicketIdGeneratorUsingDELETE", notes = "", tags={ "ticket-id-generator-resource", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK"),
        @ApiResponse(code = 204, message = "No Content"),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden") })
    @RequestMapping(value = "/api/ticket-id-generators/{id}",
        method = RequestMethod.DELETE)
    ResponseEntity<Void> deleteTicketIdGeneratorUsingDELETE(@ApiParam(value = "id",required=true) @PathVariable("id") Long id);


    @ApiOperation(value = "getAllTicketIdGenerators", nickname = "getAllTicketIdGeneratorsUsingGET", notes = "", response = TicketIdGeneratorDTO.class, responseContainer = "List", tags={ "ticket-id-generator-resource", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = TicketIdGeneratorDTO.class, responseContainer = "List"),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/api/ticket-id-generators",
        produces = "*/*", 
        method = RequestMethod.GET)
    ResponseEntity<List<TicketIdGeneratorDTO>> getAllTicketIdGeneratorsUsingGET(@ApiParam(value = "Page number of the requested page") @Valid @RequestParam(value = "page", required = false) Integer page,@ApiParam(value = "Size of a page") @Valid @RequestParam(value = "size", required = false) Integer size,@ApiParam(value = "Sorting criteria in the format: property(,asc|desc). Default sort order is ascending. Multiple sort criteria are supported.") @Valid @RequestParam(value = "sort", required = false) List<String> sort);


    @ApiOperation(value = "getTicketIdGenerator", nickname = "getTicketIdGeneratorUsingGET", notes = "", response = TicketIdGeneratorDTO.class, tags={ "ticket-id-generator-resource", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = TicketIdGeneratorDTO.class),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/api/ticket-id-generators/{id}",
        produces = "*/*", 
        method = RequestMethod.GET)
    ResponseEntity<TicketIdGeneratorDTO> getTicketIdGeneratorUsingGET(@ApiParam(value = "id",required=true) @PathVariable("id") Long id);


    @ApiOperation(value = "searchTicketIdGenerators", nickname = "searchTicketIdGeneratorsUsingGET", notes = "", response = TicketIdGeneratorDTO.class, responseContainer = "List", tags={ "ticket-id-generator-resource", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = TicketIdGeneratorDTO.class, responseContainer = "List"),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/api/_search/ticket-id-generators",
        produces = "*/*", 
        method = RequestMethod.GET)
    ResponseEntity<List<TicketIdGeneratorDTO>> searchTicketIdGeneratorsUsingGET(@NotNull @ApiParam(value = "query", required = true) @Valid @RequestParam(value = "query", required = true) String query,@ApiParam(value = "Page number of the requested page") @Valid @RequestParam(value = "page", required = false) Integer page,@ApiParam(value = "Size of a page") @Valid @RequestParam(value = "size", required = false) Integer size,@ApiParam(value = "Sorting criteria in the format: property(,asc|desc). Default sort order is ascending. Multiple sort criteria are supported.") @Valid @RequestParam(value = "sort", required = false) List<String> sort);


    @ApiOperation(value = "updateTicketIdGenerator", nickname = "updateTicketIdGeneratorUsingPUT", notes = "", response = TicketIdGeneratorDTO.class, tags={ "ticket-id-generator-resource", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = TicketIdGeneratorDTO.class),
        @ApiResponse(code = 201, message = "Created"),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/api/ticket-id-generators",
        produces = "*/*", 
        consumes = "application/json",
        method = RequestMethod.PUT)
    ResponseEntity<TicketIdGeneratorDTO> updateTicketIdGeneratorUsingPUT(@ApiParam(value = "ticketIdGeneratorDTO" ,required=true )  @Valid @RequestBody TicketIdGeneratorDTO ticketIdGeneratorDTO);

}
