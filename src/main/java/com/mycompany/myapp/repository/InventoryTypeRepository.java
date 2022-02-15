package com.mycompany.myapp.repository;

import com.mycompany.myapp.domain.InventoryType;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;

/**
 * Spring Data SQL repository for the InventoryType entity.
 */
@SuppressWarnings("unused")
@Repository
public interface InventoryTypeRepository extends JpaRepository<InventoryType, Long>, JpaSpecificationExecutor<InventoryType> {}
