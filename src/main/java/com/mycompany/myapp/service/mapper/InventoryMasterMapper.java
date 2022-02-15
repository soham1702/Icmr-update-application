package com.mycompany.myapp.service.mapper;

import com.mycompany.myapp.domain.InventoryMaster;
import com.mycompany.myapp.service.dto.InventoryMasterDTO;
import org.mapstruct.*;

/**
 * Mapper for the entity {@link InventoryMaster} and its DTO {@link InventoryMasterDTO}.
 */
@Mapper(componentModel = "spring", uses = { InventoryTypeMapper.class })
public interface InventoryMasterMapper extends EntityMapper<InventoryMasterDTO, InventoryMaster> {
    @Mapping(target = "inventoryType", source = "inventoryType", qualifiedByName = "name")
    InventoryMasterDTO toDto(InventoryMaster s);

    @Named("name")
    @BeanMapping(ignoreByDefault = true)
    @Mapping(target = "id", source = "id")
    @Mapping(target = "name", source = "name")
    InventoryMasterDTO toDtoName(InventoryMaster inventoryMaster);
}
