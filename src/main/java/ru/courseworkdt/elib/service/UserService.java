package ru.courseworkdt.elib.service;

import ru.courseworkdt.elib.Model.User;

import java.util.List;

public interface UserService {
    List<User> findAll();

    User create(User user);

    void deleteById(Long id);

    User update(User user);

    User findById(long id);
}