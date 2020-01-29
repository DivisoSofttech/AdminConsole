package com.diviso.graeshoppe.service.mapper;

import org.mapstruct.Mapper;

import com.diviso.graeshoppe.client.administration.model.About;
import com.diviso.graeshoppe.client.administration.model.AboutDTO;

/**
 * Mapper for the entity {@link About} and its DTO {@link AboutDTO}.
 */
@Mapper(componentModel = "spring", uses = {})
public interface AboutMapper extends EntityMapper<AboutDTO, About> {



    default About fromId(Long id) {
        if (id == null) {
            return null;
        }
        About about = new About();
        about.setId(id);
        return about;
    }
}
