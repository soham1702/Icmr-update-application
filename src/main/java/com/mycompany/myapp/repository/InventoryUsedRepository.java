package com.mycompany.myapp.repository;

import com.mycompany.myapp.domain.InventoryUsed;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;

/**
 * Spring Data SQL repository for the InventoryUsed entity.
 */
@SuppressWarnings("unused")
@Repository
public interface InventoryUsedRepository extends JpaRepository<InventoryUsed, Long>, JpaSpecificationExecutor<InventoryUsed> {}
