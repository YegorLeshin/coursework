package ru.courseworkdt.elib.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.courseworkdt.elib.Model.Book;

import java.util.List;


public interface BookRepository extends JpaRepository<Book, Long> {
}
