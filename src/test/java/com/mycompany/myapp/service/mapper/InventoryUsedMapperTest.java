package com.mycompany.myapp.service.mapper;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class InventoryUsedMapperTest {

    private InventoryUsedMapper inventoryUsedMapper;

    @BeforeEach
    public void setUp() {
        inventoryUsedMapper = new InventoryUsedMapperImpl();
    }
}
