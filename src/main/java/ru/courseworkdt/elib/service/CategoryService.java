package ru.courseworkdt.elib.service;

import ru.courseworkdt.elib.Model.Category;

import java.util.List;

public interface CategoryService {
    List<Category> findAll();

    Category create(Category category);

    void deleteById(Long id);

    Category update(Category user);

    Category findById(long id);
}

