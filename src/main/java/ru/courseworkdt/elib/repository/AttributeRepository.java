package ru.courseworkdt.elib.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.courseworkdt.elib.Model.Attribute;

public interface AttributeRepository extends JpaRepository<Attribute, Long> {
}
