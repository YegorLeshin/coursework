package ru.courseworkdt.elib.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.courseworkdt.elib.Model.Download;

public interface DownloadRepository extends JpaRepository<Download, Long> {
    Iterable<Long> findAllById(int id);
}
