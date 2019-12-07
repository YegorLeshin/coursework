package ru.courseworkdt.elib.service;

import ru.courseworkdt.elib.Model.Book;

import java.util.List;

public interface BookService {
    List<Book> findAll();
    void create(Book book);
    void delete(Book book);
    void update(Book book);
    Book findById(long id);
}
