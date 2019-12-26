package ru.courseworkdt.elib.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ru.courseworkdt.elib.Model.Download;
import ru.courseworkdt.elib.converters.DownloadConverter;
import ru.courseworkdt.elib.converters.dto.DownloadDtoConverter;
import ru.courseworkdt.elib.dto.DownloadDto;
import ru.courseworkdt.elib.service.DownloadService;

import java.util.List;

@RestController
public class
DownloadController {

    private DownloadService downloadService;
    private DownloadConverter downloadConverter;
    private DownloadDtoConverter downloadDtoConverter;

    @GetMapping("/downloads")
    public List<Download> findAll() {
        List<Download> all = downloadService.findAll();
        return all;
    }

    @PostMapping("/download")
    public DownloadDto addDownload(@RequestBody DownloadDto downloadDto) {
        Download download = downloadConverter.convert(downloadDto);
        return downloadDtoConverter.convert(downloadService.create(download));
    }

    @PutMapping("/download")
    public DownloadDto updateDownload(@RequestBody DownloadDto downloadDto) {
        Download download = downloadConverter.convert(downloadDto);
        return downloadDtoConverter.convert(downloadService.update(download));
    }

    @DeleteMapping("/download/{id}")
    public String deleteDownload(@PathVariable("id") Long id) {
        downloadService.deleteById(id);
        return "delete";
    }


    @Autowired
    public void setDownloadService(DownloadService downloadService) {
        this.downloadService = downloadService;
    }

    @Autowired
    public void setDownloadConverter(DownloadConverter downloadConverter) {
        this.downloadConverter = downloadConverter;
    }

    @Autowired
    public void setDownloadDtoConverter(DownloadDtoConverter downloadDtoConverter) {
        this.downloadDtoConverter = downloadDtoConverter;
    }
}
