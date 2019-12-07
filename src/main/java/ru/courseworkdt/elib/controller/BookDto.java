package ru.courseworkdt.elib.controller;

import lombok.Data;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

@Data
public class BookDto {
    private  Long Id;
    private String title;
    private int year;
    private String author;
    private String genre;

}
