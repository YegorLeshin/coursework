package ru.courseworkdt.elib.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ru.courseworkdt.elib.Model.Book;
import ru.courseworkdt.elib.Model.Category;
import ru.courseworkdt.elib.converters.BookConverter;
import ru.courseworkdt.elib.converters.dto.BookDtoConverter;
import ru.courseworkdt.elib.dto.BookDto;
import ru.courseworkdt.elib.dto.CategoryDto;
import ru.courseworkdt.elib.service.BookService;
import ru.courseworkdt.elib.service.jdbc.BookJDBCService;

import java.util.List;
import java.util.stream.Collectors;


@RestController
public class BookController {

    private BookService bookService;
    private BookDtoConverter bookDtoConverter;
    private BookConverter bookConverter;
    private BookJDBCService bookJDBCService;

    @GetMapping("/books")
    public List<Book> findAll() {
        List<Book> all = bookService.findAll();
        return all;
    }

    @PostMapping("/book")
    public BookDto addBook(@RequestBody BookDto bookDto) {
        Book book = bookConverter.convert(bookDto);
        return bookDtoConverter.convert(bookService.create(book));
    }

    @PutMapping("/book")
    public BookDto updateBook(@RequestBody BookDto bookDto) {
        Book book = bookConverter.convert(bookDto);
        return bookDtoConverter.convert(bookService.update(book));
    }

    @DeleteMapping("/book/{id}")
    public String deleteBook(@PathVariable("id") Long id) {
        bookService.deleteById(id);
        return "delete";
    }

    @PostMapping("/category/{categoryId}/books")
    public List<BookDto> getBooksByCategory(@PathVariable("categoryId") Long categoryId,
                                     @RequestBody BookFilter bookFilter) {
        List<Book> booksByCategory = bookJDBCService.getBooksByCategory(categoryId, bookFilter);
        return  booksByCategory.stream().map(bookDtoConverter::convert).collect(Collectors.toList());
    }

    @Autowired
    public void setBookDtoConverter(BookDtoConverter bookDtoConverter) {
        this.bookDtoConverter = bookDtoConverter;
    }

    @Autowired
    public void setBookConverter(BookConverter bookConverter) {
        this.bookConverter = bookConverter;
    }

    @Autowired
    public void setBookService(BookService bookService) {
        this.bookService = bookService;
    }

    @Autowired
    public void setBookJDBCService(BookJDBCService bookJDBCService) {
        this.bookJDBCService = bookJDBCService;
    }
}