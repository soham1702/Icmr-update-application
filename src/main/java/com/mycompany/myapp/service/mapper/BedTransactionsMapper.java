package com.mycompany.myapp.service.mapper;

import com.mycompany.myapp.domain.BedTransactions;
import com.mycompany.myapp.service.dto.BedTransactionsDTO;
import org.mapstruct.*;

/**
 * Mapper for the entity {@link BedTransactions} and its DTO {@link BedTransactionsDTO}.
 */
@Mapper(componentModel = "spring", uses = { BedTypeMapper.class, HospitalMapper.class })
public interface BedTransactionsMapper extends EntityMapper<BedTransactionsDTO, BedTransactions> {
    @Mapping(target = "bedType", source = "bedType", qualifiedByName = "name")
    @Mapping(target = "hospital", source = "hospital", qualifiedByName = "name")
    BedTransactionsDTO toDto(BedTransactions s);
}
