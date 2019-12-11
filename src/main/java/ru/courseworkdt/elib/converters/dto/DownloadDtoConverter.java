package ru.courseworkdt.elib.converters.dto;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;
import ru.courseworkdt.elib.Model.Download;
import ru.courseworkdt.elib.dto.DownloadDto;


@Component
public class DownloadDtoConverter implements Converter<Download, DownloadDto> {
    @Override
    public DownloadDto convert(Download download) {
        DownloadDto downloadDto = new DownloadDto();
        downloadDto.setDate(download.getDate());
        downloadDto.setId(download.getId());
        return downloadDto;
    }
}
