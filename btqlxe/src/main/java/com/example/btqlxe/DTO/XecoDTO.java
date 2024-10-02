package com.example.btqlxe.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class XecoDTO {
    private Long id;
    private String biensoxe; // Biển số xe
    private String loaixe; // Loại xe
}
