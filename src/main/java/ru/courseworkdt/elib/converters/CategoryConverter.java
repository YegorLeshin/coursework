package ru.courseworkdt.elib.converters;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;
import ru.courseworkdt.elib.Model.Category;
import ru.courseworkdt.elib.dto.CategoryDto;

@Component
public class CategoryConverter implements Converter<CategoryDto, Category> {
    @Override
    public Category convert(CategoryDto categoryDto) {
        Category category = new Category();
        category.setCategory(categoryDto.getCategory());
        category.setId(categoryDto.getId());
        return category;

    }
}
