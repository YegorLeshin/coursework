package ru.courseworkdt.elib.converters;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;
import ru.courseworkdt.elib.Model.Book;
import ru.courseworkdt.elib.dto.BookDto;

@Component
public class BookConverter implements Converter<BookDto, Book> {

    @Override
    public Book convert(BookDto bookDto) {
        Book book = new Book();
        book.setId(bookDto.getId());
        book.setTitle(bookDto.getTitle());
        book.setDescription(bookDto.getDescription());
        book.setAuthor(bookDto.getAuthor());
        book.setGenre(bookDto.getGenre());
        book.setCapacity(bookDto.getCapacity());
        book.setRating(bookDto.getRating());
        book.setImage(bookDto.getImage());
        return book;
    }
}
