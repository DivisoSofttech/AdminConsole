package com.diviso.graeshoppe.client.report.model;

import java.util.Objects;
import com.diviso.graeshoppe.client.report.model.OfferLine;
import com.diviso.graeshoppe.client.report.model.OrderLine;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * EscPosDocket
 */
@Validated
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-02-06T14:12:57.765+05:30[Asia/Kolkata]")

public class EscPosDocket   {
  @JsonProperty("addressType")
  private String addressType = null;

  @JsonProperty("allergyNote")
  private String allergyNote = null;

  @JsonProperty("alternatePhone")
  private Long alternatePhone = null;

  @JsonProperty("attentionForFirstOrder")
  private String attentionForFirstOrder = null;

  @JsonProperty("cancellationRef")
  private Long cancellationRef = null;

  @JsonProperty("city")
  private String city = null;

  @JsonProperty("content")
  private String content = null;

  @JsonProperty("customerDetails")
  private String customerDetails = null;

  @JsonProperty("customerId")
  private String customerId = null;

  @JsonProperty("customerName")
  private String customerName = null;

  @JsonProperty("customerOrder")
  private Long customerOrder = null;

  @JsonProperty("customerOrderDetails")
  private String customerOrderDetails = null;

  @JsonProperty("deliveryCharge")
  private Double deliveryCharge = null;

  @JsonProperty("discountAndTotal")
  private String discountAndTotal = null;

  @JsonProperty("email")
  private String email = null;

  @JsonProperty("expectedDelivery")
  private OffsetDateTime expectedDelivery = null;

  @JsonProperty("footer")
  private String footer = null;

  @JsonProperty("headers")
  private String headers = null;

  @JsonProperty("houseNoOrBuildingName")
  private String houseNoOrBuildingName = null;

  @JsonProperty("id")
  private Long id = null;

  @JsonProperty("landmark")
  private String landmark = null;

  @JsonProperty("loyaltyPoint")
  private Long loyaltyPoint = null;

  @JsonProperty("methodOfOrder")
  private String methodOfOrder = null;

  @JsonProperty("notes")
  private String notes = null;

  @JsonProperty("offerLines")
  @Valid
  private List<OfferLine> offerLines = null;

  @JsonProperty("orderAcceptedAt")
  private OffsetDateTime orderAcceptedAt = null;

  @JsonProperty("orderDiscountAmount")
  private Double orderDiscountAmount = null;

  @JsonProperty("orderFromCustomer")
  private Long orderFromCustomer = null;

  @JsonProperty("orderLines")
  @Valid
  private List<OrderLine> orderLines = null;

  @JsonProperty("orderNumber")
  private String orderNumber = null;

  @JsonProperty("orderPlaceAt")
  private OffsetDateTime orderPlaceAt = null;

  @JsonProperty("orderStatus")
  private String orderStatus = null;

  @JsonProperty("paymentRef")
  private String paymentRef = null;

  @JsonProperty("paymentStatus")
  private String paymentStatus = null;

  @JsonProperty("paymentStatusForDocket")
  private String paymentStatusForDocket = null;

  @JsonProperty("phone")
  private Long phone = null;

  @JsonProperty("pincode")
  private String pincode = null;

  @JsonProperty("preOrderDate")
  private OffsetDateTime preOrderDate = null;

  @JsonProperty("products")
  private String products = null;

  @JsonProperty("refundedAmount")
  private Double refundedAmount = null;

  @JsonProperty("roadNameAreaOrStreet")
  private String roadNameAreaOrStreet = null;

  @JsonProperty("serviceCharge")
  private Double serviceCharge = null;

  @JsonProperty("state")
  private String state = null;

  @JsonProperty("storeIdpcode")
  private String storeIdpcode = null;

  @JsonProperty("storeName")
  private String storeName = null;

  @JsonProperty("storePhone")
  private Long storePhone = null;

  @JsonProperty("storelocationName")
  private String storelocationName = null;

  @JsonProperty("subTotal")
  private Double subTotal = null;

  @JsonProperty("totalDue")
  private Double totalDue = null;

  @JsonProperty("zoneId")
  private String zoneId = null;

