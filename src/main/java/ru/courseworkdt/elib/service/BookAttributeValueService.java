package ru.courseworkdt.elib.service;

import ru.courseworkdt.elib.Model.BookAttributeValue;

import java.util.List;

public interface BookAttributeValueService {

    List<BookAttributeValue> findAll();

    BookAttributeValue create(BookAttributeValue bookAttributeValue);

    void deleteById(Long id);

    BookAttributeValue update(BookAttributeValue bookAttributeValue);

    BookAttributeValue findById(long id);
}
