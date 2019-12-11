package ru.courseworkdt.elib.service.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.courseworkdt.elib.Model.Book;
import ru.courseworkdt.elib.controller.BookFilter;
import ru.courseworkdt.elib.service.jdbc.sql.GetBooksByCategorySql;

import java.util.List;

@Service
public class BookJDBCService {

    private GetBooksByCategorySql getBooksByCategorySql;

    public List<Book> getBooksByCategory (Long categoryId, BookFilter bookFilter) {
        return getBooksByCategorySql.execute(categoryId, bookFilter);
    }

    @Autowired
    public void setGetBooksByCategorySql(GetBooksByCategorySql getBooksByCategorySql) {
        this.getBooksByCategorySql = getBooksByCategorySql;
    }
}
