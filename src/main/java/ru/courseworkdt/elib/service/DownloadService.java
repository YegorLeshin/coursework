package ru.courseworkdt.elib.service;

import org.springframework.stereotype.Service;
import ru.courseworkdt.elib.Model.Download;

import java.util.List;


public interface DownloadService {
    List<Download> findAll();

    Download create(Download download);

    void deleteById(Long id);

    Download update(Download download);

    Download findById(long id);
}