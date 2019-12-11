package ru.courseworkdt.elib.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.courseworkdt.elib.Model.License;
import ru.courseworkdt.elib.repository.LicenseRepository;
import ru.courseworkdt.elib.service.LicenseService;

import java.util.List;

@Service
public class LicenseServiceImpl implements LicenseService {
    private LicenseRepository licenseRepository;

    @Override
    @Transactional
    public List<License> findAll() { return licenseRepository.findAll(); }

    @Override
    @Transactional
    public License create(License license) {
        return licenseRepository.save(license);
    }

    @Override
    @Transactional
    public void deleteById(Long id) {
        licenseRepository.deleteById(id);
    }

    @Override
    @Transactional
    public License update(License license) { return licenseRepository.save(license);    }

    @Override
    @Transactional
    public License findById(long id) {
        return licenseRepository.findById(id).orElse(null);
    }

    @Autowired
    public void setLicenseRepository(LicenseRepository licenseRepository) { this.licenseRepository = licenseRepository;
    }
}
