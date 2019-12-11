package ru.courseworkdt.elib.dto;


import lombok.Data;

@Data
public class LicenseDto {
    private Long id;
    private String type;
    private double price;
}
