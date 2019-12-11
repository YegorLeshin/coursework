package ru.courseworkdt.elib.converters.dto;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;
import ru.courseworkdt.elib.Model.Category;
import ru.courseworkdt.elib.dto.CategoryDto;

@Component
public class CategoryDtoConverter implements Converter<Category, CategoryDto> {
    @Override
    public CategoryDto convert(Category category) {
        CategoryDto categoryDto = new CategoryDto();
        categoryDto.setCategory(category.getCategory());
        categoryDto.setId(category.getId());
        return categoryDto;
    }
}
