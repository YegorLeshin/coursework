package ru.courseworkdt.elib.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.courseworkdt.elib.Model.Category;
import ru.courseworkdt.elib.repository.CategoryRepository;
import ru.courseworkdt.elib.service.CategoryService;

import java.util.List;

@Service
public class CategoryServiceImpl implements CategoryService {

    private CategoryRepository categoryRepository;
    @Override
    public List<Category> findAll() {
        return categoryRepository.findAll();
    }

    @Override
    public Category create(Category category) {
        return categoryRepository.save(category);
    }

    @Override
    public void deleteById(Long id) {
        categoryRepository.deleteById(id);
    }

    @Override
    public Category update(Category category) {
        return categoryRepository.save(category);
    }

    @Override
    public Category findById(long id) {
            return categoryRepository.findById(id).orElse(null);
    }

    @Autowired
    public void setCategoryRepository(CategoryRepository categoryRepository) {this.categoryRepository = categoryRepository;}
}

