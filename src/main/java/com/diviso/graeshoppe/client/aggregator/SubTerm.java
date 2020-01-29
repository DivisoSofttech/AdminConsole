package com.diviso.graeshoppe.client.aggregator;

public class SubTerm {

    private Long id;

    private String termDescription;

    private Term term;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTermDescription() {
		return termDescription;
	}

	public void setTermDescription(String termDescription) {
		this.termDescription = termDescription;
	}

	public Term getTerm() {
		return term;
	}

	public void setTerm(Term term) {
		this.term = term;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((term == null) ? 0 : term.hashCode());
		result = prime * result + ((termDescription == null) ? 0 : termDescription.hashCode());
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
		SubTerm other = (SubTerm) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (term == null) {
			if (other.term != null)
				return false;
		} else if (!term.equals(other.term))
			return false;
		if (termDescription == null) {
			if (other.termDescription != null)
				return false;
		} else if (!termDescription.equals(other.termDescription))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "SubTerm [id=" + id + ", termDescription=" + termDescription + ", term=" + term + "]";
	}
	
	
}