  public EscPosDocket addressType(String addressType) {
    this.addressType = addressType;
    return this;
  }

  /**
   * Get addressType
   * @return addressType
  **/
  @ApiModelProperty(value = "")


  public String getAddressType() {
    return addressType;
  }

  public void setAddressType(String addressType) {
    this.addressType = addressType;
  }

  public EscPosDocket allergyNote(String allergyNote) {
    this.allergyNote = allergyNote;
    return this;
  }

  /**
   * Get allergyNote
   * @return allergyNote
  **/
  @ApiModelProperty(value = "")


  public String getAllergyNote() {
    return allergyNote;
  }

  public void setAllergyNote(String allergyNote) {
    this.allergyNote = allergyNote;
  }

  public EscPosDocket alternatePhone(Long alternatePhone) {
    this.alternatePhone = alternatePhone;
    return this;
  }

  /**
   * Get alternatePhone
   * @return alternatePhone
  **/
  @ApiModelProperty(value = "")


  public Long getAlternatePhone() {
    return alternatePhone;
  }

  public void setAlternatePhone(Long alternatePhone) {
    this.alternatePhone = alternatePhone;
  }

  public EscPosDocket attentionForFirstOrder(String attentionForFirstOrder) {
    this.attentionForFirstOrder = attentionForFirstOrder;
    return this;
  }

  /**
   * Get attentionForFirstOrder
   * @return attentionForFirstOrder
  **/
  @ApiModelProperty(value = "")


  public String getAttentionForFirstOrder() {
    return attentionForFirstOrder;
  }

  public void setAttentionForFirstOrder(String attentionForFirstOrder) {
    this.attentionForFirstOrder = attentionForFirstOrder;
  }

  public EscPosDocket cancellationRef(Long cancellationRef) {
    this.cancellationRef = cancellationRef;
    return this;
  }

  /**
   * Get cancellationRef
   * @return cancellationRef
  **/
  @ApiModelProperty(value = "")


  public Long getCancellationRef() {
    return cancellationRef;
  }

  public void setCancellationRef(Long cancellationRef) {
    this.cancellationRef = cancellationRef;
  }

  public EscPosDocket city(String city) {
    this.city = city;
    return this;
  }

  /**
   * Get city
   * @return city
  **/
  @ApiModelProperty(value = "")


  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public EscPosDocket content(String content) {
    this.content = content;
    return this;
  }

  /**
   * Get content
   * @return content
  **/
  @ApiModelProperty(value = "")


  public String getContent() {
    return content;
  }

  public void setContent(String content) {
    this.content = content;
  }

  public EscPosDocket customerDetails(String customerDetails) {
    this.customerDetails = customerDetails;
    return this;
  }

  /**
   * Get customerDetails
   * @return customerDetails
  **/
  @ApiModelProperty(value = "")


  public String getCustomerDetails() {
    return customerDetails;
  }

  public void setCustomerDetails(String customerDetails) {
    this.customerDetails = customerDetails;
  }

  public EscPosDocket customerId(String customerId) {
    this.customerId = customerId;
    return this;
  }

  /**
   * Get customerId
   * @return customerId
  **/
  @ApiModelProperty(value = "")


  public String getCustomerId() {
    return customerId;
  }

  public void setCustomerId(String customerId) {
    this.customerId = customerId;
  }

  public EscPosDocket customerName(String customerName) {
    this.customerName = customerName;
    return this;
  }

  /**
   * Get customerName
   * @return customerName
  **/
  @ApiModelProperty(value = "")


  public String getCustomerName() {
    return customerName;
  }

  public void setCustomerName(String customerName) {
    this.customerName = customerName;
  }

  public EscPosDocket customerOrder(Long customerOrder) {
    this.customerOrder = customerOrder;
    return this;
  }

  /**
   * Get customerOrder
   * @return customerOrder
  **/
  @ApiModelProperty(value = "")


  public Long getCustomerOrder() {
    return customerOrder;
  }

  public void setCustomerOrder(Long customerOrder) {
    this.customerOrder = customerOrder;
  }

  public EscPosDocket customerOrderDetails(String customerOrderDetails) {
    this.customerOrderDetails = customerOrderDetails;
    return this;
  }

