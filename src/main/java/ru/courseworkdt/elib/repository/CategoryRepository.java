package ru.courseworkdt.elib.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.courseworkdt.elib.Model.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
