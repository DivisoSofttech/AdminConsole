/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (3.0.0-SNAPSHOT).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package com.diviso.graeshoppe.client.store.api;

import com.diviso.graeshoppe.client.store.model.PreOrderSettingsDTO;
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
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-12-26T12:53:13.446+05:30[Asia/Calcutta]")

@Api(value = "PreOrderSettingsResource", description = "the PreOrderSettingsResource API")
public interface PreOrderSettingsResourceApi {

    @ApiOperation(value = "createPreOrderSettings", nickname = "createPreOrderSettingsUsingPOST", notes = "", response = PreOrderSettingsDTO.class, tags={ "pre-order-settings-resource", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = PreOrderSettingsDTO.class),
        @ApiResponse(code = 201, message = "Created"),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/api/pre-order-settings",
        produces = "*/*", 
        consumes = "application/json",
        method = RequestMethod.POST)
    ResponseEntity<PreOrderSettingsDTO> createPreOrderSettingsUsingPOST(@ApiParam(value = "preOrderSettingsDTO" ,required=true )  @Valid @RequestBody PreOrderSettingsDTO preOrderSettingsDTO);


    @ApiOperation(value = "deletePreOrderSettings", nickname = "deletePreOrderSettingsUsingDELETE", notes = "", tags={ "pre-order-settings-resource", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK"),
        @ApiResponse(code = 204, message = "No Content"),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden") })
    @RequestMapping(value = "/api/pre-order-settings/{id}",
        method = RequestMethod.DELETE)
    ResponseEntity<Void> deletePreOrderSettingsUsingDELETE(@ApiParam(value = "id",required=true) @PathVariable("id") Long id);


    @ApiOperation(value = "getAllPreOrderSettings", nickname = "getAllPreOrderSettingsUsingGET", notes = "", response = PreOrderSettingsDTO.class, responseContainer = "List", tags={ "pre-order-settings-resource", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = PreOrderSettingsDTO.class, responseContainer = "List"),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/api/pre-order-settings",
        produces = "*/*", 
        method = RequestMethod.GET)
    ResponseEntity<List<PreOrderSettingsDTO>> getAllPreOrderSettingsUsingGET(@ApiParam(value = "Page number of the requested page") @Valid @RequestParam(value = "page", required = false) Integer page,@ApiParam(value = "Size of a page") @Valid @RequestParam(value = "size", required = false) Integer size,@ApiParam(value = "Sorting criteria in the format: property(,asc|desc). Default sort order is ascending. Multiple sort criteria are supported.") @Valid @RequestParam(value = "sort", required = false) List<String> sort);


    @ApiOperation(value = "getPreOrderSettings", nickname = "getPreOrderSettingsUsingGET", notes = "", response = PreOrderSettingsDTO.class, tags={ "pre-order-settings-resource", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = PreOrderSettingsDTO.class),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/api/pre-order-settings/{id}",
        produces = "*/*", 
        method = RequestMethod.GET)
    ResponseEntity<PreOrderSettingsDTO> getPreOrderSettingsUsingGET(@ApiParam(value = "id",required=true) @PathVariable("id") Long id);


    @ApiOperation(value = "searchPreOrderSettings", nickname = "searchPreOrderSettingsUsingGET", notes = "", response = PreOrderSettingsDTO.class, responseContainer = "List", tags={ "pre-order-settings-resource", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = PreOrderSettingsDTO.class, responseContainer = "List"),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/api/_search/pre-order-settings",
        produces = "*/*", 
        method = RequestMethod.GET)
    ResponseEntity<List<PreOrderSettingsDTO>> searchPreOrderSettingsUsingGET(@NotNull @ApiParam(value = "query", required = true) @Valid @RequestParam(value = "query", required = true) String query,@ApiParam(value = "Page number of the requested page") @Valid @RequestParam(value = "page", required = false) Integer page,@ApiParam(value = "Size of a page") @Valid @RequestParam(value = "size", required = false) Integer size,@ApiParam(value = "Sorting criteria in the format: property(,asc|desc). Default sort order is ascending. Multiple sort criteria are supported.") @Valid @RequestParam(value = "sort", required = false) List<String> sort);


    @ApiOperation(value = "updatePreOrderSettings", nickname = "updatePreOrderSettingsUsingPUT", notes = "", response = PreOrderSettingsDTO.class, tags={ "pre-order-settings-resource", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = PreOrderSettingsDTO.class),
        @ApiResponse(code = 201, message = "Created"),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/api/pre-order-settings",
        produces = "*/*", 
        consumes = "application/json",
        method = RequestMethod.PUT)
    ResponseEntity<PreOrderSettingsDTO> updatePreOrderSettingsUsingPUT(@ApiParam(value = "preOrderSettingsDTO" ,required=true )  @Valid @RequestBody PreOrderSettingsDTO preOrderSettingsDTO);

}