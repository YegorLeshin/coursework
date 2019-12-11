package ru.courseworkdt.elib.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.courseworkdt.elib.Model.BookAttributeValue;
import ru.courseworkdt.elib.repository.BookAttributeValueRepository;
import ru.courseworkdt.elib.service.BookAttributeValueService;

import java.util.List;

@Service
public class BookAttributeValueServiceImpl implements BookAttributeValueService {

    private BookAttributeValueRepository bookAttributeValueRepository;


    @Override
    public List<BookAttributeValue> findAll() {
        return bookAttributeValueRepository.findAll();
    }

    @Override
    public BookAttributeValue create(BookAttributeValue bookAttributeValue) {
        return bookAttributeValueRepository.save(bookAttributeValue);
    }

    @Override
    public void deleteById(Long id) {
        bookAttributeValueRepository.deleteById(id);
    }

    @Override
    public BookAttributeValue update(BookAttributeValue bookAttributeValue) {
        return bookAttributeValueRepository.save(bookAttributeValue);
    }

    @Override
    public BookAttributeValue findById(long id) {
        return bookAttributeValueRepository.findById(id).orElse(null);
    }

    @Autowired
    public void setBookAttributeValueRepository(BookAttributeValueRepository bookAttributeValueRepository) {
        this.bookAttributeValueRepository = bookAttributeValueRepository;
    }

}
