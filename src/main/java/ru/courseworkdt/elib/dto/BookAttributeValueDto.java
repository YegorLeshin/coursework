package ru.courseworkdt.elib.dto;

import lombok.Data;
import ru.courseworkdt.elib.Model.AttributeValueType;

@Data
public class BookAttributeValueDto {
    private Long id;
    private AttributeValueType type;
}
