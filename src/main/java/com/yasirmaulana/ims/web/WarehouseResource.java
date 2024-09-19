package com.yasirmaulana.ims.web;

import com.yasirmaulana.ims.dto.WarehouseCreateRequestDTO;
import com.yasirmaulana.ims.dto.WarehouseUpdateRequestDTO;
import com.yasirmaulana.ims.service.WarehouseService;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;

@AllArgsConstructor
@RestController
public class WarehouseResource {

    private WarehouseService warehouseService;

    @PostMapping("/v1/warehouse")
    public ResponseEntity<Void> createNewWarehouse(@RequestBody @Valid WarehouseCreateRequestDTO dto){
        warehouseService.createWarehouse(dto);
        return ResponseEntity.created(URI.create("/v1/warehouse")).build();
    }

    @PutMapping("/v1/warehouse/{id}")
    public ResponseEntity<Void> updateWarehouse(@PathVariable Long id, @RequestBody @Valid WarehouseUpdateRequestDTO dto){
        warehouseService.updateWarehouse(id, dto);
        return ResponseEntity.ok().build();
    }

}
