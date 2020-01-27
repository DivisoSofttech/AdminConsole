/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (3.0.0-SNAPSHOT).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package com.diviso.graeshoppe.client.administration.api;

import com.diviso.graeshoppe.client.administration.model.SubTermDTO;
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
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-01-27T14:39:15.905+05:30[Asia/Kolkata]")

@Api(value = "SubTermResource", description = "the SubTermResource API")
public interface SubTermResourceApi {

    @ApiOperation(value = "createSubTerm", nickname = "createSubTermUsingPOST", notes = "", response = SubTermDTO.class, tags={ "sub-term-resource", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = SubTermDTO.class),
        @ApiResponse(code = 201, message = "Created"),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/api/sub-terms",
        produces = "*/*", 
        consumes = "application/json",
        method = RequestMethod.POST)
    ResponseEntity<SubTermDTO> createSubTermUsingPOST(@ApiParam(value = "subTermDTO" ,required=true )  @Valid @RequestBody SubTermDTO subTermDTO);


    @ApiOperation(value = "deleteSubTerm", nickname = "deleteSubTermUsingDELETE", notes = "", tags={ "sub-term-resource", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK"),
        @ApiResponse(code = 204, message = "No Content"),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden") })
    @RequestMapping(value = "/api/sub-terms/{id}",
        method = RequestMethod.DELETE)
    ResponseEntity<Void> deleteSubTermUsingDELETE(@ApiParam(value = "id",required=true) @PathVariable("id") Long id);


    @ApiOperation(value = "getAllSubTerms", nickname = "getAllSubTermsUsingGET", notes = "", response = SubTermDTO.class, responseContainer = "List", tags={ "sub-term-resource", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = SubTermDTO.class, responseContainer = "List"),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/api/sub-terms",
        produces = "*/*", 
        method = RequestMethod.GET)
    ResponseEntity<List<SubTermDTO>> getAllSubTermsUsingGET(@ApiParam(value = "Page number of the requested page") @Valid @RequestParam(value = "page", required = false) Integer page,@ApiParam(value = "Size of a page") @Valid @RequestParam(value = "size", required = false) Integer size,@ApiParam(value = "Sorting criteria in the format: property(,asc|desc). Default sort order is ascending. Multiple sort criteria are supported.") @Valid @RequestParam(value = "sort", required = false) List<String> sort);


    @ApiOperation(value = "getSubTerm", nickname = "getSubTermUsingGET", notes = "", response = SubTermDTO.class, tags={ "sub-term-resource", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = SubTermDTO.class),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/api/sub-terms/{id}",
        produces = "*/*", 
        method = RequestMethod.GET)
    ResponseEntity<SubTermDTO> getSubTermUsingGET(@ApiParam(value = "id",required=true) @PathVariable("id") Long id);


    @ApiOperation(value = "searchSubTerms", nickname = "searchSubTermsUsingGET", notes = "", response = SubTermDTO.class, responseContainer = "List", tags={ "sub-term-resource", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = SubTermDTO.class, responseContainer = "List"),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/api/_search/sub-terms",
        produces = "*/*", 
        method = RequestMethod.GET)
    ResponseEntity<List<SubTermDTO>> searchSubTermsUsingGET(@NotNull @ApiParam(value = "query", required = true) @Valid @RequestParam(value = "query", required = true) String query,@ApiParam(value = "Page number of the requested page") @Valid @RequestParam(value = "page", required = false) Integer page,@ApiParam(value = "Size of a page") @Valid @RequestParam(value = "size", required = false) Integer size,@ApiParam(value = "Sorting criteria in the format: property(,asc|desc). Default sort order is ascending. Multiple sort criteria are supported.") @Valid @RequestParam(value = "sort", required = false) List<String> sort);


    @ApiOperation(value = "updateSubTerm", nickname = "updateSubTermUsingPUT", notes = "", response = SubTermDTO.class, tags={ "sub-term-resource", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = SubTermDTO.class),
        @ApiResponse(code = 201, message = "Created"),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/api/sub-terms",
        produces = "*/*", 
        consumes = "application/json",
        method = RequestMethod.PUT)
    ResponseEntity<SubTermDTO> updateSubTermUsingPUT(@ApiParam(value = "subTermDTO" ,required=true )  @Valid @RequestBody SubTermDTO subTermDTO);

}
