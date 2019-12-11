package ru.courseworkdt.elib.service;

import ru.courseworkdt.elib.Model.Order;
import java.util.List;

public interface OrderService {
    List<Order> findAll();

    Order create(Order order);

    void deleteById(Long id);

    Order update(Order order);

    Order findById(long id);
}

