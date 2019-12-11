package ru.courseworkdt.elib.converters;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;
import ru.courseworkdt.elib.Model.Download;
import ru.courseworkdt.elib.dto.DownloadDto;

@Component
public class DownloadConverter implements Converter<DownloadDto, Download> {
    @Override
    public Download convert(DownloadDto downloadDto) {
        Download download = new Download();
        download.setId(downloadDto.getId());
        download.setDate(downloadDto.getDate());
        return download;
    }
}