  /**
   * Get customerOrderDetails
   * @return customerOrderDetails
  **/
  @ApiModelProperty(value = "")


  public String getCustomerOrderDetails() {
    return customerOrderDetails;
  }

  public void setCustomerOrderDetails(String customerOrderDetails) {
    this.customerOrderDetails = customerOrderDetails;
  }

  public EscPosDocket deliveryCharge(Double deliveryCharge) {
    this.deliveryCharge = deliveryCharge;
    return this;
  }

  /**
   * Get deliveryCharge
   * @return deliveryCharge
  **/
  @ApiModelProperty(value = "")


  public Double getDeliveryCharge() {
    return deliveryCharge;
  }

  public void setDeliveryCharge(Double deliveryCharge) {
    this.deliveryCharge = deliveryCharge;
  }

  public EscPosDocket discountAndTotal(String discountAndTotal) {
    this.discountAndTotal = discountAndTotal;
    return this;
  }

  /**
   * Get discountAndTotal
   * @return discountAndTotal
  **/
  @ApiModelProperty(value = "")


  public String getDiscountAndTotal() {
    return discountAndTotal;
  }

  public void setDiscountAndTotal(String discountAndTotal) {
    this.discountAndTotal = discountAndTotal;
  }

  public EscPosDocket email(String email) {
    this.email = email;
    return this;
  }

  /**
   * Get email
   * @return email
  **/
  @ApiModelProperty(value = "")


  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public EscPosDocket expectedDelivery(OffsetDateTime expectedDelivery) {
    this.expectedDelivery = expectedDelivery;
    return this;
  }

  /**
   * Get expectedDelivery
   * @return expectedDelivery
  **/
  @ApiModelProperty(value = "")

  @Valid

  public OffsetDateTime getExpectedDelivery() {
    return expectedDelivery;
  }

  public void setExpectedDelivery(OffsetDateTime expectedDelivery) {
    this.expectedDelivery = expectedDelivery;
  }

  public EscPosDocket footer(String footer) {
    this.footer = footer;
    return this;
  }

  /**
   * Get footer
   * @return footer
  **/
  @ApiModelProperty(value = "")


  public String getFooter() {
    return footer;
  }

  public void setFooter(String footer) {
    this.footer = footer;
  }

  public EscPosDocket headers(String headers) {
    this.headers = headers;
    return this;
  }

  /**
   * Get headers
   * @return headers
  **/
  @ApiModelProperty(value = "")


  public String getHeaders() {
    return headers;
  }

  public void setHeaders(String headers) {
    this.headers = headers;
  }

  public EscPosDocket houseNoOrBuildingName(String houseNoOrBuildingName) {
    this.houseNoOrBuildingName = houseNoOrBuildingName;
    return this;
  }

  /**
   * Get houseNoOrBuildingName
   * @return houseNoOrBuildingName
  **/
  @ApiModelProperty(value = "")


  public String getHouseNoOrBuildingName() {
    return houseNoOrBuildingName;
  }

  public void setHouseNoOrBuildingName(String houseNoOrBuildingName) {
    this.houseNoOrBuildingName = houseNoOrBuildingName;
  }

