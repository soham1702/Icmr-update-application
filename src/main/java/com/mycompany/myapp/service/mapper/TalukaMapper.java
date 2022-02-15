package com.mycompany.myapp.service.mapper;

import com.mycompany.myapp.domain.Taluka;
import com.mycompany.myapp.service.dto.TalukaDTO;
import org.mapstruct.*;

/**
 * Mapper for the entity {@link Taluka} and its DTO {@link TalukaDTO}.
 */
@Mapper(componentModel = "spring", uses = { DistrictMapper.class })
public interface TalukaMapper extends EntityMapper<TalukaDTO, Taluka> {
    @Mapping(target = "district", source = "district", qualifiedByName = "name")
    TalukaDTO toDto(Taluka s);

    @Named("name")
    @BeanMapping(ignoreByDefault = true)
    @Mapping(target = "id", source = "id")
    @Mapping(target = "name", source = "name")
    TalukaDTO toDtoName(Taluka taluka);
}
