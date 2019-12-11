package ru.courseworkdt.elib.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ru.courseworkdt.elib.Model.Attribute;
import ru.courseworkdt.elib.converters.AttributeConverter;
import ru.courseworkdt.elib.converters.dto.AttributeDtoConverter;
import ru.courseworkdt.elib.dto.AttributeDto;
import ru.courseworkdt.elib.service.AttributeService;

import java.util.List;

@RestController
public class AttributeController {
    
    private AttributeService attributeService;
    private AttributeConverter attributeConverter;
    private AttributeDtoConverter attributeDtoConverter;


    @GetMapping("/attributes")
    public List<Attribute> findAll() {
        List<Attribute> all = attributeService.findAll();
        return all;
    }

    @PostMapping("/attribute")
    public AttributeDto addAttribute(@RequestBody AttributeDto attributeDto) {
        Attribute attribute = attributeConverter.convert(attributeDto);
        return attributeDtoConverter.convert(attributeService.create(attribute));
    }

    @PutMapping("/attribute")
    public AttributeDto updateAttribute(@RequestBody AttributeDto attributeDto) {
        Attribute attribute = attributeConverter.convert(attributeDto);
        return attributeDtoConverter.convert(attributeService.update(attribute));
    }

    @DeleteMapping("/Attribute/{id}")
    public String deleteAttribute(@PathVariable("id") Long id) {
        attributeService.deleteById(id);
        return "delete";
    }

    @Autowired
    public void setAttributeService(AttributeService attributeService) {
        this.attributeService = attributeService;
    }

    @Autowired
    public void setAttributeConverter(AttributeConverter attributeConverter) {
        this.attributeConverter = attributeConverter;
    }

    @Autowired
    public void setAttributeDtoConverter(AttributeDtoConverter attributeDtoConverter) {
        this.attributeDtoConverter = attributeDtoConverter;
    }
}
