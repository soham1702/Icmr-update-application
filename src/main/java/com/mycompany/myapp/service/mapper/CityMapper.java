package com.mycompany.myapp.service.mapper;

import com.mycompany.myapp.domain.City;
import com.mycompany.myapp.service.dto.CityDTO;
import org.mapstruct.*;

/**
 * Mapper for the entity {@link City} and its DTO {@link CityDTO}.
 */
@Mapper(componentModel = "spring", uses = { TalukaMapper.class })
public interface CityMapper extends EntityMapper<CityDTO, City> {
    @Mapping(target = "taluka", source = "taluka", qualifiedByName = "name")
    CityDTO toDto(City s);

    @Named("name")
    @BeanMapping(ignoreByDefault = true)
    @Mapping(target = "id", source = "id")
    @Mapping(target = "name", source = "name")
    CityDTO toDtoName(City city);
}
