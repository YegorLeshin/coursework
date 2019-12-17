package ru.courseworkdt.elib.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;
import ru.courseworkdt.elib.Model.Book;
import ru.courseworkdt.elib.Model.Category;
import ru.courseworkdt.elib.Model.Download;

import java.util.List;

public interface BookRepository extends JpaRepository<Book, Long> {

    List<Book> findByCategory(Category category);
    List<Book> findAllByCategory(Category category);
    List<Book> findAllById(Long id);
   List<Book> findTop10ByOrderByRatingDesc();

}
