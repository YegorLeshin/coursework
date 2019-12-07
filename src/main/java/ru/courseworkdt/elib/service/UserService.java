package ru.courseworkdt.elib.service;

import ru.courseworkdt.elib.Model.User;

import java.util.List;

public interface UserService {
 List<User> findAll();
        void create(User user);
        void delete(User user);
        void update(User user);
        User findById(long id);
}