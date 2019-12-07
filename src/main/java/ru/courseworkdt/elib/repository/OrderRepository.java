package ru.courseworkdt.elib.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.courseworkdt.elib.Model.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
