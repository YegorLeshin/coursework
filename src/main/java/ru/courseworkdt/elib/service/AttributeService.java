package ru.courseworkdt.elib.service;

import ru.courseworkdt.elib.Model.Attribute;

import java.util.List;

public interface AttributeService {
    List<Attribute> findAll();

    Attribute create(Attribute attribute);

    void deleteById(Long id);

    Attribute update(Attribute attribute);

    Attribute findById(long id);
}
