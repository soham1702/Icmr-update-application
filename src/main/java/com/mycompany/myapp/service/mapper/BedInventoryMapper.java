package com.mycompany.myapp.service.mapper;

import com.mycompany.myapp.domain.BedInventory;
import com.mycompany.myapp.service.dto.BedInventoryDTO;
import org.mapstruct.*;

/**
 * Mapper for the entity {@link BedInventory} and its DTO {@link BedInventoryDTO}.
 */
@Mapper(componentModel = "spring", uses = { BedTypeMapper.class, HospitalMapper.class })
public interface BedInventoryMapper extends EntityMapper<BedInventoryDTO, BedInventory> {
    @Mapping(target = "bedType", source = "bedType", qualifiedByName = "name")
    @Mapping(target = "hospital", source = "hospital", qualifiedByName = "name")
    BedInventoryDTO toDto(BedInventory s);
}
