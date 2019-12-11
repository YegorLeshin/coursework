package ru.courseworkdt.elib.converters;


import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;
import ru.courseworkdt.elib.Model.License;
import ru.courseworkdt.elib.dto.LicenseDto;

@Component
public class LicenseConverter implements Converter<LicenseDto, License> {
    @Override
    public License convert(LicenseDto licenseDto) {
        License license = new License();
        license.setId(licenseDto.getId());
        license.setType(licenseDto.getType());
        license.setPrice(licenseDto.getPrice());
        return license;
    }
}
