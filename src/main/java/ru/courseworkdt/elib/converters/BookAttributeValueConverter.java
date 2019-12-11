package ru.courseworkdt.elib.converters;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;
import ru.courseworkdt.elib.Model.BookAttributeValue;
import ru.courseworkdt.elib.dto.BookAttributeValueDto;

@Component
public class BookAttributeValueConverter implements Converter<BookAttributeValueDto, BookAttributeValue> {

    @Override
    public BookAttributeValue convert(BookAttributeValueDto bookAttributeValueDto) {
        BookAttributeValue bookAttributeValue = new BookAttributeValue();
        bookAttributeValue.setId(bookAttributeValueDto.getId());
        bookAttributeValue.setType(bookAttributeValueDto.getType());
        return bookAttributeValue;
    }
}
