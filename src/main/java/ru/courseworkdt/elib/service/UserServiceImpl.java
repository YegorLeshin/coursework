package ru.courseworkdt.elib.service;

import org.springframework.beans.factory.annotation.Autowired;
import ru.courseworkdt.elib.Model.User;
import ru.courseworkdt.elib.repository.UserRepository;

import java.util.List;

public class UserServiceImpl implements UserService {

    @Autowired
    private UserService userService;

    @Override
    public List<User> findAll() { return UserRepository.findAll(); }

    @Override
    public void create(User user) {UserRepository.save(user);

    }

    @Override
    public void delete(User user) {

    }

    @Override
    public void update(User user) {

    }

    @Override
    public User findById(long id) {
        return null;
    }
}
