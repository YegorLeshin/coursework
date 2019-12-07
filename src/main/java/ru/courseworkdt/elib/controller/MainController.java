package ru.courseworkdt.elib.controller;

import org.omg.CORBA.BAD_QOS;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import ru.courseworkdt.elib.Model.Book;
import ru.courseworkdt.elib.Model.User;
import ru.courseworkdt.elib.repository.BookRepository;
import ru.courseworkdt.elib.repository.UserRepository;
import ru.courseworkdt.elib.service.BookService;

import java.util.AbstractQueue;
import java.util.Map;

@RestController
public class MainController {

@Autowired
private UserRepository userRepository;
    private BookRepository bookRepository;

    @GetMapping("/")
    public String greeting(Map<String, Object> model) {

        return "greeting";
    }

    @GetMapping("/books")
    public String books(Map<String, Object> model) {
        Iterable<Book> books = bookRepository.findAll();

        model.put("book", books);
        return "books";
    }
    @PostMapping("/books")
    public String addBook(@RequestBody BookDto bookDto) {
        Book book = new Book(
                bookDto.getTitle(),
                bookDto.getYear(),
                bookDto.getAuthor(),
                bookDto.getGenre(),
                false);
        bookRepository.save(book);

        Iterable<Book> books = bookRepository.findAll();
        return "books";
    }
    @PostMapping("/delbook")
    public String delBook(@RequestBody BookDto bookDto) {
        Book book = new Book(bookDto.getId());
        bookRepository.delete(book);

        Iterable<Book> books = bookRepository.findAll();
        return "delbook";
    }
    @PostMapping("/users")
    public String addUser(@RequestBody UserDto userDto) {
        User user = new User(
                userDto.getUsername(),
                userDto.getPassword(),
                userDto.getEmail(),
                userDto.getPhone(),
                false);
        userRepository.save(user);

        Iterable<User> users = userRepository.findAll();
        return "users";
    }
    @PostMapping("/deluser")
    public String delUser(@RequestBody UserDto userDto) {
        User user = new User(UserDto.getId());
        userRepository.delete(user);

        Iterable<User> users = userRepository.findAll();
        return "deluser";
    }

//    @Autowired
//    public void setBookRepository(BookRepository bookRepository) {
//        this.bookRepository = bookRepository;
//    }
}


