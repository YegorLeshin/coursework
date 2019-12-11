package ru.courseworkdt.elib.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.courseworkdt.elib.Model.Book;
import ru.courseworkdt.elib.repository.BookRepository;
import ru.courseworkdt.elib.service.BookService;

import java.util.List;

@Service
public class BookServiceImpl implements BookService {

    private BookRepository bookRepository;

    @Override
    @Transactional
    public List<Book> findAll() {
        return bookRepository.findAll();
    }

    @Override
    @Transactional
    public Book create(Book book) { return bookRepository.save(book); }

    @Override
    @Transactional
    public void deleteById(Long id) {
        bookRepository.deleteById(id);
    }

    @Override
    @Transactional
    public Book update(Book book) {
        return bookRepository.save(book);
    }

    @Override
    @Transactional
    public Book findById(long id) {
        return bookRepository.findById(id).orElse(null);
    }

    @Autowired
    public void setBookRepository(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }
}

