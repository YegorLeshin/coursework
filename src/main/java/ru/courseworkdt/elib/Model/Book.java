package ru.courseworkdt.elib.Model;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@Table(name = "books")
public class Book {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "title")
    private String title;

    @Column(name = "year")
    private int year;

    @Column(name = "author")
    private String author;

    @Column(name = "genre")
    private String genre;

    @Column(name = "watched")
    private boolean watched;


    public Book() {}
    public Book(Long id)  {
        this.id = id;
    }

    public Book(String title, int year, String author, String genre, boolean watched) {
        this.title = title;
        this.year = year;
        this.author = author;
        this.genre = genre;
        this.watched = watched;
    }

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public int getYear() {
        return year;
    }

    public String getAuthor() {
        return author;
    }

    public String getGenre() {
        return genre;
    }

    public boolean isWatched() {
        return watched;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public void setWatched(boolean watched) {
        this.watched = watched;
    }
}