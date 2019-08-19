package com.diviso.graeshoppe.client.order.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * AuxItem
 */
@Validated
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-08-19T15:28:24.559733200+05:30[Asia/Calcutta]")

public class AuxItem   {
  @JsonProperty("auxItem")
  private String auxItem = null;

  @JsonProperty("quantity")
  private Double quantity = null;

  @JsonProperty("total")
  private Double total = null;

  public AuxItem auxItem(String auxItem) {
    this.auxItem = auxItem;
    return this;
  }

  /**
   * Get auxItem
   * @return auxItem
  **/
  @ApiModelProperty(value = "")


  public String getAuxItem() {
    return auxItem;
  }

  public void setAuxItem(String auxItem) {
    this.auxItem = auxItem;
  }

  public AuxItem quantity(Double quantity) {
    this.quantity = quantity;
    return this;
  }

  /**
   * Get quantity
   * @return quantity
  **/
  @ApiModelProperty(value = "")


  public Double getQuantity() {
    return quantity;
  }

  public void setQuantity(Double quantity) {
    this.quantity = quantity;
  }

  public AuxItem total(Double total) {
    this.total = total;
    return this;
  }

  /**
   * Get total
   * @return total
  **/
  @ApiModelProperty(value = "")


  public Double getTotal() {
    return total;
  }

  public void setTotal(Double total) {
    this.total = total;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AuxItem auxItem = (AuxItem) o;
    return Objects.equals(this.auxItem, auxItem.auxItem) &&
        Objects.equals(this.quantity, auxItem.quantity) &&
        Objects.equals(this.total, auxItem.total);
  }

  @Override
  public int hashCode() {
    return Objects.hash(auxItem, quantity, total);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AuxItem {\n");
    
    sb.append("    auxItem: ").append(toIndentedString(auxItem)).append("\n");
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
    sb.append("    total: ").append(toIndentedString(total)).append("\n");
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

