package ru.courseworkdt.elib.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ru.courseworkdt.elib.Model.Book;
import ru.courseworkdt.elib.Model.BookAttributeValue;
import ru.courseworkdt.elib.converters.BookAttributeValueConverter;
import ru.courseworkdt.elib.converters.dto.BookAttributeValueDtoConverter;
import ru.courseworkdt.elib.dto.BookAttributeValueDto;
import ru.courseworkdt.elib.dto.BookDto;
import ru.courseworkdt.elib.service.BookAttributeValueService;

import java.util.List;

@RestController
public class BookAttributeValueController {

    private BookAttributeValueService bookAttributeValueService;
    private BookAttributeValueDtoConverter bookAttributeValueDtoConverter;
    private BookAttributeValueConverter bookAttributeValueConverter;

    @GetMapping("/bookAttributeValues")
    public List<BookAttributeValue> findAll() {
        List<BookAttributeValue> all = bookAttributeValueService.findAll();
        return all;
    }

    @PostMapping("/bookAttributeValue")
    public BookAttributeValueDto addBookAttributeValue(@RequestBody BookAttributeValueDto bookAttributeValueDto) {
        BookAttributeValue bookAttributeValue = bookAttributeValueConverter.convert(bookAttributeValueDto);
        return bookAttributeValueDtoConverter.convert(bookAttributeValueService.create(bookAttributeValue));
    }

    @PutMapping("/bookAttributeValue")
    public BookAttributeValueDto updateBook(@RequestBody BookAttributeValueDto bookAttributeValueDto) {
        BookAttributeValue bookAttributeValue = bookAttributeValueConverter.convert(bookAttributeValueDto);
        return bookAttributeValueDtoConverter.convert(bookAttributeValueService.update(bookAttributeValue));
    }

    @DeleteMapping("/book/{id}")
    public String deleteBook(@PathVariable("id") Long id) {
        bookAttributeValueService.deleteById(id);
        return "delete";
    }

    @Autowired
    public void setBookAttributeValueService(BookAttributeValueService bookAttributeValueService) {
        this.bookAttributeValueService = bookAttributeValueService;
    }

    @Autowired
    public void setBookAttributeValueDtoConverter(BookAttributeValueDtoConverter bookAttributeValueDtoConverter) {
        this.bookAttributeValueDtoConverter = bookAttributeValueDtoConverter;
    }

    @Autowired
    public void setBookAttributeValueConverter(BookAttributeValueConverter bookAttributeValueConverter) {
        this.bookAttributeValueConverter = bookAttributeValueConverter;
    }
}
