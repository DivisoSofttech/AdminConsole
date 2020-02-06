package com.diviso.graeshoppe.client.report.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.time.LocalDate;
import java.util.Date;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * CancellationSummary
 */
@Validated
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-02-06T14:12:57.765+05:30[Asia/Kolkata]")

public class CancellationSummary   {
  @JsonProperty("allCardCount")
  private Long allCardCount = null;

  @JsonProperty("allCardTotal")
  private Double allCardTotal = null;

  @JsonProperty("allRefundAmount")
  private Double allRefundAmount = null;

  @JsonProperty("collectionCardCount")
  private Long collectionCardCount = null;

  @JsonProperty("collectionCardTotal")
  private Double collectionCardTotal = null;

  @JsonProperty("collectionRefundAmount")
  private Double collectionRefundAmount = null;

  @JsonProperty("date")
  private LocalDate date = null;

  @JsonProperty("deliveryCardCount")
  private Long deliveryCardCount = null;

  @JsonProperty("deliveryCardTotal")
  private Double deliveryCardTotal = null;

  @JsonProperty("deliveryRefundAmount")
  private Double deliveryRefundAmount = null;

  @JsonProperty("storeId")
  private String storeId = null;

  public CancellationSummary allCardCount(Long allCardCount) {
    this.allCardCount = allCardCount;
    return this;
  }

  /**
   * Get allCardCount
   * @return allCardCount
  **/
  @ApiModelProperty(value = "")


  public Long getAllCardCount() {
    return allCardCount;
  }

  public void setAllCardCount(Long allCardCount) {
    this.allCardCount = allCardCount;
  }

  public CancellationSummary allCardTotal(Double allCardTotal) {
    this.allCardTotal = allCardTotal;
    return this;
  }

  /**
   * Get allCardTotal
   * @return allCardTotal
  **/
  @ApiModelProperty(value = "")


  public Double getAllCardTotal() {
    return allCardTotal;
  }

  public void setAllCardTotal(Double allCardTotal) {
    this.allCardTotal = allCardTotal;
  }

  public CancellationSummary allRefundAmount(Double allRefundAmount) {
    this.allRefundAmount = allRefundAmount;
    return this;
  }

  /**
   * Get allRefundAmount
   * @return allRefundAmount
  **/
  @ApiModelProperty(value = "")


  public Double getAllRefundAmount() {
    return allRefundAmount;
  }

  public void setAllRefundAmount(Double allRefundAmount) {
    this.allRefundAmount = allRefundAmount;
  }

  public CancellationSummary collectionCardCount(Long collectionCardCount) {
    this.collectionCardCount = collectionCardCount;
    return this;
  }

  /**
   * Get collectionCardCount
   * @return collectionCardCount
  **/
  @ApiModelProperty(value = "")


  public Long getCollectionCardCount() {
    return collectionCardCount;
  }

  public void setCollectionCardCount(Long collectionCardCount) {
    this.collectionCardCount = collectionCardCount;
  }

  public CancellationSummary collectionCardTotal(Double collectionCardTotal) {
    this.collectionCardTotal = collectionCardTotal;
    return this;
  }

  /**
   * Get collectionCardTotal
   * @return collectionCardTotal
  **/
  @ApiModelProperty(value = "")


  public Double getCollectionCardTotal() {
    return collectionCardTotal;
  }

  public void setCollectionCardTotal(Double collectionCardTotal) {
    this.collectionCardTotal = collectionCardTotal;
  }

  public CancellationSummary collectionRefundAmount(Double collectionRefundAmount) {
    this.collectionRefundAmount = collectionRefundAmount;
    return this;
  }

  /**
   * Get collectionRefundAmount
   * @return collectionRefundAmount
  **/
  @ApiModelProperty(value = "")


  public Double getCollectionRefundAmount() {
    return collectionRefundAmount;
  }

  public void setCollectionRefundAmount(Double collectionRefundAmount) {
    this.collectionRefundAmount = collectionRefundAmount;
  }

  public CancellationSummary date(LocalDate date) {
    this.date = date;
    return this;
  }

  /**
   * Get date
   * @return date
  **/
  @ApiModelProperty(value = "")

  @Valid

  public LocalDate getDate() {
    return date;
  }

