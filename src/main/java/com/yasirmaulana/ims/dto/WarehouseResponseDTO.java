package com.yasirmaulana.ims.dto;


import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.Data;

@Data
@JsonNaming(PropertyNamingStrategy.class)
public class WarehouseResponseDTO {
    private Long id;
    private String name;
    private String location;
}
