package ru.courseworkdt.elib.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.courseworkdt.elib.Model.BookAttributeValue;

public interface BookAttributeValueRepository extends JpaRepository<BookAttributeValue, Long> {
}
