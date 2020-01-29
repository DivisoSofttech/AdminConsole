package com.diviso.graeshoppe.service.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;


import com.diviso.graeshoppe.client.administration.model.TermDTO;
import com.diviso.graeshoppe.client.aggregator.Term;

/**
 * Mapper for the entity {@link Term} and its DTO {@link TermDTO}.
 */
@Mapper(componentModel = "spring", uses = {})
public interface TermMapper extends EntityMapper<TermDTO, Term> {


    @Mapping(target = "subTerms", ignore = true)
    @Mapping(target = "removeSubTerm", ignore = true)
    Term toEntity(TermDTO termDTO);

    default Term fromId(Long id) {
        if (id == null) {
            return null;
        }
        Term term = new Term();
        term.setId(id);
        return term;
    }
}
