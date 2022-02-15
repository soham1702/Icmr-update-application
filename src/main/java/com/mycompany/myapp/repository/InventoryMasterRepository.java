package com.mycompany.myapp.repository;

import com.mycompany.myapp.domain.InventoryMaster;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;

/**
 * Spring Data SQL repository for the InventoryMaster entity.
 */
@SuppressWarnings("unused")
@Repository
public interface InventoryMasterRepository extends JpaRepository<InventoryMaster, Long>, JpaSpecificationExecutor<InventoryMaster> {}
