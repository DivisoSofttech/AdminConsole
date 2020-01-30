package com.diviso.graeshoppe.client.aggregator;

import java.util.HashSet;
import java.util.Set;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Term {
	
	 @JsonProperty("id")
	 private Long id;

	 @JsonProperty("title")
	 private String title;
	    
	 @JsonProperty("subTerms")
	 private Set<SubTerm> subTerms = new HashSet<>();

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Set<SubTerm> getSubTerms() {
		return subTerms;
	}

	public void setSubTerms(Set<SubTerm> subTerms) {
		this.subTerms = subTerms;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((subTerms == null) ? 0 : subTerms.hashCode());
		result = prime * result + ((title == null) ? 0 : title.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Term other = (Term) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (subTerms == null) {
			if (other.subTerms != null)
				return false;
		} else if (!subTerms.equals(other.subTerms))
			return false;
		if (title == null) {
			if (other.title != null)
				return false;
		} else if (!title.equals(other.title))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Term [id=" + id + ", title=" + title + ", subTerms=" + subTerms + "]";
	}
	 
	 	 
	 
}
	 
	 
