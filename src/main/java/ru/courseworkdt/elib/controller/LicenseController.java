package ru.courseworkdt.elib.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ru.courseworkdt.elib.Model.License;
import ru.courseworkdt.elib.converters.LicenseConverter;
import ru.courseworkdt.elib.converters.dto.LicenseDtoConverter;
import ru.courseworkdt.elib.dto.LicenseDto;
import ru.courseworkdt.elib.service.LicenseService;


import java.util.List;

@RestController
public class LicenseController {

    private LicenseService licenseService;
    private LicenseConverter licenseConverter;
    private LicenseDtoConverter licenseDtoConverter;

    @GetMapping("/licenses")
    public List<License> licensesAll() {return licenseService.findAll();
    }

    @PostMapping("/licence")
    public LicenseDto addLicense(@RequestBody LicenseDto licenseDto) {
        License license = licenseConverter.convert(licenseDto);
        return licenseDtoConverter.convert(licenseService.create(license));
    }

    @PostMapping("/license/{id}")
    public LicenseDto getLicenceByID(@PathVariable("id") Long id) {
        return licenseDtoConverter.convert(licenseService.findById(id));
    }

    @PutMapping("/licence")
    public LicenseDto updateLicense(@RequestBody LicenseDto licenseDto) {
        License license = licenseConverter.convert(licenseDto);
        return licenseDtoConverter.convert(licenseService.update(license));
    }

    @DeleteMapping("/licence/{id}")
    public String deleteLicense(@PathVariable("id") Long id) {
        licenseService.deleteById(id);
        return "delete";
    }
    @Autowired
    public void setLicenseService(LicenseService licenseService) {
        this.licenseService = licenseService;
    }

    @Autowired
    public void setLicenseDtoConverter(LicenseDtoConverter licenseDtoConverter) {
        this.licenseDtoConverter = licenseDtoConverter;
    }

    @Autowired
    public void setLicenseConverter(LicenseConverter licenseConverter) {
        this.licenseConverter = licenseConverter;
    }
}