  public EscPosDocket id(Long id) {
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

  public EscPosDocket landmark(String landmark) {
    this.landmark = landmark;
    return this;
  }

  /**
   * Get landmark
   * @return landmark
  **/
  @ApiModelProperty(value = "")


  public String getLandmark() {
    return landmark;
  }

  public void setLandmark(String landmark) {
    this.landmark = landmark;
  }

  public EscPosDocket loyaltyPoint(Long loyaltyPoint) {
    this.loyaltyPoint = loyaltyPoint;
    return this;
  }

  /**
   * Get loyaltyPoint
   * @return loyaltyPoint
  **/
  @ApiModelProperty(value = "")


  public Long getLoyaltyPoint() {
    return loyaltyPoint;
  }

  public void setLoyaltyPoint(Long loyaltyPoint) {
    this.loyaltyPoint = loyaltyPoint;
  }

  public EscPosDocket methodOfOrder(String methodOfOrder) {
    this.methodOfOrder = methodOfOrder;
    return this;
  }

  /**
   * Get methodOfOrder
   * @return methodOfOrder
  **/
  @ApiModelProperty(value = "")


  public String getMethodOfOrder() {
    return methodOfOrder;
  }

  public void setMethodOfOrder(String methodOfOrder) {
    this.methodOfOrder = methodOfOrder;
  }

  public EscPosDocket notes(String notes) {
    this.notes = notes;
    return this;
  }

  /**
   * Get notes
   * @return notes
  **/
  @ApiModelProperty(value = "")


  public String getNotes() {
    return notes;
  }

  public void setNotes(String notes) {
    this.notes = notes;
  }

  public EscPosDocket offerLines(List<OfferLine> offerLines) {
    this.offerLines = offerLines;
    return this;
  }

  public EscPosDocket addOfferLinesItem(OfferLine offerLinesItem) {
    if (this.offerLines == null) {
      this.offerLines = new ArrayList<OfferLine>();
    }
    this.offerLines.add(offerLinesItem);
    return this;
  }

  /**
   * Get offerLines
   * @return offerLines
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<OfferLine> getOfferLines() {
    return offerLines;
  }

  public void setOfferLines(List<OfferLine> offerLines) {
    this.offerLines = offerLines;
  }

  public EscPosDocket orderAcceptedAt(OffsetDateTime orderAcceptedAt) {
    this.orderAcceptedAt = orderAcceptedAt;
    return this;
  }

  /**
   * Get orderAcceptedAt
   * @return orderAcceptedAt
  **/
  @ApiModelProperty(value = "")

  @Valid

  public OffsetDateTime getOrderAcceptedAt() {
    return orderAcceptedAt;
  }

  public void setOrderAcceptedAt(OffsetDateTime orderAcceptedAt) {
    this.orderAcceptedAt = orderAcceptedAt;
  }

  public EscPosDocket orderDiscountAmount(Double orderDiscountAmount) {
    this.orderDiscountAmount = orderDiscountAmount;
    return this;
  }

  /**
   * Get orderDiscountAmount
   * @return orderDiscountAmount
  **/
  @ApiModelProperty(value = "")


  public Double getOrderDiscountAmount() {
    return orderDiscountAmount;
  }

  public void setOrderDiscountAmount(Double orderDiscountAmount) {
    this.orderDiscountAmount = orderDiscountAmount;
  }

  public EscPosDocket orderFromCustomer(Long orderFromCustomer) {
    this.orderFromCustomer = orderFromCustomer;
    return this;
  }

  /**
   * Get orderFromCustomer
   * @return orderFromCustomer
  **/
  @ApiModelProperty(value = "")


  public Long getOrderFromCustomer() {
    return orderFromCustomer;
  }

  public void setOrderFromCustomer(Long orderFromCustomer) {
    this.orderFromCustomer = orderFromCustomer;
  }

  public EscPosDocket orderLines(List<OrderLine> orderLines) {
    this.orderLines = orderLines;
    return this;
  }

  public EscPosDocket addOrderLinesItem(OrderLine orderLinesItem) {
    if (this.orderLines == null) {
      this.orderLines = new ArrayList<OrderLine>();
    }
    this.orderLines.add(orderLinesItem);
    return this;
  }

  /**
   * Get orderLines
   * @return orderLines
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<OrderLine> getOrderLines() {
    return orderLines;
  }

  public void setOrderLines(List<OrderLine> orderLines) {
    this.orderLines = orderLines;
  }

  public EscPosDocket orderNumber(String orderNumber) {
    this.orderNumber = orderNumber;
    return this;
  }

  /**
   * Get orderNumber
   * @return orderNumber
  **/
  @ApiModelProperty(value = "")


  public String getOrderNumber() {
    return orderNumber;
  }

  public void setOrderNumber(String orderNumber) {
    this.orderNumber = orderNumber;
  }

  public EscPosDocket orderPlaceAt(OffsetDateTime orderPlaceAt) {
    this.orderPlaceAt = orderPlaceAt;
    return this;
  }

  /**
   * Get orderPlaceAt
   * @return orderPlaceAt
  **/
  @ApiModelProperty(value = "")

  @Valid

  public OffsetDateTime getOrderPlaceAt() {
    return orderPlaceAt;
  }

  public void setOrderPlaceAt(OffsetDateTime orderPlaceAt) {
    this.orderPlaceAt = orderPlaceAt;
  }

  public EscPosDocket orderStatus(String orderStatus) {
    this.orderStatus = orderStatus;
    return this;
  }

  /**
   * Get orderStatus
   * @return orderStatus
  **/
  @ApiModelProperty(value = "")


  public String getOrderStatus() {
    return orderStatus;
  }

  public void setOrderStatus(String orderStatus) {
    this.orderStatus = orderStatus;
  }

  public EscPosDocket paymentRef(String paymentRef) {
    this.paymentRef = paymentRef;
    return this;
  }

  /**
   * Get paymentRef
   * @return paymentRef
  **/
  @ApiModelProperty(value = "")


  public String getPaymentRef() {
    return paymentRef;
  }

  public void setPaymentRef(String paymentRef) {
    this.paymentRef = paymentRef;
  }

  public EscPosDocket paymentStatus(String paymentStatus) {
    this.paymentStatus = paymentStatus;
    return this;
  }

  /**
   * Get paymentStatus
   * @return paymentStatus
  **/
  @ApiModelProperty(value = "")


  public String getPaymentStatus() {
    return paymentStatus;
  }

  public void setPaymentStatus(String paymentStatus) {
    this.paymentStatus = paymentStatus;
  }

  public EscPosDocket paymentStatusForDocket(String paymentStatusForDocket) {
    this.paymentStatusForDocket = paymentStatusForDocket;
    return this;
  }

  /**
   * Get paymentStatusForDocket
   * @return paymentStatusForDocket
  **/
  @ApiModelProperty(value = "")


  public String getPaymentStatusForDocket() {
    return paymentStatusForDocket;
  }

  public void setPaymentStatusForDocket(String paymentStatusForDocket) {
    this.paymentStatusForDocket = paymentStatusForDocket;
  }

  public EscPosDocket phone(Long phone) {
    this.phone = phone;
    return this;
  }

  /**
   * Get phone
   * @return phone
  **/
  @ApiModelProperty(value = "")


  public Long getPhone() {
    return phone;
  }

  public void setPhone(Long phone) {
    this.phone = phone;
  }

  public EscPosDocket pincode(String pincode) {
    this.pincode = pincode;
    return this;
  }

  /**
   * Get pincode
   * @return pincode
  **/
  @ApiModelProperty(value = "")


  public String getPincode() {
    return pincode;
  }

  public void setPincode(String pincode) {
    this.pincode = pincode;
  }

  public EscPosDocket preOrderDate(OffsetDateTime preOrderDate) {
    this.preOrderDate = preOrderDate;
    return this;
  }

  /**
   * Get preOrderDate
   * @return preOrderDate
  **/
  @ApiModelProperty(value = "")

  @Valid

  public OffsetDateTime getPreOrderDate() {
    return preOrderDate;
  }

  public void setPreOrderDate(OffsetDateTime preOrderDate) {
    this.preOrderDate = preOrderDate;
  }

  public EscPosDocket products(String products) {
    this.products = products;
    return this;
  }

  /**
   * Get products
   * @return products
  **/
  @ApiModelProperty(value = "")


  public String getProducts() {
    return products;
  }

  public void setProducts(String products) {
    this.products = products;
  }

  public EscPosDocket refundedAmount(Double refundedAmount) {
    this.refundedAmount = refundedAmount;
    return this;
  }

  /**
   * Get refundedAmount
   * @return refundedAmount
  **/
  @ApiModelProperty(value = "")


  public Double getRefundedAmount() {
    return refundedAmount;
  }

  public void setRefundedAmount(Double refundedAmount) {
    this.refundedAmount = refundedAmount;
  }

  public EscPosDocket roadNameAreaOrStreet(String roadNameAreaOrStreet) {
    this.roadNameAreaOrStreet = roadNameAreaOrStreet;
    return this;
  }

  /**
   * Get roadNameAreaOrStreet
   * @return roadNameAreaOrStreet
  **/
  @ApiModelProperty(value = "")


  public String getRoadNameAreaOrStreet() {
    return roadNameAreaOrStreet;
  }

  public void setRoadNameAreaOrStreet(String roadNameAreaOrStreet) {
    this.roadNameAreaOrStreet = roadNameAreaOrStreet;
  }

  public EscPosDocket serviceCharge(Double serviceCharge) {
    this.serviceCharge = serviceCharge;
    return this;
  }

  /**
   * Get serviceCharge
   * @return serviceCharge
  **/
  @ApiModelProperty(value = "")


  public Double getServiceCharge() {
    return serviceCharge;
  }

  public void setServiceCharge(Double serviceCharge) {
    this.serviceCharge = serviceCharge;
  }

  public EscPosDocket state(String state) {
    this.state = state;
    return this;
  }

  /**
   * Get state
   * @return state
  **/
  @ApiModelProperty(value = "")


  public String getState() {
    return state;
  }

  public void setState(String state) {
    this.state = state;
  }

  public EscPosDocket storeIdpcode(String storeIdpcode) {
    this.storeIdpcode = storeIdpcode;
    return this;
  }

  /**
   * Get storeIdpcode
   * @return storeIdpcode
  **/
  @ApiModelProperty(value = "")


  public String getStoreIdpcode() {
    return storeIdpcode;
  }

  public void setStoreIdpcode(String storeIdpcode) {
    this.storeIdpcode = storeIdpcode;
  }

  public EscPosDocket storeName(String storeName) {
    this.storeName = storeName;
    return this;
  }

  /**
   * Get storeName
   * @return storeName
  **/
  @ApiModelProperty(value = "")


  public String getStoreName() {
    return storeName;
  }

  public void setStoreName(String storeName) {
    this.storeName = storeName;
  }

  public EscPosDocket storePhone(Long storePhone) {
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

  public EscPosDocket storelocationName(String storelocationName) {
    this.storelocationName = storelocationName;
    return this;
  }

  /**
   * Get storelocationName
   * @return storelocationName
  **/
  @ApiModelProperty(value = "")


  public String getStorelocationName() {
    return storelocationName;
  }

  public void setStorelocationName(String storelocationName) {
    this.storelocationName = storelocationName;
  }

  public EscPosDocket subTotal(Double subTotal) {
    this.subTotal = subTotal;
    return this;
  }

  /**
   * Get subTotal
   * @return subTotal
  **/
  @ApiModelProperty(value = "")


  public Double getSubTotal() {
    return subTotal;
  }

  public void setSubTotal(Double subTotal) {
    this.subTotal = subTotal;
  }

  public EscPosDocket totalDue(Double totalDue) {
    this.totalDue = totalDue;
    return this;
  }

  /**
   * Get totalDue
   * @return totalDue
  **/
  @ApiModelProperty(value = "")


  public Double getTotalDue() {
    return totalDue;
  }

  public void setTotalDue(Double totalDue) {
    this.totalDue = totalDue;
  }

  public EscPosDocket zoneId(String zoneId) {
    this.zoneId = zoneId;
    return this;
  }

  /**
   * Get zoneId
   * @return zoneId
  **/
  @ApiModelProperty(value = "")


  public String getZoneId() {
    return zoneId;
  }

  public void setZoneId(String zoneId) {
    this.zoneId = zoneId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EscPosDocket escPosDocket = (EscPosDocket) o;
    return Objects.equals(this.addressType, escPosDocket.addressType) &&
        Objects.equals(this.allergyNote, escPosDocket.allergyNote) &&
        Objects.equals(this.alternatePhone, escPosDocket.alternatePhone) &&
        Objects.equals(this.attentionForFirstOrder, escPosDocket.attentionForFirstOrder) &&
        Objects.equals(this.cancellationRef, escPosDocket.cancellationRef) &&
        Objects.equals(this.city, escPosDocket.city) &&
        Objects.equals(this.content, escPosDocket.content) &&
        Objects.equals(this.customerDetails, escPosDocket.customerDetails) &&
        Objects.equals(this.customerId, escPosDocket.customerId) &&
        Objects.equals(this.customerName, escPosDocket.customerName) &&
        Objects.equals(this.customerOrder, escPosDocket.customerOrder) &&
        Objects.equals(this.customerOrderDetails, escPosDocket.customerOrderDetails) &&
        Objects.equals(this.deliveryCharge, escPosDocket.deliveryCharge) &&
        Objects.equals(this.discountAndTotal, escPosDocket.discountAndTotal) &&
        Objects.equals(this.email, escPosDocket.email) &&
        Objects.equals(this.expectedDelivery, escPosDocket.expectedDelivery) &&
        Objects.equals(this.footer, escPosDocket.footer) &&
        Objects.equals(this.headers, escPosDocket.headers) &&
        Objects.equals(this.houseNoOrBuildingName, escPosDocket.houseNoOrBuildingName) &&
        Objects.equals(this.id, escPosDocket.id) &&
        Objects.equals(this.landmark, escPosDocket.landmark) &&
        Objects.equals(this.loyaltyPoint, escPosDocket.loyaltyPoint) &&
        Objects.equals(this.methodOfOrder, escPosDocket.methodOfOrder) &&
        Objects.equals(this.notes, escPosDocket.notes) &&
        Objects.equals(this.offerLines, escPosDocket.offerLines) &&
        Objects.equals(this.orderAcceptedAt, escPosDocket.orderAcceptedAt) &&
        Objects.equals(this.orderDiscountAmount, escPosDocket.orderDiscountAmount) &&
        Objects.equals(this.orderFromCustomer, escPosDocket.orderFromCustomer) &&
        Objects.equals(this.orderLines, escPosDocket.orderLines) &&
        Objects.equals(this.orderNumber, escPosDocket.orderNumber) &&
        Objects.equals(this.orderPlaceAt, escPosDocket.orderPlaceAt) &&
        Objects.equals(this.orderStatus, escPosDocket.orderStatus) &&
        Objects.equals(this.paymentRef, escPosDocket.paymentRef) &&
        Objects.equals(this.paymentStatus, escPosDocket.paymentStatus) &&
        Objects.equals(this.paymentStatusForDocket, escPosDocket.paymentStatusForDocket) &&
        Objects.equals(this.phone, escPosDocket.phone) &&
        Objects.equals(this.pincode, escPosDocket.pincode) &&
        Objects.equals(this.preOrderDate, escPosDocket.preOrderDate) &&
        Objects.equals(this.products, escPosDocket.products) &&
        Objects.equals(this.refundedAmount, escPosDocket.refundedAmount) &&
        Objects.equals(this.roadNameAreaOrStreet, escPosDocket.roadNameAreaOrStreet) &&
        Objects.equals(this.serviceCharge, escPosDocket.serviceCharge) &&
        Objects.equals(this.state, escPosDocket.state) &&
        Objects.equals(this.storeIdpcode, escPosDocket.storeIdpcode) &&
        Objects.equals(this.storeName, escPosDocket.storeName) &&
        Objects.equals(this.storePhone, escPosDocket.storePhone) &&
        Objects.equals(this.storelocationName, escPosDocket.storelocationName) &&
        Objects.equals(this.subTotal, escPosDocket.subTotal) &&
        Objects.equals(this.totalDue, escPosDocket.totalDue) &&
        Objects.equals(this.zoneId, escPosDocket.zoneId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(addressType, allergyNote, alternatePhone, attentionForFirstOrder, cancellationRef, city, content, customerDetails, customerId, customerName, customerOrder, customerOrderDetails, deliveryCharge, discountAndTotal, email, expectedDelivery, footer, headers, houseNoOrBuildingName, id, landmark, loyaltyPoint, methodOfOrder, notes, offerLines, orderAcceptedAt, orderDiscountAmount, orderFromCustomer, orderLines, orderNumber, orderPlaceAt, orderStatus, paymentRef, paymentStatus, paymentStatusForDocket, phone, pincode, preOrderDate, products, refundedAmount, roadNameAreaOrStreet, serviceCharge, state, storeIdpcode, storeName, storePhone, storelocationName, subTotal, totalDue, zoneId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EscPosDocket {\n");
    
    sb.append("    addressType: ").append(toIndentedString(addressType)).append("\n");
    sb.append("    allergyNote: ").append(toIndentedString(allergyNote)).append("\n");
    sb.append("    alternatePhone: ").append(toIndentedString(alternatePhone)).append("\n");
    sb.append("    attentionForFirstOrder: ").append(toIndentedString(attentionForFirstOrder)).append("\n");
    sb.append("    cancellationRef: ").append(toIndentedString(cancellationRef)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
    sb.append("    customerDetails: ").append(toIndentedString(customerDetails)).append("\n");
    sb.append("    customerId: ").append(toIndentedString(customerId)).append("\n");
    sb.append("    customerName: ").append(toIndentedString(customerName)).append("\n");
    sb.append("    customerOrder: ").append(toIndentedString(customerOrder)).append("\n");
    sb.append("    customerOrderDetails: ").append(toIndentedString(customerOrderDetails)).append("\n");
    sb.append("    deliveryCharge: ").append(toIndentedString(deliveryCharge)).append("\n");
    sb.append("    discountAndTotal: ").append(toIndentedString(discountAndTotal)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    expectedDelivery: ").append(toIndentedString(expectedDelivery)).append("\n");
    sb.append("    footer: ").append(toIndentedString(footer)).append("\n");
    sb.append("    headers: ").append(toIndentedString(headers)).append("\n");
    sb.append("    houseNoOrBuildingName: ").append(toIndentedString(houseNoOrBuildingName)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    landmark: ").append(toIndentedString(landmark)).append("\n");
    sb.append("    loyaltyPoint: ").append(toIndentedString(loyaltyPoint)).append("\n");
    sb.append("    methodOfOrder: ").append(toIndentedString(methodOfOrder)).append("\n");
    sb.append("    notes: ").append(toIndentedString(notes)).append("\n");
    sb.append("    offerLines: ").append(toIndentedString(offerLines)).append("\n");
    sb.append("    orderAcceptedAt: ").append(toIndentedString(orderAcceptedAt)).append("\n");
    sb.append("    orderDiscountAmount: ").append(toIndentedString(orderDiscountAmount)).append("\n");
    sb.append("    orderFromCustomer: ").append(toIndentedString(orderFromCustomer)).append("\n");
    sb.append("    orderLines: ").append(toIndentedString(orderLines)).append("\n");
    sb.append("    orderNumber: ").append(toIndentedString(orderNumber)).append("\n");
    sb.append("    orderPlaceAt: ").append(toIndentedString(orderPlaceAt)).append("\n");
    sb.append("    orderStatus: ").append(toIndentedString(orderStatus)).append("\n");
    sb.append("    paymentRef: ").append(toIndentedString(paymentRef)).append("\n");
    sb.append("    paymentStatus: ").append(toIndentedString(paymentStatus)).append("\n");
    sb.append("    paymentStatusForDocket: ").append(toIndentedString(paymentStatusForDocket)).append("\n");
    sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
    sb.append("    pincode: ").append(toIndentedString(pincode)).append("\n");
    sb.append("    preOrderDate: ").append(toIndentedString(preOrderDate)).append("\n");
    sb.append("    products: ").append(toIndentedString(products)).append("\n");
    sb.append("    refundedAmount: ").append(toIndentedString(refundedAmount)).append("\n");
    sb.append("    roadNameAreaOrStreet: ").append(toIndentedString(roadNameAreaOrStreet)).append("\n");
    sb.append("    serviceCharge: ").append(toIndentedString(serviceCharge)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    storeIdpcode: ").append(toIndentedString(storeIdpcode)).append("\n");
    sb.append("    storeName: ").append(toIndentedString(storeName)).append("\n");
    sb.append("    storePhone: ").append(toIndentedString(storePhone)).append("\n");
    sb.append("    storelocationName: ").append(toIndentedString(storelocationName)).append("\n");
    sb.append("    subTotal: ").append(toIndentedString(subTotal)).append("\n");
    sb.append("    totalDue: ").append(toIndentedString(totalDue)).append("\n");
    sb.append("    zoneId: ").append(toIndentedString(zoneId)).append("\n");
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

