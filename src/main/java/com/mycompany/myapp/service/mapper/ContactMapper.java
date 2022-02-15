package com.mycompany.myapp.service.mapper;

import com.mycompany.myapp.domain.Contact;
import com.mycompany.myapp.service.dto.ContactDTO;
import org.mapstruct.*;

/**
 * Mapper for the entity {@link Contact} and its DTO {@link ContactDTO}.
 */
@Mapper(componentModel = "spring", uses = { ContactTypeMapper.class, HospitalMapper.class, SupplierMapper.class })
public interface ContactMapper extends EntityMapper<ContactDTO, Contact> {
    @Mapping(target = "contactType", source = "contactType", qualifiedByName = "name")
    @Mapping(target = "hospital", source = "hospital", qualifiedByName = "name")
    @Mapping(target = "supplier", source = "supplier", qualifiedByName = "name")
    ContactDTO toDto(Contact s);
}
