package ru.courseworkdt.elib.converters.dto;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;
import ru.courseworkdt.elib.Model.BookAttributeValue;
import ru.courseworkdt.elib.dto.BookAttributeValueDto;

@Component
public class BookAttributeValueDtoConverter implements Converter<BookAttributeValue, BookAttributeValueDto> {
    @Override
    public BookAttributeValueDto convert(BookAttributeValue bookAttributeValue) {
        BookAttributeValueDto bookAttributeValueDto = new BookAttributeValueDto();
        bookAttributeValue.setId(bookAttributeValueDto.getId());
        bookAttributeValue.setType(bookAttributeValueDto.getType());
        return bookAttributeValueDto;
    }
}
