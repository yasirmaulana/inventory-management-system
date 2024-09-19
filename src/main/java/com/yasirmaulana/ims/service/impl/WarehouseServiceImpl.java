package com.yasirmaulana.ims.service.impl;

import com.yasirmaulana.ims.domain.Warehouse;
import com.yasirmaulana.ims.dto.WarehouseCreateRequestDTO;
import com.yasirmaulana.ims.dto.WarehouseResponseDTO;
import com.yasirmaulana.ims.dto.WarehouseUpdateRequestDTO;
import com.yasirmaulana.ims.exception.BadRequestException;
import com.yasirmaulana.ims.repository.WarehouseRepository;
import com.yasirmaulana.ims.service.WarehouseService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class WarehouseServiceImpl implements WarehouseService {

    private final WarehouseRepository warehouseRepository;

    @Override
    public void createWarehouse(WarehouseCreateRequestDTO dto) {
        Warehouse warehouse = new Warehouse();
        warehouse.setName(dto.getName());
        warehouse.setLocation(dto.getLocation());
        warehouseRepository.save(warehouse);
    }

    @Override
    public void updateWarehouse(Long id, WarehouseUpdateRequestDTO dto) {
        Warehouse warehouse = warehouseRepository.findById(id)
                .orElseThrow(() -> new BadRequestException("invalid.warehouse_id"));
        warehouse.setName(dto.getName()==null|| dto.getName().isBlank()? warehouse.getName() : dto.getName());
        warehouse.setLocation(dto.getLocation()==null|| dto.getLocation().isBlank()? warehouse.getLocation() : dto.getLocation());
        warehouseRepository.save(warehouse);
    }

    @Override
    public WarehouseResponseDTO findWarehouseById(Long id) {
        Warehouse warehouse = warehouseRepository.findById(id)
                .orElseThrow(() -> new BadRequestException("invalid warehouse id"));

        WarehouseResponseDTO dto = new WarehouseResponseDTO();
        dto.setId(warehouse.getId());
        dto.setName(warehouse.getName());
        dto.setLocation(warehouse.getLocation());
        return dto;
    }

}
