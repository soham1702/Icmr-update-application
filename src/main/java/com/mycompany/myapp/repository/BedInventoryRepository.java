package com.mycompany.myapp.repository;

import com.mycompany.myapp.domain.BedInventory;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;

/**
 * Spring Data SQL repository for the BedInventory entity.
 */
@SuppressWarnings("unused")
@Repository
public interface BedInventoryRepository extends JpaRepository<BedInventory, Long>, JpaSpecificationExecutor<BedInventory> {}
