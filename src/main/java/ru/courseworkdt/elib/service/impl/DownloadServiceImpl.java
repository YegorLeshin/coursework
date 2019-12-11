package ru.courseworkdt.elib.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.courseworkdt.elib.Model.Download;
import ru.courseworkdt.elib.repository.DownloadRepository;
import ru.courseworkdt.elib.service.DownloadService;

import java.util.List;

@Service
public class DownloadServiceImpl implements DownloadService {

    private DownloadRepository downloadRepository;

    @Override
    public List<Download> findAll() {
        return downloadRepository.findAll();
    }

    @Override
    public Download create(Download download) {
        return downloadRepository.save(download);
    }

    @Override
    public void deleteById(Long id) {
        downloadRepository.deleteById(id);
    }

    @Override
    public Download update(Download download) {
        return downloadRepository.save(download);
    }

    @Override
    public Download findById(long id) {
       return downloadRepository.findById(id).orElse(null);
    }

    @Autowired
    public void setDownloadRepository(DownloadRepository downloadRepository) {
        this.downloadRepository = downloadRepository;
    }
}
