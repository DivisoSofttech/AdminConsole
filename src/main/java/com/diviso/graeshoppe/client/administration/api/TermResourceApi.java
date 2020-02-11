/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (3.0.0-SNAPSHOT).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package com.diviso.graeshoppe.client.administration.api;

import com.diviso.graeshoppe.client.administration.model.TermDTO;
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

@Api(value = "TermResource", description = "the TermResource API")
public interface TermResourceApi {

    @ApiOperation(value = "createTerm", nickname = "createTermUsingPOST", notes = "", response = TermDTO.class, tags={ "term-resource", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = TermDTO.class),
        @ApiResponse(code = 201, message = "Created"),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/api/terms",
        produces = "*/*", 
        consumes = "application/json",
        method = RequestMethod.POST)
    ResponseEntity<TermDTO> createTermUsingPOST(@ApiParam(value = "termDTO" ,required=true )  @Valid @RequestBody TermDTO termDTO);


    @ApiOperation(value = "deleteTerm", nickname = "deleteTermUsingDELETE", notes = "", tags={ "term-resource", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK"),
        @ApiResponse(code = 204, message = "No Content"),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden") })
    @RequestMapping(value = "/api/terms/{id}",
        method = RequestMethod.DELETE)
    ResponseEntity<Void> deleteTermUsingDELETE(@ApiParam(value = "id",required=true) @PathVariable("id") Long id);


    @ApiOperation(value = "getAllTerms", nickname = "getAllTermsUsingGET", notes = "", response = TermDTO.class, responseContainer = "List", tags={ "term-resource", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = TermDTO.class, responseContainer = "List"),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/api/terms",
        produces = "*/*", 
        method = RequestMethod.GET)
    ResponseEntity<List<TermDTO>> getAllTermsUsingGET(@ApiParam(value = "Page number of the requested page") @Valid @RequestParam(value = "page", required = false) Integer page,@ApiParam(value = "Size of a page") @Valid @RequestParam(value = "size", required = false) Integer size,@ApiParam(value = "Sorting criteria in the format: property(,asc|desc). Default sort order is ascending. Multiple sort criteria are supported.") @Valid @RequestParam(value = "sort", required = false) List<String> sort);


    @ApiOperation(value = "getTerm", nickname = "getTermUsingGET", notes = "", response = TermDTO.class, tags={ "term-resource", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = TermDTO.class),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/api/terms/{id}",
        produces = "*/*", 
        method = RequestMethod.GET)
    ResponseEntity<TermDTO> getTermUsingGET(@ApiParam(value = "id",required=true) @PathVariable("id") Long id);


    @ApiOperation(value = "searchTerms", nickname = "searchTermsUsingGET", notes = "", response = TermDTO.class, responseContainer = "List", tags={ "term-resource", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = TermDTO.class, responseContainer = "List"),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/api/_search/terms",
        produces = "*/*", 
        method = RequestMethod.GET)
    ResponseEntity<List<TermDTO>> searchTermsUsingGET(@NotNull @ApiParam(value = "query", required = true) @Valid @RequestParam(value = "query", required = true) String query,@ApiParam(value = "Page number of the requested page") @Valid @RequestParam(value = "page", required = false) Integer page,@ApiParam(value = "Size of a page") @Valid @RequestParam(value = "size", required = false) Integer size,@ApiParam(value = "Sorting criteria in the format: property(,asc|desc). Default sort order is ascending. Multiple sort criteria are supported.") @Valid @RequestParam(value = "sort", required = false) List<String> sort);


    @ApiOperation(value = "updateTerm", nickname = "updateTermUsingPUT", notes = "", response = TermDTO.class, tags={ "term-resource", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = TermDTO.class),
        @ApiResponse(code = 201, message = "Created"),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/api/terms",
        produces = "*/*", 
        consumes = "application/json",
        method = RequestMethod.PUT)
    ResponseEntity<TermDTO> updateTermUsingPUT(@ApiParam(value = "termDTO" ,required=true )  @Valid @RequestBody TermDTO termDTO);

}
