package com.mycompany.myapp.service.mapper;

import com.mycompany.myapp.domain.Inventory;
import com.mycompany.myapp.service.dto.InventoryDTO;
import org.mapstruct.*;

/**
 * Mapper for the entity {@link Inventory} and its DTO {@link InventoryDTO}.
 */
@Mapper(componentModel = "spring", uses = { InventoryMasterMapper.class, SupplierMapper.class, HospitalMapper.class })
public interface InventoryMapper extends EntityMapper<InventoryDTO, Inventory> {
    @Mapping(target = "inventoryMaster", source = "inventoryMaster", qualifiedByName = "name")
    @Mapping(target = "supplier", source = "supplier", qualifiedByName = "name")
    @Mapping(target = "hospital", source = "hospital", qualifiedByName = "name")
    InventoryDTO toDto(Inventory s);

    @Named("id")
    @BeanMapping(ignoreByDefault = true)
    @Mapping(target = "id", source = "id")
    InventoryDTO toDtoId(Inventory inventory);
}
