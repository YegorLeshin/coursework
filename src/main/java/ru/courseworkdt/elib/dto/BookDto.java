package ru.courseworkdt.elib.dto;

import lombok.Data;


@Data
public class BookDto {
    private Long id;
    private String title;
    private String description;
    private String author;
    private String format;
    private int capacity;
    private double rating;
    private byte[] image;
}
