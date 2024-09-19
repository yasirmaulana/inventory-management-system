package com.yasirmaulana.ims.dto;

import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
@JsonNaming(PropertyNamingStrategy.class)
public class WarehouseCreateRequestDTO {

    @NotBlank
    private String name;

    @NotBlank
    private String location;
}
