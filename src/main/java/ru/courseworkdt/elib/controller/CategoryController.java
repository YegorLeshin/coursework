package ru.courseworkdt.elib.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ru.courseworkdt.elib.Model.Category;
import ru.courseworkdt.elib.converters.CategoryConverter;
import ru.courseworkdt.elib.converters.dto.CategoryDtoConverter;
import ru.courseworkdt.elib.dto.CategoryDto;
import ru.courseworkdt.elib.service.CategoryService;


import java.util.List;

@RestController
public class CategoryController {
    private CategoryService categoryService;
    private CategoryDtoConverter categoryDtoConverter;
    private CategoryConverter categoryConverter;

    @GetMapping("/category")
    public List<Category> categoriesAll() {return categoryService.findAll();
    }

    @PostMapping("/category")
    public CategoryDto addCategory(@RequestBody CategoryDto categoryDto) {
        Category category = categoryConverter.convert(categoryDto);
        return categoryDtoConverter.convert(categoryService.create(category));
    }

    @PostMapping("/category/{id}")
    public CategoryDto getCategoryByID(@PathVariable("id") Long id) {
        return categoryDtoConverter.convert(categoryService.findById(id));
    }

    @PutMapping("/category")
    public CategoryDto updateCategory(@RequestBody CategoryDto categoryDto) {
        Category category = categoryConverter.convert(categoryDto);
        return categoryDtoConverter.convert(categoryService.update(category));
    }

    @DeleteMapping("/category/{id}")
    public String deleteCategory(@PathVariable("id") Long id) {
        categoryService.deleteById(id);
        return "delete";
    }

    @Autowired
    public void setCategoryService(CategoryService categoryService) {
        this.categoryService = categoryService;
    }

    @Autowired
    public void setCategoryDtoConverter(CategoryDtoConverter categoryDtoConverter) {
        this.categoryDtoConverter = categoryDtoConverter;
    }

    @Autowired
    public void setCategoryConverter(CategoryConverter categoryConverter) {
        this.categoryConverter = categoryConverter;
    }
}
