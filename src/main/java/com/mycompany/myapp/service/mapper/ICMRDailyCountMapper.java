package com.mycompany.myapp.service.mapper;

import com.mycompany.myapp.domain.ICMRDailyCount;
import com.mycompany.myapp.service.dto.ICMRDailyCountDTO;
import org.mapstruct.*;

/**
 * Mapper for the entity {@link ICMRDailyCount} and its DTO {@link ICMRDailyCountDTO}.
 */
@Mapper(componentModel = "spring", uses = {})
public interface ICMRDailyCountMapper extends EntityMapper<ICMRDailyCountDTO, ICMRDailyCount> {}
