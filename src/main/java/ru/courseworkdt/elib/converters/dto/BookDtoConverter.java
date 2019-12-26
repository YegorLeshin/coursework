package ru.courseworkdt.elib.converters.dto;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;
import ru.courseworkdt.elib.Model.Book;
import ru.courseworkdt.elib.dto.BookDto;

@Component
public class BookDtoConverter implements Converter<Book, BookDto> {

    @Override
    public BookDto convert(Book book) {
        BookDto bookDto = new BookDto();
        bookDto.setAuthor(book.getAuthor());
        bookDto.setFormat(book.getFormat());
        bookDto.setId(book.getId());
        bookDto.setTitle(book.getTitle());
        bookDto.setDescription(book.getDescription());
        bookDto.setCapacity(book.getCapacity());
        bookDto.setRating(book.getRating());
        bookDto.setImage(book.getImage());
        return bookDto;
    }
}
