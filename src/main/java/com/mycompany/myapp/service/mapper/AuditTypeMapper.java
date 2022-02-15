package com.mycompany.myapp.service.mapper;

import com.mycompany.myapp.domain.AuditType;
import com.mycompany.myapp.service.dto.AuditTypeDTO;
import org.mapstruct.*;

/**
 * Mapper for the entity {@link AuditType} and its DTO {@link AuditTypeDTO}.
 */
@Mapper(componentModel = "spring", uses = {})
public interface AuditTypeMapper extends EntityMapper<AuditTypeDTO, AuditType> {
    @Named("name")
    @BeanMapping(ignoreByDefault = true)
    @Mapping(target = "id", source = "id")
    @Mapping(target = "name", source = "name")
    AuditTypeDTO toDtoName(AuditType auditType);
}
