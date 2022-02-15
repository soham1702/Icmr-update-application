package com.mycompany.myapp.service.mapper;

import com.mycompany.myapp.domain.Division;
import com.mycompany.myapp.service.dto.DivisionDTO;
import org.mapstruct.*;

/**
 * Mapper for the entity {@link Division} and its DTO {@link DivisionDTO}.
 */
@Mapper(componentModel = "spring", uses = {})
public interface DivisionMapper extends EntityMapper<DivisionDTO, Division> {
    @Named("name")
    @BeanMapping(ignoreByDefault = true)
    @Mapping(target = "id", source = "id")
    @Mapping(target = "name", source = "name")
    DivisionDTO toDtoName(Division division);
}
