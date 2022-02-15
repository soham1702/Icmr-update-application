package com.mycompany.myapp.repository;

import com.mycompany.myapp.domain.PatientInfo;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;

/**
 * Spring Data SQL repository for the PatientInfo entity.
 */
@SuppressWarnings("unused")
@Repository
public interface PatientInfoRepository extends JpaRepository<PatientInfo, Long>, JpaSpecificationExecutor<PatientInfo> {}
