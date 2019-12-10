package ru.courseworkdt.elib.controller;

import lombok.Data;


@Data
public class BookDto {
    private Long id;
    private String title;
    private int year;
    private String author;
    private String genre;
}
