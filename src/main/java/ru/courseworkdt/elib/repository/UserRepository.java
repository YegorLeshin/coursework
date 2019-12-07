package ru.courseworkdt.elib.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.courseworkdt.elib.Model.User;

public interface UserRepository extends JpaRepository<User, Long> {
}
