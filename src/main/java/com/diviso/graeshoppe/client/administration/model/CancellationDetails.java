package com.diviso.graeshoppe.client.administration.model;

import java.util.HashSet;
import java.util.*;



import com.diviso.graeshoppe.client.administration.model.CancellationRequest;
import com.diviso.graeshoppe.client.administration.model.CancelledAuxilaryOrderLine;
import com.diviso.graeshoppe.client.administration.model.CancelledOrderLine;

public class CancellationDetails {
	
	
	private Long id;


	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	
    private List<CancelledOrderLine> cancelledOrderLines = new ArrayList<>();
	
	
    private List<CancelledAuxilaryOrderLine> cancelledAuxilaryOrderLines = new ArrayList<>();
	

   
	
	private CancellationRequest cancellationRequest;


	public List<CancelledOrderLine> getCancelledOrderLines() {
		return cancelledOrderLines;
	}

	public void setCancelledOrderLines(List<CancelledOrderLine> cancelledOrderLines) {
		this.cancelledOrderLines = cancelledOrderLines;
	}

	public List<CancelledAuxilaryOrderLine> getCancelledAuxilaryOrderLines() {
		return cancelledAuxilaryOrderLines;
	}

	public void setCancelledAuxilaryOrderLines(List<CancelledAuxilaryOrderLine> cancelledAuxilaryOrderLines) {
		this.cancelledAuxilaryOrderLines = cancelledAuxilaryOrderLines;
	}

	public CancellationRequest getCancellationRequest() {
		return cancellationRequest;
	}

	public void setCancellationRequest(CancellationRequest cancellationRequest) {
		this.cancellationRequest = cancellationRequest;
	}

	@Override
	public String toString() {
		return "CancellationDetails [id=" + id + ", cancelledOrderLines=" + cancelledOrderLines
				+ ", cancelledAuxilaryOrderLines=" + cancelledAuxilaryOrderLines + ", cancellationRequest="
				+ cancellationRequest + ", getId()=" + getId() + ", getCancelledOrderLines()="
				+ getCancelledOrderLines() + ", getCancelledAuxilaryOrderLines()=" + getCancelledAuxilaryOrderLines()
				+ ", getCancellationRequest()=" + getCancellationRequest() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	
	
	

	
	

}
