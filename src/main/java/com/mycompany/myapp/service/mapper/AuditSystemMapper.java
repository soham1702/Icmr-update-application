package com.mycompany.myapp.service.mapper;

import com.mycompany.myapp.domain.AuditSystem;
import com.mycompany.myapp.service.dto.AuditSystemDTO;
import org.mapstruct.*;

/**
 * Mapper for the entity {@link AuditSystem} and its DTO {@link AuditSystemDTO}.
 */
@Mapper(componentModel = "spring", uses = { AuditTypeMapper.class, HospitalMapper.class, SupplierMapper.class })
public interface AuditSystemMapper extends EntityMapper<AuditSystemDTO, AuditSystem> {
    @Mapping(target = "auditType", source = "auditType", qualifiedByName = "name")
    @Mapping(target = "hospital", source = "hospital", qualifiedByName = "name")
    @Mapping(target = "supplier", source = "supplier", qualifiedByName = "name")
    AuditSystemDTO toDto(AuditSystem s);
}
