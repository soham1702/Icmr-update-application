package com.mycompany.myapp.service.mapper;

import com.mycompany.myapp.domain.InventoryType;
import com.mycompany.myapp.service.dto.InventoryTypeDTO;
import org.mapstruct.*;

/**
 * Mapper for the entity {@link InventoryType} and its DTO {@link InventoryTypeDTO}.
 */
@Mapper(componentModel = "spring", uses = {})
public interface InventoryTypeMapper extends EntityMapper<InventoryTypeDTO, InventoryType> {
    @Named("name")
    @BeanMapping(ignoreByDefault = true)
    @Mapping(target = "id", source = "id")
    @Mapping(target = "name", source = "name")
    InventoryTypeDTO toDtoName(InventoryType inventoryType);
}
