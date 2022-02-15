package com.mycompany.myapp.service.mapper;

import com.mycompany.myapp.domain.InventoryUsed;
import com.mycompany.myapp.service.dto.InventoryUsedDTO;
import org.mapstruct.*;

/**
 * Mapper for the entity {@link InventoryUsed} and its DTO {@link InventoryUsedDTO}.
 */
@Mapper(componentModel = "spring", uses = { InventoryMapper.class })
public interface InventoryUsedMapper extends EntityMapper<InventoryUsedDTO, InventoryUsed> {
    @Mapping(target = "inventory", source = "inventory", qualifiedByName = "id")
    InventoryUsedDTO toDto(InventoryUsed s);
}
