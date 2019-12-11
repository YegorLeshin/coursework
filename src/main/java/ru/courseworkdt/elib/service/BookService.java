package ru.courseworkdt.elib.service;

import ru.courseworkdt.elib.Model.Book;

import java.util.List;

public interface BookService {
    List<Book> findAll();

    Book create(Book book);

    void deleteById(Long id);

    Book update(Book book);

    Book findById(long id);
}
