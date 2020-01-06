package com.diviso.graeshoppe.client.administration.model;

public class CancelledAuxilaryOrderLine{
	  private Long id;

	    
	    private Long orderLineId;

	    private Double pricePerUnit;

	 
	    private Double ammount;

	   
	    private Long quantity;

	 
	    private String itemName;

	
	    private Long productId;

	 
	    private CancellationRequest cancellationRequest;

	    // jhipster-needle-entity-add-field - JHipster will add fields here, do not remove
	    public Long getId() {
	        return id;
	    }

	    public void setId(Long id) {
	        this.id = id;
	    }

	    public Long getOrderLineId() {
	        return orderLineId;
	    }

	    public CancelledAuxilaryOrderLine orderLineId(Long orderLineId) {
	        this.orderLineId = orderLineId;
	        return this;
	    }

	    public void setOrderLineId(Long orderLineId) {
	        this.orderLineId = orderLineId;
	    }

	    public Double getPricePerUnit() {
	        return pricePerUnit;
	    }

	    public CancelledAuxilaryOrderLine pricePerUnit(Double pricePerUnit) {
	        this.pricePerUnit = pricePerUnit;
	        return this;
	    }

	    public void setPricePerUnit(Double pricePerUnit) {
	        this.pricePerUnit = pricePerUnit;
	    }

	    public Double getAmmount() {
	        return ammount;
	    }

	    public CancelledAuxilaryOrderLine ammount(Double ammount) {
	        this.ammount = ammount;
	        return this;
	    }

	    public void setAmmount(Double ammount) {
	        this.ammount = ammount;
	    }

	    public Long getQuantity() {
	        return quantity;
	    }

	    public CancelledAuxilaryOrderLine quantity(Long quantity) {
	        this.quantity = quantity;
	        return this;
	    }

	    public void setQuantity(Long quantity) {
	        this.quantity = quantity;
	    }

	    public String getItemName() {
	        return itemName;
	    }

	    public CancelledAuxilaryOrderLine itemName(String itemName) {
	        this.itemName = itemName;
	        return this;
	    }

	    public void setItemName(String itemName) {
	        this.itemName = itemName;
	    }

	    public Long getProductId() {
	        return productId;
	    }

	    public CancelledAuxilaryOrderLine productId(Long productId) {
	        this.productId = productId;
	        return this;
	    }

	    public void setProductId(Long productId) {
	        this.productId = productId;
	    }

	    public CancellationRequest getCancellationRequest() {
	        return cancellationRequest;
	    }

	    public CancelledAuxilaryOrderLine cancellationRequest(CancellationRequest cancellationRequest) {
	        this.cancellationRequest = cancellationRequest;
	        return this;
	    }

	    public void setCancellationRequest(CancellationRequest cancellationRequest) {
	        this.cancellationRequest = cancellationRequest;
	    }
	    // jhipster-needle-entity-add-getters-setters - JHipster will add getters and setters here, do not remove

	    @Override
	    public boolean equals(Object o) {
	        if (this == o) {
	            return true;
	        }
	        if (!(o instanceof CancelledAuxilaryOrderLine)) {
	            return false;
	        }
	        return id != null && id.equals(((CancelledAuxilaryOrderLine) o).id);
	    }

	    @Override
	    public int hashCode() {
	        return 31;
	    }

	    @Override
	    public String toString() {
	        return "CancelledAuxilaryOrderLine{" +
	            "id=" + getId() +
	            ", orderLineId=" + getOrderLineId() +
	            ", pricePerUnit=" + getPricePerUnit() +
	            ", ammount=" + getAmmount() +
	            ", quantity=" + getQuantity() +
	            ", itemName='" + getItemName() + "'" +
	            ", productId=" + getProductId() +
	            "}";
	    }
	}

