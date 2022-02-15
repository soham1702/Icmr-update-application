package com.mycompany.myapp.service.mapper;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class InventoryMasterMapperTest {

    private InventoryMasterMapper inventoryMasterMapper;

    @BeforeEach
    public void setUp() {
        inventoryMasterMapper = new InventoryMasterMapperImpl();
    }
}
