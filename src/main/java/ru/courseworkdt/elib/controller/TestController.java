package ru.courseworkdt.elib.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import ru.courseworkdt.elib.Model.Book;
import ru.courseworkdt.elib.Model.Category;
import ru.courseworkdt.elib.converters.dto.BookDtoConverter;
import ru.courseworkdt.elib.dto.BookDto;
import ru.courseworkdt.elib.service.BookService;
import ru.courseworkdt.elib.service.CategoryService;
import ru.courseworkdt.elib.service.impl.CategoryServiceImpl;
import ru.courseworkdt.elib.service.jdbc.BookJDBCService;

import java.util.List;
import java.util.stream.Collectors;

@Controller
public class TestController {

    @Autowired
    private CategoryService categoryService;
    private BookService bookService;
    private BookJDBCService bookJDBCService;


    @GetMapping("/list_books")
    public String list_books (Model model, @RequestParam("categoryName") String categoryName) {
        List<Category> category = categoryService.findAll();
     //  List<Book> books = bookService.findAll();
       model.addAttribute("category", category);
     //  model.addAttribute("book", books);
        return "list_books";
    }

    @GetMapping("/category/{categoryId}/books")
    public String list_boo (Model model, @PathVariable("categoryId") Long categoryId,
                            @RequestBody BookFilter bookFilter) {

        List<Book> booksByCategory = bookJDBCService.getBooksByCategory(categoryId, bookFilter);
        model.addAttribute("category", booksByCategory);
        return "list_books";
    }


    @GetMapping("/index")
    public String index (Model model) {
        return "index";
    }

    @GetMapping("/subscribe")
    public String subscribe (Model model) {
        return "subscribe";
    }

    @GetMapping("/about_us")
    public String about_us (Model model) {
        return "about_us";
    }

    @GetMapping("/account")
    public String account (Model model) {
        return "account";
    }

    @GetMapping("/auth")
    public String auth (Model model) {
        return "auth";
    }

    @GetMapping("/reg")
    public String reg (Model model) {
        return "reg";
    }

    @GetMapping("/contacts")
    public String contacts (Model model) {
        return "contacts";
    }

    @GetMapping("/view_book")
    public String view_book (Model model) {
        return "view_book";
    }

}
