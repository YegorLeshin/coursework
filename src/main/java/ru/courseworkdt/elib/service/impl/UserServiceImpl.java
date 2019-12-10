package ru.courseworkdt.elib.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.courseworkdt.elib.Model.User;
import ru.courseworkdt.elib.repository.UserRepository;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    private UserRepository userRepository;

    @Override
    @Transactional
    public List<User> findAll() { return userRepository.findAll(); }

    @Override
    @Transactional
    public User create(User user) {
        return userRepository.save(user);
    }

    @Override
    @Transactional
    public void deleteById(Long id) {
        userRepository.deleteById(id);
    }

    @Override
    @Transactional
    public User update(User user) { return userRepository.save(user);    }

    @Override
    @Transactional
    public User findById(long id) {
        return null;
    }

    @Autowired
    public void setUserRepository(UserRepository userRepository) {
        this.userRepository = userRepository;
    }
}
