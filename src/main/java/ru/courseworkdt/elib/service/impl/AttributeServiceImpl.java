package ru.courseworkdt.elib.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.courseworkdt.elib.Model.Attribute;
import ru.courseworkdt.elib.repository.AttributeRepository;
import ru.courseworkdt.elib.service.AttributeService;

import java.util.List;

@Service
public class AttributeServiceImpl implements AttributeService {

    private AttributeRepository attributeRepository;

    @Override
    @Transactional
    public List<Attribute> findAll() {
        return attributeRepository.findAll();
    }

    @Override
    @Transactional
    public Attribute create(Attribute attribute) {
        return attributeRepository.save(attribute);
    }

    @Override
    @Transactional
    public void deleteById(Long id) {
        attributeRepository.deleteById(id);

    }

    @Override
    @Transactional
    public Attribute update(Attribute attribute) {
        return attributeRepository.save(attribute);
    }

    @Override
    @Transactional
    public Attribute findById(long id) {
        {
            return attributeRepository.findById(id).orElse(null);
        }
    }
        @Autowired
        public void setAttributeRepository (AttributeRepository attributeRepository){
            this.attributeRepository = attributeRepository;
        }
    }

