/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (3.0.0-SNAPSHOT).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package com.diviso.graeshoppe.client.offer_resource.api;

import com.diviso.graeshoppe.client.offer_resource.model.DeductionValueTypeDTO;
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
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-08-16T09:47:50.329632700+05:30[Asia/Calcutta]")

@Api(value = "DeductionValueTypeResource", description = "the DeductionValueTypeResource API")
public interface DeductionValueTypeResourceApi {

    @ApiOperation(value = "createDeductionValueType", nickname = "createDeductionValueTypeUsingPOST", notes = "", response = DeductionValueTypeDTO.class, tags={ "deduction-value-type-resource", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = DeductionValueTypeDTO.class),
        @ApiResponse(code = 201, message = "Created"),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/api/deduction-value-types",
        produces = "*/*", 
        consumes = "application/json",
        method = RequestMethod.POST)
    ResponseEntity<DeductionValueTypeDTO> createDeductionValueTypeUsingPOST(@ApiParam(value = "deductionValueTypeDTO" ,required=true )  @Valid @RequestBody DeductionValueTypeDTO deductionValueTypeDTO);


    @ApiOperation(value = "deleteDeductionValueType", nickname = "deleteDeductionValueTypeUsingDELETE", notes = "", tags={ "deduction-value-type-resource", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK"),
        @ApiResponse(code = 204, message = "No Content"),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden") })
    @RequestMapping(value = "/api/deduction-value-types/{id}",
        method = RequestMethod.DELETE)
    ResponseEntity<Void> deleteDeductionValueTypeUsingDELETE(@ApiParam(value = "id",required=true) @PathVariable("id") Long id);


    @ApiOperation(value = "getAllDeductionValueTypes", nickname = "getAllDeductionValueTypesUsingGET1", notes = "", response = DeductionValueTypeDTO.class, responseContainer = "List", tags={ "deduction-value-type-resource", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = DeductionValueTypeDTO.class, responseContainer = "List"),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/api/deduction-value-types",
        produces = "*/*", 
        method = RequestMethod.GET)
    ResponseEntity<List<DeductionValueTypeDTO>> getAllDeductionValueTypesUsingGET1(@ApiParam(value = "") @Valid @RequestParam(value = "offset", required = false) Long offset,@ApiParam(value = "Page number of the requested page") @Valid @RequestParam(value = "page", required = false) Integer page,@ApiParam(value = "") @Valid @RequestParam(value = "pageNumber", required = false) Integer pageNumber,@ApiParam(value = "") @Valid @RequestParam(value = "pageSize", required = false) Integer pageSize,@ApiParam(value = "") @Valid @RequestParam(value = "paged", required = false) Boolean paged,@ApiParam(value = "Size of a page") @Valid @RequestParam(value = "size", required = false) Integer size,@ApiParam(value = "Sorting criteria in the format: property(,asc|desc). Default sort order is ascending. Multiple sort criteria are supported.") @Valid @RequestParam(value = "sort", required = false) List<String> sort,@ApiParam(value = "") @Valid @RequestParam(value = "sort.sorted", required = false) Boolean sortSorted,@ApiParam(value = "") @Valid @RequestParam(value = "sort.unsorted", required = false) Boolean sortUnsorted,@ApiParam(value = "") @Valid @RequestParam(value = "unpaged", required = false) Boolean unpaged);


    @ApiOperation(value = "getDeductionValueType", nickname = "getDeductionValueTypeUsingGET", notes = "", response = DeductionValueTypeDTO.class, tags={ "deduction-value-type-resource", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = DeductionValueTypeDTO.class),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/api/deduction-value-types/{id}",
        produces = "*/*", 
        method = RequestMethod.GET)
    ResponseEntity<DeductionValueTypeDTO> getDeductionValueTypeUsingGET(@ApiParam(value = "id",required=true) @PathVariable("id") Long id);


    @ApiOperation(value = "searchDeductionValueTypes", nickname = "searchDeductionValueTypesUsingGET", notes = "", response = DeductionValueTypeDTO.class, responseContainer = "List", tags={ "deduction-value-type-resource", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = DeductionValueTypeDTO.class, responseContainer = "List"),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/api/_search/deduction-value-types",
        produces = "*/*", 
        method = RequestMethod.GET)
    ResponseEntity<List<DeductionValueTypeDTO>> searchDeductionValueTypesUsingGET(@NotNull @ApiParam(value = "query", required = true) @Valid @RequestParam(value = "query", required = true) String query,@ApiParam(value = "") @Valid @RequestParam(value = "offset", required = false) Long offset,@ApiParam(value = "Page number of the requested page") @Valid @RequestParam(value = "page", required = false) Integer page,@ApiParam(value = "") @Valid @RequestParam(value = "pageNumber", required = false) Integer pageNumber,@ApiParam(value = "") @Valid @RequestParam(value = "pageSize", required = false) Integer pageSize,@ApiParam(value = "") @Valid @RequestParam(value = "paged", required = false) Boolean paged,@ApiParam(value = "Size of a page") @Valid @RequestParam(value = "size", required = false) Integer size,@ApiParam(value = "Sorting criteria in the format: property(,asc|desc). Default sort order is ascending. Multiple sort criteria are supported.") @Valid @RequestParam(value = "sort", required = false) List<String> sort,@ApiParam(value = "") @Valid @RequestParam(value = "sort.sorted", required = false) Boolean sortSorted,@ApiParam(value = "") @Valid @RequestParam(value = "sort.unsorted", required = false) Boolean sortUnsorted,@ApiParam(value = "") @Valid @RequestParam(value = "unpaged", required = false) Boolean unpaged);


    @ApiOperation(value = "updateDeductionValueType", nickname = "updateDeductionValueTypeUsingPUT", notes = "", response = DeductionValueTypeDTO.class, tags={ "deduction-value-type-resource", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = DeductionValueTypeDTO.class),
        @ApiResponse(code = 201, message = "Created"),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/api/deduction-value-types",
        produces = "*/*", 
        consumes = "application/json",
        method = RequestMethod.PUT)
    ResponseEntity<DeductionValueTypeDTO> updateDeductionValueTypeUsingPUT(@ApiParam(value = "deductionValueTypeDTO" ,required=true )  @Valid @RequestBody DeductionValueTypeDTO deductionValueTypeDTO);

}
