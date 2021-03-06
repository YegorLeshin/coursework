package ru.courseworkdt.elib.dto;

import lombok.Data;
import ru.courseworkdt.elib.Model.AttributeValueType;

@Data
public class AttributeDto {
    private Long id;
    private String name;
    private AttributeValueType type;
}
