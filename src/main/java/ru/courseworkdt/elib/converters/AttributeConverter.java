package ru.courseworkdt.elib.converters;

import org.springframework.core.convert.converter.Converter;

import org.springframework.stereotype.Component;
import ru.courseworkdt.elib.Model.Attribute;
import ru.courseworkdt.elib.dto.AttributeDto;

@Component
public class AttributeConverter implements Converter<AttributeDto, Attribute> {
    @Override
    public Attribute convert(AttributeDto attributeDto) {
        Attribute attribute = new Attribute();
        attribute.setId(attributeDto.getId());
        attribute.setName(attributeDto.getName());
        attribute.setType(attributeDto.getType());
        return attribute;

    }
}
