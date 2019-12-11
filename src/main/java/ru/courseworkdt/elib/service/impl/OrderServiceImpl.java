package ru.courseworkdt.elib.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.courseworkdt.elib.Model.Order;
import ru.courseworkdt.elib.repository.OrderRepository;
import ru.courseworkdt.elib.service.OrderService;

import java.util.List;


@Service
public class OrderServiceImpl implements OrderService {

    private OrderRepository orderRepository;

    @Override
    @Transactional
    public List<Order> findAll() {
        return orderRepository.findAll();
    }

    @Override
    @Transactional
    public Order create(Order order) {
        return orderRepository.save(order);
    }

    @Override
    @Transactional
    public void deleteById(Long id) { orderRepository.deleteById(id);

    }

    @Override
    @Transactional
    public Order update(Order order) {
        return orderRepository.save(order);
    }

    @Override
    @Transactional
    public Order findById(long id) {
        return orderRepository.findById(id).orElse(null);
    }
    @Autowired
    public void setOrderRepository(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }
}
