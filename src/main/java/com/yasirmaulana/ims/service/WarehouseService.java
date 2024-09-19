package com.yasirmaulana.ims.service;

import com.yasirmaulana.ims.dto.WarehouseCreateRequestDTO;
import com.yasirmaulana.ims.dto.WarehouseResponseDTO;
import com.yasirmaulana.ims.dto.WarehouseUpdateRequestDTO;

public interface WarehouseService {

    void createWarehouse(WarehouseCreateRequestDTO dto);
    void updateWarehouse(Long id, WarehouseUpdateRequestDTO dto);
    WarehouseResponseDTO findWarehouseById(Long id);
}
