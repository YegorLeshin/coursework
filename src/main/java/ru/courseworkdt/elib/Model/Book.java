package ru.courseworkdt.elib.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Entity
@Table(name = "books")
@NoArgsConstructor
@AllArgsConstructor
public class Book {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "title")
    private String title;

    @Column(name = "description")
    private String description;

    @Column(name = "author")
    private String author;

    @Column(name = "format")
    private String format;

    @Column(name = "capacity")
    private int capacity;

    @Column(name = "rating")
    private double rating;

    @Column(name = "image")
    private byte[] image;

    @ManyToOne(fetch = FetchType.EAGER, cascade = {CascadeType.ALL})
    @JoinColumn(name = "category_id", nullable = false)
    private Category category;
}