package ru.courseworkdt.elib.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.courseworkdt.elib.Model.Book;
import ru.courseworkdt.elib.repository.BookRepository;

import java.util.List;

@Service
public class BookServiceImpl implements BookService {
    @Autowired
    private BookRepository bookRepository;

    @Override
    public List<Book> findAll() {
        return bookRepository.findAll();
    }

    @Override
    @Transactional
    public void create(Book book) {
        bookRepository.save(book);
    }

    @Override
    @Transactional
    public void delete(Book book) {
        bookRepository.delete(book);
    }

    @Override
    @Transactional
    public void update(Book book) {
        bookRepository.save(book);
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

