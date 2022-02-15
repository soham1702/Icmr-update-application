package com.mycompany.myapp.service.mapper;

import com.mycompany.myapp.domain.Trip;
import com.mycompany.myapp.service.dto.TripDTO;
import org.mapstruct.*;

/**
 * Mapper for the entity {@link Trip} and its DTO {@link TripDTO}.
 */
@Mapper(componentModel = "spring", uses = { SupplierMapper.class })
public interface TripMapper extends EntityMapper<TripDTO, Trip> {
    @Mapping(target = "supplier", source = "supplier", qualifiedByName = "name")
    TripDTO toDto(Trip s);

    @Named("id")
    @BeanMapping(ignoreByDefault = true)
    @Mapping(target = "id", source = "id")
    TripDTO toDtoId(Trip trip);
}
