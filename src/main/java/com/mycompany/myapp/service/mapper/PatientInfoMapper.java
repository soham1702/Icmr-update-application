package com.mycompany.myapp.service.mapper;

import com.mycompany.myapp.domain.PatientInfo;
import com.mycompany.myapp.service.dto.PatientInfoDTO;
import org.mapstruct.*;

/**
 * Mapper for the entity {@link PatientInfo} and its DTO {@link PatientInfoDTO}.
 */
@Mapper(componentModel = "spring", uses = { StateMapper.class, DistrictMapper.class })
public interface PatientInfoMapper extends EntityMapper<PatientInfoDTO, PatientInfo> {
    @Mapping(target = "state", source = "state", qualifiedByName = "name")
    @Mapping(target = "district", source = "district", qualifiedByName = "name")
    PatientInfoDTO toDto(PatientInfo s);
}
