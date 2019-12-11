package ru.courseworkdt.elib.converters.dto;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;
import ru.courseworkdt.elib.Model.License;
import ru.courseworkdt.elib.dto.LicenseDto;

@Component
public class LicenseDtoConverter implements Converter<License, LicenseDto> {
    @Override
    public LicenseDto convert(License license) {
        LicenseDto licenseDto = new LicenseDto();
        licenseDto.setId(license.getId());
        licenseDto.setType(license.getType());
        licenseDto.setPrice(license.getPrice());
        return licenseDto;
    }
}
