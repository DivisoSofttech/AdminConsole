/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (3.0.0-SNAPSHOT).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package com.diviso.graeshoppe.client.report.api;

import com.diviso.graeshoppe.client.report.model.ComboItemDTO;
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
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-01-13T12:00:20.433+05:30[Asia/Calcutta]")

@Api(value = "ComboItemResource", description = "the ComboItemResource API")
public interface ComboItemResourceApi {

    @ApiOperation(value = "createComboItem", nickname = "createComboItemUsingPOST", notes = "", response = ComboItemDTO.class, tags={ "combo-item-resource", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = ComboItemDTO.class),
        @ApiResponse(code = 201, message = "Created"),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/api/combo-items",
        produces = "*/*", 
        consumes = "application/json",
        method = RequestMethod.POST)
    ResponseEntity<ComboItemDTO> createComboItemUsingPOST(@ApiParam(value = "comboItemDTO" ,required=true )  @Valid @RequestBody ComboItemDTO comboItemDTO);


    @ApiOperation(value = "deleteComboItem", nickname = "deleteComboItemUsingDELETE", notes = "", tags={ "combo-item-resource", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK"),
        @ApiResponse(code = 204, message = "No Content"),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden") })
    @RequestMapping(value = "/api/combo-items/{id}",
        method = RequestMethod.DELETE)
    ResponseEntity<Void> deleteComboItemUsingDELETE(@ApiParam(value = "id",required=true) @PathVariable("id") Long id);


    @ApiOperation(value = "getAllComboItems", nickname = "getAllComboItemsUsingGET", notes = "", response = ComboItemDTO.class, responseContainer = "List", tags={ "combo-item-resource", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = ComboItemDTO.class, responseContainer = "List"),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/api/combo-items",
        produces = "*/*", 
        method = RequestMethod.GET)
    ResponseEntity<List<ComboItemDTO>> getAllComboItemsUsingGET(@ApiParam(value = "Page number of the requested page") @Valid @RequestParam(value = "page", required = false) Integer page,@ApiParam(value = "Size of a page") @Valid @RequestParam(value = "size", required = false) Integer size,@ApiParam(value = "Sorting criteria in the format: property(,asc|desc). Default sort order is ascending. Multiple sort criteria are supported.") @Valid @RequestParam(value = "sort", required = false) List<String> sort);


    @ApiOperation(value = "getComboItem", nickname = "getComboItemUsingGET", notes = "", response = ComboItemDTO.class, tags={ "combo-item-resource", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = ComboItemDTO.class),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/api/combo-items/{id}",
        produces = "*/*", 
        method = RequestMethod.GET)
    ResponseEntity<ComboItemDTO> getComboItemUsingGET(@ApiParam(value = "id",required=true) @PathVariable("id") Long id);


    @ApiOperation(value = "searchComboItems", nickname = "searchComboItemsUsingGET", notes = "", response = ComboItemDTO.class, responseContainer = "List", tags={ "combo-item-resource", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = ComboItemDTO.class, responseContainer = "List"),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/api/_search/combo-items",
        produces = "*/*", 
        method = RequestMethod.GET)
    ResponseEntity<List<ComboItemDTO>> searchComboItemsUsingGET(@NotNull @ApiParam(value = "query", required = true) @Valid @RequestParam(value = "query", required = true) String query,@ApiParam(value = "Page number of the requested page") @Valid @RequestParam(value = "page", required = false) Integer page,@ApiParam(value = "Size of a page") @Valid @RequestParam(value = "size", required = false) Integer size,@ApiParam(value = "Sorting criteria in the format: property(,asc|desc). Default sort order is ascending. Multiple sort criteria are supported.") @Valid @RequestParam(value = "sort", required = false) List<String> sort);


    @ApiOperation(value = "updateComboItem", nickname = "updateComboItemUsingPUT", notes = "", response = ComboItemDTO.class, tags={ "combo-item-resource", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = ComboItemDTO.class),
        @ApiResponse(code = 201, message = "Created"),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/api/combo-items",
        produces = "*/*", 
        consumes = "application/json",
        method = RequestMethod.PUT)
    ResponseEntity<ComboItemDTO> updateComboItemUsingPUT(@ApiParam(value = "comboItemDTO" ,required=true )  @Valid @RequestBody ComboItemDTO comboItemDTO);

}
