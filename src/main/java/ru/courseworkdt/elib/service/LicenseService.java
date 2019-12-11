package ru.courseworkdt.elib.service;

import ru.courseworkdt.elib.Model.License;

import java.util.List;

public interface LicenseService {
    List<License> findAll();

    License create(License license);

    void deleteById(Long id);

    License update(License license);

    License findById(long id);
}

