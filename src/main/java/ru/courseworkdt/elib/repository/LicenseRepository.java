package ru.courseworkdt.elib.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.courseworkdt.elib.Model.License;

public interface LicenseRepository extends JpaRepository<License, Long> {
}
