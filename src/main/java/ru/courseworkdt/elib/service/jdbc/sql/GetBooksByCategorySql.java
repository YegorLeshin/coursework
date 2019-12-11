package ru.courseworkdt.elib.service.jdbc.sql;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Component;
import ru.courseworkdt.elib.Model.Book;
import ru.courseworkdt.elib.controller.BookFilter;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component
public class GetBooksByCategorySql {

    public static final String QUERY = "SELECT * FROM books WHERE category_id = :categoryId ";

    private NamedParameterJdbcTemplate jdbcTemplate;

    public List<Book> execute(Long categoryId, BookFilter bookFilter) {
        Map<String, Object> params = new HashMap<>();
        params.put("categoryId", categoryId);
        StringBuilder query = new StringBuilder(QUERY);
        addConditions(query, params, bookFilter);
        return jdbcTemplate.query(query.toString(), params, this::mapRow);
    }

    public Book mapRow(ResultSet rs, int i) throws SQLException {
        Book book = new Book();
        book.setId(rs.getLong("id"));
        book.setAuthor(rs.getString("author"));
        return book;
    }

    @Autowired
    public void setJdbcTemplate(NamedParameterJdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    private void addConditions(StringBuilder query, Map<String, Object> params, BookFilter filter) {
        addNameCondition(query, params, filter);

    }

    private void addNameCondition(StringBuilder query, Map<String, Object> params, BookFilter filter) {
        String name = filter.getName();
        if (StringUtils.isNotBlank(name)) {
            query.append(" AND name = ':name' ");
            params.put("name", name);
        }
    }
}
