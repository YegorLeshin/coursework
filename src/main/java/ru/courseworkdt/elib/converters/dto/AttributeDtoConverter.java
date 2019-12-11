package ru.courseworkdt.elib.converters.dto;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;
import ru.courseworkdt.elib.Model.Attribute;
import ru.courseworkdt.elib.dto.AttributeDto;

@Component
public class AttributeDtoConverter implements Converter<Attribute, AttributeDto> {
    @Override
    public AttributeDto convert(Attribute attribute) {
        AttributeDto attributeDto = new AttributeDto();
        attributeDto.setId(attribute.getId());
        attributeDto.setName(attribute.getName());
        attributeDto.setType(attribute.getType());
        return attributeDto;
    }
}
