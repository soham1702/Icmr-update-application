package com.mycompany.myapp.repository;

import com.mycompany.myapp.domain.ICMRDailyCount;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;

/**
 * Spring Data SQL repository for the ICMRDailyCount entity.
 */
@SuppressWarnings("unused")
@Repository
public interface ICMRDailyCountRepository extends JpaRepository<ICMRDailyCount, Long>, JpaSpecificationExecutor<ICMRDailyCount> {}
