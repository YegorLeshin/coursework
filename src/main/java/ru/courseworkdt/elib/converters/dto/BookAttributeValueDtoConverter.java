package ru.courseworkdt.elib.converters.dto;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;
import org.springframework.util.ResourceUtils;
import ru.courseworkdt.elib.Model.BookAttributeValue;
import ru.courseworkdt.elib.dto.BookAttributeValueDto;

import javax.annotation.PostConstruct;
import java.io.File;
import java.nio.file.Files;

@Component
public class BookAttributeValueDtoConverter implements Converter<BookAttributeValue, BookAttributeValueDto> {
    @Override
    public BookAttributeValueDto convert(BookAttributeValue bookAttributeValue) {
        BookAttributeValueDto bookAttributeValueDto = new BookAttributeValueDto();
        bookAttributeValue.setId(bookAttributeValueDto.getId());
        bookAttributeValue.setType(bookAttributeValueDto.getType());
        return bookAttributeValueDto;
    }

    @PostConstruct
    public void asdas (){

        File file1 = ResourceUtils.getFile("classpath:img.png");
        byte[] bytes = Files.readAllBytes(file1.toPath());



    }
}
