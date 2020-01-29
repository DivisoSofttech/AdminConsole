package com.diviso.graeshoppe.client.aggregator;

import java.util.HashSet;
import java.util.Set;

public class Term {
	
	  private Long id;

	    private String title;
	    private Set<SubTerm> subTerms = new HashSet<>();

	    // jhipster-needle-entity-add-field - JHipster will add fields here, do not remove
	    public Long getId() {
	        return id;
	    }

	    public void setId(Long id) {
	        this.id = id;
	    }

	    public String getTitle() {
	        return title;
	    }

	    public Term title(String title) {
	        this.title = title;
	        return this;
	    }

	    public void setTitle(String title) {
	        this.title = title;
	    }

	    public Set<SubTerm> getSubTerms() {
	        return subTerms;
	    }

	    public Term subTerms(Set<SubTerm> subTerms) {
	        this.subTerms = subTerms;
	        return this;
	    }

	    public Term addSubTerm(SubTerm subTerm) {
	        this.subTerms.add(subTerm);
	        subTerm.setTerm(this);
	        return this;
	    }

	    public Term removeSubTerm(SubTerm subTerm) {
	        this.subTerms.remove(subTerm);
	        subTerm.setTerm(null);
	        return this;
	    }

	    public void setSubTerms(Set<SubTerm> subTerms) {
	        this.subTerms = subTerms;
	    }
	    // jhipster-needle-entity-add-getters-setters - JHipster will add getters and setters here, do not remove

	    @Override
	    public boolean equals(Object o) {
	        if (this == o) {
	            return true;
	        }
	        if (!(o instanceof Term)) {
	            return false;
	        }
	        return id != null && id.equals(((Term) o).id);
	    }

	    @Override
	    public int hashCode() {
	        return 31;
	    }

	    @Override
	    public String toString() {
	        return "Term{" +
	            "id=" + getId() +
	            ", title='" + getTitle() + "'" +
	            "}";
	    }
	}
	 
	  