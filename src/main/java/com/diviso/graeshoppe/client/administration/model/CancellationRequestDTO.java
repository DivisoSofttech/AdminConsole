package com.diviso.graeshoppe.client.administration.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * CancellationRequestDTO
 */
@Validated
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-12-03T16:52:52.203+05:30[Asia/Kolkata]")

public class CancellationRequestDTO   {
  @JsonProperty("customerEmail")
  private String customerEmail = null;

  @JsonProperty("customerPhone")
  private Long customerPhone = null;

  @JsonProperty("date")
  private OffsetDateTime date = null;

  @JsonProperty("id")
  private Long id = null;

  @JsonProperty("orderId")
  private String orderId = null;

  @JsonProperty("paymentId")
  private String paymentId = null;

  @JsonProperty("refoundDetailsId")
  private Long refoundDetailsId = null;

  @JsonProperty("status")
  private String status = null;

  @JsonProperty("storeEmail")
  private String storeEmail = null;

  @JsonProperty("storePhone")
  private Long storePhone = null;

  public CancellationRequestDTO customerEmail(String customerEmail) {
    this.customerEmail = customerEmail;
    return this;
  }

  /**
   * Get customerEmail
   * @return customerEmail
  **/
  @ApiModelProperty(value = "")


  public String getCustomerEmail() {
    return customerEmail;
  }

  public void setCustomerEmail(String customerEmail) {
    this.customerEmail = customerEmail;
  }

  public CancellationRequestDTO customerPhone(Long customerPhone) {
    this.customerPhone = customerPhone;
    return this;
  }

  /**
   * Get customerPhone
   * @return customerPhone
  **/
  @ApiModelProperty(value = "")


  public Long getCustomerPhone() {
    return customerPhone;
  }

  public void setCustomerPhone(Long customerPhone) {
    this.customerPhone = customerPhone;
  }

  public CancellationRequestDTO date(OffsetDateTime date) {
    this.date = date;
    return this;
  }

  /**
   * Get date
   * @return date
  **/
  @ApiModelProperty(value = "")

  @Valid

  public OffsetDateTime getDate() {
    return date;
  }

  public void setDate(OffsetDateTime date) {
    this.date = date;
  }

  public CancellationRequestDTO id(Long id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(value = "")


  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public CancellationRequestDTO orderId(String orderId) {
    this.orderId = orderId;
    return this;
  }

  /**
   * Get orderId
   * @return orderId
  **/
  @ApiModelProperty(value = "")


  public String getOrderId() {
    return orderId;
  }

  public void setOrderId(String orderId) {
    this.orderId = orderId;
  }

  public CancellationRequestDTO paymentId(String paymentId) {
    this.paymentId = paymentId;
    return this;
  }

  /**
   * Get paymentId
   * @return paymentId
  **/
  @ApiModelProperty(value = "")


  public String getPaymentId() {
    return paymentId;
  }

  public void setPaymentId(String paymentId) {
    this.paymentId = paymentId;
  }

  public CancellationRequestDTO refoundDetailsId(Long refoundDetailsId) {
    this.refoundDetailsId = refoundDetailsId;
    return this;
  }

  /**
   * Get refoundDetailsId
   * @return refoundDetailsId
  **/
  @ApiModelProperty(value = "")


  public Long getRefoundDetailsId() {
    return refoundDetailsId;
  }

  public void setRefoundDetailsId(Long refoundDetailsId) {
    this.refoundDetailsId = refoundDetailsId;
  }

  public CancellationRequestDTO status(String status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
  **/
  @ApiModelProperty(value = "")


  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public CancellationRequestDTO storeEmail(String storeEmail) {
    this.storeEmail = storeEmail;
    return this;
  }

  /**
   * Get storeEmail
   * @return storeEmail
  **/
  @ApiModelProperty(value = "")


  public String getStoreEmail() {
    return storeEmail;
  }

  public void setStoreEmail(String storeEmail) {
    this.storeEmail = storeEmail;
  }

  public CancellationRequestDTO storePhone(Long storePhone) {
    this.storePhone = storePhone;
    return this;
  }

  /**
   * Get storePhone
   * @return storePhone
  **/
  @ApiModelProperty(value = "")


  public Long getStorePhone() {
    return storePhone;
  }

  public void setStorePhone(Long storePhone) {
    this.storePhone = storePhone;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CancellationRequestDTO cancellationRequestDTO = (CancellationRequestDTO) o;
    return Objects.equals(this.customerEmail, cancellationRequestDTO.customerEmail) &&
        Objects.equals(this.customerPhone, cancellationRequestDTO.customerPhone) &&
        Objects.equals(this.date, cancellationRequestDTO.date) &&
        Objects.equals(this.id, cancellationRequestDTO.id) &&
        Objects.equals(this.orderId, cancellationRequestDTO.orderId) &&
        Objects.equals(this.paymentId, cancellationRequestDTO.paymentId) &&
        Objects.equals(this.refoundDetailsId, cancellationRequestDTO.refoundDetailsId) &&
        Objects.equals(this.status, cancellationRequestDTO.status) &&
        Objects.equals(this.storeEmail, cancellationRequestDTO.storeEmail) &&
        Objects.equals(this.storePhone, cancellationRequestDTO.storePhone);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customerEmail, customerPhone, date, id, orderId, paymentId, refoundDetailsId, status, storeEmail, storePhone);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CancellationRequestDTO {\n");
    
    sb.append("    customerEmail: ").append(toIndentedString(customerEmail)).append("\n");
    sb.append("    customerPhone: ").append(toIndentedString(customerPhone)).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    orderId: ").append(toIndentedString(orderId)).append("\n");
    sb.append("    paymentId: ").append(toIndentedString(paymentId)).append("\n");
    sb.append("    refoundDetailsId: ").append(toIndentedString(refoundDetailsId)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    storeEmail: ").append(toIndentedString(storeEmail)).append("\n");
    sb.append("    storePhone: ").append(toIndentedString(storePhone)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