  public void setDate(LocalDate date) {
    this.date = date;
  }

  public CancellationSummary deliveryCardCount(Long deliveryCardCount) {
    this.deliveryCardCount = deliveryCardCount;
    return this;
  }

  /**
   * Get deliveryCardCount
   * @return deliveryCardCount
  **/
  @ApiModelProperty(value = "")


  public Long getDeliveryCardCount() {
    return deliveryCardCount;
  }

  public void setDeliveryCardCount(Long deliveryCardCount) {
    this.deliveryCardCount = deliveryCardCount;
  }

  public CancellationSummary deliveryCardTotal(Double deliveryCardTotal) {
    this.deliveryCardTotal = deliveryCardTotal;
    return this;
  }

  /**
   * Get deliveryCardTotal
   * @return deliveryCardTotal
  **/
  @ApiModelProperty(value = "")


  public Double getDeliveryCardTotal() {
    return deliveryCardTotal;
  }

  public void setDeliveryCardTotal(Double deliveryCardTotal) {
    this.deliveryCardTotal = deliveryCardTotal;
  }

  public CancellationSummary deliveryRefundAmount(Double deliveryRefundAmount) {
    this.deliveryRefundAmount = deliveryRefundAmount;
    return this;
  }

  /**
   * Get deliveryRefundAmount
   * @return deliveryRefundAmount
  **/
  @ApiModelProperty(value = "")


  public Double getDeliveryRefundAmount() {
    return deliveryRefundAmount;
  }

  public void setDeliveryRefundAmount(Double deliveryRefundAmount) {
    this.deliveryRefundAmount = deliveryRefundAmount;
  }

  public CancellationSummary storeId(String storeId) {
    this.storeId = storeId;
    return this;
  }

  /**
   * Get storeId
   * @return storeId
  **/
  @ApiModelProperty(value = "")


  public String getStoreId() {
    return storeId;
  }

  public void setStoreId(String storeId) {
    this.storeId = storeId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CancellationSummary cancellationSummary = (CancellationSummary) o;
    return Objects.equals(this.allCardCount, cancellationSummary.allCardCount) &&
        Objects.equals(this.allCardTotal, cancellationSummary.allCardTotal) &&
        Objects.equals(this.allRefundAmount, cancellationSummary.allRefundAmount) &&
        Objects.equals(this.collectionCardCount, cancellationSummary.collectionCardCount) &&
        Objects.equals(this.collectionCardTotal, cancellationSummary.collectionCardTotal) &&
        Objects.equals(this.collectionRefundAmount, cancellationSummary.collectionRefundAmount) &&
        Objects.equals(this.date, cancellationSummary.date) &&
        Objects.equals(this.deliveryCardCount, cancellationSummary.deliveryCardCount) &&
        Objects.equals(this.deliveryCardTotal, cancellationSummary.deliveryCardTotal) &&
        Objects.equals(this.deliveryRefundAmount, cancellationSummary.deliveryRefundAmount) &&
        Objects.equals(this.storeId, cancellationSummary.storeId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(allCardCount, allCardTotal, allRefundAmount, collectionCardCount, collectionCardTotal, collectionRefundAmount, date, deliveryCardCount, deliveryCardTotal, deliveryRefundAmount, storeId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CancellationSummary {\n");
    
    sb.append("    allCardCount: ").append(toIndentedString(allCardCount)).append("\n");
    sb.append("    allCardTotal: ").append(toIndentedString(allCardTotal)).append("\n");
    sb.append("    allRefundAmount: ").append(toIndentedString(allRefundAmount)).append("\n");
    sb.append("    collectionCardCount: ").append(toIndentedString(collectionCardCount)).append("\n");
    sb.append("    collectionCardTotal: ").append(toIndentedString(collectionCardTotal)).append("\n");
    sb.append("    collectionRefundAmount: ").append(toIndentedString(collectionRefundAmount)).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    deliveryCardCount: ").append(toIndentedString(deliveryCardCount)).append("\n");
    sb.append("    deliveryCardTotal: ").append(toIndentedString(deliveryCardTotal)).append("\n");
    sb.append("    deliveryRefundAmount: ").append(toIndentedString(deliveryRefundAmount)).append("\n");
    sb.append("    storeId: ").append(toIndentedString(storeId)).append("\n");
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

