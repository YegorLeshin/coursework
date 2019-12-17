package ru.courseworkdt.elib.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import ru.courseworkdt.elib.Model.Book;
import ru.courseworkdt.elib.Model.Category;
import ru.courseworkdt.elib.Model.Download;
import ru.courseworkdt.elib.Model.User;
import ru.courseworkdt.elib.converters.dto.BookDtoConverter;
import ru.courseworkdt.elib.dto.BookDto;
import ru.courseworkdt.elib.repository.BookRepository;
import ru.courseworkdt.elib.repository.DownloadRepository;
import ru.courseworkdt.elib.service.BookService;
import ru.courseworkdt.elib.service.CategoryService;
import ru.courseworkdt.elib.service.UserService;
import ru.courseworkdt.elib.service.impl.CategoryServiceImpl;
import ru.courseworkdt.elib.service.jdbc.BookJDBCService;

import java.util.List;
import java.util.stream.Collectors;

@Controller
public class TestController {

    @Autowired
    private CategoryService categoryService;
    private BookRepository bookRepository;
    private DownloadRepository downloadRepository;
    private UserService userService;
    private BookService bookService;
    private BookJDBCService bookJDBCService;


    @GetMapping("/list_books")
    public String list_books (Model model, @RequestParam("categoryName") String categoryName) {
        List<Category> category = categoryService.findAll();
        List<Book> books = bookRepository.findAll();
        model.addAttribute("category", category);
        model.addAttribute("books", books);
        return "list_books";
    }

    @GetMapping("/view_book/{id}")
    public String book(Model model, @PathVariable int id) {
        Book book = bookService.findById(id);
        model.addAttribute("book", book);
        return "view_book";
    }

    @GetMapping("/index")
    public String index (Model model) {
        List<Book> topBooks = bookRepository.findTop10ByOrderByRatingDesc();
        model.addAttribute("topBooks", topBooks);
        return "index";
    }

    @GetMapping("/subscribe")
    public String subscribe(Model model) {
        return "subscribe";
    }

    @GetMapping("/about_us")
    public String about_us (Model model) {
        return "about_us";
    }

    @GetMapping("/account")
    public String account (Model model, @RequestParam("id") int id) {
        List<Book> books = bookRepository.findAllById(downloadRepository.findAllById(id));
        User user = userService.findById(id);
        model.addAttribute("books", books);
        model.addAttribute("user", user);
        return "account";
    }

    @GetMapping("/auth")
    public String auth (Model model) {
        return "auth";
    }

    @GetMapping("/reg")
    public String reg (Model model) {
        User user = new User();
        userService.create(user);
        return "reg";
    }

    @GetMapping("/contacts")
    public String contacts (Model model) {
        return "contacts";
    }

    @Autowired
    public void setCategoryService(CategoryService categoryService) {
        this.categoryService = categoryService;
    }
    @Autowired
    public void setBookRepository(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }
    @Autowired
    public void setDownloadRepository(DownloadRepository downloadRepository) {
        this.downloadRepository = downloadRepository;
    }
    @Autowired
    public void setUserService(UserService userService) {
        this.userService = userService;
    }
    @Autowired
    public void setBookService(BookService bookService) {
        this.bookService = bookService;
    }
}
