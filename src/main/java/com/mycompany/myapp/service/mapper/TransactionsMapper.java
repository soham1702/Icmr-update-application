package com.mycompany.myapp.service.mapper;

import com.mycompany.myapp.domain.Transactions;
import com.mycompany.myapp.service.dto.TransactionsDTO;
import org.mapstruct.*;

/**
 * Mapper for the entity {@link Transactions} and its DTO {@link TransactionsDTO}.
 */
@Mapper(componentModel = "spring", uses = { SupplierMapper.class, InventoryMapper.class })
public interface TransactionsMapper extends EntityMapper<TransactionsDTO, Transactions> {
    @Mapping(target = "supplier", source = "supplier", qualifiedByName = "name")
    @Mapping(target = "inventory", source = "inventory", qualifiedByName = "id")
    TransactionsDTO toDto(Transactions s);

    @Named("id")
    @BeanMapping(ignoreByDefault = true)
    @Mapping(target = "id", source = "id")
    TransactionsDTO toDtoId(Transactions transactions);
}
