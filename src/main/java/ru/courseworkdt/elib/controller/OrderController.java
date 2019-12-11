package ru.courseworkdt.elib.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ru.courseworkdt.elib.Model.Order;
import ru.courseworkdt.elib.converters.OrderConverter;
import ru.courseworkdt.elib.converters.dto.OrderDtoConverter;
import ru.courseworkdt.elib.dto.OrderDto;
import ru.courseworkdt.elib.service.OrderService;

import java.util.List;

@RestController
public class OrderController {
    private OrderService orderService;
    private OrderConverter orderConverter;
    private OrderDtoConverter orderDtoConverter;

    @GetMapping("/orders")
    public List<Order> orderAll() {
        return orderService.findAll();
    }

    @PostMapping("/order")
    public OrderDto addOrder(@RequestBody OrderDto orderDto) {
        Order order = orderConverter.convert(orderDto);
        return orderDtoConverter.convert(orderService.create(order));
    }

    @PutMapping("/order")
    public OrderDto updateOrder(@RequestBody OrderDto orderDto) {
        Order order = orderConverter.convert(orderDto);
        return orderDtoConverter.convert(orderService.update(order));
    }

    @DeleteMapping("/order/{id}")
    public String delOrder(@PathVariable("id") Long id) {
        orderService.deleteById(id);
        return  "delete";
    }

    @Autowired
    public void setOrderService(OrderService orderService) {
        this.orderService = orderService;
    }

    @Autowired
    public void setOrderDtoConverter(OrderDtoConverter orderDtoConverter) {
        this.orderDtoConverter = orderDtoConverter;
    }

    @Autowired
    public void setOrderConverter(OrderConverter orderConverter) {
        this.orderConverter = orderConverter;
    }
}

