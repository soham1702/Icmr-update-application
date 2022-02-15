package com.mycompany.myapp.service.mapper;

import com.mycompany.myapp.domain.MunicipalCorp;
import com.mycompany.myapp.service.dto.MunicipalCorpDTO;
import org.mapstruct.*;

/**
 * Mapper for the entity {@link MunicipalCorp} and its DTO {@link MunicipalCorpDTO}.
 */
@Mapper(componentModel = "spring", uses = { DistrictMapper.class })
public interface MunicipalCorpMapper extends EntityMapper<MunicipalCorpDTO, MunicipalCorp> {
    @Mapping(target = "district", source = "district", qualifiedByName = "name")
    MunicipalCorpDTO toDto(MunicipalCorp s);

    @Named("name")
    @BeanMapping(ignoreByDefault = true)
    @Mapping(target = "id", source = "id")
    @Mapping(target = "name", source = "name")
    MunicipalCorpDTO toDtoName(MunicipalCorp municipalCorp);
}
