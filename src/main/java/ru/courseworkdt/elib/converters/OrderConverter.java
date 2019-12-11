package ru.courseworkdt.elib.converters;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;
import ru.courseworkdt.elib.Model.Order;
import ru.courseworkdt.elib.dto.OrderDto;

@Component
public class OrderConverter implements Converter<OrderDto, Order> {
    @Override
    public Order convert(OrderDto orderDto) {
        Order order = new Order();
        order.setId(orderDto.getId());
        order.setDate(orderDto.getDate());
        return order;

    }
}
