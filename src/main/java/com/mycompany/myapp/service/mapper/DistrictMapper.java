package com.mycompany.myapp.service.mapper;

import com.mycompany.myapp.domain.District;
import com.mycompany.myapp.service.dto.DistrictDTO;
import org.mapstruct.*;

/**
 * Mapper for the entity {@link District} and its DTO {@link DistrictDTO}.
 */
@Mapper(componentModel = "spring", uses = { StateMapper.class, DivisionMapper.class })
public interface DistrictMapper extends EntityMapper<DistrictDTO, District> {
    @Mapping(target = "state", source = "state", qualifiedByName = "name")
    @Mapping(target = "division", source = "division", qualifiedByName = "name")
    DistrictDTO toDto(District s);

    @Named("name")
    @BeanMapping(ignoreByDefault = true)
    @Mapping(target = "id", source = "id")
    @Mapping(target = "name", source = "name")
    DistrictDTO toDtoName(District district);
}
